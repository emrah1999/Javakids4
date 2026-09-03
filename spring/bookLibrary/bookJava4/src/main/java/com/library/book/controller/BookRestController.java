package com.library.book.controller;

import com.library.book.exception.MyValidationException;
import com.library.book.request.BookAddRequestDTO;
import com.library.book.service.BookService;
import jakarta.validation.Valid;
import jakarta.validation.ValidationException;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookRestController {
    private final BookService bookService;

    @PostMapping
    @ResponseStatus(org.springframework.http.HttpStatus.CREATED)
    public void addBook(@RequestBody @Valid BookAddRequestDTO bookAddRequestDTO, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            throw new MyValidationException("Melumatlar dtam deyil","Validation error",bindingResult);
        }
        bookService.saveBook(bookAddRequestDTO);
    }
}
