package p000X;

import java.util.Arrays;

/* renamed from: X.0hy  reason: invalid class name and case insensitive filesystem */
public final class C13150hy {
    public static void A00() {
        C227269qE r1 = new C227269qE();
        A04(r1, C13150hy.class.getName());
        throw r1;
    }

    public static void A01(Object obj, String str) {
        if (obj == null) {
            IllegalStateException illegalStateException = new IllegalStateException(AnonymousClass000.A0E(str, " must not be null"));
            A04(illegalStateException, C13150hy.class.getName());
            throw illegalStateException;
        }
    }

    public static void A02(Object obj, String str) {
        if (obj == null) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(AnonymousClass000.A0P("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ", str));
            A04(illegalArgumentException, C13150hy.class.getName());
            throw illegalArgumentException;
        }
    }

    public static void A03(String str) {
        C191618He r1 = new C191618He(AnonymousClass000.A0J("lateinit property ", str, " has not been initialized"));
        A04(r1, C13150hy.class.getName());
        throw r1;
    }

    public static boolean A05(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    public static void A04(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }
}
