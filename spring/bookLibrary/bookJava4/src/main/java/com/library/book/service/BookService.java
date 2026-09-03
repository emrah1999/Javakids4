package com.library.book.service;

import com.library.book.request.BookAddRequestDTO;

public interface BookService {
    public void saveBook(BookAddRequestDTO bookAddRequestDTO);
}
