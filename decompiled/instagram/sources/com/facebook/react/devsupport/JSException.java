package com.facebook.react.devsupport;

public class JSException extends Exception {
    public final String mStack;

    public JSException(String str, String str2, Throwable th) {
        super(str, th);
        this.mStack = str2;
    }
}
