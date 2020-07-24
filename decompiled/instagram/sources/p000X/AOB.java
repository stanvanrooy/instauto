package p000X;

import android.os.Bundle;
import com.facebook.C0003R;
import com.facebook.video.common.livestreaming.LiveStreamingError;
import com.instagram.video.live.streaming.common.BroadcastFailureType;

/* renamed from: X.AOB */
public final class AOB implements Runnable {
    public final /* synthetic */ LiveStreamingError A00;
    public final /* synthetic */ BroadcastFailureType A01;
    public final /* synthetic */ AQ5 A02;

    public AOB(AQ5 aq5, BroadcastFailureType broadcastFailureType, LiveStreamingError liveStreamingError) {
        this.A02 = aq5;
        this.A01 = broadcastFailureType;
        this.A00 = liveStreamingError;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    public final void run() {
        C23474ANw aNw;
        int i;
        C23486AOi aOi;
        C23470ANr aNr = this.A02.A09;
        if (aNr != null) {
            BroadcastFailureType broadcastFailureType = this.A01;
            LiveStreamingError liveStreamingError = this.A00;
            if (C23470ANr.A02(aNr)) {
                aNr.A0a.A03(liveStreamingError.descripton);
            }
            boolean z = true;
            try {
                switch (broadcastFailureType.ordinal()) {
                    case 2:
                        aOi = C23486AOi.BROADCAST_FAILURE_FEATURE_BLOCK;
                        break;
                    case 6:
                        aOi = C23486AOi.BROADCAST_SPEED_TEST_FAILURE;
                        break;
                    default:
                        aOi = C23486AOi.BROADCAST_FAILURE;
                        break;
                }
                aNr.A04(aOi, liveStreamingError.reason, C23501AOx.A00(aNr.A0A));
            } catch (RuntimeException e) {
                AnonymousClass0QD.A05("IgLive.EndBroadcastProblem", liveStreamingError.toString(), e);
            }
            Integer num = aNr.A0A;
            if (C23501AOx.A00(num) || num == Constants.A14 || num == Constants.A12) {
                z = false;
            }
            C23467ANo aNo = aNr.A08;
            if (aNo != null) {
                String str = liveStreamingError.reason;
                switch (broadcastFailureType.ordinal()) {
                    case 1:
                        if (!z) {
                            Bundle bundle = new Bundle();
                            bundle.putString("IgLive.error_message", str);
                            aNo.A0G.A00(true, bundle);
                            return;
                        }
                        return;
                    case 2:
                        aNw = aNo.A0H;
                        i = C0003R.string.live_feature_blocked;
                        break;
                    case 6:
                        aNw = aNo.A0H;
                        i = C0003R.string.live_connection_failed;
                        break;
                    default:
                        aNw = aNo.A0H;
                        i = C0003R.string.live_broadcast_start_error;
                        break;
                }
                str = aNw.A04.A04.getContext().getString(i);
                if (!z) {
                }
            }
        }
    }
}
