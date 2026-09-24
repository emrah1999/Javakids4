package com.emrah.ecommerce.exception;

import org.springframework.validation.BindingResult;

public class ValidateProjectException extends  RuntimeException{
    public String internalMessage;
    public BindingResult bindingResult;
    public ValidateProjectException(String message, String internalMessage, BindingResult bindingResult){
        super(message);
        this.internalMessage=internalMessage;
        this.bindingResult=bindingResult;
    }
}
