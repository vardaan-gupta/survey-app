package com.survey.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3664799504090932247L;

	/**
	 * 
	 */
	

	public ResourceNotFoundException(final String msg) {
        super(msg);
    }

    public static ResourceNotFoundException createResourceNotFoundException(final String errorMessage) {
        return new ResourceNotFoundException(errorMessage);
    }

    public static void throwResourceNotFoundException(final String errorMessage) {
        throw new ResourceNotFoundException(errorMessage);
    }
}
