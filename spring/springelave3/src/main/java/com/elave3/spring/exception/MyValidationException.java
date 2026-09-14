package com.elave3.spring.exception;

import lombok.Data;
import org.springframework.validation.BindingResult;

@Data
public class MyValidationException extends RuntimeException {
    private BindingResult bindingResult;
    private String internalMessage;
    public MyValidationException(String message,String internalMessage, BindingResult bindingResult) {
        super(message);
        this.bindingResult = bindingResult;
        this.internalMessage = internalMessage;
    }
}
