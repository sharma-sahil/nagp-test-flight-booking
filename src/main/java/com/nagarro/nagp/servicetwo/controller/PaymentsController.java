package com.nagarro.nagp.servicetwo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.nagp.servicetwo.dto.PaymentDTO;
import com.nagarro.nagp.servicetwo.dto.PaymentRequest;
import com.nagarro.nagp.servicetwo.exception.InvalidParameterException;
import com.nagarro.nagp.servicetwo.exception.TransactionException;
import com.nagarro.nagp.servicetwo.service.IPaymentsService;
import com.nagarro.nagp.servicetwo.validator.InputValidator;

/**
 * The Class PaymentsController.
 */
@RestController
public class PaymentsController {

	@Autowired
	private IPaymentsService paymentsService;

	/**
	 * Record transaction.
	 *
	 * @param request
	 *            the request
	 * @throws InvalidParameterException
	 * @throws TransactionException
	 */
	@PostMapping(value = "/payments")
	public void recordTransaction(@RequestBody PaymentRequest request)
			throws InvalidParameterException, TransactionException {
		InputValidator.validateRequest(request);
		this.paymentsService.recordTransaction(request);
	}

	/**
	 * Gets the account transactions.
	 *
	 * @param accountNumber
	 *            the account number
	 * @return the account transactions
	 */
	@GetMapping(value = "/payments/{accountNumber}")
	public List<PaymentDTO> getAccountTransactions(@PathVariable("accountNumber") final String accountNumber) {
		return this.paymentsService.getAccountTransactions(accountNumber);
	}

}
