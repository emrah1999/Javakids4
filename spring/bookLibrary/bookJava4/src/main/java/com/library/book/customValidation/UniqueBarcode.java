package com.library.book.customValidation;

import jakarta.validation.Constraint;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({java.lang.annotation.ElementType.FIELD})
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqueBarcodeValidator.class)
public @interface UniqueBarcode {
    String message() default "Bu barcode sistemde movcuddur";

    Class[] groups() default {};
    Class[] payload() default {};
}
