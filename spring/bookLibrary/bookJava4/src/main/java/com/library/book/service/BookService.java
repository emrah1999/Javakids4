package com.library.book.service;

import com.library.book.request.BookAddRequestDTO;
import com.library.book.request.BookFilterRequestDTO;
import com.library.book.response.BookResponseDTO;
import com.library.book.response.ListBookResponseDTO;
import org.springframework.data.domain.Page;

public interface BookService {
    public void saveBook(BookAddRequestDTO bookAddRequestDTO);
    ListBookResponseDTO getAll(int pageNumber, int pageSize);

    Page<BookResponseDTO> filter(BookFilterRequestDTO request);

    BookResponseDTO getById(long id);

    void delete(Long id);

    BookResponseDTO update(Long id , BookAddRequestDTO request);
}
