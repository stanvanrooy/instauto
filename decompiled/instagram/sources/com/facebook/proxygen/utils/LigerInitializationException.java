package com.facebook.proxygen.utils;

public class LigerInitializationException extends RuntimeException {
    public LigerInitializationException(String str) {
        super(str);
    }

    public LigerInitializationException(Throwable th) {
        super(th);
    }
}
