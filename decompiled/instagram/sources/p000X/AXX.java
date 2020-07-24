package p000X;

/* renamed from: X.AXX */
public final class AXX extends C17920r1 {
    public final /* synthetic */ AWN A00;
    public final /* synthetic */ AXY A01;
    public final /* synthetic */ String A02;

    public AXX(AXY axy, String str, AWN awn) {
        this.A01 = axy;
        this.A02 = str;
        this.A00 = awn;
    }

    public final void onFail(C43791v5 r4) {
        int A03 = AnonymousClass0Z0.A03(-1386351557);
        AWN.A01(this.A00, AXY.A00(this.A02, r4));
        AnonymousClass0Z0.A0A(-677658444, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(741698342);
        C28691Ms r7 = (C28691Ms) obj;
        int A032 = AnonymousClass0Z0.A03(-169292400);
        AXY axy = this.A01;
        C06360Ot.formatString("%s Success.", this.A02);
        if (r7 instanceof C23666AXd) {
            axy.A01 = ((C23666AXd) r7).A00;
        }
        AWN.A00(this.A00);
        AnonymousClass0Z0.A0A(-1979668658, A032);
        AnonymousClass0Z0.A0A(-2009158646, A03);
    }
}
