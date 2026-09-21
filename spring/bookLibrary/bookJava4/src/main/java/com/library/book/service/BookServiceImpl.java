package com.library.book.service;

import com.library.book.entity.BookEntity;
import com.library.book.exception.NotFoundException;
import com.library.book.repository.BookRepository;
import com.library.book.request.BookAddRequestDTO;
import com.library.book.response.BookResponseDTO;
import com.library.book.response.ListBookResponseDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final ModelMapper modelMapper;

    @Override
    public void saveBook(BookAddRequestDTO bookAddRequestDTO) {
        BookEntity bookEntity = new BookEntity();
        String username= SecurityContextHolder.getContext().getAuthentication().getName();
        modelMapper.map(bookAddRequestDTO, bookEntity);
        bookEntity.setUsername(username);
        bookRepository.save(bookEntity);
    }
    @Override
    public ListBookResponseDTO getAll(int pageNumber, int pageSize) {

        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        Page<BookEntity> page = bookRepository.findAll(pageable);

        List<BookResponseDTO> books = new ArrayList<>();

        for (BookEntity book : page.getContent()) {
            books.add(modelMapper.map(book, BookResponseDTO.class));
        }

        ListBookResponseDTO response = new ListBookResponseDTO();

        response.setBooks(books);
        response.setPageNumber(page.getNumber());
        response.setPageSize(page.getSize());
        response.setTotalElements(page.getTotalElements());
        response.setTotalPages(page.getTotalPages());
        response.setLast(page.isLast());

        return response;
    }


    @Override
    public BookResponseDTO getById(long id) {
        BookEntity book= bookRepository.findById(id)
                .orElseThrow(() ->new NotFoundException("Kitab Tapılmadı","Not found"));


        return modelMapper.map(book,BookResponseDTO.class) ;
    }





    @Override
    public void delete(Long id) {
       BookEntity bookEntity= bookRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Kitab Tapılmadı", "Not found"));

        bookRepository.deleteById(id);
    }




    @Override
    public BookResponseDTO update(Long id, BookAddRequestDTO request) {

        BookEntity bookEntity= bookRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Kitab Tapılmadı", "Not found"));


        modelMapper.map(request, bookEntity);
        BookEntity updatedBook = bookRepository.save(bookEntity);

        return modelMapper.map(updatedBook, BookResponseDTO.class);
    }
}
