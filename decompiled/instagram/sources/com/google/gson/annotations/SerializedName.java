package com.google.gson.annotations;

public @interface SerializedName {
    String[] alternate() default {};

    String value();
}
