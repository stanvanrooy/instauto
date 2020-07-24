package p000X;

import com.instagram.video.live.streaming.common.BroadcastFailureType;

/* renamed from: X.ARX */
public final class ARX extends C17920r1 {
    public final /* synthetic */ AQ5 A00;
    public final /* synthetic */ boolean A01;

    public ARX(AQ5 aq5, boolean z) {
        this.A00 = aq5;
        this.A01 = z;
    }

    public final void onFail(C43791v5 r9) {
        String str;
        Integer num;
        int A03 = AnonymousClass0Z0.A03(2122556018);
        AQ5 aq5 = this.A00;
        if (r9.A03()) {
            str = ((C23582ASd) r9.A00).A00;
        } else {
            str = null;
        }
        aq5.A01 = str;
        String A012 = AQ5.A01(r9);
        Object[] objArr = new Object[2];
        if (r9.A03()) {
            num = Integer.valueOf(((C28691Ms) r9.A00).mStatusCode);
        } else {
            num = null;
        }
        objArr[0] = num;
        objArr[1] = A012;
        AnonymousClass0DB.A0J("IgLiveStreamingController", "Starting Broadcast Failure (%d): %s", objArr);
        this.A00.A0R.A0E(false, this.A01, A012);
        AQ5 aq52 = this.A00;
        C23582ASd aSd = (C23582ASd) r9.A00;
        BroadcastFailureType broadcastFailureType = BroadcastFailureType.InitFailure;
        if (aSd != null) {
            int i = aSd.mStatusCode;
            boolean z = true;
            boolean z2 = false;
            if (i == 400) {
                z2 = true;
            }
            if (i != 403) {
                z = false;
            }
            if (z2 || z) {
                broadcastFailureType = BroadcastFailureType.InitFailureFeatureBlock;
            }
        }
        aq52.A0D(broadcastFailureType, new C23588ASm("API Start Broadcast", A012, r9.A01));
        AnonymousClass0Z0.A0A(1879647776, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-1256126660);
        int A032 = AnonymousClass0Z0.A03(-2143371478);
        String str = ((C23582ASd) obj).A00;
        AQ5 aq5 = this.A00;
        aq5.A01 = str;
        AnonymousClass79M r3 = aq5.A0R;
        r3.A0A = str;
        r3.A0E(true, this.A01, (String) null);
        AQ5 aq52 = this.A00;
        if (!AQ5.A07(aq52)) {
            aq52.A0G = Constants.A0C;
            AQ5.A03(aq52, C23486AOi.A0D);
            C12670hC.A04(new C23469ANq(aq52));
        }
        AnonymousClass0Z0.A0A(-125703219, A032);
        AnonymousClass0Z0.A0A(1131245164, A03);
    }
}
