package com.nagarro.nagp.booking.dto;

import java.time.LocalDateTime;

/**
 * The Class TransactionDTO.
 */
public class TransactionDTO extends BookingRequest {

	/** The transaction time. */
	private LocalDateTime transactionTime;

	/** The ticket number. */
	private String ticketNumber;

	/**
	 * Instantiates a new transaction DTO.
	 */
	public TransactionDTO() {
	}

	/**
	 * Gets the transaction time.
	 *
	 * @return the transaction time
	 */
	public LocalDateTime getTransactionTime() {
		return transactionTime;
	}

	/**
	 * Sets the transaction time.
	 *
	 * @param transactionTime
	 *            the new transaction time
	 */
	public void setTransactionTime(LocalDateTime transactionTime) {
		this.transactionTime = transactionTime;
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

}
