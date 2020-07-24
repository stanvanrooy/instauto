package p000X;

/* renamed from: X.BDo */
public final class BDo implements AnonymousClass2HP {
    public final /* synthetic */ C25316BDp A00;
    public final /* synthetic */ AnonymousClass2HP A01;

    public BDo(AnonymousClass2HP r1, C25316BDp bDp) {
        this.A01 = r1;
        this.A00 = bDp;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r1 != false) goto L_0x0015;
     */
    public final Object ACq(Object obj, C233910f r5) {
        boolean z;
        Object ACq;
        C50512Gp r0;
        AnonymousClass2HP r2 = this.A01;
        C25313BDk bDk = this.A00.A00;
        if (!bDk.A02 && (r0 = bDk.A01) != null) {
            boolean isCancelled = r0.isCancelled();
            z = true;
        }
        z = false;
        if (!Boolean.valueOf(z).booleanValue() || (ACq = r2.ACq(obj, r5)) != AnonymousClass2I1.COROUTINE_SUSPENDED) {
            return C50622Ha.A00;
        }
        return ACq;
    }
}
