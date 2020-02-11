package com.nagarro.nagp.booking.dto;

import java.time.LocalDate;

/**
 * The Class BookingRequest.
 */
public class BookingRequest {

	/** The origin. */
	private String origin;

	/** The destination. */
	private String destination;

	/** The flight date. */
	private LocalDate flightDate;

	/** The flight number. */
	private String flightNumber;

	/**
	 * Instantiates a new booking request.
	 */
	public BookingRequest() {
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
	 * Gets the flight date.
	 *
	 * @return the flight date
	 */
	public LocalDate getFlightDate() {
		return flightDate;
	}

	/**
	 * Sets the flight date.
	 *
	 * @param flightDate
	 *            the new flight date
	 */
	public void setFlightDate(LocalDate flightDate) {
		this.flightDate = flightDate;
	}

	/**
	 * Gets the flight number.
	 *
	 * @return the flight number
	 */
	public String getFlightNumber() {
		return flightNumber;
	}

	/**
	 * Sets the flight number.
	 *
	 * @param flightNumber
	 *            the new flight number
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

}
