package p000X;

import com.instagram.video.live.streaming.common.BroadcastFailureType;

/* renamed from: X.AQB */
public final class AQB extends AWZ {
    public final /* synthetic */ C23486AOi A00;
    public final /* synthetic */ AQ5 A01;

    public AQB(AQ5 aq5, C23486AOi aOi) {
        this.A01 = aq5;
        this.A00 = aOi;
    }

    public final void A03(Exception exc) {
        boolean z;
        AQ5 aq5 = this.A01;
        if (exc instanceof ARA) {
            ARA ara = (ARA) exc;
            aq5.A0D(ara.A00, new C23588ASm(ara.A01, ara.getMessage(), exc));
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.A01.A0D(BroadcastFailureType.InitFailure, new C23588ASm("ApiStartBroadcast", (String) null, exc));
        }
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        AnonymousClass79M r4 = this.A01.A0R;
        C23486AOi aOi = this.A00;
        AnonymousClass0P4 A012 = AnonymousClass79M.A01(r4, Constants.A12);
        A012.A0G("reason", aOi.A00);
        A012.A0G("reason_info", (String) null);
        AnonymousClass0WN.A01(r4.A0N).BcG(A012);
        this.A01.A0R.A06();
        this.A01.A0E((APC) null);
    }
}
