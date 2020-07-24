package p000X;

/* renamed from: X.1va  reason: invalid class name and case insensitive filesystem */
public final class C44091va {
    public final C04130Co A00;
    public final C04140Cp A01;

    public final long A00(C44121vd r10) {
        Long valueOf;
        long now = this.A00.now();
        long now2 = this.A01.now();
        AnonymousClass0a4.A0A(true);
        long elapsedRealtimeNanos = r10.A00.getElapsedRealtimeNanos();
        if (elapsedRealtimeNanos == 0) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(elapsedRealtimeNanos);
        }
        if (valueOf != null) {
            return (((now2 * 1000000) - valueOf.longValue()) + 500000) / 1000000;
        }
        if (r10.A02() != null) {
            return now - r10.A02().longValue();
        }
        return Long.MIN_VALUE;
    }

    public C44091va(C04130Co r1, C04140Cp r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
