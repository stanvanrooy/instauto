package com.fasterxml.jackson.annotation;

public @interface JsonValue {
    boolean value() default true;
}
