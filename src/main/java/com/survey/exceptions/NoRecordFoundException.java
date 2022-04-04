package com.survey.exceptions;

public class NoRecordFoundException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = -5949164683746519793L;

	public NoRecordFoundException(final String msg) {
        super(msg);
    }

    public static void throwNoRecordFoundException(final String errorMessage) {
        throw new NoRecordFoundException(errorMessage);
    }
}
