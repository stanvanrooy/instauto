package p000X;

/* renamed from: X.1Ml  reason: invalid class name and case insensitive filesystem */
public final class C28621Ml extends C17920r1 {
    public final /* synthetic */ C28611Mk A00;

    public C28621Ml(C28611Mk r1) {
        this.A00 = r1;
    }

    public final void onFail(C43791v5 r3) {
        int A03 = AnonymousClass0Z0.A03(-2126683351);
        C28611Mk r0 = this.A00;
        r0.A01 = r3;
        r0.A04.countDown();
        AnonymousClass0Z0.A0A(-451834899, A03);
    }

    public final void onFailInBackground(C17710qg r3) {
        int A03 = AnonymousClass0Z0.A03(1225576263);
        this.A00.A00 = r3;
        AnonymousClass0Z0.A0A(-1670582142, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(1795721634);
        int A032 = AnonymousClass0Z0.A03(-64091544);
        C28611Mk r0 = this.A00;
        r0.A02 = (C28711Mu) obj;
        if (r0.A04.getCount() > 0) {
            AnonymousClass0QD.A01("HttpRequestConnectTask", "count down latch is not zero");
        }
        AnonymousClass0Z0.A0A(1825582369, A032);
        AnonymousClass0Z0.A0A(251144294, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0Z0.A03(1338386186);
        C28711Mu r4 = (C28711Mu) obj;
        int A032 = AnonymousClass0Z0.A03(716866618);
        C28611Mk r0 = this.A00;
        r0.A03 = r4;
        r0.A02 = r4;
        r0.A04.countDown();
        AnonymousClass0Z0.A0A(203120137, A032);
        AnonymousClass0Z0.A0A(-1524108568, A03);
    }
}
