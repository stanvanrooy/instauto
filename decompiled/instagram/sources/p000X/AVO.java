package p000X;

import com.instagram.video.live.streaming.common.BroadcastFailureType;

/* renamed from: X.AVO */
public final class AVO implements AYX {
    public final /* synthetic */ C23674AXl A00;

    public final void BBB(AZM azm) {
    }

    public final void BNL(Exception exc) {
    }

    public final void BNM(boolean z) {
    }

    public AVO(C23674AXl aXl) {
        this.A00 = aXl;
    }

    public final void BB8(AZM azm, int i) {
        C23674AXl.A00(this.A00, i);
    }

    public final void BB9(AZM azm, int i) {
        C23674AXl.A00(this.A00, i);
    }

    public final void BMX() {
        C23674AXl aXl = this.A00;
        AWN awn = aXl.A01;
        if (awn != null) {
            AWN.A00(awn);
            this.A00.A01 = null;
            return;
        }
        aXl.A09.B6I(aXl);
    }

    public final void BMY() {
        C23674AXl aXl = this.A00;
        aXl.A09.BAM(aXl, "LiveWithRtcSession.onSessionDisconnected");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 == false) goto L_0x000b;
     */
    public final void BMZ() {
        boolean z;
        C23674AXl aXl = this.A00;
        AO0 ao0 = aXl.A07;
        if (ao0 != null) {
            boolean z2 = aXl.A02;
            z = true;
        }
        z = false;
        if (z) {
            ao0.A02(Constants.A0C);
        }
    }

    public final void BMa(Exception exc) {
        BroadcastFailureType broadcastFailureType;
        AnonymousClass0DB.A0G("RtcLiveStreamingSession", "onSessionError", exc);
        C23674AXl aXl = this.A00;
        AWN awn = aXl.A01;
        if (awn != null) {
            AWN.A01(awn, exc);
            this.A00.A01 = null;
            return;
        }
        AVL avl = aXl.A09;
        if (exc instanceof C23772Aay) {
            broadcastFailureType = BroadcastFailureType.RtcSessionUnavailable;
        } else {
            broadcastFailureType = BroadcastFailureType.RtcSessionFailure;
        }
        avl.Ath(aXl, new ARA(broadcastFailureType, "RtcLiveStreamingSession", exc.toString()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 == false) goto L_0x000b;
     */
    public final void BMb() {
        boolean z;
        C23674AXl aXl = this.A00;
        AO0 ao0 = aXl.A07;
        if (ao0 != null) {
            boolean z2 = aXl.A02;
            z = true;
        }
        z = false;
        if (z) {
            ao0.A02(Constants.A0C);
        }
    }
}
