package com.library.book.customValidation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class PublishDateValidator implements ConstraintValidator<PublishDateLimit, LocalDate> {
    @Override
    public boolean isValid(LocalDate localDate, ConstraintValidatorContext constraintValidatorContext) {
        LocalDate start=LocalDate.of(1900, 1, 1);
        LocalDate end=LocalDate.now();
        if(localDate==null){
            return true;
        }
        if(localDate.isAfter(start) && localDate.isBefore(end)){
            return true;
        }

        return false;
    }
}
