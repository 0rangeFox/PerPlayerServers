package com.mizuledevelopment.shared.rcon.ex;

public class RconClientException extends RuntimeException {

    public RconClientException(String message) {
        super(message);
    }

    public RconClientException(String message, Throwable cause) {
        super(message, cause);
    }

}
