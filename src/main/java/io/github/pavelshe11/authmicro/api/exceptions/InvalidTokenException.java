package io.github.pavelshe11.authmicro.api.exceptions;

import org.springframework.http.HttpStatus;

public class InvalidTokenException extends HttpStatusException {
    public InvalidTokenException() {
        super(HttpStatus.UNAUTHORIZED);
    }
}
