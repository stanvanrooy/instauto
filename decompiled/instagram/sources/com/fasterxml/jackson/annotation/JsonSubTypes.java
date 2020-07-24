package com.fasterxml.jackson.annotation;

public @interface JsonSubTypes {

    public @interface Type {
        String name() default "";

        Class value();
    }

    Type[] value();
}
