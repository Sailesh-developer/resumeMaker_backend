package com.example.resumeMaker_backend.exceptions;

public class APIException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public APIException(String message) {
        super(message);
    }

    public APIException() {

    }
}
