package com.library.book.customValidation;

import jakarta.validation.Constraint;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({java.lang.annotation.ElementType.FIELD})
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqueUsernameValidator.class)
public @interface UniqueUsername {
    String message() default "Kitab buraxilish tarixi 1900-01-01 ile bu gun arasinda olmalidir";

    Class[] groups() default {};
    Class[] payload() default {};
}
