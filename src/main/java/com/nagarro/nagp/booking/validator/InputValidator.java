package com.nagarro.nagp.booking.validator;

import org.springframework.util.StringUtils;

import com.nagarro.nagp.booking.dto.BookingRequest;
import com.nagarro.nagp.booking.exception.InvalidParameterException;

/**
 * The Class InputValidator.
 */
public class InputValidator {

	private InputValidator() {
		// to prevent Initialization
	}

	/**
	 * Validate request.
	 *
	 * @param request
	 *            the request
	 * @throws InvalidParameterException
	 */
	public static void validateRequest(BookingRequest request) throws InvalidParameterException {
		if (null == request) {
			throw new InvalidParameterException("input request must not be null", "invalid.request");
		}

		if (!StringUtils.hasText(request.getOrigin())) {
			throw new InvalidParameterException("Origin must not be null", "invalid.request.origin");
		}

		if (!StringUtils.hasText(request.getDestination())) {
			throw new InvalidParameterException("Deestination must not be null", "invalid.request.destination");
		}

		if (null == request.getFlightDate()) {
			throw new InvalidParameterException("Flight Date must not be null", "invalid.request.flightDate");
		}

		if (!StringUtils.hasText(request.getFlightNumber())) {
			throw new InvalidParameterException("Flight Number must not be null", "invalid.request.flightNumber");
		}
	}

}
