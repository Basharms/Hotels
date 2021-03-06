/**
 * 
 */
package com.maf.hotels.model;

import java.util.Date;


/**
 * @author Bashar
 *
 */
public class BestHotels {
	
	private String hotelName;
	private int hotelRate;
	private float hotelFare;
	private String[] roomAmenities;
	
	/**
	 * 
	 */
	public BestHotels() {
	
	}


	/**
	 * @param hotelName
	 * @param hotelRate
	 * @param hotelFare
	 * @param roomAmenities
	 */
	public BestHotels(String hotelName, int hotelRate, float hotelFare, String[] roomAmenities) {
		super();
		this.hotelName = hotelName;
		this.hotelRate = hotelRate;
		this.hotelFare = hotelFare;
		this.roomAmenities = roomAmenities;
	}


	/**
	 * @param hotelName
	 * @param hotelRate
	 * @param hotelFare
	 * @param roomAmenities
	 * @param city
	 * @param fromDate
	 * @param toDate
	 * @param numberOfAdults
	 */
	public BestHotels(String hotelName, int hotelRate, float hotelFare, String[] roomAmenities, String city,
			Date fromDate, Date toDate, Integer numberOfAdults) {
		super();
		this.hotelName = hotelName;
		this.hotelRate = hotelRate;
		this.hotelFare = hotelFare;
		this.roomAmenities = roomAmenities;
	}


	/**
	 * @return the hotelName
	 */
	public String getHotelName() {
		return hotelName;
	}


	/**
	 * @param hotelName the hotelName to set
	 */
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}


	/**
	 * @return the hotelRate
	 */
	public int getHotelRate() {
		return hotelRate;
	}


	/**
	 * @param hotelRate the hotelRate to set
	 */
	public void setHotelRate(int hotelRate) {
		this.hotelRate = hotelRate;
	}


	/**
	 * @return the hotelFare
	 */
	public float getHotelFare() {
		return hotelFare;
	}


	/**
	 * @param hotelFare the hotelFare to set
	 */
	public void setHotelFare(float hotelFare) {
		this.hotelFare = hotelFare;
	}


	/**
	 * @return the roomAmenities
	 */
	public String[] getRoomAmenities() {
		return roomAmenities;
	}


	/**
	 * @param roomAmenities the roomAmenities to set
	 */
	public void setRoomAmenities(String[] roomAmenities) {
		this.roomAmenities = roomAmenities;
	}

}
