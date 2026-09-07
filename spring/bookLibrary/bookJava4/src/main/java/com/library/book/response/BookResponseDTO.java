package com.library.book.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDate;

@Data
public class BookResponseDTO {

    @Schema(description = "The unique identifier of the book", example = "1")
    private Long id;
    private String name;
    private String author;
    private Integer quantity;
    private Integer pageCount;
    private LocalDate publishDate;
    private String creator;
    private Double price;
    private String barcode;
}
