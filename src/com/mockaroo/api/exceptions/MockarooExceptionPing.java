package com.mockaroo.api.exceptions;

/**
 * Throw when the ping is not success
 * @author Dennis Hern�ndez Vargas
 * @version 0.1.0
 * @since 17/July/2014
 */
public class MockarooExceptionPing  extends MockarooException {

	private static final long serialVersionUID = 8018157517385691591L;

	public MockarooExceptionPing(String message) {
		super(message);
	}
}