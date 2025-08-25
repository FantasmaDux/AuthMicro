package io.github.pavelshe11.authmicro.api.exceptions;

import org.springframework.http.HttpStatus;

public class CodeIsNotExpiredException extends AbstractException {
    public CodeIsNotExpiredException() {
        super("error.code.not.expired", "code.confirmation.error", HttpStatus.BAD_REQUEST, "code");
    }
}
