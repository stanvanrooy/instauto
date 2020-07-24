package com.facebook.react.bridge;

public @interface ReactMethod {
    boolean isBlockingSynchronousMethod() default false;
}
