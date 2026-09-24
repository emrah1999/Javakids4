package com.emrah.ecommerce.exception;

import org.springframework.validation.BindingResult;

public class MyProjectException extends  RuntimeException{
    public String internalMessage;
    public MyProjectException(String message, String internalMessage){
        super(message);
        this.internalMessage=internalMessage;
    }
}
