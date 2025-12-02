package com.myprojects.httpserver.config;

public class HttpConfigurationExceprion extends RuntimeException {

    public HttpConfigurationExceprion() {
    }

    public HttpConfigurationExceprion(String message) {
        super(message);
    }

    public HttpConfigurationExceprion(String message, Throwable cause) {
        super(message, cause);
    }

    public HttpConfigurationExceprion(Throwable cause) {
        super(cause);
    }

    public HttpConfigurationExceprion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
