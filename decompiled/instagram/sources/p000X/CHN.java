package p000X;

/* renamed from: X.CHN */
public final class CHN extends C17920r1 {
    public final /* synthetic */ CHR A00;

    public CHN(CHR chr) {
        this.A00 = chr;
    }

    public final void onFail(C43791v5 r3) {
        int A03 = AnonymousClass0Z0.A03(-1875715734);
        super.onFail(r3);
        this.A00.A01.A01();
        CHR.A00(this.A00);
        CHR.A01(this.A00);
        AnonymousClass0Z0.A0A(587591666, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(281494307);
        int A032 = AnonymousClass0Z0.A03(116418960);
        super.onSuccess((C28691Ms) obj);
        CHR.A02(this.A00);
        AnonymousClass0Z0.A0A(57374849, A032);
        AnonymousClass0Z0.A0A(117226492, A03);
    }
}
