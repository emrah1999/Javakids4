package com.web.project.response;

import lombok.Data;

@Data
public class ErrorResponseDto {
    private Integer status;
    private String message;
    private String internalMessage;
}
