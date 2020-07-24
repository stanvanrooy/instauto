package com.fasterxml.jackson.annotation;

public @interface JsonBackReference {
    String value() default "defaultReference";
}
