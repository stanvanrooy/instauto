package com.fasterxml.jackson.annotation;

public @interface JsonView {
    Class[] value() default {};
}
