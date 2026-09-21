package com.library.book.request;

import lombok.Data;

@Data
public class OrderDetailRequestDTO {
    private Long bookId;
    private Integer quantity;
}
