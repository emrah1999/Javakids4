package com.web.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Products {
    private Long id;
    private String name;
    private Double price;
    private String barcode;
}
