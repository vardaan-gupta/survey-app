package com.survey.exceptions;



public class FieldValidationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1675202255854603463L;

	public FieldValidationException(final String msg) {
        super(msg);
    }

	public static void throwFieldValidationException(final String errorMessage) {
		throw new FieldValidationException(errorMessage);
	}
}
