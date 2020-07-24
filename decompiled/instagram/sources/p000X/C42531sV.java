package p000X;

import android.content.Context;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import com.instagram.model.mediatype.MediaType;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.react.modules.product.IgReactGeoGatingModule;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.util.jpeg.JpegBridge;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: X.1sV  reason: invalid class name and case insensitive filesystem */
public final class C42531sV implements C06570Po {
    public final AnonymousClass0C1 A00;
    public final Context A01;
    public final C06180Ob A02 = C06190Oc.A00;

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0046  */
    public static AnonymousClass0P4 A02(C42531sV r12, String str, PendingMedia pendingMedia) {
        String A06;
        Integer num;
        ClipInfo clipInfo;
        int i;
        String str2 = pendingMedia.A24;
        C42421sK r6 = pendingMedia.A0v;
        if (Arrays.asList(new String[]{"pending_media_post", "pending_media_cancel_click", "pending_media_retry_click"}).contains(str)) {
            boolean z = false;
            if (Settings.Global.getInt(r12.A01.getContentResolver(), "airplane_mode_on", 0) != 0) {
                z = true;
            }
            if (z) {
                A06 = "Airplane mode";
                AnonymousClass0P4 A002 = AnonymousClass0P4.A00(str, (AnonymousClass0RN) null);
                A002.A0G("upload_id", str2);
                PendingMedia pendingMedia2 = pendingMedia;
                if (pendingMedia.A0q()) {
                    HashSet hashSet = new HashSet();
                    for (PendingMedia pendingMedia3 : pendingMedia.A0J()) {
                        hashSet.add(pendingMedia3.A0g);
                    }
                    if (hashSet.size() == 1) {
                        pendingMedia2 = (PendingMedia) pendingMedia.A0J().get(0);
                    } else {
                        num = Constants.A0N;
                        A002.A0G("media_type", C107434k8.A01(num));
                        A002.A0G("from", String.valueOf(r6));
                        A002.A0G("connection", A06);
                        A002.A0G("share_type", pendingMedia.A0E().toString());
                        if (pendingMedia.A0g == MediaType.VIDEO && (clipInfo = pendingMedia.A0l) != null) {
                            A002.A0E("video_duration", Integer.valueOf(clipInfo.AKe()));
                            A002.A0E("dimension", Integer.valueOf(pendingMedia.A0P));
                            A002.A0E("dimension_height", Integer.valueOf(pendingMedia.A0O));
                            C46551zw r0 = pendingMedia.A0q;
                            if (!(r0 == null || (i = r0.A00) == -1)) {
                                A002.A0E("target_bitrate", Integer.valueOf(i));
                            }
                        }
                        A0C(A002, pendingMedia);
                        if (Arrays.asList(new String[]{"pending_media_cancel_click", "pending_media_retry_click"}).contains(str)) {
                            r12.A0A(A002, pendingMedia);
                        }
                        return A002;
                    }
                }
                num = C107434k8.A00(pendingMedia2.A0A());
                A002.A0G("media_type", C107434k8.A01(num));
                A002.A0G("from", String.valueOf(r6));
                A002.A0G("connection", A06);
                A002.A0G("share_type", pendingMedia.A0E().toString());
                A002.A0E("video_duration", Integer.valueOf(clipInfo.AKe()));
                A002.A0E("dimension", Integer.valueOf(pendingMedia.A0P));
                A002.A0E("dimension_height", Integer.valueOf(pendingMedia.A0O));
                C46551zw r02 = pendingMedia.A0q;
                A002.A0E("target_bitrate", Integer.valueOf(i));
                A0C(A002, pendingMedia);
                if (Arrays.asList(new String[]{"pending_media_cancel_click", "pending_media_retry_click"}).contains(str)) {
                }
                return A002;
            }
        }
        A06 = AnonymousClass0NT.A06(AnonymousClass0NT.A01(r12.A01));
        AnonymousClass0P4 A0022 = AnonymousClass0P4.A00(str, (AnonymousClass0RN) null);
        A0022.A0G("upload_id", str2);
        PendingMedia pendingMedia22 = pendingMedia;
        if (pendingMedia.A0q()) {
        }
        num = C107434k8.A00(pendingMedia22.A0A());
        A0022.A0G("media_type", C107434k8.A01(num));
        A0022.A0G("from", String.valueOf(r6));
        A0022.A0G("connection", A06);
        A0022.A0G("share_type", pendingMedia.A0E().toString());
        A0022.A0E("video_duration", Integer.valueOf(clipInfo.AKe()));
        A0022.A0E("dimension", Integer.valueOf(pendingMedia.A0P));
        A0022.A0E("dimension_height", Integer.valueOf(pendingMedia.A0O));
        C46551zw r022 = pendingMedia.A0q;
        A0022.A0E("target_bitrate", Integer.valueOf(i));
        A0C(A0022, pendingMedia);
        if (Arrays.asList(new String[]{"pending_media_cancel_click", "pending_media_retry_click"}).contains(str)) {
        }
        return A0022;
    }

    public static AnonymousClass0P4 A03(C42531sV r3, String str, PendingMedia pendingMedia, String str2, String str3, C23160zf r8) {
        AnonymousClass0P4 A012 = A01(r3, str, (AnonymousClass0RN) null, pendingMedia);
        A012.A0G("reason", str2);
        if (r8 != null) {
            A012.A0E("sub_share_id", Integer.valueOf(r8.AX9()));
            if (r8.getTypeName().equals("UploadFinishShareTarget")) {
                A012.A0E("operation_seq_number", Integer.valueOf(pendingMedia.A0C().A00(Constants.A0Y)));
            }
        }
        A0B(A012, pendingMedia);
        A0D(A012, pendingMedia);
        A012.A0G("media_id", pendingMedia.getId());
        A012.A0D("since_share_seconds", Float.valueOf(((float) (System.currentTimeMillis() - pendingMedia.A0X)) / 1000.0f));
        A012.A0G("attempt_source", str3);
        return A012;
    }

    public static void A0K(C42531sV r2, PendingMedia pendingMedia, String str, String str2) {
        AnonymousClass0P4 A012 = A01(r2, str, (AnonymousClass0RN) null, pendingMedia);
        A012.A0G("reason", str2);
        A0H(r2, A012);
    }

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static AnonymousClass0P4 A00(C42531sV r5, C195348Xq r6, String str, String str2, long j) {
        PendingMedia pendingMedia = r6.A0A;
        int A002 = pendingMedia.A0C().A00(Constants.ZERO);
        AnonymousClass0P4 A012 = A01(r5, "pending_media_info", (AnonymousClass0RN) null, pendingMedia);
        A012.A0G("step", str);
        A012.A0F("duration_in_ms", Long.valueOf(SystemClock.elapsedRealtime() - r6.A03));
        A012.A0G("attempt_source", r6.A0F);
        A012.A0G("reason", str2);
        A012.A0E("operation_seq_number", Integer.valueOf(A002));
        if (j >= 0) {
            A012.A0F("total_size", Long.valueOf(j));
        }
        A0D(A012, r6.A0A);
        return A012;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    public static AnonymousClass0P4 A01(C42531sV r7, String str, AnonymousClass0RN r9, PendingMedia pendingMedia) {
        String A06;
        AnonymousClass0P4 A002;
        ClipInfo clipInfo;
        int i;
        String str2 = pendingMedia.A24;
        C42421sK r6 = pendingMedia.A0v;
        if (str == "pending_media_post" || str == "pending_media_cancel_click" || str == "pending_media_retry_click") {
            boolean z = false;
            if (Settings.Global.getInt(r7.A01.getContentResolver(), "airplane_mode_on", 0) != 0) {
                z = true;
            }
            if (z) {
                A06 = "Airplane mode";
                A002 = AnonymousClass0P4.A00(str, r9);
                A002.A0G("upload_id", str2);
                A002.A0G("media_type", pendingMedia.A0A().toString());
                A002.A0G("from", String.valueOf(r6));
                A002.A0G("connection", A06);
                A002.A0G("share_type", pendingMedia.A0E().toString());
                if (pendingMedia.A0g == MediaType.VIDEO && (clipInfo = pendingMedia.A0l) != null) {
                    A002.A0E("video_duration", Integer.valueOf(clipInfo.AKe()));
                    A002.A0E("dimension", Integer.valueOf(pendingMedia.A0P));
                    A002.A0E("dimension_height", Integer.valueOf(pendingMedia.A0O));
                    C46551zw r0 = pendingMedia.A0q;
                    if (!(r0 == null || (i = r0.A00) == -1)) {
                        A002.A0E("target_bitrate", Integer.valueOf(i));
                    }
                }
                if (pendingMedia.A0r()) {
                    A002.A0G("is_carousel_child", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                }
                A0C(A002, pendingMedia);
                if (str == "pending_media_cancel_click" || str == "pending_media_retry_click") {
                    r7.A0A(A002, pendingMedia);
                }
                if (pendingMedia.A3M) {
                    A002.A0E("steps_count", -1);
                }
                return A002;
            }
        }
        A06 = AnonymousClass0NT.A06(AnonymousClass0NT.A01(r7.A01));
        A002 = AnonymousClass0P4.A00(str, r9);
        A002.A0G("upload_id", str2);
        A002.A0G("media_type", pendingMedia.A0A().toString());
        A002.A0G("from", String.valueOf(r6));
        A002.A0G("connection", A06);
        A002.A0G("share_type", pendingMedia.A0E().toString());
        A002.A0E("video_duration", Integer.valueOf(clipInfo.AKe()));
        A002.A0E("dimension", Integer.valueOf(pendingMedia.A0P));
        A002.A0E("dimension_height", Integer.valueOf(pendingMedia.A0O));
        C46551zw r02 = pendingMedia.A0q;
        A002.A0E("target_bitrate", Integer.valueOf(i));
        if (pendingMedia.A0r()) {
        }
        A0C(A002, pendingMedia);
        r7.A0A(A002, pendingMedia);
        if (pendingMedia.A3M) {
        }
        return A002;
    }

    public static AnonymousClass0P4 A04(C42531sV r11, String str, C195348Xq r13) {
        C195328Xo r0;
        String str2;
        String str3;
        String sb;
        long j;
        PendingMedia pendingMedia = r13.A0A;
        AnonymousClass0P4 A012 = A01(r11, str, (AnonymousClass0RN) null, pendingMedia);
        A012.A0G("attempt_source", r13.A0F);
        A012.A0F("duration_in_ms", Long.valueOf(SystemClock.elapsedRealtime() - r13.A03));
        A012.A0G("to", String.valueOf(r13.A0A.A0v));
        int i = r13.A00;
        if (i > 0) {
            A012.A0E("attempt_loop_count", Integer.valueOf(i));
        }
        int i2 = r13.A01;
        if (i2 > 0) {
            A012.A0E("attempt_auto_retry_count", Integer.valueOf(i2));
        }
        int i3 = r13.A02;
        if (i3 > 0) {
            A012.A0E("attempt_server_retry_count", Integer.valueOf(i3));
        }
        C201908kW r6 = r13.A07;
        if (r6 != null) {
            long j2 = r6.A04;
            if (j2 >= 0) {
                A012.A0F("total_size", Long.valueOf(j2));
            }
            long j3 = r6.A01 - 0;
            long j4 = j3;
            if (j3 >= 0 && r13.A04 == r13.A0A.A0v) {
                A012.A0F("sent_size", Long.valueOf(j4));
            }
            long j5 = r6.A02;
            if (j5 >= 0) {
                A012.A0F("chunk_size", Long.valueOf(j5));
            }
            int i4 = r6.A00;
            if (i4 > 0) {
                A012.A0E("chunk_count", Integer.valueOf(i4));
            }
            long j6 = r6.A03;
            if (j6 >= 0) {
                j = SystemClock.elapsedRealtime() - j6;
            } else {
                j = -1;
            }
            if (j >= 0) {
                A012.A0F("chunk_duration", Long.valueOf(j));
            }
            String str4 = r6.A05;
            if (!TextUtils.isEmpty(str4)) {
                A012.A0G("server", str4);
            }
        }
        if (pendingMedia.A0g == MediaType.PHOTO && r13.A04 == C42421sK.NOT_UPLOADED) {
            A012.A0E("original_width", Integer.valueOf(pendingMedia.A0G));
            A012.A0E("original_height", Integer.valueOf(pendingMedia.A0F));
            A012.A0E("crop_dimension", Integer.valueOf(pendingMedia.A0A));
            A012.A0E("crop_dimension_height", Integer.valueOf(pendingMedia.A09));
            A012.A0E("dimension", Integer.valueOf(pendingMedia.A0P));
            A012.A0E("dimension_height", Integer.valueOf(pendingMedia.A0O));
            A012.A0E("quality", Integer.valueOf(pendingMedia.A08));
            synchronized (AnonymousClass82A.class) {
                AnonymousClass82A.A05();
                StringBuilder sb2 = new StringBuilder();
                if (JpegBridge.A00()) {
                    str2 = JpegBridge.getJpegLibraryNameNative();
                } else {
                    str2 = "library_not_loaded";
                }
                sb2.append(str2);
                sb2.append('/');
                if (JpegBridge.A00()) {
                    str3 = JpegBridge.getJpegLibraryVersionNative();
                } else {
                    str3 = "library_not_loaded";
                }
                sb2.append(str3);
                sb2.append('/');
                sb2.append(AnonymousClass82A.A01);
                sb2.append('@');
                sb2.append(AnonymousClass82A.A03);
                sb2.append('-');
                sb2.append(AnonymousClass82A.A00);
                sb2.append('@');
                sb2.append(AnonymousClass82A.A02);
                sb = sb2.toString();
            }
            A012.A0G("compression", sb);
            A012.A0G("photo_processing", AnonymousClass82A.A04(r11.A00));
            String str5 = pendingMedia.A1f;
            if (str5 != null) {
                A012.A0G("histogram", str5);
            }
        }
        if (r13.A04 == C42421sK.UPLOADED) {
            A0B(A012, pendingMedia);
            A0C(A012, pendingMedia);
            if (r13.A0A.A0v == C42421sK.CONFIGURED) {
                r11.A0A(A012, pendingMedia);
                if (pendingMedia.A2e) {
                    A012.A0G("wifi_only", "true");
                }
            }
        }
        C195338Xp r02 = r13.A06;
        if (r02 != null) {
            r0 = r02.A01;
        } else {
            r0 = null;
        }
        if (r0 != null) {
            A012.A0G("error_type", r0.toString());
        }
        return A012;
    }

    public static void A0B(AnonymousClass0P4 r5, PendingMedia pendingMedia) {
        int i = pendingMedia.A0C + pendingMedia.A0H;
        if (i > 0) {
            r5.A0G("auto_retry_count", Integer.toString(i));
        }
        int i2 = pendingMedia.A0L;
        if (i2 > 0) {
            r5.A0G("immediate_retry_count", Integer.toString(i2));
        }
        int i3 = pendingMedia.A0N;
        if (i3 > 0) {
            r5.A0G("manual_retry_count", Integer.toString(i3));
        }
        int i4 = pendingMedia.A0M;
        if (i4 > 0) {
            r5.A0G("loop_count", Integer.toString(i4));
        }
        int i5 = pendingMedia.A0K;
        if (i5 > 0) {
            r5.A0G("cancel_count", Integer.toString(i5));
        }
        long currentTimeMillis = (System.currentTimeMillis() - pendingMedia.A0U) / 1000;
        if (currentTimeMillis >= 0 && currentTimeMillis < 1209600) {
            r5.A0F("time_since_last_user_interaction_sec", Long.valueOf(currentTimeMillis));
        }
    }

    public static void A0D(AnonymousClass0P4 r3, PendingMedia pendingMedia) {
        r3.A0E("original_width", Integer.valueOf(pendingMedia.A0G));
        r3.A0E("original_height", Integer.valueOf(pendingMedia.A0F));
        r3.A0G("source_type", C160466sx.A00(pendingMedia.A0I));
        if (pendingMedia.A0x()) {
            r3.A0F("total_size", Long.valueOf(pendingMedia.A0Y));
            ClipInfo clipInfo = pendingMedia.A0l;
            if (clipInfo != null) {
                r3.A0F("original_video_duration_ms", Long.valueOf(clipInfo.A0B));
                r3.A0F("original_file_size", Long.valueOf(clipInfo.A0C));
            }
        }
    }

    public static void A0F(PendingMedia pendingMedia, AnonymousClass0P4 r3) {
        r3.A0F("original_file_size_bytes", Long.valueOf(AnonymousClass0P6.A02(pendingMedia.A1n)));
        r3.A0E("original_media_height", Integer.valueOf(pendingMedia.A0F));
        r3.A0E("original_media_width", Integer.valueOf(pendingMedia.A0G));
        r3.A0E("media_width", Integer.valueOf(pendingMedia.A0P));
        r3.A0E("media_height", Integer.valueOf(pendingMedia.A0O));
        r3.A0F("file_size_bytes", Long.valueOf(AnonymousClass0P6.A02(pendingMedia.A1g)));
    }

    public final void A0L(PendingMedia pendingMedia) {
        C42291s7 r3 = pendingMedia.A0n;
        for (Integer intValue : r3.A00()) {
            int intValue2 = intValue.intValue();
            AnonymousClass0P4 A022 = A02(this, "ig_media_publish_success", pendingMedia);
            A0J(this, A022, A06(pendingMedia), intValue2, (MediaType) null, A07(pendingMedia), A08(pendingMedia), pendingMedia.A0q());
            if (A022.A06.A01("ingest_surface") == null) {
                AnonymousClass0QD.A03("ingest_surface_null", A022.toString(), 1);
            }
            A0H(this, A022);
            synchronized (r3) {
                r3.A03.add(Integer.valueOf(intValue2));
            }
        }
        pendingMedia.A0R();
        AnonymousClass00B.A01.markerEnd(51052545, pendingMedia.A24.hashCode(), 2);
    }

    public final void A0M(PendingMedia pendingMedia) {
        AnonymousClass0P4 A022 = A02(this, "ig_video_render_start", pendingMedia);
        A0G(pendingMedia, A022);
        A022.A0G("ingest_type", A05(pendingMedia));
        ClipInfo clipInfo = pendingMedia.A0l;
        A022.A0E("duration_ms", Integer.valueOf(clipInfo.AKe()));
        A022.A0F("original_file_size_bytes", Long.valueOf(clipInfo.A0C));
        A022.A0E("original_media_height", Integer.valueOf(clipInfo.A07));
        A022.A0E("original_media_width", Integer.valueOf(clipInfo.A0A));
        A022.A0E("media_width", Integer.valueOf(pendingMedia.A0P));
        A022.A0E("media_height", Integer.valueOf(pendingMedia.A0O));
        A0H(this, A022);
    }

    public final void A0Q(PendingMedia pendingMedia, C23160zf r5) {
        AnonymousClass0P4 A012 = A01(this, "post_action_share", (AnonymousClass0RN) null, pendingMedia);
        A0C(A012, pendingMedia);
        A012.A0G("upload_id", pendingMedia.A24);
        A012.A0G("media_type", pendingMedia.A0A().toString());
        if (pendingMedia.A0x()) {
            A012.A0E("cover_frame_time_ms", Integer.valueOf(pendingMedia.A05));
            A012.A0G("source_type", C160466sx.A00(pendingMedia.A0I));
        }
        if (r5 != null) {
            A012.A0E("sub_share_id", Integer.valueOf(r5.AX9()));
        }
        A0I(this, A012, pendingMedia.A3F);
    }

    public final void A0R(PendingMedia pendingMedia, String str) {
        AnonymousClass0P4 A022 = A02(this, "ig_media_upload_failure", pendingMedia);
        A0G(pendingMedia, A022);
        A0E(pendingMedia, A022);
        A022.A0G("reason", str);
        A022.A0G("error_message", str);
        A0H(this, A022);
    }

    public final void A0S(PendingMedia pendingMedia, String str) {
        AnonymousClass0P4 A012 = A01(this, "pending_media_info", (AnonymousClass0RN) null, pendingMedia);
        A012.A0G("reason", str);
        A0B(A012, pendingMedia);
        A0H(this, A012);
    }

    public final void A0U(PendingMedia pendingMedia, String str, C23160zf r18) {
        String str2 = str;
        PendingMedia pendingMedia2 = pendingMedia;
        A0I(this, A03(this, "configure_media_failure", pendingMedia2, str2, (String) null, r18), pendingMedia2.A3F);
        for (Integer intValue : pendingMedia2.A0n.A00()) {
            int intValue2 = intValue.intValue();
            AnonymousClass0P4 A022 = A02(this, "ig_media_publish_failure", pendingMedia2);
            A0J(this, A022, A06(pendingMedia2), intValue2, (MediaType) null, A07(pendingMedia2), A08(pendingMedia2), pendingMedia2.A0q());
            A022.A0G("reason", str2);
            A022.A0G("error_message", str2);
            A0H(this, A022);
        }
        AnonymousClass00B.A01.markerPoint(51052545, pendingMedia2.A24.hashCode(), "configure_error", str2);
    }

    public C42531sV(Context context, AnonymousClass0C1 r3) {
        this.A01 = context.getApplicationContext();
        this.A00 = r3;
    }

    public static String A05(PendingMedia pendingMedia) {
        AnonymousClass20J A0B = pendingMedia.A0B();
        if (A0B instanceof C191788Hw) {
            return "segmented";
        }
        if (A0B instanceof AnonymousClass20I) {
            return "streaming";
        }
        if (A0B instanceof AnonymousClass26L) {
            return "sequential";
        }
        AnonymousClass0QD.A01("unknown_ingestion_strategy_configuration", "configuration: " + A0B);
        return "unknown";
    }

    public static String A06(PendingMedia pendingMedia) {
        if (pendingMedia.A0r()) {
            return pendingMedia.A1q;
        }
        String str = pendingMedia.A1w;
        if (str == null) {
            return pendingMedia.A24;
        }
        return str;
    }

    public static String A07(PendingMedia pendingMedia) {
        return A09(pendingMedia.A0E());
    }

    public static String A08(PendingMedia pendingMedia) {
        switch (pendingMedia.A0E().ordinal()) {
            case 0:
            case 7:
                return IgReactGeoGatingModule.SETTING_TYPE_FEED;
            case 1:
                return "direct_permanent";
            case 2:
                return "story";
            case 3:
                return "direct_ephemeral";
            case 5:
                return "story_or_direct_ephemeral";
            case 6:
                return "nametag_selfie";
            case 8:
            case C120125Dh.VIEW_TYPE_LINK /*14*/:
                return "igtv";
            case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                return "clips";
            case 15:
                return "igtv_post_live_to_cover_photo";
            default:
                return "invalid";
        }
    }

    public static String A09(ShareType shareType) {
        switch (shareType.ordinal()) {
            case 0:
            case 7:
                return IgReactGeoGatingModule.SETTING_TYPE_FEED;
            case 1:
                return "direct_permanent";
            case 2:
            case 5:
                return "story_or_direct_ephemeral";
            case 3:
                return "direct_ephemeral";
            case 6:
                return "nametag_selfie";
            case 8:
                return "igtv";
            case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                return "clips";
            case C120125Dh.VIEW_TYPE_LINK /*14*/:
                return "post_live_igtv";
            case 15:
                return "igtv_post_live_to_cover_photo";
            default:
                return "invalid";
        }
    }

    private void A0A(AnonymousClass0P4 r6, PendingMedia pendingMedia) {
        long currentTimeMillis = (System.currentTimeMillis() - pendingMedia.A0X) / 1000;
        if (currentTimeMillis >= 0 && currentTimeMillis < 1209600) {
            r6.A0F("post_duration_sec", Long.valueOf(currentTimeMillis));
        }
    }

    public static void A0C(AnonymousClass0P4 r2, PendingMedia pendingMedia) {
        if (!TextUtils.isEmpty(pendingMedia.A0G())) {
            r2.A0G("waterfall_id", pendingMedia.A0G());
        }
    }

    public static void A0E(PendingMedia pendingMedia, AnonymousClass0P4 r9) {
        A0G(pendingMedia, r9);
        if (pendingMedia.A0x()) {
            ClipInfo clipInfo = pendingMedia.A0l;
            r9.A0E("duration_ms", Integer.valueOf(clipInfo.AKe()));
            r9.A0F("original_file_size_bytes", Long.valueOf(clipInfo.A0C));
            r9.A0E("original_media_height", Integer.valueOf(clipInfo.A07));
            r9.A0E("original_media_width", Integer.valueOf(clipInfo.A0A));
            r9.A0E("media_width", Integer.valueOf(pendingMedia.A0P));
            r9.A0E("media_height", Integer.valueOf(pendingMedia.A0O));
            r9.A0G("ingest_type", A05(pendingMedia));
            r9.A0F("file_size_bytes", Long.valueOf(pendingMedia.A0Y));
        } else if (pendingMedia.A0u()) {
            A0F(pendingMedia, r9);
        } else {
            boolean z = false;
            if (pendingMedia.A0g == MediaType.AUDIO) {
                z = true;
            }
            if (z) {
                AnonymousClass2CZ r3 = pendingMedia.A0i;
                long A022 = AnonymousClass0P6.A02(r3.A01);
                r9.A0E("duration_ms", Integer.valueOf(r3.AKe()));
                Long valueOf = Long.valueOf(A022);
                r9.A0F("original_file_size_bytes", valueOf);
                r9.A0G("ingest_type", A05(pendingMedia));
                r9.A0F("file_size_bytes", valueOf);
            }
        }
    }

    public static void A0G(PendingMedia pendingMedia, AnonymousClass0P4 r3) {
        r3.A0G("session_id", A06(pendingMedia));
        r3.A0G("ingest_surface", A07(pendingMedia));
        r3.A0A("is_carousel_item", Boolean.valueOf(pendingMedia.A0q()));
        r3.A0G("ingest_id", pendingMedia.A24);
    }

    public static void A0H(C42531sV r2, AnonymousClass0P4 r3) {
        if (C12670hC.A08()) {
            boolean z = false;
            if (C14220jx.A01 != null) {
                z = true;
            }
            if (!z) {
                C05700Lp.A00().ADc(new AnonymousClass4WI(r2, r3));
                return;
            }
        }
        AnonymousClass0WN.A01(r2.A00).BcG(r3);
    }

    public static void A0I(C42531sV r2, AnonymousClass0P4 r3, C42421sK r4) {
        r3.A0G("target", String.valueOf(r4));
        A0H(r2, r3);
    }

    public static void A0J(C42531sV r2, AnonymousClass0P4 r3, String str, int i, MediaType mediaType, String str2, String str3, boolean z) {
        r3.A0G("session_id", str);
        r3.A0G("ingest_surface", str2);
        r3.A0G("target_surface", str3);
        r3.A0E("publish_id", Integer.valueOf(i));
        r3.A0A("is_carousel_item", Boolean.valueOf(z));
        if (mediaType != null) {
            r3.A0G("media_type", C107434k8.A01(C107434k8.A00(mediaType)));
        }
        r3.A0G("connection", AnonymousClass0NT.A06(AnonymousClass0NT.A01(r2.A01)));
    }

    public final void A0N(PendingMedia pendingMedia) {
        pendingMedia.A0E();
        pendingMedia.A0M(C23160zf.class);
        if (!pendingMedia.A0q()) {
            AnonymousClass0P4 A022 = A02(this, "ig_media_ingest_start", pendingMedia);
            A022.A0G("session_id", A06(pendingMedia));
            A022.A0G("ingest_id", pendingMedia.A24);
            A022.A0G("ingest_surface", A07(pendingMedia));
            A022.A0G("target_surface", A08(pendingMedia));
            A022.A0A("is_carousel_item", Boolean.valueOf(pendingMedia.A0r()));
            A0H(this, A022);
        }
    }

    public final void A0O(PendingMedia pendingMedia) {
        int i;
        if (pendingMedia.A0q()) {
            for (PendingMedia A0O : pendingMedia.A0J()) {
                A0O(A0O);
            }
            return;
        }
        C42291s7 r5 = pendingMedia.A0n;
        if (!r5.A04) {
            AnonymousClass0P4 A022 = A02(this, "ig_media_publish_ready", pendingMedia);
            A022.A0G("session_id", A06(pendingMedia));
            A022.A0G("ingest_id", pendingMedia.A24);
            A022.A0G("ingest_surface", A07(pendingMedia));
            A022.A0G("target_surface", A08(pendingMedia));
            A022.A0A("is_carousel_item", Boolean.valueOf(pendingMedia.A0r()));
            if (pendingMedia.A0x()) {
                A022.A0F("file_size_bytes", Long.valueOf(pendingMedia.A0Y));
                i = pendingMedia.A0l.AKe();
            } else {
                boolean z = false;
                if (pendingMedia.A0g == MediaType.AUDIO) {
                    z = true;
                }
                if (z) {
                    AnonymousClass2CZ r6 = pendingMedia.A0i;
                    if (r6 != null) {
                        A022.A0F("file_size_bytes", Long.valueOf(AnonymousClass0P6.A02(r6.A01)));
                        i = r6.AKe();
                    }
                    A0H(this, A022);
                    r5.A04 = true;
                }
                if (pendingMedia.A0u()) {
                    A022.A0F("file_size_bytes", Long.valueOf(AnonymousClass0P6.A02(pendingMedia.A1g)));
                    i = 0;
                }
                A0H(this, A022);
                r5.A04 = true;
            }
            A022.A0E("duration_ms", Integer.valueOf(i));
            A0H(this, A022);
            r5.A04 = true;
        }
    }

    public final void A0P(PendingMedia pendingMedia) {
        A0H(this, A01(this, "upload_video_attempt", (AnonymousClass0RN) null, pendingMedia));
        AnonymousClass0P4 A022 = A02(this, "ig_media_upload_start", pendingMedia);
        A0E(pendingMedia, A022);
        A0H(this, A022);
    }

    public final void A0T(PendingMedia pendingMedia, String str, long j) {
        AnonymousClass0P4 A012 = A01(this, "streaming_upload_resume", (AnonymousClass0RN) null, pendingMedia);
        A012.A0G("reason", str);
        A012.A0F("duration_in_ms", Long.valueOf(j));
        A0H(this, A012);
    }

    public final void A0V(PendingMedia pendingMedia, String str, String str2, int i, int i2, String str3) {
        AnonymousClass0P4 A012 = A01(this, "segment_upload_failure", (AnonymousClass0RN) null, pendingMedia);
        A012.A0G("upload_job_id", str);
        A012.A0G("stream_id", str2);
        A012.A0E("previously_transfered", Integer.valueOf(i));
        A012.A0E("rendered_segments_count", Integer.valueOf(i2));
        A012.A0G("error_message", str3);
        A0I(this, A012, pendingMedia.A3F);
    }

    public final void A0W(C195348Xq r7, String str, boolean z) {
        AnonymousClass0P4 A002 = A00(this, r7, "render_video_attempt_skip", str, -1);
        A002.A0A("skip_render", Boolean.valueOf(z));
        A0H(this, A002);
    }
}
