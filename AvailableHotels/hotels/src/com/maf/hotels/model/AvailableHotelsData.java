/**
 * 
 */
package com.maf.hotels.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Administrator
 *
 */
public class AvailableHotelsData {
	
	private String provider;
	private String hotelName;
	private float hotelFare;
	private String[] roomAmenities;
	
	@JsonIgnore
	private int rate;
	
	/**
	 * @return the provider
	 */
	public String getProvider() {
		return provider;
	}
	/**
	 * @param provider the provider to set
	 */
	public void setProvider(String provider) {
		this.provider = provider;
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
	/**
	 * @return the rate
	 */
	public int getRate() {
		return rate;
	}
	/**
	 * @param rate the rate to set
	 */
	public void setRate(int rate) {
		this.rate = rate;
	}

}
