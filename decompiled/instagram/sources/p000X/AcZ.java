package p000X;

import android.util.Pair;
import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;
import com.instagram.model.videocall.VideoCallInfo;

/* renamed from: X.AcZ */
public final class AcZ extends AWZ {
    public final /* synthetic */ C23859AcX A00;

    public AcZ(C23859AcX acX) {
        this.A00 = acX;
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        Pair pair = (Pair) obj;
        C23859AcX acX = this.A00;
        if (acX.A05.A00 == C23863Acc.STARTING) {
            VideoCallInfo videoCallInfo = (VideoCallInfo) pair.first;
            boolean booleanValue = ((Boolean) pair.second).booleanValue();
            acX.A01 = videoCallInfo;
            acX.A04 = booleanValue;
            C62322nS r2 = acX.A07;
            String str = videoCallInfo.A01;
            r2.A02 = str;
            r2.A00 = videoCallInfo.A00;
            acX.A06.Blg(str);
            C23859AcX acX2 = this.A00;
            C23751Aad aad = acX2.A09;
            String str2 = acX2.A01.A01;
            aad.A06 = str2;
            DLog.m40d(DLogTag.VIDEO_CALL, "joinCall success %s", str2);
        }
    }
}
