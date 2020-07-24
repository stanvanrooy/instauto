package p000X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.0Lv  reason: invalid class name and case insensitive filesystem */
public final class C05760Lv {
    public static C05760Lv A01;
    public SharedPreferences A00;

    public final String A00() {
        return this.A00.getString("fb_attribution_id", (String) null);
    }

    public final String A01() {
        return this.A00.getString("google_ad_id", (String) null);
    }

    public final void A02(String str) {
        this.A00.edit().putString("google_ad_id", str).apply();
    }

    public final void A03(boolean z) {
        this.A00.edit().putBoolean("has_backup_codes", z).apply();
    }

    public final void A04(boolean z) {
        this.A00.edit().putBoolean("opt_out_ads", z).apply();
    }

    public final boolean A05() {
        return this.A00.getBoolean("has_user_confirmed_dialog", false);
    }

    public C05760Lv(Context context) {
        this.A00 = C05790Ly.A00(context);
    }
}
