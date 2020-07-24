package p000X;

/* renamed from: X.0Lj  reason: invalid class name and case insensitive filesystem */
public final class C05640Lj {
    public static Object A01(AnonymousClass0L7 r2, String str, Object obj) {
        AnonymousClass0LQ r0 = AnonymousClass0LQ.A01;
        if (r0 != null) {
            return C05560Lb.A00(r0.A06(), r2, str, obj, (AnonymousClass04H) null);
        }
        C05560Lb.A03(r2, str);
        return obj;
    }

    public static Object A00(AnonymousClass0L7 r5, String str, Object obj) {
        try {
            return A01(r5, str, obj);
        } finally {
            AnonymousClass0LQ r3 = AnonymousClass0LQ.A01;
            if (r3 != null) {
                C05560Lb.A02(C06550Pm.A00().A00, r5, str, (AnonymousClass04H) null, r3.A06());
            }
        }
    }
}
