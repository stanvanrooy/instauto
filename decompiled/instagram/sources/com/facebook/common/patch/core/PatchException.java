package com.facebook.common.patch.core;

public class PatchException extends Exception {
    public PatchException(Throwable th) {
        super("Error applying patch.", th);
    }
}
