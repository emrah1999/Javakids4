package com.library.book.customValidation;

import com.library.book.entity.BookEntity;
import com.library.book.repository.BookRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class UniqueBarcodeValidator implements ConstraintValidator<UniqueBarcode,String> {
    private final BookRepository bookRepository;
    @Override
    public boolean isValid(String barcode, ConstraintValidatorContext constraintValidatorContext) {
        if(barcode==null){
            return true;
        }
        Optional<BookEntity> bookBarcode = bookRepository.findByBarcode(barcode);
        if (bookBarcode.isPresent()) {
            return false;
        }
        return true;

    }
}
