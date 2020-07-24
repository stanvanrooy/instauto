package com.fasterxml.jackson.annotation;

public @interface JsonSetter {
    String value() default "";
}
