package com.fasterxml.jackson.annotation;

public @interface JsonIdentityReference {
    boolean alwaysAsId() default false;
}
