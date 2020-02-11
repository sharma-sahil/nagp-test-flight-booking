package com.nagarro.nagp.booking.service;

import java.util.List;

import com.nagarro.nagp.booking.dto.BookingRequest;
import com.nagarro.nagp.booking.dto.TransactionDTO;
import com.nagarro.nagp.booking.exception.TransactionException;

/**
 * The Interface IBookingService.
 */
public interface IBookingService {

	/**
	 * Book flight.
	 *
	 * @param request
	 *            the request
	 * @throws TransactionException
	 *             the transaction exception
	 */
	void bookFlight(BookingRequest request) throws TransactionException;

	/**
	 * Gets the all transactions.
	 *
	 * @return the all transactions
	 */
	List<TransactionDTO> getAllTransactions();

	/**
	 * Record transaction.
	 *
	 * @param request
	 *            the request
	 * @throws TransactionException
	 *             the transaction exception
	 */
	void recordTransaction(BookingRequest request) throws TransactionException;

}
