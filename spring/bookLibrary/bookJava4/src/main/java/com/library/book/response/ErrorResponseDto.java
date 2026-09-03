package com.library.book.response;

import com.library.book.field.MyField;
import lombok.Data;

import java.util.List;

@Data
public class ErrorResponseDto {
    private Integer status;
    private String message;
    private String internalMessage;
    private List<MyField> fields;
}
