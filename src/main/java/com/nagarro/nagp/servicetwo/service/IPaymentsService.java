package com.nagarro.nagp.servicetwo.service;

import java.util.List;

import com.nagarro.nagp.servicetwo.dto.PaymentDTO;
import com.nagarro.nagp.servicetwo.dto.PaymentRequest;
import com.nagarro.nagp.servicetwo.exception.TransactionException;

/**
 * The Interface IPaymentsService.
 */
public interface IPaymentsService {

	/**
	 * Record transaction.
	 *
	 * @param request
	 *            the request
	 * @throws TransactionException
	 *             the transaction exception
	 */
	void recordTransaction(PaymentRequest request) throws TransactionException;

	/**
	 * Gets the account transactions.
	 *
	 * @param accountNumber
	 *            the account number
	 * @return the account transactions
	 */
	List<PaymentDTO> getAccountTransactions(String accountNumber);

}
