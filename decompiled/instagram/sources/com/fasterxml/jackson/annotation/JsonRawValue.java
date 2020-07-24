package com.fasterxml.jackson.annotation;

public @interface JsonRawValue {
    boolean value() default true;
}
