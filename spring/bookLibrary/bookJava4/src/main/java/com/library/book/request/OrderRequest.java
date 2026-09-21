package com.library.book.request;

import lombok.Data;

import java.util.List;

@Data
public class OrderRequest {
    private String address;
    private String phone;
    private String card;
    private List<OrderDetailRequestDTO> orderDetails;
}
