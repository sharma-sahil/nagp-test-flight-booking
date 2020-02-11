package com.nagarro.nagp.booking.dao.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.nagarro.nagp.booking.dao.ITransactionDAO;
import com.nagarro.nagp.booking.model.Transaction;
import com.nagarro.nagp.booking.service.impl.BookingServiceImpl;

/**
 * The Class TransactionDAOImpl.
 */
@Component
public class TransactionDAOImpl implements ITransactionDAO {

	private static final Logger LOGGER = LoggerFactory.getLogger(BookingServiceImpl.class);

	private static List<Transaction> transactions = new ArrayList<>();

	@Override
	public void recordTransaction(Transaction transaction) {
		transaction.setTransactionId(getNewTransactionId());
		transaction.setCreatedOn(LocalDateTime.now());
		transaction.setTicketNumber(getNewTicketNumber());
		transactions.add(transaction);
		LOGGER.info("Added a new transaction with ID: {}", transaction.getTransactionId());
	}

	@Override
	public List<Transaction> getAllTransactions() {
		return transactions;
	}

	private long getNewTransactionId() {
		long paymentID = 1L;
		if (null != transactions && transactions.size() > 0) {
			paymentID = transactions.get(transactions.size() - 1).getTransactionId() + 1;
		}

		return paymentID;
	}

	private String getNewTicketNumber() {
		long ticket = 1L;
		if (null != transactions && transactions.size() > 0) {
			ticket = Long.parseLong(transactions.get(transactions.size() - 1).getTicketNumber()) + 1;
		}

		return Long.toString(ticket);
	}

}
