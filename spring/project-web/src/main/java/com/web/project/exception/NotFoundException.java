package com.web.project.exception;

import lombok.Data;

@Data
public class NotFoundException extends RuntimeException{
    private String internalMessage;
    public NotFoundException(String message,String internalMessage) {
        super(message);
        this.internalMessage = internalMessage;
    }
}
