package p000X;

/* renamed from: X.C6O */
public final class C6O extends AnonymousClass0O9 {
    public final /* synthetic */ AnonymousClass28F A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6O(AnonymousClass28F r4) {
        super(633, 3, true, true);
        this.A00 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r2 != null) goto L_0x0021;
     */
    public final void run() {
        C484628b A002 = this.A00.A06.A00();
        AnonymousClass28F r1 = this.A00;
        r1.A02 = r1.A05.A03;
        r1.A00 = 0;
        AnonymousClass28F.A01(r1);
        if (A002 != null) {
            A002.close();
        }
    }
}
