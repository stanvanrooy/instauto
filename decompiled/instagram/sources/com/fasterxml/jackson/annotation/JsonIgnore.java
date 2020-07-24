package com.fasterxml.jackson.annotation;

public @interface JsonIgnore {
    boolean value() default true;
}
