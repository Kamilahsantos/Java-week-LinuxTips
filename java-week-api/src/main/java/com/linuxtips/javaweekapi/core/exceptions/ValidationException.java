package com.linuxtips.javaweekapi.core.exceptions;

public class ValidationException extends Exception {
    public final Number code = 422;
    public ValidationException(String message) {
        super(message);
    }
}
