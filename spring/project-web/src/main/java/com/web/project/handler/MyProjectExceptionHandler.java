package com.web.project.handler;

import com.web.project.exception.MyException;
import com.web.project.exception.NotFoundException;
import com.web.project.response.ErrorResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

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
