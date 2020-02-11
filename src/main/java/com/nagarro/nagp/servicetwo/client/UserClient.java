package com.nagarro.nagp.servicetwo.client;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.nagarro.nagp.servicetwo.dto.user.AccountDTO;
import com.nagarro.nagp.servicetwo.dto.user.UpdateAccountRequest;
import com.nagarro.nagp.servicetwo.dto.user.UserDTO;
import com.nagarro.nagp.servicetwo.exception.InvalidParameterException;

@Component
@RibbonClient(name = "nagp-test-service-1")
@FeignClient(name = "nagp-test-api-gateway")
public interface UserClient {

	/**
	 * Gets the user.
	 *
	 * @param id
	 *            the id
	 * @return the user
	 */
	@GetMapping(value = "/nagp-test-service-1/user/{id}")
	public UserDTO getUser(@PathVariable("id") final long id);

	/**
	 * Gets the user.
	 *
	 * @param id
	 *            the id
	 * @return the user
	 */
	@GetMapping(value = "/nagp-test-service-1/user")
	public List<UserDTO> getAllUser();

	/**
	 * Gets the user.
	 *
	 * @param id
	 *            the id
	 * @return the user
	 */
	@GetMapping(value = "/nagp-test-service-1/user/{id}/accounts")
	public List<AccountDTO> getUserAccounts(@PathVariable("id") final long id);

	/**
	 * Update account details.
	 *
	 * @param accountNumber
	 *            the account number
	 * @param request
	 *            the request
	 * @return the account DTO
	 * @throws InvalidParameterException
	 *             the invalid parameter exception
	 */
	@PutMapping(value = "/nagp-test-service-1/accounts/{accountNumber}")
	public AccountDTO updateAccountDetails(@PathVariable("accountNumber") final String accountNumber,
			@RequestBody UpdateAccountRequest request) throws InvalidParameterException;

	/**
	 * Gets the account.
	 *
	 * @param accountNumber
	 *            the account number
	 * @return the account
	 */
	@GetMapping(value = "/nagp-test-service-1/accounts/{accountNumber}")
	public AccountDTO getAccount(@PathVariable("accountNumber") final String accountNumber);

}
