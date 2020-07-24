package p000X;

import android.content.Context;
import android.content.Intent;
import com.facebook.common.dextricks.DexStore;
import com.instagram.model.videocall.VideoCallAudience;
import com.instagram.model.videocall.VideoCallInfo;
import com.instagram.model.videocall.VideoCallSource;
import com.instagram.video.videocall.activity.VideoCallActivity;

/* renamed from: X.0pB  reason: invalid class name and case insensitive filesystem */
public final class C16800pB extends C16810pC {
    public final /* synthetic */ C16580op A00;

    public C16800pB(C16580op r1) {
        this.A00 = r1;
    }

    public final void A02(Context context, AnonymousClass0C1 r8, VideoCallInfo videoCallInfo, VideoCallAudience videoCallAudience, VideoCallSource videoCallSource) {
        this.A00.A04(context, r8, videoCallInfo, videoCallAudience, videoCallSource);
    }

    public final boolean A03(AnonymousClass0C1 r2, Context context) {
        return this.A00.A0C(r2, context);
    }

    public final boolean A06(String str) {
        if (this.A00.A00.get(str) != null) {
            return true;
        }
        return false;
    }

    public final String A00(AnonymousClass0C1 r2, Context context) {
        VideoCallSource videoCallSource;
        C54312Wu A01 = C54312Wu.A01(r2);
        if (A01 == null || (videoCallSource = A01.A03) == null) {
            return null;
        }
        return videoCallSource.A02.getId();
    }

    public final void A01(Context context, AnonymousClass0C1 r4, VideoCallAudience videoCallAudience, VideoCallSource videoCallSource) {
        Intent A002 = VideoCallActivity.A00(context, r4.A04(), videoCallSource, videoCallAudience, (VideoCallInfo) null);
        if (!C16590oq.A00.A0C(r4, context) && !AnonymousClass70S.A00().booleanValue()) {
            A002.addFlags(DexStore.LOAD_RESULT_PGO);
        }
        AnonymousClass1BH.A03(A002, context);
    }

    public final boolean A04(AnonymousClass0C1 r3, Context context) {
        C54312Wu A01 = C54312Wu.A01(r3);
        if (A01 == null || !A01.A0B) {
            return false;
        }
        return true;
    }

    public final boolean A05(AnonymousClass0C1 r2, String str) {
        C54312Wu A01 = C54312Wu.A01(r2);
        if (A01 != null) {
            return A01.A0C(str);
        }
        return false;
    }
}
