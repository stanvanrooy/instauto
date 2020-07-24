package com.facebook.proxygen.utils;

public final class Preconditions {
    public static Object checkNotNull(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw null;
    }

    public static Object checkNotNull(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static void checkState(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void checkState(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
