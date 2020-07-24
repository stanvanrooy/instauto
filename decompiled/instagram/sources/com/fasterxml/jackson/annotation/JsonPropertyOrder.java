package com.fasterxml.jackson.annotation;

public @interface JsonPropertyOrder {
    boolean alphabetic() default false;

    String[] value() default {};
}
