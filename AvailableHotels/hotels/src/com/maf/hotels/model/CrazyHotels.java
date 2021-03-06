/**
 * 
 */
package com.maf.hotels.model;

import java.util.Date;


/**
 * @author Bashar
 *
 */
public class CrazyHotels {
	
	private String hotelName;
	private String rate;
	private float price;
	private float discount;
	private String[] roomAmenities;
	
	/**
	 * 
	 */
	public CrazyHotels() {
	
	}
	
	/**
	 * @param hotelName
	 * @param hotelRate
	 * @param price
	 * @param discount
	 * @param roomAmenities
	 * @param city
	 * @param fromDate
	 * @param toDate
	 * @param numberOfAdults
	 */
	public CrazyHotels(String hotelName, String hotelRate, float price, float discount, String[] roomAmenities,
			String city, Date fromDate, Date toDate, int numberOfAdults) {
		super();
		this.hotelName = hotelName;
		this.rate = hotelRate;
		this.price = price;
		this.discount = discount;
		this.roomAmenities = roomAmenities;
	}
	
	/**
	 * @param hotelName
	 * @param hotelRate
	 * @param price
	 * @param discount
	 * @param roomAmenities
	 */
	public CrazyHotels(String hotelName, String hotelRate, float price, float discount, String[] roomAmenities) {
		super();
		this.hotelName = hotelName;
		this.rate = hotelRate;
		this.price = price;
		this.discount = discount;
		this.roomAmenities = roomAmenities;
	}

	/**
	 * @return the hotelName
	 */
	public String getHotelName() {
		return hotelName;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setHotelRate(String rate) {
		this.rate = rate;
	}

	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * @return the discount
	 */
	public float getDiscount() {
		return discount;
	}

	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(float discount) {
		this.discount = discount;
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
	public String getRate() {
		return rate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(String rate) {
		this.rate = rate;
	}

	/**
	 * @param hotelName the hotelName to set
	 */
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	
}
