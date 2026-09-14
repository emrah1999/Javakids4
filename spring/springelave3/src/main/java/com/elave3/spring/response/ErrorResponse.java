package com.elave3.spring.response;

import com.elave3.spring.field.MyField;
import lombok.Data;
import org.springframework.validation.FieldError;

import java.util.List;

@Data
public class ErrorResponse {
    private String message;
    private int status;
    private String internalMessage;
    private List<MyField> fieldErrors;


}
