package com.facebook.jni;

public class UnknownCppException extends CppException {
    public UnknownCppException() {
        super("Unknown");
    }

    public UnknownCppException(String str) {
        super(str);
    }
}
