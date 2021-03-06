/**
 * This is service  class to get all hotels and do the other functionalities if needed.
 */
package com.maf.bestHotels.service;
import java.util.ArrayList;
import java.util.List;

import com.maf.bestHotels.model.BestHotels;
/**
 * @author Administrator
 *
 */
public class BestHotelsService {
	
	/**
	 * @return all Best hotels
	 */
	public List<BestHotels> getAllHotels() {
		
		// Fill  dummy data  for 2 hotels.
		List<BestHotels> hotels= new ArrayList<BestHotels>();
		String[] rotanaRoomAmenities ={"Hair dryer", "Television", "Kitchen facilities"};
		String[] sheratonRoomAmenities ={"Hair dryer", "Television", "Kitchen facilities", "Computer and Internet access", "Washer and Dryer"};
		
		BestHotels rotanaBestHotel = new BestHotels("Grand Millennium", 5, 125.25f, rotanaRoomAmenities);
		BestHotels sheratonBestHotel = new BestHotels("The Ritz-Carlton Abu Dhabi", 3, 500, sheratonRoomAmenities);
		
		hotels.add(sheratonBestHotel);
		hotels.add(rotanaBestHotel);
		
		return hotels;
		
	}

}
