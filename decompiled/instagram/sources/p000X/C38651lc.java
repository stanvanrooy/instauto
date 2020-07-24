package p000X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1lc  reason: invalid class name and case insensitive filesystem */
public final class C38651lc {
    public static Set A00;
    public static C38651lc A01;

    public static synchronized void A00() {
        synchronized (C38651lc.class) {
            if (A01 == null) {
                A01 = new C38651lc();
                A00 = new HashSet();
            }
        }
    }
}
