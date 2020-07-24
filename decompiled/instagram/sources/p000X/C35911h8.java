package p000X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1h8  reason: invalid class name and case insensitive filesystem */
public final class C35911h8 {
    public int A00 = 1000;
    public HashMap A01;
    public List A02;
    public final HashMap A03 = new HashMap();

    public static synchronized void A00(C35911h8 r1) {
        synchronized (r1) {
            if (r1.A01 == null) {
                r1.A01 = new HashMap();
            }
            if (r1.A02 == null) {
                r1.A02 = new ArrayList();
            }
        }
    }

    public C35911h8() {
        A00(this);
    }
}
