package com.facebook.react.bridge;

public class ObjectAlreadyConsumedException extends RuntimeException {
    public ObjectAlreadyConsumedException(String str) {
        super(str);
    }
}
