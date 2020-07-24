package com.google.gson.annotations;

public @interface JsonAdapter {
    boolean nullSafe() default true;

    Class value();
}
