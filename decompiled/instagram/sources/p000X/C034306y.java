package p000X;

import java.lang.reflect.InvocationTargetException;

/* renamed from: X.06y  reason: invalid class name and case insensitive filesystem */
public final class C034306y {
    public static void A00(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        } else if (targetException instanceof Error) {
            throw ((Error) targetException);
        }
    }
}
