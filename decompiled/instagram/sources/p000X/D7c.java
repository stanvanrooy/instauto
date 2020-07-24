package p000X;

import java.util.HashSet;

/* renamed from: X.D7c */
public final class D7c {
    public static String A00 = "goog.exo.core";
    public static final HashSet A01 = new HashSet();

    public static synchronized void A00(String str) {
        synchronized (D7c.class) {
            if (A01.add(str)) {
                A00 = AnonymousClass000.A0J(A00, ", ", str);
            }
        }
    }
}
