package com.emrah.ecommerce.handler;

import com.emrah.ecommerce.exception.MyProjectException;
import com.emrah.ecommerce.exception.ValidateProjectException;
import com.emrah.ecommerce.field.MyField;
import com.emrah.ecommerce.response.ErrorResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class MyProjectExceptionHandler {

    @ResponseStatus(code= HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ValidateProjectException.class)
    public ErrorResponseDTO validateProjectExceptionHandler(ValidateProjectException exception){
        ErrorResponseDTO responseDTO =new ErrorResponseDTO();
        responseDTO.setMessage(exception.getMessage());
        responseDTO.setInternalMessage(exception.internalMessage);
        responseDTO.setStatus(500);
        responseDTO.setCreatedAt(LocalDateTime.now());
        if(exception.bindingResult!=null){
            List<FieldError> errores= exception.bindingResult.getFieldErrors();
            List<MyField> fields=new ArrayList<>();
            for (FieldError fieldError:errores){
                MyField myField =new MyField();
                myField.setField(fieldError.getField());
                myField.setMessage(fieldError.getDefaultMessage());
                fields.add(myField);
            }
            responseDTO.setValidations(fields);
        }
        return responseDTO;
    }

    @ResponseStatus(code= HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(MyProjectException.class)
    public ErrorResponseDTO myProjectExceptionHandler(MyProjectException exception){
        ErrorResponseDTO responseDTO =new ErrorResponseDTO();
        responseDTO.setMessage(exception.getMessage());
        responseDTO.setInternalMessage(exception.internalMessage);
        responseDTO.setStatus(500);
        responseDTO.setCreatedAt(LocalDateTime.now());
        return responseDTO;
    }
    @ResponseStatus(code= HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public ErrorResponseDTO exceptionHandler(Exception exception){
        ErrorResponseDTO responseDTO =new ErrorResponseDTO();
        responseDTO.setMessage(exception.getMessage());
        responseDTO.setInternalMessage("Server error");
        responseDTO.setStatus(500);
        responseDTO.setCreatedAt(LocalDateTime.now());
        return responseDTO;
    }



}
