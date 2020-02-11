package com.nagarro.nagp.booking.dao;

import java.util.List;

import com.nagarro.nagp.booking.model.Transaction;

/**
 * The Interface ITransactionDAO.
 */
public interface ITransactionDAO {

	/**
	 * Record transaction.
	 *
	 * @param transaction
	 *            the transaction
	 */
	void recordTransaction(Transaction transaction);

	/**
	 * Gets the all transactions.
	 *
	 * @return the all transactions
	 */
	List<Transaction> getAllTransactions();

}
