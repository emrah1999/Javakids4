package com.library.book.handler;


import com.library.book.exception.MyException;
import com.library.book.exception.NotFoundException;
import com.library.book.exception.MyValidationException;
import com.library.book.field.MyField;
import com.library.book.response.ErrorResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class MyProjectExceptionHandler {

    @ExceptionHandler(value = {MyException.class})
    @ResponseStatus(org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponseDto handleMyException(MyException ex){
        ErrorResponseDto errorResponse =new ErrorResponseDto();
        errorResponse.setStatus(500);
        errorResponse.setMessage(ex.getMessage());
        errorResponse.setInternalMessage(ex.getInternalMessage());
        return errorResponse;
    }

    @ExceptionHandler(value = {MyValidationException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponseDto handleValidationException(MyValidationException ex){
        ErrorResponseDto errorResponse =new ErrorResponseDto();
        errorResponse.setStatus(400);
        errorResponse.setMessage(ex.getMessage());
        errorResponse.setInternalMessage(ex.getInternalMessage());
        List<FieldError> fields = ex.getBindingResult().getFieldErrors();
        ArrayList<MyField> myFields=new ArrayList<>();
        for (FieldError fieldError : fields) {
            MyField myField = new MyField();
            myField.setField(fieldError.getField());
            myField.setMessage(fieldError.getDefaultMessage());
            myFields.add(myField);
        }
        errorResponse.setFields(myFields);
        return errorResponse;
    }

    @ExceptionHandler(value = {NotFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponseDto handleNotFound(NotFoundException ex){
        ErrorResponseDto errorResponse =new ErrorResponseDto();
        errorResponse.setStatus(404);
        errorResponse.setMessage(ex.getMessage());
        errorResponse.setInternalMessage(ex.getInternalMessage());
        return errorResponse;
    }


    @ExceptionHandler(value = {Exception.class})
    @ResponseStatus(org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponseDto handleException(Exception ex){
        ErrorResponseDto errorResponse =new ErrorResponseDto();
        errorResponse.setStatus(500);
        errorResponse.setMessage("Xeta baş verdi. Zəhmət olmasa birazdan yoxlayın");
        errorResponse.setInternalMessage(ex.getMessage());
        return errorResponse;
    }



}
