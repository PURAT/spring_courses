package com.example.validation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EmailValidation.class)
public @interface Email {

    String message() default "email must ends with \"@xyz.com \"";

    String value() default "@xyz.com";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
