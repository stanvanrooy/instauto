package p000X;

import com.facebook.video.common.livestreaming.LiveStreamingError;

/* renamed from: X.AR0 */
public final class AR0 {
    public final AnonymousClass79M A00;

    public final void A00(LiveStreamingError liveStreamingError) {
        AnonymousClass79M r1 = this.A00;
        int i = liveStreamingError.errorCode;
        String str = liveStreamingError.domain;
        String str2 = liveStreamingError.reason;
        String str3 = liveStreamingError.descripton;
        String str4 = liveStreamingError.fullDescription;
        AnonymousClass0P4 A02 = AnonymousClass79M.A02(r1, Constants.A05);
        AWM.A03("IgLiveBroadcastWaterfall", A02, i, str, str2, str3, str4);
        AnonymousClass0WN.A01(r1.A0N).BcG(A02);
    }

    public final void A01(LiveStreamingError liveStreamingError) {
        AnonymousClass79M r1 = this.A00;
        int i = liveStreamingError.errorCode;
        String str = liveStreamingError.domain;
        String str2 = liveStreamingError.reason;
        String str3 = liveStreamingError.descripton;
        String str4 = liveStreamingError.fullDescription;
        if (r1.A0n) {
            AnonymousClass0P4 A02 = AnonymousClass79M.A02(r1, Constants.A06);
            AWM.A03("IgLiveBroadcastWaterfall", A02, i, str, str2, str3, str4);
            AnonymousClass0WN.A01(r1.A0N).BcG(A02);
        }
    }

    public AR0(AnonymousClass79M r1) {
        this.A00 = r1;
    }
}
