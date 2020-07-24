package p000X;

import android.os.SystemClock;
import com.facebook.proxygen.TraceFieldType;
import java.util.HashMap;

/* renamed from: X.1op  reason: invalid class name and case insensitive filesystem */
public final class C40541op {
    public AnonymousClass42W A00;
    public final AnonymousClass00B A01;
    public final C40461oh A02;
    public final C40491ok A03;

    public static void A00(C40541op r1, C54382Xb r2) {
        AnonymousClass42W r12 = r1.A00;
        if (r12 != null) {
            r2.A02 = Integer.valueOf(r12.A00);
            r2.A09 = r12.A01;
            r2.A08 = r12.A02;
        }
    }

    public static void A01(C40541op r24, C54392Xc r25) {
        int intValue;
        int intValue2;
        int intValue3;
        String str;
        C40541op r12 = r24;
        if (r12.A03.A00()) {
            r12.A01.A0M(28180483, 1);
            C54392Xc r11 = r25;
            int hashCode = r11.A0D.hashCode();
            r12.A01.markerStart(28180483, hashCode);
            String str2 = r11.A0D;
            String str3 = str2;
            int indexOf = str2.indexOf(95);
            if (indexOf > -1) {
                str3 = str3.substring(0, indexOf);
            }
            String str4 = r11.A09;
            Integer num = r11.A05;
            int i = r11.A00;
            long j = (long) i;
            Integer num2 = r11.A06;
            Integer num3 = r11.A07;
            if (num3 == null) {
                intValue = 0;
            } else {
                intValue = num3.intValue();
            }
            Boolean bool = r11.A01;
            Integer num4 = r11.A03;
            if (num4 == null) {
                intValue2 = 0;
            } else {
                intValue2 = num4.intValue();
            }
            String str5 = r11.A0B;
            Integer num5 = r11.A04;
            if (num5 == null) {
                intValue3 = 0;
            } else {
                intValue3 = num5.intValue();
            }
            String str6 = r11.A08;
            String str7 = r11.A0A;
            String str8 = r11.A0C;
            String A09 = C09870cF.A00().A09();
            if (A09.equals("UNKNOWN_TRACEID") || A09.equals("UNKNOWN_SESSIONID")) {
                A09 = null;
            } else {
                int indexOf2 = A09.indexOf(45);
                if (indexOf2 >= 0) {
                    A09 = A09.substring(0, indexOf2);
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("time_ms", Long.toString(SystemClock.elapsedRealtime()));
            hashMap.put("player_id", str4);
            hashMap.put("state", C24682Ark.A00(num));
            hashMap.put("video_position_ms", Integer.toString(i));
            hashMap.put("video_absolute_position_ms", Long.toString(j));
            hashMap.put("video_blackscreen_duration_ms", Long.toString(0));
            if (str3 != null) {
                hashMap.put(TraceFieldType.VideoId, str3);
            }
            if (num2 != null) {
                switch (num2.intValue()) {
                    case 1:
                        str = "dash";
                        break;
                    case 2:
                        str = "dash_live";
                        break;
                    case 3:
                        str = "progressive";
                        break;
                    case 4:
                        str = "rtc_live";
                        break;
                    case 5:
                        str = "hls";
                        break;
                    case 6:
                        str = "fbvp";
                        break;
                    default:
                        str = "unknown";
                        break;
                }
                hashMap.put("streaming_format", str);
            }
            if (str8 != null) {
                hashMap.put("representation_id", str8);
            }
            if (intValue > 0) {
                hashMap.put("video_duration_ms", Integer.toString(intValue));
            }
            if (bool != null) {
                hashMap.put("is_live", bool.toString());
            }
            if (intValue2 > 0) {
                hashMap.put(TraceFieldType.Bitrate, Integer.toString(intValue2));
            }
            if (str5 != null) {
                hashMap.put("quality_label", str5);
            }
            if (intValue3 > 0) {
                hashMap.put("next_bitrate", Integer.toString(intValue3));
            }
            if (str6 != null) {
                hashMap.put("next_quality_label", str6);
            }
            if (str7 != null) {
                hashMap.put("player_origin", str7);
            }
            if (A09 != null) {
                hashMap.put("ta_trace_id", A09);
            }
            Boolean bool2 = r11.A02;
            if (bool2 != null) {
                hashMap.put("is_sponsored", Boolean.toString(bool2.booleanValue()));
            }
            hashMap.put("ig_video_id", r11.A0D);
            int i2 = hashCode;
            C40441of.A00(28180483, i2, hashMap);
            r12.A01.markerEnd(28180483, i2, 2);
        }
    }

    public C40541op(AnonymousClass00B r1, C40491ok r2, C40461oh r3) {
        this.A03 = r2;
        this.A01 = r1;
        this.A02 = r3;
    }
}
