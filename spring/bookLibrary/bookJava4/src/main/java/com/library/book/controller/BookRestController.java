package com.library.book.controller;

import com.library.book.exception.MyValidationException;
import com.library.book.request.BookAddRequestDTO;
import com.library.book.response.BookResponseDTO;
import com.library.book.response.ListBookResponseDTO;
import com.library.book.service.BookService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import jakarta.validation.ValidationException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookRestController {
    private final BookService bookService;

    @PostMapping
    @ResponseStatus(org.springframework.http.HttpStatus.CREATED)
    @Operation(
            summary = "Add a new book",
            description = "This endpoint allows you to add a new book to" +
                    " the library.")
    @ApiResponses({
            @ApiResponse(
                    responseCode = "201",
                    description = "User add successfully"

            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "User not found"
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "Validation error"

            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "Server error"

            )
    })
    @PreAuthorize(value = "hasRole('ROLE_ADD_BOOK')")
    public void addBook(@RequestBody @Valid BookAddRequestDTO bookAddRequestDTO, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            throw new MyValidationException("Melumatlar dtam deyil","Validation error",bindingResult);
        }
        bookService.saveBook(bookAddRequestDTO);
    }
    @PreAuthorize(value = "hasRole('ROLE_GET_BOOKS')")
    @GetMapping
    public ListBookResponseDTO getAll(
            @RequestParam(defaultValue = "0") int pageNumber,
            @RequestParam(defaultValue = "10") int pageSize
    ) {

        return bookService.getAll(pageNumber, pageSize);
    }



    @GetMapping("/{id}")
    public BookResponseDTO getById(@PathVariable Long id){
        return bookService.getById(id);
    }


    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.delete(id);
    }

    @PutMapping("/{id}")
    public BookResponseDTO updateBook(
            @PathVariable Long id,
            @RequestBody @Valid BookAddRequestDTO request,
            BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            throw new MyValidationException(
                    "Melumat tam deyil",
                    "Validation xeta",
                    bindingResult
            );
        }

        return bookService.update(id, request);
    }
}
