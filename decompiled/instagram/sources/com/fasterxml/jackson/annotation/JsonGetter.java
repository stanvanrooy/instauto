package com.fasterxml.jackson.annotation;

public @interface JsonGetter {
    String value() default "";
}
