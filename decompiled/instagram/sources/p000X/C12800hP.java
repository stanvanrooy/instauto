package p000X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.login.LoginClient$Request;
import com.facebook.react.modules.camera.CameraRollManager;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.0hP  reason: invalid class name and case insensitive filesystem */
public final class C12800hP {
    public static long A00 = -1;
    public static final C12830hS A01 = C12810hQ.A00();

    public static void A0C(C06590Pq r7, boolean z) {
        C06590Pq r3 = r7;
        if (z) {
            A0A(r3, Constants.ONE, A02(r7), false, (Integer) null, (AnonymousClass5CW) null);
        }
        boolean AgN = r3.AgN();
        if (AgN) {
            C14190ju.A00(C05210Iq.A05(r3), Constants.A0o).edit().clear().apply();
        } else {
            C14110jm.A01();
            C23290AGo.A00(r3).A00 = null;
        }
        C14110jm.A01();
        if (AgN) {
            C23300zv A002 = C23300zv.A00(C05210Iq.A02(r3));
            A002.BXT(new C242013r());
            A002.BXT(new AnonymousClass28X());
        }
    }

    public static void A0D(C06590Pq r6, boolean z, Integer num, Boolean bool, AnonymousClass5CW r10) {
        C06590Pq r4 = r6;
        if (bool != null && A0J(r6)) {
            AnonymousClass0C1 A02 = C05210Iq.A02(r6);
            C42251s2.A01(A02).edit().putBoolean("token_has_manage_pages", bool.booleanValue()).apply();
        } else if (!A0J(r6)) {
            return;
        }
        A0A(r4, Constants.ZERO, A02(r6), z, num, r10);
        if (r4.AgN()) {
            A0F(C05210Iq.A02(r4), (AnonymousClass66M) null);
        }
        C11130eT.A01.BXT(new AnonymousClass69D(A02(r4)));
    }

    public static boolean A0L(AnonymousClass0C1 r1) {
        return !TextUtils.isEmpty(A01(r1, true).A01);
    }

    public static C17850qu A00(AnonymousClass0C1 r3) {
        C486028s r2 = new C486028s();
        r2.A02 = Constants.A0N;
        r2.A05 = "me";
        r2.A03 = A02(r3);
        r2.A09("fields", "id,is_employee,name");
        r2.A04(C155266k7.class);
        return r2.A01();
    }

    public static AnonymousClass2ZQ A01(AnonymousClass0C1 r6, boolean z) {
        if (z && AnonymousClass2ZP.A06(r6)) {
            C58892gh r0 = r6.A06.A0E;
            AnonymousClass0a4.A06(r0);
            C58912gj r02 = r0.A00;
            return new AnonymousClass2ZQ(r02 != null ? r02.A00 : "", r02 != null ? r02.A01 : "", "");
        } else if (z && AnonymousClass2ZP.A05(r6)) {
            C13300iJ r03 = r6.A06;
            String str = r03.A2U;
            AnonymousClass0a4.A06(str);
            return new AnonymousClass2ZQ(str, r03.A2V, "");
        } else if (r6.A06.AeV()) {
            return new AnonymousClass2ZQ(C42251s2.A01(r6).getString("biz_page_id", ""), C42251s2.A01(r6).getString("biz_page_name", ""), C42251s2.A01(r6).getString("biz_page_access_token", ""));
        } else {
            return new AnonymousClass2ZQ(C42251s2.A01(r6).getString("page_id", ""), C42251s2.A01(r6).getString("page_name", ""), C42251s2.A01(r6).getString("page_access_token", ""));
        }
    }

    public static void A05(C06590Pq r1, int i, Intent intent, AnonymousClass1KZ r4, String str) {
        C25189B5u.A00(i, intent, new C130805id(r4, str, r1));
    }

    public static void A07(C06590Pq r1, AnonymousClass1HD r2, C696433b r3) {
        A09(r1, r2, r3.A00);
    }

    public static void A0A(C06590Pq r9, Integer num, String str, boolean z, Integer num2, AnonymousClass5CW r14) {
        String str2;
        String A002;
        String str3;
        int i;
        C15890nh r2 = new C15890nh(r9);
        r2.A09 = Constants.ONE;
        if (1 - num.intValue() != 0) {
            str2 = "fb/store_token/";
        } else {
            str2 = "fb/clear_token/";
        }
        r2.A0C = str2;
        r2.A09("fb_access_token", str);
        String str4 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        r2.A09("share_to_facebook", str4);
        r2.A09("fb_has_publish_actions", str4);
        if (!z) {
            str4 = "0";
        }
        r2.A09("suppress_facebook_linked_notification", str4);
        r2.A06(AnonymousClass1N4.class, false);
        if (num2 != null) {
            switch (num2.intValue()) {
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 3;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                    i = 5;
                    break;
                case 6:
                    i = 6;
                    break;
                case 7:
                    i = 7;
                    break;
                case 8:
                    i = 8;
                    break;
                case 9:
                    i = 9;
                    break;
                case 10:
                    i = 10;
                    break;
                case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                    i = 11;
                    break;
                case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                    i = 12;
                    break;
                case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                    i = 13;
                    break;
                case C120125Dh.VIEW_TYPE_LINK /*14*/:
                    i = 14;
                    break;
                case 15:
                    i = 15;
                    break;
                case 16:
                    i = 16;
                    break;
                case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                    i = 17;
                    break;
                case 18:
                    i = 18;
                    break;
                case 19:
                    i = 19;
                    break;
                case 20:
                    i = 20;
                    break;
                case C120125Dh.VIEW_TYPE_BRANDING /*21*/:
                    i = 21;
                    break;
                case C120125Dh.NUM_VIEW_TYPES /*22*/:
                    i = 22;
                    break;
                case 23:
                    i = 23;
                    break;
                case 24:
                    i = 24;
                    break;
                case 25:
                    i = 25;
                    break;
                case OdexSchemeArtXdex.OREO_SDK_INT /*26*/:
                    i = 26;
                    break;
                case 27:
                    i = 27;
                    break;
                case 28:
                    i = 28;
                    break;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                    i = 29;
                    break;
                case 30:
                    i = 30;
                    break;
                case 31:
                    i = 31;
                    break;
                case 32:
                    i = 32;
                    break;
                case 33:
                    i = 33;
                    break;
                case 34:
                    i = 34;
                    break;
                default:
                    i = 0;
                    break;
            }
            r2.A09("send_credential_surface", String.valueOf(i));
        }
        C17850qu A03 = r2.A03();
        if (r9 != null && r9.AgN()) {
            AnonymousClass0C1 A02 = C05210Iq.A02(r9);
            boolean z2 = false;
            if (num == Constants.ZERO) {
                z2 = true;
            }
            if (A02(A02) != null) {
                str3 = C42251s2.A01(A02).getString("user_name", (String) null);
            } else {
                str3 = null;
            }
            String A04 = A04(A02);
            AnonymousClass111 A003 = AnonymousClass111.A00(A02);
            if (z2) {
                A003.A04(new C56712cw(true, str3, A04), true);
            } else {
                A003.A04(new C56712cw(false, (String) null, (String) null), true);
            }
            A03.A00 = new AnonymousClass5CL(A02, r14);
        }
        A01.schedule(A03);
        if (num == Constants.ZERO && TextUtils.isEmpty(str)) {
            boolean equals = "".equals(str);
            if (num2 == null) {
                A002 = "null";
            } else {
                A002 = C126795c1.A00(num2);
            }
            AnonymousClass0P4 A004 = AnonymousClass0P4.A00("ig_android_fb_linking_null_token", (AnonymousClass0RN) null);
            boolean AgN = r9.AgN();
            Boolean valueOf = Boolean.valueOf(AgN);
            A004.A0A("is_logged_in", valueOf);
            A004.A0A("fb4a_installed", Boolean.valueOf(C17200pq.A03()));
            if (num2 != null) {
                A002 = C126795c1.A00(num2);
                A004.A0G("referrer", A002);
            }
            if (AgN) {
                A004.A0G("pk", C05210Iq.A02(r9).A04());
            }
            if (equals) {
                A004.A0A("token_empty_string", true);
            }
            AnonymousClass0WN.A01(r9).BcG(A004);
            AnonymousClass0QD.A03("fb_account_linking_null_token", C06360Ot.formatString("referrer=%s, logged_in=%b, fb4a_installed=%b", A002, valueOf, Boolean.valueOf(C17200pq.A03())), ((Integer) C05640Lj.A00(AnonymousClass0L7.FB_ACCOUNT_LINKING_SAMPLING_FREQ, "freq", 100)).intValue());
        }
    }

    public static void A0G(AnonymousClass0C1 r5, AnonymousClass2ZQ r6) {
        String str = r6.A01;
        C42251s2.A01(r5).edit().putString("biz_page_access_token", r6.A00).putString("biz_page_id", str).putString("biz_page_name", r6.A02).putBoolean("token_has_manage_pages", true).apply();
    }

    public static void A0H(AnonymousClass0C1 r3, AnonymousClass2ZQ r4) {
        C42251s2.A02(r3, r4.A01, r4.A02, r4.A00);
    }

    public static void A0I(AnonymousClass0C1 r3, String str, C119825Cb r5) {
        C486028s r2 = new C486028s();
        r2.A02 = Constants.A0N;
        r2.A05 = str;
        r2.A03 = A02(r3);
        r2.A09("fields", "access_token, id, name");
        r2.A04(AnonymousClass5AG.class);
        C17850qu A012 = r2.A01();
        A012.A00 = new C119815Ca(r3, r5);
        A01.schedule(A012);
    }

    public static String A02(C06590Pq r1) {
        AccessToken accessToken;
        if (r1.AgN()) {
            accessToken = C14110jm.A00(C05210Iq.A02(r1).A04()).A02();
        } else {
            accessToken = C23290AGo.A00(r1).A00;
        }
        if (accessToken == null) {
            return null;
        }
        return accessToken.A02;
    }

    public static String A03(AnonymousClass0C1 r1) {
        String str;
        if (A0L(r1)) {
            str = A01(r1, true).A02;
        } else if (A0K(r1)) {
            C56712cw A02 = AnonymousClass111.A00(r1).A02();
            AnonymousClass0a4.A06(A02);
            str = A02.A02;
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public static String A04(AnonymousClass0C1 r2) {
        String str;
        if (A0L(r2)) {
            return A01(r2, true).A01;
        }
        if (AnonymousClass2ZP.A06(r2)) {
            C58892gh r22 = r2.A06.A0E;
            AnonymousClass0a4.A06(r22);
            C58912gj r0 = r22.A00;
            if (r0 != null) {
                str = r0.A00;
            } else {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            C58912gj r02 = r22.A01;
            if (r02 != null) {
                return r02.A00;
            }
            return "";
        } else if (A0K(r2)) {
            return C42251s2.A01(r2).getString(MemoryDumpUploadJob.EXTRA_USER_ID, (String) null);
        } else {
            return "";
        }
    }

    public static void A06(C06590Pq r4, Activity activity, C696433b r6) {
        String str;
        boolean AgN = r4.AgN();
        if (!AgN || !C05210Iq.A02(r4).Abj()) {
            C25180B5i A012 = C25180B5i.A01();
            List list = r6.A00;
            if (AgN) {
                str = C05210Iq.A02(r4).A04();
            } else {
                str = "fbsdk_logged_out_id";
            }
            C25180B5i.A02(A012, new AnonymousClass79A(activity), C25180B5i.A00(list, str));
        }
    }

    public static void A08(C06590Pq r3, AnonymousClass1HD r4, C696433b r5, C126785c0 r6) {
        Integer num;
        String str;
        AnonymousClass5CP.A00(r3, r6);
        if (AnonymousClass4EQ.A00(r3)) {
            switch (r6.ordinal()) {
                case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                    num = Constants.A0Y;
                    break;
                case 20:
                    num = Constants.ONE;
                    break;
                case C120125Dh.VIEW_TYPE_BRANDING /*21*/:
                    num = Constants.A0N;
                    break;
                case C120125Dh.NUM_VIEW_TYPES /*22*/:
                    num = Constants.A0C;
                    break;
                case 23:
                    num = Constants.ZERO;
                    break;
                default:
                    num = Constants.A0j;
                    break;
            }
            if (num != null) {
                switch (num.intValue()) {
                    case 1:
                        str = "ig_fb_reel_settings";
                        break;
                    case 2:
                        str = "ig_fb_reel_viewer_self_story";
                        break;
                    case 3:
                        str = "ig_fb_share_advanced_settings";
                        break;
                    case 4:
                        str = "ig_fb_share_feed";
                        break;
                    case 5:
                        str = "ig_fb_share_settings";
                        break;
                    default:
                        str = "ig_fb_direct_inbox_tab";
                        break;
                }
            } else {
                str = null;
            }
            Bundle bundle = r4.mArguments;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("location", str);
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r3.getToken());
            r4.setArguments(bundle);
        }
        A07(r3, r4, r5);
    }

    public static void A09(C06590Pq r4, AnonymousClass1HD r5, List list) {
        String str;
        boolean AgN = r4.AgN();
        if (!AgN || !C05210Iq.A02(r4).Abj()) {
            C25180B5i A012 = C25180B5i.A01();
            if (AgN) {
                str = C05210Iq.A02(r4).A04();
            } else {
                str = "fbsdk_logged_out_id";
            }
            LoginClient$Request A002 = C25180B5i.A00(list, str);
            Bundle bundle = r5.mArguments;
            if (bundle != null) {
                A002.A00 = bundle.getString("location");
                A002.A01 = bundle.getString("IgSessionManager.SESSION_TOKEN_KEY");
            }
            C25180B5i.A02(A012, new AnonymousClass79C(r5), A002);
        }
    }

    public static void A0B(C06590Pq r2, String str, String str2, Integer num) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !str.equals(A02(r2)) && !str2.equals(C14100jl.A01(r2))) {
            AccessToken accessToken = new AccessToken(str, str2);
            if (r2.AgN()) {
                C14110jm.A00(C05210Iq.A02(r2).A04()).A03(accessToken);
            } else {
                C23290AGo.A00(r2).A00 = accessToken;
            }
            A0D(r2, false, num, (Boolean) null, (AnonymousClass5CW) null);
        }
        if (!TextUtils.isEmpty(str)) {
            C205778rQ.A00(r2, str);
        }
    }

    public static void A0E(AnonymousClass0C1 r0, AccessToken accessToken) {
        C14110jm.A00(r0.A04()).A03(accessToken);
    }

    public static void A0F(AnonymousClass0C1 r3, AnonymousClass66M r4) {
        if (A0J(r3)) {
            boolean z = false;
            if (C42251s2.A01(r3).getString(MemoryDumpUploadJob.EXTRA_USER_ID, (String) null) != null) {
                z = true;
            }
            if (!z) {
                C17850qu A002 = A00(r3);
                A002.A00 = new C155246k5(r3, r4);
                A01.schedule(A002);
                return;
            }
            if (C42251s2.A01(r3).getBoolean("user_ie", false)) {
                C23300zv.A00(r3).BXT(new C242013r());
            }
            C23300zv.A00(r3).BXT(new AnonymousClass28X());
            if (r4 != null) {
                r4.onComplete();
            }
        }
    }

    public static boolean A0J(C06590Pq r1) {
        if (A02(r1) != null) {
            return true;
        }
        return false;
    }

    public static boolean A0K(AnonymousClass0C1 r1) {
        C56712cw A02 = AnonymousClass111.A00(r1).A02();
        if (A02 == null || !A02.A00.booleanValue()) {
            return false;
        }
        return true;
    }

    public static boolean A0M(AnonymousClass0C1 r1, List list) {
        AccessToken accessToken;
        if (r1.AgN()) {
            accessToken = C14110jm.A00(C05210Iq.A02(r1).A04()).A02();
        } else {
            accessToken = C23290AGo.A00(r1).A00;
        }
        if (accessToken == null) {
            return false;
        }
        HashSet hashSet = new HashSet(list);
        hashSet.removeAll(accessToken.A07);
        return hashSet.isEmpty();
    }

    public static boolean A0N(AnonymousClass0C1 r1, boolean z) {
        if (!TextUtils.isEmpty(A01(r1, z).A00)) {
            return true;
        }
        if (z && AnonymousClass2ZP.A06(r1)) {
            return true;
        }
        if (!z || !AnonymousClass2ZP.A05(r1)) {
            return false;
        }
        return true;
    }
}
