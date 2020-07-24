package com.fasterxml.jackson.annotation;

public @interface JsonProperty {
    boolean required() default false;

    String value() default "";
}
