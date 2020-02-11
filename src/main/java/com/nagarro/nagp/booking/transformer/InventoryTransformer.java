package com.nagarro.nagp.booking.transformer;

import com.nagarro.nagp.booking.dto.BookingRequest;
import com.nagarro.nagp.booking.dto.inventory.CheckAvailableFlightsRequest;
import com.nagarro.nagp.booking.dto.inventory.UpdateInventoryRequest;
import com.nagarro.nagp.booking.enums.inventory.UpdateInventoryAction;

/**
 * The Class InventoryTransformer.
 */
public class InventoryTransformer {

	private InventoryTransformer() {
		// to prevent Initialization
	}

	/**
	 * Gets the check available flights request.
	 *
	 * @param request
	 *            the request
	 * @return the check available flights request
	 */
	public static CheckAvailableFlightsRequest getCheckAvailableFlightsRequest(BookingRequest request) {
		CheckAvailableFlightsRequest availabilityRequest = new CheckAvailableFlightsRequest();

		availabilityRequest.setOrigin(request.getOrigin());
		availabilityRequest.setDestination(request.getDestination());
		availabilityRequest.setTravelDate(request.getFlightDate());

		return availabilityRequest;
	}

	/**
	 * Gets the update inventory request.
	 *
	 * @param request
	 *            the request
	 * @param seats
	 *            the seats
	 * @return the update inventory request
	 */
	public static UpdateInventoryRequest getUpdateInventoryRequest(BookingRequest request, int seats) {
		UpdateInventoryRequest updateInventoryRequest = new UpdateInventoryRequest();
		updateInventoryRequest
				.setAction(seats > 0 ? UpdateInventoryAction.INCREASE_SEAT : UpdateInventoryAction.DECREASE_SEAT);
		updateInventoryRequest.setSeats(Math.abs(seats));
		updateInventoryRequest.setFlightDate(request.getFlightDate());
		updateInventoryRequest.setFlightNumber(request.getFlightNumber());
		return updateInventoryRequest;
	}

}
