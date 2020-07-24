package p000X;

/* renamed from: X.CBL */
public final class CBL extends AnonymousClass0O9 {
    public final /* synthetic */ AnonymousClass1LY A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CBL(AnonymousClass1LY r2) {
        super(161);
        this.A00 = r2;
    }

    public final void run() {
        AnonymousClass1LY r1 = this.A00;
        if (r1.A07) {
            synchronized (r1.A0A) {
                this.A00.A0B.clear();
            }
            AnonymousClass1LY r0 = this.A00;
            C26631Eg r2 = r0.A02;
            String A002 = AnonymousClass1LY.A00(r0);
            C12670hC.A01();
            new C26741Fb(r2, A002).run();
        }
        this.A00.A09.clear();
    }
}
