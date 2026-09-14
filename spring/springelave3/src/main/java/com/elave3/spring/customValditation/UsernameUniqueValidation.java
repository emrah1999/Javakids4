package com.elave3.spring.customValditation;

import jakarta.validation.Constraint;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({java.lang.annotation.ElementType.FIELD})
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqueUsernameValidator.class)
public @interface UsernameUniqueValidation {
    String message() default "Username must be unique";

    Class[] groups() default {};
    Class[] payload() default {};
}
