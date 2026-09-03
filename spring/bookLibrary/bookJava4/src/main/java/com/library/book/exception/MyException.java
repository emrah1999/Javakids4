package com.library.book.exception;

import lombok.Data;

@Data
public class MyException extends  RuntimeException{
    private String internalMessage;
    public MyException(String message,String internalMessage) {
        super(message);
        this.internalMessage = internalMessage;
    }
}
