package com.library.book.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class BookFilterRequestDTO {
    private String name;
    private String author;

    private String sortField = "id";
    private String sortDir = "desc";

    @NotNull
    private int page = 0;
    @NotNull
    private int size = 10;


}
