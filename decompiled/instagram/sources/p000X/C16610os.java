package p000X;

import android.net.Uri;
import com.facebook.proxygen.TraceEventType;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0os  reason: invalid class name and case insensitive filesystem */
public final class C16610os {
    public static final long A02 = TimeUnit.MINUTES.toMillis(1);
    public final C16600or A00;
    public final String A01;

    public static AnonymousClass0P4 A00(C16610os r2, C16600or r3, Integer num, String str, String str2, String str3) {
        String str4;
        AnonymousClass0P4 A012 = AnonymousClass0P4.A01("ig_video_call_notification_waterfall", r3.A00);
        A012.A0G("waterfall_id", AnonymousClass000.A0O(str2, "_", str, "_", r2.A01));
        switch (num.intValue()) {
            case 1:
                str4 = "notif_ignored";
                break;
            case 2:
                str4 = "notif_displayed";
                break;
            case 3:
                str4 = "notif_action";
                break;
            default:
                str4 = "notif_received";
                break;
        }
        A012.A0G("step", str4);
        A012.A0G("thread_id", str3);
        A012.A0G("video_call_id", str2);
        return A012;
    }

    private AnonymousClass0P4 A01(Integer num, C42861tN r12) {
        long j;
        Uri parse = Uri.parse(r12.A06);
        String queryParameter = parse.getQueryParameter("vc_id");
        String queryParameter2 = parse.getQueryParameter("surface_id");
        AnonymousClass0P4 A002 = A00(this, this.A00, num, r12.A08, queryParameter, queryParameter2);
        A002.A0G("notification_id", parse.getQueryParameter("push_notification_id"));
        A002.A0G("notification_type", AnonymousClass6K8.A00(A02(r12)));
        try {
            j = Long.parseLong(parse.getQueryParameter(TraceFieldType.StartTime));
        } catch (NumberFormatException unused) {
            j = -1;
        }
        A002.A0F("server_job_start_time", Long.valueOf(j));
        return A002;
    }

    public static Integer A02(C42861tN r1) {
        String str = r1.A03;
        if ("video_call_incoming".equals(str)) {
            return Constants.ZERO;
        }
        if ("video_call_ended".equals(str)) {
            return Constants.ONE;
        }
        return Constants.A0C;
    }

    public static void A03(C42861tN r10) {
        long j;
        try {
            j = Long.parseLong(Uri.parse(r10.A06).getQueryParameter(TraceFieldType.StartTime));
        } catch (NumberFormatException unused) {
            j = -1;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - j;
        String queryParameter = Uri.parse(r10.A06).getQueryParameter("vc_id");
        String str = "Type: " + AnonymousClass6K8.A00(A02(r10)) + " Server sent time: " + j + " Client received time: " + currentTimeMillis + " Delay: " + j2 + " VideoCallID: " + queryParameter;
        if (j != -1 && j2 >= A02) {
            AnonymousClass0QD.A01("VideoCallNotificationsLoggerImpl", AnonymousClass000.A0E("Delay in receiving push notification. ", str));
        }
    }

    public final void A04(C42861tN r7) {
        AnonymousClass0P4 A012 = A01(Constants.ZERO, r7);
        A012.A0G("recipient_id", r7.A08);
        AnonymousClass0WN.A00().BcG(A012);
        A03(r7);
        Uri parse = Uri.parse(r7.A06);
        String queryParameter = parse.getQueryParameter("vc_id");
        String queryParameter2 = parse.getQueryParameter(TraceFieldType.StartTime);
        String A002 = AnonymousClass6K8.A00(A02(r7));
        String str = r7.A05;
        AnonymousClass0J1.A09(r7.A08, Constants.A03, new C137225tH(str, queryParameter2, queryParameter, A002), (C05180Im) null);
    }

    public final void A05(C42861tN r4, Integer num) {
        String str;
        AnonymousClass0P4 A012 = A01(Constants.A0C, r4);
        if (1 - num.intValue() != 0) {
            str = TraceEventType.Push;
        } else {
            str = "incoming_call";
        }
        A012.A0G("display_type", str);
        A012.A0G("recipient_id", r4.A08);
        AnonymousClass0WN.A00().BcG(A012);
    }

    public final void A06(C42861tN r4, Integer num) {
        String str;
        AnonymousClass0P4 A012 = A01(Constants.ONE, r4);
        switch (num.intValue()) {
            case 1:
                str = "not supported";
                break;
            case 2:
                str = "not active user";
                break;
            case 3:
                str = DialogModule.ACTION_DISMISSED;
                break;
            default:
                str = "not logged in";
                break;
        }
        A012.A0G("reason", str);
        A012.A0G("recipient_id", r4.A08);
        AnonymousClass0WN.A00().BcG(A012);
        A03(r4);
    }

    public C16610os(C16600or r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }
}
