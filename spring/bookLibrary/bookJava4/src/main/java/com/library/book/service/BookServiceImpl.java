package com.library.book.service;

import com.library.book.entity.BookEntity;
import com.library.book.repository.BookRepository;
import com.library.book.request.BookAddRequestDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final ModelMapper modelMapper;

    @Override
    public void saveBook(BookAddRequestDTO bookAddRequestDTO) {
        BookEntity bookEntity = new BookEntity();
        modelMapper.map(bookAddRequestDTO, bookEntity);
        bookRepository.save(bookEntity);
    }
}
