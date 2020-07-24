package p000X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import com.facebook.C0003R;
import com.instagram.model.videocall.VideoCallAudience;
import com.instagram.model.videocall.VideoCallInfo;
import com.instagram.model.videocall.VideoCallSource;
import com.instagram.model.videocall.VideoCallThreadSurfaceKey;
import com.instagram.notifications.push.VideoCallDeclineActionReceiver;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0oz  reason: invalid class name and case insensitive filesystem */
public final class C16680oz implements C16690p0 {
    public static final long A03 = TimeUnit.SECONDS.toMillis(30);
    public final Handler A00;
    public final Context A01;
    public final C16700p1 A02;

    public final Object ABo(String str) {
        return C42861tN.A00(str, (String) null);
    }

    public final String AHw() {
        return "video_call_incoming";
    }

    /* JADX WARNING: type inference failed for: r22v3, types: [com.instagram.common.typedurl.ImageUrl] */
    /* JADX WARNING: type inference failed for: r29v0, types: [com.instagram.common.typedurl.ImageUrl] */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0077, code lost:
        if (r4 != false) goto L_0x0079;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    public final C59722i7 A71(AnonymousClass0C1 r33, String str, List list, boolean z) {
        VideoCallAudience videoCallAudience;
        C16600or r11;
        String id;
        PendingIntent A012;
        String AHw = AHw();
        String str2 = str;
        List list2 = list;
        AnonymousClass2O4 A032 = C59672hx.A03(this.A01, AHw, str2, list2);
        A032.A04(C019000b.A00(this.A01, C0003R.color.ig_led_color));
        C42861tN r1 = (C42861tN) list2.get(list2.size() - 1);
        boolean equals = "video_call_incoming".equals(r1.A03);
        Context context = this.A01;
        AnonymousClass0C1 r6 = r33;
        C145376Jj r2 = new C145376Jj(context, r6, AHw);
        if (equals) {
            A032.A09.when = 0;
            A032.A0F = "call";
            A032.A07 = 2;
            AnonymousClass2O4.A01(A032, 2, true);
            String string = context.getString(C0003R.string.videocall_incoming_call_notification_decline_button);
            String string2 = this.A01.getString(C0003R.string.videocall_incoming_call_notification_join_button);
            boolean z2 = true;
            if (this.A02.A00.getRingerMode() != 1) {
                z2 = false;
            }
            if (!z2) {
                boolean z3 = false;
                if (this.A02.A00.getRingerMode() == 2) {
                    z3 = true;
                }
            }
            A032.A09.vibrate = C23937Adw.A00;
            A032.A03(1);
            String queryParameter = Uri.parse(r1.A06).getQueryParameter("vc_id");
            String str3 = r1.A08;
            Intent intent = new Intent(r2.A00, VideoCallDeclineActionReceiver.class);
            intent.setData(C143476Bu.A00(r2.A02, str2));
            intent.putExtra("vc_id", queryParameter).putExtra("recipient_id", str3);
            PendingIntent broadcast = PendingIntent.getBroadcast(r2.A00, 64278, intent, 268435456);
            A032.A09.deleteIntent = broadcast;
            A032.A05(0, string, broadcast);
            if (((Boolean) AnonymousClass0L6.A02(r6, AnonymousClass0L7.VC_EXPLICIT_INTENT_FOR_NOTIFICATION, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                VideoCallInfo A013 = C145376Jj.A01(r1);
                VideoCallAudience A002 = C145376Jj.A00(r1);
                VideoCallSource A022 = r2.A02(r1);
                String str4 = str2;
                A032.A0A = C16590oq.A00.A01(r2.A00, r1.A08, str4, A013, A002, A022, false, 64278);
                VideoCallInfo A014 = C145376Jj.A01(r1);
                VideoCallAudience A003 = C145376Jj.A00(r1);
                VideoCallSource A023 = r2.A02(r1);
                A012 = C16590oq.A00.A01(r2.A00, r1.A08, str4, A014, A003, A023, false, 64278);
            } else {
                A012 = C59672hx.A01(this.A01, r1, (String) null);
            }
            A032.A05(0, string2, A012);
            String str5 = r1.A08;
            if (r33 != null && r6.A04().equals(str5)) {
                Uri parse = Uri.parse(r1.A06);
                String queryParameter2 = parse.getQueryParameter("vc_id");
                String queryParameter3 = parse.getQueryParameter("surface_id");
                String str6 = r1.A08;
                VideoCallSource videoCallSource = new VideoCallSource(C16600or.RING_SCREEN, C103484dZ.THREAD, VideoCallThreadSurfaceKey.A00(queryParameter3));
                A032.A0B = C16590oq.A00.A00(r2.A00, str6, str2, C145376Jj.A01(r1), C145376Jj.A00(r1), videoCallSource, AnonymousClass000.A0E(queryParameter2, str6).hashCode());
                AnonymousClass2O4.A01(A032, 128, true);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                A032.A08 = A03;
            } else {
                AnonymousClass0ZA.A09(this.A00, new C23936Adv(str2), A03, 595847948);
            }
        } else {
            A032.A07 = 1;
            boolean z4 = true;
            if (this.A02.A00.getRingerMode() != 1) {
                z4 = false;
            }
            if (z4) {
                A032.A09.vibrate = C23937Adw.A01;
            }
            if (((Boolean) AnonymousClass0L6.A02(r6, AnonymousClass0L7.VC_EXPLICIT_INTENT_FOR_NOTIFICATION, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                String string3 = this.A01.getString(C0003R.string.videocall_missed_call_notification_call_back_action);
                String queryParameter4 = Uri.parse(r1.A06).getQueryParameter("surface_id");
                AnonymousClass0C1 r12 = r2.A01;
                if (r12 != null) {
                    C21860xP.A00.A00();
                    Context context2 = r2.A00;
                    C13300iJ r10 = r12.A06;
                    C66112uw ALW = C19290tE.A00(r12).ALW(queryParameter4);
                    videoCallAudience = null;
                    if (ALW != null) {
                        List A033 = C58942gm.A03(r12.A06, ALW.AQ1());
                        boolean Aff = ALW.Aff();
                        String A024 = AnonymousClass41K.A02(context2, r12, false, ALW);
                        String str7 = "";
                        if (r10 == null) {
                            AnonymousClass0QD.A01("AnalyticsEvent", "create video call audience with a null caller");
                            id = str7;
                        } else {
                            str7 = r10.AZn();
                            id = r10.getId();
                            videoCallAudience = r10.ASv();
                        }
                        videoCallAudience = new VideoCallAudience(A033, Aff, ALW.Afz(), A024, str7, videoCallAudience, id, ALW.APz());
                    }
                } else {
                    videoCallAudience = null;
                }
                if (videoCallAudience != null) {
                    if (C06080Nr.A09(r2.A00)) {
                        r11 = C16600or.THREADS_APP_MISSED_CALL_NOTIFICATION;
                    } else {
                        r11 = C16600or.MISSED_CALL_NOTIFICATION;
                    }
                    VideoCallSource videoCallSource2 = new VideoCallSource(r11, C103484dZ.THREAD, VideoCallThreadSurfaceKey.A00(queryParameter4));
                    A032.A05(0, string3, C16590oq.A00.A01(r2.A00, r1.A08, str2, (VideoCallInfo) null, videoCallAudience, videoCallSource2, true, 64278));
                }
            } else {
                Context context3 = this.A01;
                A032.A05(0, context3.getString(C0003R.string.videocall_missed_call_notification_call_back_action), C59672hx.A01(context3, r1, "action_call_back"));
            }
        }
        Notification A025 = A032.A02();
        if (equals) {
            A025.flags |= 4;
        } else {
            A025.flags &= -5;
        }
        C237211o.A01(this.A01, A025, list2);
        return new C59722i7(A025, AHw, C59672hx.A04(list2, 10), r1.A06);
    }

    public final SharedPreferences AVy() {
        return C05750Lu.A00("insta_video_call_notifications");
    }

    public final String BfS(Object obj) {
        return ((C42861tN) obj).A01();
    }

    public C16680oz(Context context, C16700p1 r3, Handler handler) {
        this.A01 = context.getApplicationContext();
        this.A02 = r3;
        this.A00 = handler;
    }

    public final boolean A5l(Object obj, Object obj2) {
        return false;
    }
}
