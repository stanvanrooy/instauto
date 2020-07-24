package p000X;

import android.app.Activity;
import android.content.Context;
import android.provider.Settings;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.AWM */
public final class AWM {
    public static void A02(AnonymousClass0P4 r2, AZi aZi) {
        r2.A0A("disable_build_in_aec", Boolean.valueOf(aZi.A07));
        r2.A0A("disable_build_in_ns", Boolean.valueOf(aZi.A08));
    }

    public static void A03(String str, AnonymousClass0P4 r4, int i, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder("Reason:");
        sb.append(str3);
        if (str4 != null) {
            sb.append(", Description:");
            sb.append(str4);
        }
        if (str5 != null) {
            sb.append(", Full Description:");
            sb.append(str5);
        }
        AnonymousClass0DB.A0D(str, sb.toString());
        r4.A0E(TraceFieldType.ErrorCode, Integer.valueOf(i));
        r4.A0G(TraceFieldType.ErrorDomain, str2);
        r4.A0G("error_info", sb.toString());
    }

    public static C06270Ok A00(C15780nW r7, C23724Aa8 aa8, C475124h r9) {
        Activity activity;
        C06270Ok A00 = C06270Ok.A00();
        r7.A01();
        C15780nW.A00(r7);
        A00.A07("battery_level", Integer.valueOf(r7.A00));
        C15780nW.A00(r7);
        A00.A09("battery_status", r7.A03);
        if (r7.A01 == -1 && (activity = (Activity) AnonymousClass0PK.A01(r7.A08, Activity.class)) != null) {
            double d = (double) activity.getWindow().getAttributes().screenBrightness;
            if (d > 0.0d) {
                r7.A01 = (int) Math.round(255.0d * d);
            }
        }
        if (r7.A01 == -1) {
            try {
                r7.A01 = Settings.System.getInt(r7.A08.getContentResolver(), "screen_brightness");
            } catch (Settings.SettingNotFoundException unused) {
            }
        }
        A00.A07("screen_brightness", Integer.valueOf(r7.A01));
        C475124h A01 = C475024g.A01(C475024g.A02(AnonymousClass0C5.$const$string(41)));
        A00.A00.A03("cpu_kernel_time", Double.valueOf(A01.A00 - r9.A00));
        A00.A00.A03("cpu_user_time", Double.valueOf(A01.A01 - r9.A01));
        if (aa8 != null) {
            A00.A09("camera_size", C23724Aa8.A00(aa8.A04));
            A00.A09("screen_size", C23724Aa8.A00(aa8.A06));
            A00.A09("streaming_video_size", C23724Aa8.A00(aa8.A07));
            double d2 = aa8.A01;
            boolean z = false;
            if (d2 >= 0.0d) {
                z = true;
            }
            if (z) {
                A00.A07("input_video_bitrate", Integer.valueOf((int) d2));
            }
            double d3 = aa8.A00;
            boolean z2 = false;
            if (d3 >= 0.0d) {
                z2 = true;
            }
            if (z2) {
                A00.A07(TraceFieldType.Throughput, Integer.valueOf((int) d3));
            }
            String str = aa8.A0E;
            if (str != null) {
                A00.A09("video_encoder_name", str);
            }
            int i = aa8.A02;
            boolean z3 = false;
            if (i >= 0) {
                z3 = true;
            }
            if (z3) {
                A00.A07("lag", Integer.valueOf(i));
            }
            Integer num = aa8.A0B;
            boolean z4 = false;
            if (num != null) {
                z4 = true;
            }
            if (z4) {
                A00.A07("render_fps", num);
            }
            Integer num2 = aa8.A0A;
            boolean z5 = false;
            if (num2 != null) {
                z5 = true;
            }
            if (z5) {
                A00.A07("live_encode_fps", num2);
            }
            Integer num3 = aa8.A09;
            boolean z6 = false;
            if (num3 != null) {
                z6 = true;
            }
            if (z6) {
                A00.A07("dvr_encode_fps", num3);
            }
        }
        return A00;
    }

    public static void A01(AnonymousClass0P4 r4, Context context, AOK aok) {
        String str = "0";
        if (AnonymousClass3TG.A01(context)) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        }
        r4.A0G(C193418Ps.$const$string(155), str);
        r4.A0G("has_face_effect", "0");
    }
}
