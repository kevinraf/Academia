package com.academiaspedropaulet.academia.excepcion;

import org.springframework.http.HttpStatus;

public class ModelNotFoundException extends RuntimeException {
    private HttpStatus status;

    public ModelNotFoundException(String message) {
        super(message);
    }

    public ModelNotFoundException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}