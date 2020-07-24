package com.fasterxml.jackson.annotation;

public @interface JsonIgnoreProperties {
    boolean ignoreUnknown() default false;

    String[] value() default {};
}
