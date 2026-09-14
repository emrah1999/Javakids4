package com.elave3.spring.handler;

import com.elave3.spring.exception.MyValidationException;
import com.elave3.spring.exception.NotFoundException;
import com.elave3.spring.field.MyField;
import com.elave3.spring.response.ErrorResponse;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class MyExceptionHandler {
    @ExceptionHandler(MyValidationException.class)
    @ResponseStatus(org.springframework.http.HttpStatus.BAD_REQUEST)
    public ErrorResponse handleValidationException(MyValidationException e) {
        ErrorResponse response=new ErrorResponse();
        response.setMessage(e.getMessage());
        response.setStatus(400);
        response.setInternalMessage(e.getInternalMessage());
        ArrayList<MyField> myFields=new ArrayList<>();
        List<FieldError> fields =e.getBindingResult().getFieldErrors();
        for (FieldError fieldError : fields){
            MyField myField=new MyField();
            myField.setField(fieldError.getField());
            myField.setMessage(fieldError.getDefaultMessage());
            myFields.add(myField);
        }
        response.setFieldErrors(myFields);
        return response;
    }

    @ExceptionHandler(value= NotFoundException.class)
    @ResponseStatus(org.springframework.http.HttpStatus.NOT_FOUND)
    public ErrorResponse handleNotFoundException(NotFoundException e) {
        ErrorResponse response=new ErrorResponse();
        response.setStatus(404);
        response.setMessage(e.getMessage());
        response.setInternalMessage(e.getInternalMessage());
        return response;
    }
    @ExceptionHandler(Exception.class)
    @ResponseStatus(org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse handleException(Exception e) {
        ErrorResponse response=new ErrorResponse();
        response.setStatus(500);
        response.setMessage("Server xetasi, birazdan yeniden cehd edin ");
        response.setInternalMessage(e.getMessage());
        return response;
    }
}
