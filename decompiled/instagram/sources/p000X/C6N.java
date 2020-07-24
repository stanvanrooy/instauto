package p000X;

/* renamed from: X.C6N */
public final class C6N extends AnonymousClass0O9 {
    public final /* synthetic */ AnonymousClass28K A00;
    public final /* synthetic */ C55472ai A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6N(AnonymousClass28K r4, C55472ai r5) {
        super(20, 3, true, true);
        this.A00 = r4;
        this.A01 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        if (r2 != null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        throw r0;
     */
    public final void run() {
        AnonymousClass28F r4 = this.A00.A00;
        String str = this.A01.A00.A00;
        C484628b A002 = r4.A06.A00();
        C484728c r1 = r4.A05;
        r1.A04.A01();
        if (r1.A00.remove(str) != null) {
            for (C57732eg r0 : r1.A07.values()) {
                r0.A04.remove(str);
            }
        }
        r4.A05.A00(r4.A0B);
        if (A002 != null) {
            A002.close();
        }
    }
}
