package com.nagarro.nagp.booking.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * The Class Transaction.
 */
public class Transaction {

	/** The transaction id. */
	private long transactionId;

	/** The origin. */
	private String origin;

	/** The destination. */
	private String destination;

	/** The flight number. */
	private String flightNumber;

	/** The flight date. */
	private LocalDate flightDate;

	/** The Ticket number. */
	private String ticketNumber;

	/** The created on. */
	private LocalDateTime createdOn;

	/**
	 * Instantiates a new payment.
	 */
	public Transaction() {
		// default constructor
	}

	/**
	 * Gets the transaction id.
	 *
	 * @return the transaction id
	 */
	public long getTransactionId() {
		return transactionId;
	}

	/**
	 * Sets the transaction id.
	 *
	 * @param transactionId
	 *            the new transaction id
	 */
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
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
	 * Gets the ticket number.
	 *
	 * @return the ticket number
	 */
	public String getTicketNumber() {
		return ticketNumber;
	}

	/**
	 * Sets the ticket number.
	 *
	 * @param ticketNumber
	 *            the new ticket number
	 */
	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	/**
	 * Gets the created on.
	 *
	 * @return the created on
	 */
	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	/**
	 * Sets the created on.
	 *
	 * @param createdOn
	 *            the new created on
	 */
	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

}
