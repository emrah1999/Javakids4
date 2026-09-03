package com.library.book.exception;

import lombok.Data;
import org.springframework.validation.BindingResult;

@Data
public class MyValidationException extends RuntimeException {
    private String internalMessage;
    private BindingResult bindingResult;
    public MyValidationException(String message,String internalMessage, BindingResult bindingResult) {
        super(message);
        this.internalMessage = internalMessage;
        this.bindingResult = bindingResult;
    }
}
