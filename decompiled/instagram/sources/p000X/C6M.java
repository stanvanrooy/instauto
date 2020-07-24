package p000X;

/* renamed from: X.C6M */
public final class C6M extends AnonymousClass0O9 {
    public final /* synthetic */ AnonymousClass28J A00;
    public final /* synthetic */ C33231ca A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6M(AnonymousClass28J r4, C33231ca r5) {
        super(19, 3, true, true);
        this.A00 = r4;
        this.A01 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        if (r3 != null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        throw r0;
     */
    public final void run() {
        AnonymousClass28F r4 = this.A00.A00;
        C13300iJ r5 = this.A01.A00;
        C484628b A002 = r4.A06.A00();
        C484728c r2 = r4.A05;
        r2.A04.A01();
        if (r2.A01.remove(r5.getId()) != null) {
            for (C57732eg r0 : r2.A07.values()) {
                r0.A04.remove(r5.getId());
            }
        }
        r4.A05.A00(r4.A0B);
        if (A002 != null) {
            A002.close();
        }
    }
}
