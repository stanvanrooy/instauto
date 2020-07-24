package p000X;

import android.content.SharedPreferences;

/* renamed from: X.1s2  reason: invalid class name and case insensitive filesystem */
public final class C42251s2 {
    public static int A00(AnonymousClass0C1 r2) {
        return A01(r2).getInt("invite_suggestions", -1);
    }

    public static SharedPreferences A01(AnonymousClass0C1 r1) {
        return C14190ju.A01(r1).A03(Constants.A0o);
    }

    public static void A02(AnonymousClass0C1 r1, String str, String str2, String str3) {
        A01(r1).edit().putString("page_access_token", str3).putString("page_id", str).putString("page_name", str2).putBoolean("token_has_manage_pages", true).apply();
    }

    public static void A03(AnonymousClass0C1 r1, boolean z) {
        A01(r1).edit().putBoolean("auto_cross_post_to_facebook_feed", z).apply();
    }

    public static boolean A04(AnonymousClass0C1 r2) {
        return A01(r2).getBoolean("auto_cross_post_to_facebook_feed", false);
    }
}
