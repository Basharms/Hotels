/**
 * 
 */
package com.maf.bestHotels.model;

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
	private String city;
	private Date fromDate;
	private Date toDate;
	private Integer numberOfAdults;
	
	
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
		this.city = city;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.numberOfAdults = numberOfAdults;
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
	
}
