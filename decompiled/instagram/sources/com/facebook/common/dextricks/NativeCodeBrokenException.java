package com.facebook.common.dextricks;

public final class NativeCodeBrokenException extends RuntimeException {
    public NativeCodeBrokenException() {
    }

    public NativeCodeBrokenException(String str) {
        super(str);
    }

    public NativeCodeBrokenException(String str, Throwable th) {
        super(str, th);
    }

    public NativeCodeBrokenException(Throwable th) {
        super(th);
    }
}
