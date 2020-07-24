package p000X;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.0Dn  reason: invalid class name and case insensitive filesystem */
public final class C04330Dn {
    public static final Set A00 = new HashSet();
    public static final ExecutorService A01 = Executors.newSingleThreadExecutor();
    public static volatile C04320Dm A02;
    public static volatile boolean A03;

    public static synchronized void A00(boolean z) {
        synchronized (C04330Dn.class) {
            if (z != A03) {
                A03 = z;
                HashSet hashSet = new HashSet();
                hashSet.addAll(A00);
                AnonymousClass0Z9.A03(A01, new C04310Dl(hashSet, z), -1255891323);
            }
        }
    }
}
