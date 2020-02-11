package com.nagarro.nagp.booking.dto.inventory;

import java.time.LocalDate;

import com.nagarro.nagp.booking.enums.inventory.UpdateInventoryAction;

/**
 * The Class UpdateAccountRequest.
 */
public class UpdateInventoryRequest {

	/** The action. */
	private UpdateInventoryAction action;

	/** The flight number. */
	private String flightNumber;

	/** The flight date. */
	private LocalDate flightDate;

	/** The seats. */
	private int seats;

	/**
	 * Instantiates a new update inventory request.
	 */
	public UpdateInventoryRequest() {
		// default constructor
	}

	/**
	 * Gets the action.
	 *
	 * @return the action
	 */
	public UpdateInventoryAction getAction() {
		return action;
	}

	/**
	 * Sets the action.
	 *
	 * @param action
	 *            the new action
	 */
	public void setAction(UpdateInventoryAction action) {
		this.action = action;
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
	 * Gets the seats.
	 *
	 * @return the seats
	 */
	public int getSeats() {
		return seats;
	}

	/**
	 * Sets the seats.
	 *
	 * @param seats
	 *            the new seats
	 */
	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "UpdateInventoryRequest => Action= " + this.action + ", FlightNumber= " + this.flightNumber
				+ ", FlightDate=  " + this.flightDate + ", Seats= " + this.seats;

	}

}
