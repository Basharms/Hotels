/**
 * This is service  class to get all hotels and do the other functionalities if needed.
 */
package com.maf.crazyHotels.service;
import java.util.ArrayList;
import java.util.List;

import com.maf.crazyHotels.model.CrazyHotels;
/**
 * @author Administrator
 *
 */
public class CrazyHotelsService {
	
	/**
	 * @return all crazy hotels
	 */
	public List<CrazyHotels> getAllHotels() {
		
		// Fill  dummy data  for 2 hotels.
		List<CrazyHotels> hotels= new ArrayList<CrazyHotels>();
		String[] rotanaRoomAmenities ={"Hair dryer", "Television", "Kitchen facilities"};
		String[] sheratonRoomAmenities ={"Hair dryer", "Television", "Kitchen facilities", "Computer and Internet access", "Washer and Dryer"};
		
		CrazyHotels rotanaCrazyHotel = new CrazyHotels("Amman Rotana", "****", 125.25f, 0, rotanaRoomAmenities);
		CrazyHotels sheratonCrazyHotel = new CrazyHotels("Sheraton", "**", 500, 0.05F, sheratonRoomAmenities);
		
		hotels.add(sheratonCrazyHotel);
		hotels.add(rotanaCrazyHotel);
		
		return hotels;
		
	}

}
