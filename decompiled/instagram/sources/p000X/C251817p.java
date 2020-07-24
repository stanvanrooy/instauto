package p000X;

/* renamed from: X.17p  reason: invalid class name and case insensitive filesystem */
public final class C251817p {
    public static boolean A00;
    public static boolean A01;

    public static synchronized void A00() {
        synchronized (C251817p.class) {
            if (!A01) {
                boolean z = true;
                A01 = true;
                if (!AnonymousClass0JE.A03()) {
                    z = false;
                }
                A00 = z;
            }
        }
    }
}
