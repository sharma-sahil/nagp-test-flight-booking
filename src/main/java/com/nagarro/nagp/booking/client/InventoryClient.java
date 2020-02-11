package com.nagarro.nagp.booking.client;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.nagarro.nagp.booking.dto.inventory.CheckAvailableFlightsRequest;
import com.nagarro.nagp.booking.dto.inventory.FlightsDTO;
import com.nagarro.nagp.booking.dto.inventory.UpdateInventoryRequest;
import com.nagarro.nagp.booking.exception.InvalidParameterException;

/**
 * The Interface InventoryClient.
 */
@Component
@RibbonClient(name = "nagp-test-flight-inventory")
@FeignClient(name = "nagp-test-api-gateway")
public interface InventoryClient {

	/**
	 * Check availability.
	 *
	 * @param request
	 *            the request
	 * @return the list
	 * @throws InvalidParameterException
	 *             the invalid parameter exception
	 */
	@PostMapping(value = "/nagp-test-flight-inventory/checkAvailability")
	public List<FlightsDTO> checkAvailability(@RequestBody final CheckAvailableFlightsRequest request)
			throws InvalidParameterException;

	/**
	 * Update inventory.
	 *
	 * @param request
	 *            the request
	 * @throws InvalidParameterException
	 *             the invalid parameter exception
	 */
	@PutMapping(value = "/nagp-test-flight-inventory/updateInventory")
	public void updateInventory(@RequestBody final UpdateInventoryRequest request) throws InvalidParameterException;

}
