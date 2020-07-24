package com.facebook.jni;

public class CppSystemErrorException extends CppException {
    public int errorCode;

    public CppSystemErrorException(String str, int i) {
        super(str);
        this.errorCode = i;
    }
}
