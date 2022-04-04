package com.survey.util;

import java.util.Optional;
import java.util.UUID;

import com.survey.exceptions.FieldValidationException;

public final class SurveyValidationUtils {

	private SurveyValidationUtils() {

	}

	public static UUID validateAndConvertUUIDOrElseThrown(final String id, final String errorMessage) {

		validateUUID(id, errorMessage).ifPresent(FieldValidationException::throwFieldValidationException);
		return UUID.fromString(id);
	}

	private static Optional<String> validateUUID(final String id, final String errorMessage) {
		try {
			UUID.fromString(id);
			return Optional.empty();
		} catch (IllegalArgumentException illegalArgumentException) {
			return Optional.of(errorMessage);
		}
	}
}
