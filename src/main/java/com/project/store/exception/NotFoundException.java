package com.project.store.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author admin
 */
@ResponseStatus
public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}
