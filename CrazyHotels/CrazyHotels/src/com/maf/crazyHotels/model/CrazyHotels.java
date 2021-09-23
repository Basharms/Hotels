/**
 * 
 */
package com.maf.crazyHotels.model;

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
	private String city;
	private Date fromDate;
	private Date toDate;
	private Integer numberOfAdults;
	
	
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
		this.city = city;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.numberOfAdults = numberOfAdults;
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
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
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
	 * @return the fromDate
	 */
	public Date getFromDate() {
		return fromDate;
	}
	/**
	 * @param fromDate the fromDate to set
	 */
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	/**
	 * @return the toDate
	 */
	public Date getToDate() {
		return toDate;
	}
	/**
	 * @param toDate the toDate to set
	 */
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	/**
	 * @return the numberOfAdults
	 */
	public Integer getNumberOfAdults() {
		return numberOfAdults;
	}

	/**
	 * @param numberOfAdults the numberOfAdults to set
	 */
	public void setNumberOfAdults(Integer numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
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
}
