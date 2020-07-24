package com.facebook.jni;

public class CppException extends RuntimeException {
    public CppException(String str) {
        super(str);
    }
}
