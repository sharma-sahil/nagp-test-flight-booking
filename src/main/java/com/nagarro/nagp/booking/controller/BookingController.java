package com.nagarro.nagp.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.nagp.booking.dto.BookingRequest;
import com.nagarro.nagp.booking.dto.TransactionDTO;
import com.nagarro.nagp.booking.exception.InvalidParameterException;
import com.nagarro.nagp.booking.exception.TransactionException;
import com.nagarro.nagp.booking.service.IBookingService;
import com.nagarro.nagp.booking.validator.InputValidator;

/**
 * The Class BookingController.
 */
@RestController
public class BookingController {

	@Autowired
	private IBookingService bookingService;

	/**
	 * Record transaction.
	 *
	 * @param request
	 *            the request
	 * @throws InvalidParameterException
	 * @throws TransactionException
	 */
	@PostMapping(value = "/bookFlight")
	public void recordTransaction(@RequestBody BookingRequest request)
			throws InvalidParameterException, TransactionException {
		InputValidator.validateRequest(request);
		this.bookingService.recordTransaction(request);
	}

	/**
	 * Gets the all transactions.
	 *
	 * @return the all transactions
	 */
	@GetMapping(value = "/transactions")
	public List<TransactionDTO> getAllTransactions() {
		return this.bookingService.getAllTransactions();
	}

}
