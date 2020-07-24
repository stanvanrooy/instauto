package p000X;

import android.content.Context;
import com.instagram.strings.StringBridge;
import java.util.Arrays;
import java.util.HashSet;
import org.webrtc.HardwareVideoEncoderFactory;

/* renamed from: X.05a  reason: invalid class name and case insensitive filesystem */
public final class C030105a extends C08680Yc {
    public final Context A00;
    public final C08540Xm A01;

    public C030105a(Context context, C08540Xm r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    public final void A06() {
        super.A06();
        this.A04.add(AnonymousClass0YJ.class);
        this.A04.add(AnonymousClass0b1.class);
    }

    /* JADX WARNING: type inference failed for: r4v31, types: [X.05c] */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void A07() {
        C030205b r4;
        AnonymousClass2LU r0;
        int A03 = AnonymousClass0Z0.A03(1824804605);
        Context context = this.A00;
        C06590Pq r2 = this.A01.A00;
        if (!StringBridge.A00) {
            String str = C07000Rj.A00;
            if (C22270y8.A01().A06(C22470yU.DEVELOPER_OPTIONS)) {
                String string = AnonymousClass0RK.A00().A00.getString("logging_host", "");
                if (!string.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    if (!string.contains("://")) {
                        sb.append("https://");
                    }
                    sb.append(string);
                    sb.append("/logging_client_events");
                    str = sb.toString();
                }
            }
            C22480yV r11 = new C22480yV();
            AnonymousClass0RZ A002 = AnonymousClass0a8.A00();
            boolean z = !C05770Lw.A00().A00.getBoolean("event_sampling_disabled", false);
            if (C22490yW.A00()) {
                r4 = new C030305c(A002, context, str, r11);
            } else {
                AnonymousClass0RQ r02 = new AnonymousClass0RQ();
                AnonymousClass0L7 r23 = AnonymousClass0L7.LOGGING_METRIC_UNIVERSE_V2;
                r02.A0F = C05630Li.A03(new C05000Hl("is_beacon_enabled", r23, (Object) null, (String[]) null, (AnonymousClass04H) null));
                r02.A0G = C05630Li.A03(new C05000Hl("is_funnel_logging_enabled", r23, (Object) null, (String[]) null, (AnonymousClass04H) null));
                r02.A0P = C05630Li.A03(new C05000Hl("use_idle_handler", r23, (Object) null, (String[]) null, (AnonymousClass04H) null));
                r02.A07 = C05630Li.A00(new C05000Hl("max_batch_size", r23, 50, new String[]{"50"}, (AnonymousClass04H) null));
                r02.A0O = ((Boolean) AnonymousClass0L6.A00(r2, AnonymousClass0L7.FILE_BASED_SESSION_2, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
                r02.A0Q = C05630Li.A03(new C05000Hl("enabled", AnonymousClass0L7.DELAYED_ANALYTICS, (Object) null, (String[]) null, (AnonymousClass04H) null));
                r02.A0J = ((Boolean) AnonymousClass0L6.A00(r2, AnonymousClass0L7.ANALYTICS_MULTI_BATCH, "is_enabled", true, (AnonymousClass04H) null)).booleanValue();
                r02.A03 = ((Integer) AnonymousClass0L6.A00(r2, AnonymousClass0L7.ANALYTICS_MULTI_BATCH, "min_payload_size", 10000, (AnonymousClass04H) null)).intValue();
                AnonymousClass0L7 r14 = AnonymousClass0L7.ANALYTICS_MULTI_BATCH;
                r02.A02 = ((Integer) AnonymousClass0L6.A00(r2, r14, "max_file_size", 300000, (AnonymousClass04H) null)).intValue();
                r02.A0K = ((Boolean) AnonymousClass0L6.A00(r2, r14, "is_streaming_enabled", false, (AnonymousClass04H) null)).booleanValue();
                r02.A0I = ((Boolean) AnonymousClass0L6.A00(r2, r14, "is_hi_pri_multi_batch_enabled", false, (AnonymousClass04H) null)).booleanValue();
                r02.A07 = ((Integer) AnonymousClass0L6.A00(r2, r14, "batch_size", 50, (AnonymousClass04H) null)).intValue();
                r02.A06 = ((Integer) AnonymousClass0L6.A00(r2, r14, "hi_pri_min_payload_size", 10000, (AnonymousClass04H) null)).intValue();
                r02.A05 = ((Integer) AnonymousClass0L6.A00(r2, r14, "hi_pri_max_file_size", Integer.valueOf(HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS), (AnonymousClass04H) null)).intValue();
                String str2 = (String) AnonymousClass0L6.A00(r2, r14, "dyno_stats_tags", "", (AnonymousClass04H) null);
                if (str2 == null || str2.isEmpty()) {
                    r02.A0D = null;
                } else {
                    r02.A0D = str2;
                }
                r02.A04 = ((Integer) AnonymousClass0L6.A00(r2, r14, "fg_regular_upload_min_timeout", 3000, (AnonymousClass04H) null)).intValue();
                r02.A0M = ((Boolean) AnonymousClass0L6.A00(r2, r14, "is_scheduled_logger_enabled", false, (AnonymousClass04H) null)).booleanValue();
                r02.A0H = ((Boolean) AnonymousClass0L6.A00(r2, r14, "microbatching_enabled", false, (AnonymousClass04H) null)).booleanValue();
                r02.A0C = (long) ((Integer) AnonymousClass0L6.A00(r2, r14, "zero_latency_timeout", 100, (AnonymousClass04H) null)).intValue();
                String str3 = (String) AnonymousClass0L6.A00(r2, r14, "realtime_event_names", "instagram_ad_webview_end", (AnonymousClass04H) null);
                String str4 = str3;
                if (str3 != null && str3.length() > 0) {
                    r02.A0E = new HashSet(Arrays.asList(str4.split(",")));
                }
                r02.A0B = (long) ((Integer) AnonymousClass0L6.A00(r2, r14, "regular_latency_default_timeout", 120000, (AnonymousClass04H) null)).intValue();
                r02.A0L = ((Boolean) AnonymousClass0L6.A00(r2, r14, "pre_encoded_files_enabled", false, (AnonymousClass04H) null)).booleanValue();
                r02.A0A = (long) ((Integer) AnonymousClass0L6.A00(r2, r14, "min_video_playback_event_store_timeout", 1000, (AnonymousClass04H) null)).intValue();
                r02.A08 = (long) ((Integer) AnonymousClass0L6.A00(r2, r14, "max_staleness_timeout", 10000, (AnonymousClass04H) null)).intValue();
                r02.A09 = (long) ((Integer) AnonymousClass0L6.A00(r2, r14, "min_microbatch_actions", 10, (AnonymousClass04H) null)).intValue();
                Double valueOf = Double.valueOf(0.0d);
                r02.A00 = ((Double) AnonymousClass0L6.A00(r2, r14, "min_busy_interaction_condition", valueOf, (AnonymousClass04H) null)).doubleValue();
                r02.A01 = ((Double) AnonymousClass0L6.A00(r2, r14, "min_busy_video_condition", valueOf, (AnonymousClass04H) null)).doubleValue();
                r02.A0R = ((Boolean) AnonymousClass0L6.A00(r2, r14, "is_plain_batch_file_enabled", false, (AnonymousClass04H) null)).booleanValue();
                r02.A0N = ((Boolean) AnonymousClass0L6.A00(r2, AnonymousClass0L7.ANALYTICS_SHOULD_CHECK_RECOVERY_FILES, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
                C05640Lj.A00(AnonymousClass0L7.MISATTRIBUTION_LOGVIEW, "enabled", false);
                AnonymousClass0RZ r17 = A002;
                r4 = new C030205b(r17, context, str, z, r11, r02);
            }
            C13890jP.A00().A01(new C22500yX(C08150Vv.A00()));
            AnonymousClass0WN.A00 = r4;
            for (C06590Pq r42 : AnonymousClass0WN.A01) {
                Class<C06320Op> cls = C06320Op.class;
                C06320Op r1 = (C06320Op) r42.AV9(cls);
                if (r1 != null) {
                    r1.A02(AnonymousClass0WN.A01(r42));
                    r1.A01();
                    r42.BbT(cls);
                }
            }
            AnonymousClass0WN.A01.clear();
            C22890zA r5 = C22890zA.BatchUpload;
            int intValue = ((Integer) AnonymousClass0L6.A00(r2, AnonymousClass0L7.ANALYTICS_BACKGROUND_UPLOADER_SCHEDULE, "delay_minutes", -1, (AnonymousClass04H) null)).intValue();
            if (intValue > 0) {
                r5.A00 = ((long) intValue) * 60000;
            }
            boolean booleanValue = ((Boolean) AnonymousClass0L6.A00(r2, AnonymousClass0L7.LI_SESSION_CHAINING, "is_enabled", false, (AnonymousClass04H) null)).booleanValue();
            C22900zC.A00 = booleanValue;
            if (booleanValue) {
                r0 = AnonymousClass2LT.A00;
            } else {
                r0 = null;
            }
            AnonymousClass0RM.A00 = r0;
        }
        C22910zD.A00(context, r2);
        AnonymousClass0Z0.A0A(1000460227, A03);
    }
}
