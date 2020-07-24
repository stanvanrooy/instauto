package p000X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.LruCache;
import com.facebook.common.dextricks.DexStore;
import com.instagram.model.videocall.VideoCallAudience;
import com.instagram.model.videocall.VideoCallInfo;
import com.instagram.model.videocall.VideoCallSource;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.video.videocall.activity.VideoCallActivity;
import com.instagram.video.videocall.analytics.VideoCallWaterfall$LeaveReason;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.0op  reason: invalid class name and case insensitive filesystem */
public abstract class C16580op extends C16590oq {
    public final LruCache A00 = new LruCache(100);
    public final C16610os A01;
    public final C16650ow A02;

    public C1891786f A02() {
        return null;
    }

    public final boolean A0D(AnonymousClass0C1 r2, Context context, String str, String str2, List list) {
        return true;
    }

    public final C16610os A03() {
        return this.A01;
    }

    public final void A07(AnonymousClass0C1 r3, Context context, String str) {
        C12810hQ.A02(AnonymousClass75A.A00(new C24166AjG(r3).A00, str, "RINGING"));
    }

    public final void A08(String str) {
        C16650ow r0 = this.A02;
        C23937Adw.A02(r0.A02, str, C23938Adx.EVENT_TYPE_INCOMING_CALL);
    }

    public final void A09(String str) {
        C16650ow r0 = this.A02;
        C23937Adw.A02(r0.A02, str, C23938Adx.EVENT_TYPE_MISSED_CALL);
    }

    public final void A0A(String str) {
        this.A00.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    public final void A0B(String str, String str2) {
        A09(C23937Adw.A00(str, C23938Adx.EVENT_TYPE_MISSED_CALL, Constants.ONE, str2));
    }

    public C16580op(Context context, boolean z) {
        C16600or r2;
        Context context2 = context;
        if (C06080Nr.A09(context)) {
            r2 = C16600or.THREADS_APP_PUSH_NOTIFICATION;
        } else {
            r2 = C16600or.PUSH_NOTIFICATION;
        }
        this.A01 = new C16610os(r2, C05860Mt.A02.A05(context));
        this.A02 = new C16650ow(context2, C16620ot.A01(), new C16640ov(C05680Ln.Abs), this, A03(), C11130eT.A01, z);
        Context applicationContext = context.getApplicationContext();
        C16650ow r1 = this.A02;
        C16670oy.A04("video_call_incoming", r1);
        C16670oy.A04("video_call_ended", r1);
        C16620ot.A01().A03("video_call_incoming", new C16680oz(applicationContext, new C16700p1((AudioManager) applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)), new Handler(Looper.getMainLooper())));
        RealtimeClientManager.addOtherRealtimeEventHandlerProvider(C16770p8.A00);
        RealtimeClientManager.addOtherRealtimeEventHandlerProvider(C16780p9.A00);
        RealtimeClientManager.addOtherRealtimeEventHandlerProvider(C16790pA.A00);
        C16810pC.A00 = new C16800pB(this);
    }

    public final PendingIntent A00(Context context, String str, String str2, VideoCallInfo videoCallInfo, VideoCallAudience videoCallAudience, VideoCallSource videoCallSource, int i) {
        Intent A002 = VideoCallActivity.A00(context, str, videoCallSource, videoCallAudience, videoCallInfo);
        A002.putExtra("VideoCallActivity.VIDEO_CALL_ACTIVITY_ARGUMENT_RING", true);
        A002.putExtra("VideoCallActivity.VIDEO_CALL_NOTIFICATION_ID", str2);
        AnonymousClass0XS A003 = AnonymousClass0XU.A00();
        A003.A04(A002, context.getClassLoader());
        return A003.A01(context, i, 134217728);
    }

    public final PendingIntent A01(Context context, String str, String str2, VideoCallInfo videoCallInfo, VideoCallAudience videoCallAudience, VideoCallSource videoCallSource, boolean z, int i) {
        Intent A002 = VideoCallActivity.A00(context, str, videoCallSource, videoCallAudience, videoCallInfo);
        A002.putExtra("VideoCallActivity.VIDEO_CALL_NOTIFICATION_ID", str2);
        A002.putExtra("VideoCallActivity.VIDEO_CALL_NOTIFICATION_CALL_BACK_ACTION", z);
        AnonymousClass0XS A003 = AnonymousClass0XU.A00();
        A003.A04(A002, context.getClassLoader());
        return A003.A01(context, i, 134217728);
    }

    public final void A04(Context context, AnonymousClass0C1 r4, VideoCallInfo videoCallInfo, VideoCallAudience videoCallAudience, VideoCallSource videoCallSource) {
        Intent A002 = VideoCallActivity.A00(context, r4.A04(), videoCallSource, videoCallAudience, videoCallInfo);
        if (!C16590oq.A00.A0C(r4, context) && !AnonymousClass70S.A00().booleanValue()) {
            A002.addFlags(DexStore.LOAD_RESULT_PGO);
        }
        AnonymousClass1BH.A03(A002, context);
    }

    public final void A05(AnonymousClass0C1 r3, Context context) {
        C54312Wu A012 = C54312Wu.A01(r3);
        if (A012 != null) {
            A012.A09(VideoCallWaterfall$LeaveReason.USER_INITIATED);
        } else {
            AnonymousClass0QD.A01("VideoCallPlugin", "Calling leave() with no VideoCallManager present in user session");
        }
    }

    public final void A06(AnonymousClass0C1 r3, Context context, String str) {
        C12810hQ.A02(AnonymousClass75A.A00(C54312Wu.A02(r3, context).A0J.A00, str, "REJECTED"));
    }

    public final boolean A0C(AnonymousClass0C1 r3, Context context) {
        C54312Wu A012 = C54312Wu.A01(r3);
        if (A012 == null || !A012.A0A()) {
            return false;
        }
        return true;
    }
}
