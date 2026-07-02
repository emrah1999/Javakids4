package com.web.project.service;

import com.web.project.model.Book;
import com.web.project.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    public void addBook(Book book) {
        bookRepository.save(book);
    }
    public void updateBook(Book book) {
        bookRepository.update(book);
    }
    public void deleteBook(Long id) {
        bookRepository.deleteBook(id);
    }
    public Book getBookById(Long id) {
        return bookRepository.findById(id);
    }
}
