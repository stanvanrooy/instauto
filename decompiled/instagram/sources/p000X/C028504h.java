package p000X;

/* renamed from: X.04h  reason: invalid class name and case insensitive filesystem */
public final class C028504h {
    public static C028404g A00() {
        String A00 = AnonymousClass0Cb.A00("/proc/self/oom_adj");
        String A002 = AnonymousClass0Cb.A00("/proc/self/oom_score");
        String A003 = AnonymousClass0Cb.A00("/proc/self/oom_score_adj");
        if (!(A00 == null || A002 == null || A003 == null)) {
            C028404g r1 = new C028404g();
            try {
                r1.A00 = Integer.parseInt(A00.trim());
                r1.A01 = Integer.parseInt(A002.trim());
                r1.A02 = Integer.parseInt(A003.trim());
                return r1;
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }
}
