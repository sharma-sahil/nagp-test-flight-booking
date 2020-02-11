package com.nagarro.nagp.booking.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.nagp.booking.client.InventoryClient;
import com.nagarro.nagp.booking.dao.ITransactionDAO;
import com.nagarro.nagp.booking.dto.BookingRequest;
import com.nagarro.nagp.booking.dto.TransactionDTO;
import com.nagarro.nagp.booking.dto.inventory.CheckAvailableFlightsRequest;
import com.nagarro.nagp.booking.dto.inventory.FlightsDTO;
import com.nagarro.nagp.booking.dto.inventory.UpdateInventoryRequest;
import com.nagarro.nagp.booking.exception.InvalidParameterException;
import com.nagarro.nagp.booking.exception.TransactionException;
import com.nagarro.nagp.booking.model.Transaction;
import com.nagarro.nagp.booking.service.IBookingService;
import com.nagarro.nagp.booking.transformer.InventoryTransformer;

@Service
public class BookingServiceImpl implements IBookingService {

	private static final Logger LOGGER = LoggerFactory.getLogger(BookingServiceImpl.class);

	@Autowired
	private ITransactionDAO transactionDAO;

	/** The user client. */
	@Autowired
	private InventoryClient inventoryClient;

	@Override
	public void bookFlight(BookingRequest request) throws TransactionException {
		CheckAvailableFlightsRequest checkAvailableFlightsRequest = InventoryTransformer
				.getCheckAvailableFlightsRequest(request);
		List<FlightsDTO> flights;
		try {
			flights = this.inventoryClient.checkAvailability(checkAvailableFlightsRequest);
		} catch (InvalidParameterException e) {
			throw new TransactionException(e.getMessage(), e, e.getErrorCode());
		}
		if (!flights.isEmpty()) {
			// do the booking
			// after doing the booking update the inventory
			UpdateInventoryRequest updateInventoryRequest = InventoryTransformer.getUpdateInventoryRequest(request, -1);
			try {
				this.inventoryClient.updateInventory(updateInventoryRequest);
			} catch (InvalidParameterException e) {
				throw new TransactionException(e.getMessage(), e, e.getErrorCode());
			}
		}
	}

	@Override
	public void recordTransaction(BookingRequest request) throws TransactionException {

		LOGGER.debug("Adding a new transaction for flight Number : {}", request.getFlightNumber());

		Transaction transaction = new Transaction();
		transaction.setFlightNumber(request.getFlightNumber());
		transaction.setDestination(request.getDestination());
		transaction.setFlightDate(request.getFlightDate());
		transaction.setOrigin(request.getOrigin());

		this.transactionDAO.recordTransaction(transaction);

	}

	@Override
	public List<TransactionDTO> getAllTransactions() {
		List<Transaction> transactions = this.transactionDAO.getAllTransactions();
		List<TransactionDTO> response = new ArrayList<>();

		transactions.forEach(t -> {
			response.add(transformTransactionToDTO(t));
		});

		return response;
	}

	/**
	 * Transform transaction to DTO.
	 *
	 * @param transaction
	 *            the transaction
	 * @return the payment DTO
	 */
	private TransactionDTO transformTransactionToDTO(final Transaction transaction) {
		TransactionDTO retVal = new TransactionDTO();
		retVal.setDestination(transaction.getDestination());
		retVal.setFlightDate(transaction.getFlightDate());
		retVal.setFlightNumber(transaction.getFlightNumber());
		retVal.setOrigin(transaction.getOrigin());
		retVal.setTicketNumber(transaction.getTicketNumber());
		retVal.setTransactionTime(transaction.getCreatedOn());

		return retVal;
	}

}
