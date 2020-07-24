package p000X;

/* renamed from: X.AXW */
public final class AXW extends C17920r1 {
    public final /* synthetic */ AWZ A00;
    public final /* synthetic */ AXY A01;

    public AXW(AXY axy, AWZ awz) {
        this.A01 = axy;
        this.A00 = awz;
    }

    public final void onFail(C43791v5 r4) {
        int A03 = AnonymousClass0Z0.A03(-2104133465);
        AWZ.A00(this.A00, AXY.A00("Joining Broadcast", r4));
        AnonymousClass0Z0.A0A(664618947, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(2078060355);
        C23665AXc aXc = (C23665AXc) obj;
        int A032 = AnonymousClass0Z0.A03(419433419);
        AXY axy = this.A01;
        C06360Ot.formatString("%s Success.", "Joining Broadcast");
        if (aXc instanceof C23666AXd) {
            axy.A01 = aXc.A00;
        }
        AWZ.A01(this.A00, aXc.A00);
        AnonymousClass0Z0.A0A(-1022247409, A032);
        AnonymousClass0Z0.A0A(1843337072, A03);
    }
}
