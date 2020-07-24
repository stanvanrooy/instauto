package p000X;

/* renamed from: X.AXZ */
public final class AXZ extends C17920r1 {
    public final /* synthetic */ String A00;
    public final /* synthetic */ AWZ A01;
    public final /* synthetic */ C62322nS A02;

    public AXZ(C62322nS r1, String str, AWZ awz) {
        this.A02 = r1;
        this.A00 = str;
        this.A01 = awz;
    }

    public final void onFail(C43791v5 r7) {
        Integer num;
        int A03 = AnonymousClass0Z0.A03(-1071644212);
        String str = this.A00;
        C23775Ab1 A012 = C23770Aaw.A01(r7);
        if (r7.A03()) {
            num = Integer.valueOf(((C28691Ms) r7.A00).mStatusCode);
        } else {
            num = null;
        }
        AnonymousClass0DB.A0J("VideoCallApi", "%s Failure (%d): %s", str, num, A012);
        AWZ.A00(this.A01, A012);
        AnonymousClass0Z0.A0A(266113453, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-2147373060);
        C28691Ms r5 = (C28691Ms) obj;
        int A032 = AnonymousClass0Z0.A03(-1123902705);
        C62322nS r1 = this.A02;
        if (r5 instanceof C23666AXd) {
            r1.A00 = ((C23666AXd) r5).A00;
        }
        AWZ.A01(this.A01, r5);
        AnonymousClass0Z0.A0A(1672171158, A032);
        AnonymousClass0Z0.A0A(-1923761816, A03);
    }
}
