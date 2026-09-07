package com.library.book.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListBookResponseDTO {

    private List<BookResponseDTO> books;

    private int pageNumber;

    private int pageSize;

    private long totalElements;

    private int totalPages;

    private boolean last;
}
