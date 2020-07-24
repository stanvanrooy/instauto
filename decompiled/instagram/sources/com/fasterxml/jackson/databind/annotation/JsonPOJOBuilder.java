package com.fasterxml.jackson.databind.annotation;

public @interface JsonPOJOBuilder {
    String buildMethodName() default "build";

    String withPrefix() default "with";
}
