package p000X;

/* renamed from: X.1rl  reason: invalid class name and case insensitive filesystem */
public final class C42151rl implements C08360Ws {
    public final /* synthetic */ C41971rH A00;

    public C42151rl(C41971rH r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if ((!((java.lang.Boolean) p000X.C05680Ln.A0i.A00()).booleanValue()) == false) goto L_0x0025;
     */
    public final String ALb() {
        boolean z;
        String A002 = AnonymousClass0UP.A00(this.A00.A04);
        if (A002 != null) {
            if (C06080Nr.A07(this.A00.A04)) {
                z = true;
            }
            z = false;
            if (z) {
                return A002;
            }
        }
        return this.A00.A04.getPackageName();
    }
}
