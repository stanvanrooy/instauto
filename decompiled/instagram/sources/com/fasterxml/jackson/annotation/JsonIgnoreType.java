package com.fasterxml.jackson.annotation;

public @interface JsonIgnoreType {
    boolean value() default true;
}
