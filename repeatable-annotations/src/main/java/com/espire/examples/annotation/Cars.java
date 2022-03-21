package com.espire.examples.annotation;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Cars {

    Manufacturer[] value() default {
    };
}
