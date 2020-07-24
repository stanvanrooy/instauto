package com.fasterxml.jackson.annotation;

public @interface JsonManagedReference {
    String value() default "defaultReference";
}
