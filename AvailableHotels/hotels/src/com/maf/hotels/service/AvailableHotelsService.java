/**
 * 
 */
package com.maf.hotels.service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.maf.hotels.model.AvailableHotelsData;
import com.maf.hotels.model.BestHotels;
import com.maf.hotels.model.CrazyHotels;
import com.maf.hotels.util.HttpRequestHelper;

/**
 * @author Bashar
 *
 */
public class AvailableHotelsService {
	
	public String getAvailableHotels(HttpServletRequest request) throws IOException {
		
		AvailableHotelsService service  = new  AvailableHotelsService();
		List<BestHotels> bestHotelsList = service.sendBestHotelsRequest(request);
		List<CrazyHotels> crazyHotelsList = service.sendCrazyHotelsRequest(request);
		
		//  Create a list to be returned, and gather all the data from the providers
		List<AvailableHotelsData> availableHotelsDataList = new ArrayList<AvailableHotelsData>();
		AvailableHotelsData availableHotelsData = null;
		
		for(BestHotels bestHotels : bestHotelsList) {
			availableHotelsData = new AvailableHotelsData();
			availableHotelsData.setHotelFare(bestHotels.getHotelFare());
			availableHotelsData.setHotelName(bestHotels.getHotelName());
			availableHotelsData.setProvider("Best Hotels");
			availableHotelsData.setRoomAmenities(bestHotels.getRoomAmenities());
			availableHotelsData.setRate(bestHotels.getHotelRate());
			
			availableHotelsDataList.add(availableHotelsData);
		}
		
		for(CrazyHotels crazyHotels : crazyHotelsList) {
			availableHotelsData = new AvailableHotelsData();
			availableHotelsData.setHotelFare(crazyHotels.getPrice());
			availableHotelsData.setHotelName(crazyHotels.getHotelName());
			availableHotelsData.setProvider("Best Hotels");
			availableHotelsData.setRoomAmenities(crazyHotels.getRoomAmenities());
			availableHotelsData.setRate(crazyHotels.getRate().length());
			
			availableHotelsDataList.add(availableHotelsData);
		}
		
		// Sort the List depends on hotel rate
		Collections.sort(availableHotelsDataList, new Comparator<AvailableHotelsData>() {

			public int compare(AvailableHotelsData o1, AvailableHotelsData o2) {
				return Integer.compare(o2.getRate(),o1.getRate());
			}
		});
		
		// Conver the list to  string of json
		return convertListToJsonArray(availableHotelsDataList);
		
	}
	/**
	 * This method used to collect the parameters from the request and send http request to crazy hotel API.
	 * @param request
	 * @return
	 */
	public List<BestHotels> sendBestHotelsRequest(HttpServletRequest request) {
		System.out.println("AvailableHotels.sendBestHotelsRequest()");
		List<BestHotels> bestHotelsList = null;
		StringBuilder sb = new StringBuilder();
		int adultsCount = 0;
		Date fromDate = null;
		Date toDate = null;

		// Read the request parameters
		String city = request.getParameter("city");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		try {
			// Using try catch here in case any failure in parsing integer or dates.
			try {
				String dateFromStr = request.getParameter("fromDate");
				String toDateStr = request.getParameter("toDate");

				fromDate = sdf.parse(dateFromStr);
				toDate = sdf.parse(toDateStr);
				adultsCount = Integer.parseInt(request.getParameter("numberOfAdults"));
			} catch (ParseException e) {
				e.printStackTrace();
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}

			// Append  the parameter in string builder
			sb.append("city").append("=").append(city)
			.append("&")
			.append("fromDate").append("=").append(sdf.format(fromDate))
			.append("&")
			.append("toDate").append("=").append(sdf.format(toDate))
			.append("&")
			.append("numberOfAdults").append("=").append(adultsCount);

			System.out.println("Request parameters: ");
			System.out.println("- City: " + city);
			System.out.println("- From date: " + sdf.format(fromDate));
			System.out.println("- To date: " + sdf.format(toDate));
			System.out.println("- Adults count: " + adultsCount);


			String url = "http://localhost:8083/BestHotels/Hotels?";

			String response = HttpRequestHelper.sendHttpPost(url, sb.toString());
			System.out.println("Response :: " + response);

			ObjectMapper mapper = new ObjectMapper();

			// Convert the result to list to sort them according to hotelRate
			bestHotelsList = Arrays.asList(mapper.readValue(response, BestHotels[].class));
			System.out.println("bestHotelsList.size() :: " + bestHotelsList.size());

			return bestHotelsList;
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;

	}
		
	/**
	 * This method used to collect the parameters from the request and send http request to crazy hotel API.
	 * @param request
	 * @return
	 */
	public List<CrazyHotels> sendCrazyHotelsRequest(HttpServletRequest request) {
		
		try {
			System.out.println("AvailableHotels.sendCrazyHotelsRequest()");
			// Read the request parameters
			StringBuilder sb = new StringBuilder();
			int adultsCount = 0;
			Date fromDate = null;
			Date toDate = null;
			List<CrazyHotels> crazyHotelsList = null;

			String city = request.getParameter("city");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

			// Using try catch here in case any failure in parsing integer or dates.
			try {
				String dateFromStr = request.getParameter("fromDate");
				String toDateStr = request.getParameter("toDate");

				fromDate = sdf.parse(dateFromStr);
				toDate = sdf.parse(toDateStr);
				adultsCount = Integer.parseInt(request.getParameter("numberOfAdults"));
			} catch (ParseException e) {
				e.printStackTrace();
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			
			// Append  the parameter in string builder
			sb.append("city").append("=").append(city)
			.append("&")
			.append("from").append("=").append(sdf.format(fromDate))
			.append("&")
			.append("To").append("=").append(sdf.format(toDate))
			.append("&")
			.append("adultsCount").append("=").append(adultsCount);

			System.out.println("Request parameters: ");
			System.out.println("- City: " + city);
			System.out.println("- From date: " + sdf.format(fromDate));
			System.out.println("- To date: " + sdf.format(toDate));
			System.out.println("- Adults count: " + adultsCount);


			String url = "http://localhost:8082/CrazyHotels/Hotels?";

			String response = HttpRequestHelper.sendHttpPost(url, sb.toString());
			System.out.println("Response :: " + response);

			ObjectMapper mapper = new ObjectMapper();

			// Convert the result to list to sort them according to hotelRate
			crazyHotelsList = Arrays.asList(mapper.readValue(response, CrazyHotels[].class));
			System.out.println("crazyHotelsList.size() :: " + crazyHotelsList.size());

			return crazyHotelsList;
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}
	
	/**
	 * This method used to convert list to json string
	 * @param <T>
	 * @param list
	 * @return json string
	 * @throws IOException
	 */
	public <T> String convertListToJsonArray(List<T> list) throws IOException {  

	    final ByteArrayOutputStream out = new ByteArrayOutputStream();
	    final ObjectMapper mapper = new ObjectMapper();

	    mapper.writeValue(out, list);

	    final byte[] data = out.toByteArray();
	    return new String(data);
	}
}
