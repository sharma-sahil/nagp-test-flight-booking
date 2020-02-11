package com.nagarro.nagp.servicetwo.dao;

import java.util.List;

import com.nagarro.nagp.servicetwo.model.Transaction;

/**
 * The Interface ITransactionDAO.
 */
public interface ITransactionDAO {

	void recordTransaction(Transaction transaction);

	List<Transaction> getAccountTransactions(String accountNumber);

}
