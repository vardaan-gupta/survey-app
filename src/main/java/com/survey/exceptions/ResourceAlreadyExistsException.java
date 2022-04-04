package com.survey.exceptions;

public class ResourceAlreadyExistsException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1955337671859369914L;

	public ResourceAlreadyExistsException(final String msg) {
        super(msg);
    }

    public static void throwResourceAlreadyExistsException(final String errorMessage) {
        throw new ResourceAlreadyExistsException(errorMessage);
    }
}
