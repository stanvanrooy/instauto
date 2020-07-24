package com.fasterxml.jackson.annotation;

public @interface JacksonInject {
    String value() default "";
}
