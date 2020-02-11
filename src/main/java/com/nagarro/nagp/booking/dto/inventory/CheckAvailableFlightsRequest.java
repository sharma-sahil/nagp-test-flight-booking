package com.nagarro.nagp.booking.dto.inventory;

import java.time.LocalDate;

/**
 * The Class CheckAvailableFlightsRequest.
 */
public class CheckAvailableFlightsRequest {

	/** The origin. */
	private String origin;

	/** The destination. */
	private String destination;

	/** The travel date. */
	private LocalDate travelDate;

	/**
	 * Instantiates a new check available flights request.
	 */
	public CheckAvailableFlightsRequest() {
		// default constructor
	}

	/**
	 * Gets the origin.
	 *
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * Sets the origin.
	 *
	 * @param origin
	 *            the new origin
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * Gets the destination.
	 *
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * Sets the destination.
	 *
	 * @param destination
	 *            the new destination
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * Gets the travel date.
	 *
	 * @return the travel date
	 */
	public LocalDate getTravelDate() {
		return travelDate;
	}

	/**
	 * Sets the travel date.
	 *
	 * @param travelDate
	 *            the new travel date
	 */
	public void setTravelDate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}

	@Override
	public String toString() {
		return "Origin= " + origin + ", Destination= " + destination + " ,TravelDate= " + travelDate;

	}

}
