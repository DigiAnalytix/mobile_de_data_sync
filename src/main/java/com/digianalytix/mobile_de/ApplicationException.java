package com.digianalytix.mobile_de;

public class ApplicationException extends Exception {

    public ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApplicationException(String message) {
        super(message);
    }
}
