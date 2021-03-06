package com.maf.bestHotels.resources;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.maf.bestHotels.model.BestHotels;
import com.maf.bestHotels.service.BestHotelsService;

/**
 * Servlet implementation class Hotels
 */
@WebServlet("/Hotels")
public class Hotels extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Hotels() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("------------------------------RECEIVING post call------------------------------");
		
		// Read the request parameters
		int adultsCount = 0;
		Date fromDate = null;
		Date toDate = null;
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

		System.out.println("Request parameters: ");
		System.out.println("- City: " + city);
		System.out.println("- From date: " + sdf.format(fromDate));
		System.out.println("- To date: " + sdf.format(toDate));
		System.out.println("- Adults count: " + adultsCount);

		// Get  all the hotels from the service.
		// We can pass request parameters to get  get the data accordingly.
		BestHotelsService service = new BestHotelsService();
		List<BestHotels> bestHotels = service.getAllHotels();

		// Convert the data to json message  using google jar GSON
		String hotelsJSONString = new Gson().toJson(bestHotels);

		// Send the response as json format
		PrintWriter out = response.getWriter();
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		out.print(hotelsJSONString);
		out.flush();
	}

}
