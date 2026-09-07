package com.library.book.service;

import com.library.book.request.BookAddRequestDTO;
import com.library.book.response.BookResponseDTO;
import com.library.book.response.ListBookResponseDTO;

public interface BookService {
    public void saveBook(BookAddRequestDTO bookAddRequestDTO);
    ListBookResponseDTO getAll(int pageNumber, int pageSize);

    BookResponseDTO getById(long id);

    void delete(Long id);

    BookResponseDTO update(Long id , BookAddRequestDTO request);
}
