package com.emrah.ecommerce.response;

import com.emrah.ecommerce.field.MyField;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ErrorResponseDTO {
    private String message;

    private  Integer status;

    private String internalMessage;

    private LocalDateTime createdAt;

    private List<MyField> validations;
}