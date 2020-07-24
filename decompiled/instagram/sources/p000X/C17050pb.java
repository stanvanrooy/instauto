package p000X;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.facebook.C0003R;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.EnumSet;
import java.util.List;

/* renamed from: X.0pb  reason: invalid class name and case insensitive filesystem */
public final class C17050pb {
    public static final EnumSet A00 = EnumSet.of(C17070pd.MAIN_FEED, new C17070pd[]{C17070pd.PROMOTION_PREVIEW, C17070pd.SAVE_HOME, C17070pd.AD_RATING, C17070pd.NEW_AD_BAKEOFF, C17070pd.ADS_HISTORY, C17070pd.PBIA_PROXY_PROFILE, C17070pd.VIEW_ADS, C17070pd.EXPLORE_FEED, C17070pd.EXPLORE_VIDEO_FEED, C17070pd.SINGLE_MEDIA_FEED_FOR_BC});

    public static int A00(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.rgb((int) ((((float) Color.red(i)) * f) + (((float) Color.red(i2)) * f2)), (int) ((((float) Color.green(i)) * f) + (((float) Color.green(i2)) * f2)), (int) ((((float) Color.blue(i)) * f) + (((float) Color.blue(i2)) * f2)));
    }

    public static SpannableStringBuilder A01(String str, String str2, Object obj) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        A05(spannableStringBuilder, str, str2, obj);
        return spannableStringBuilder;
    }

    public static void A04(Context context, C06590Pq r10, C15890nh r11, C15780nW r12) {
        String str = "0";
        String str2 = str;
        if (C05760Lv.A01.A00.getBoolean("opt_out_ads", false)) {
            str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        }
        r11.A08("X-Ads-Opt-Out", str2);
        String A002 = C05760Lv.A01.A00();
        String A01 = C05760Lv.A01.A01();
        if (A002 != null) {
            r11.A08("X-Attribution-ID", A002);
        }
        if (A01 != null) {
            r11.A08("X-Google-AD-ID", A01);
        }
        String A05 = C05860Mt.A02.A05(context);
        if (A05 != null) {
            r11.A08("X-DEVICE-ID", A05);
        }
        if (C17200pq.A03()) {
            r11.A08("X-FB", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        r11.A08("X-CM-Bandwidth-KBPS", C06360Ot.formatString("%.3f", Double.valueOf(C11940fv.A00.A01())));
        r11.A08("X-CM-Latency", C06360Ot.formatString("%.3f", Double.valueOf(C11940fv.A00.A02())));
        C15780nW.A00(r12);
        r11.A09("battery_level", Integer.toString(r12.A00));
        String str3 = str;
        if (r12.A03()) {
            str3 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        }
        r11.A09("is_charging", str3);
        r11.A0C("is_dark_mode", C17440qF.A00(context));
        r11.A09("phone_id", AnonymousClass0OZ.A00(r10).AZO());
        if (C17600qV.A01.A01(false)) {
            boolean z = false;
            if (r12.A02.getStreamVolume(3) == 0) {
                z = true;
            }
            if (!z) {
                str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
        }
        r11.A09("will_sound_on", str);
    }

    public static boolean A07(AnonymousClass1NJ r1, int i) {
        if (!(r1 == null || !r1.A1W() || r1.A0P(i) == null)) {
            r1 = r1.A0P(i);
        }
        return r1.A1K();
    }

    public static boolean A08(AnonymousClass1NJ r1, int i) {
        if (r1 == null) {
            return false;
        }
        if (r1.A1W() && r1.A0P(i) == null) {
            return false;
        }
        if (r1.A1W()) {
            r1 = r1.A0P(i);
        }
        return r1.A1L();
    }

    public static boolean A09(AnonymousClass1NJ r4, int i, Context context, AnonymousClass0C1 r7) {
        boolean z;
        String str;
        if (r4 != null && !r4.A1f() && A08(r4, i)) {
            C13300iJ A0c = r4.A0c(r7);
            AnonymousClass1UP A002 = C37201jH.A00(r4, i, context);
            if (A0c == null || A002 == null || A002.A00 != AnonymousClass1UR.AD_DESTINATION_PROFILE_VISIT || (str = A002.A09) == null) {
                z = false;
            } else {
                z = A0c.getId().equals(str);
            }
            if (z) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean A0B(AnonymousClass0C1 r4, AnonymousClass1NJ r5) {
        C480926p r3 = (C480926p) r4.AVA(C480926p.class, new C481026q(r4));
        String A02 = C30671Ut.A02(r4, r5);
        if (TextUtils.isEmpty(A02) || !r3.A00.getBoolean(A02, false)) {
            return false;
        }
        return true;
    }

    public static String A02(Context context, AnonymousClass1NJ r3, int i) {
        String str;
        if (r3.A1W()) {
            str = r3.A0P(i).A22;
        } else {
            str = r3.A22;
        }
        if (TextUtils.isEmpty(str)) {
            return context.getString(C0003R.string.default_link_text);
        }
        return str;
    }

    public static String A03(Context context, AnonymousClass0C1 r5, AnonymousClass1NJ r6, C36841ih r7, AnonymousClass1UP r8) {
        AnonymousClass1NJ r3;
        if (!r6.Aho()) {
            return null;
        }
        int i = r7.A01;
        if (r6.A1W()) {
            r3 = r6.A0P(i);
        } else {
            r3 = r6;
        }
        boolean z = false;
        if (r8.A00 == AnonymousClass1UR.AD_DESTINATION_LEAD_AD) {
            z = true;
        }
        if (z && A0B(r5, r6)) {
            return context.getString(C0003R.string.lead_ad_submitted);
        }
        List<AnonymousClass1TO> list = r3.A2M;
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (AnonymousClass1TO r2 : list) {
            if (r2.A00 == AnonymousClass1TS.A03) {
                return r2.A01;
            }
        }
        return null;
    }

    public static void A05(SpannableStringBuilder spannableStringBuilder, String str, String str2, Object obj) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(str2);
        int indexOf = length + str2.indexOf("{username}");
        spannableStringBuilder.replace(indexOf, indexOf + 10, str);
        spannableStringBuilder.setSpan(obj, indexOf, str.length() + indexOf, 33);
    }

    public static boolean A06(AnonymousClass1NJ r5) {
        if (r5.A1W()) {
            r5 = r5.A0P(0);
        }
        List<AnonymousClass1UP> list = r5.A2Q;
        if (list != null) {
            for (AnonymousClass1UP r2 : list) {
                if (r2.A00 == AnonymousClass1UR.AD_DESTINATION_APP_STORE && r2.A01 == AnonymousClass1UQ.INSTALLED && C06460Pd.A03(r2.A06)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean A0A(AnonymousClass1NJ r0, C17070pd r1) {
        if (!r0.Aho() || !A00.contains(r1)) {
            return false;
        }
        return true;
    }
}
