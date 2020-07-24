package com.fasterxml.jackson.annotation;

public @interface JsonUnwrapped {
    boolean enabled() default true;

    String prefix() default "";

    String suffix() default "";
}
