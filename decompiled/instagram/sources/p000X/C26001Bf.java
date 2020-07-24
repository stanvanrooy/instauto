package p000X;

import android.content.SharedPreferences;

/* renamed from: X.1Bf  reason: invalid class name and case insensitive filesystem */
public final class C26001Bf implements C06570Po, C06580Pp {
    public static final C26011Bg A07 = new C26011Bg();
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public final SharedPreferences A06;

    public final void onSessionIsEnding() {
    }

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static final String A00(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(str, "");
        if (string == null) {
            string = "";
        }
        C13150hy.A01(string, "getString(key, \"\") ?: \"\"");
        return string;
    }

    public final void A01() {
        this.A06.edit().clear().apply();
        this.A05 = "";
        this.A00 = "";
        this.A03 = "";
        this.A04 = "";
        this.A01 = "";
        this.A02 = "";
    }

    public C26001Bf(SharedPreferences sharedPreferences) {
        C13150hy.A02(sharedPreferences, "sharedPreferences");
        this.A05 = A00(sharedPreferences, "IG-U-TARGET");
        this.A00 = A00(sharedPreferences, "IG-U-IG-DIRECT-REGION-HINT");
        this.A03 = A00(sharedPreferences, "IG-U-SHBID");
        this.A04 = A00(sharedPreferences, "IG-U-SHBTS");
        this.A01 = A00(sharedPreferences, "IG-U-DS-USER-ID");
        this.A02 = A00(sharedPreferences, "IG-U-RUR");
        this.A06 = sharedPreferences;
    }

    public final void A02(String str) {
        C13150hy.A02(str, "value");
        if (!C13150hy.A05(str, this.A00)) {
            this.A00 = str;
            this.A06.edit().putString("IG-U-IG-DIRECT-REGION-HINT", this.A00).apply();
        }
    }

    public final void A03(String str) {
        C13150hy.A02(str, "value");
        if (!C13150hy.A05(str, this.A01)) {
            this.A01 = str;
            this.A06.edit().putString("IG-U-DS-USER-ID", this.A01).apply();
        }
    }

    public final void A04(String str) {
        C13150hy.A02(str, "value");
        if (!C13150hy.A05(str, this.A02)) {
            this.A02 = str;
            this.A06.edit().putString("IG-U-RUR", this.A02).apply();
        }
    }

    public final void A05(String str) {
        C13150hy.A02(str, "value");
        if (!C13150hy.A05(str, this.A03)) {
            this.A03 = str;
            this.A06.edit().putString("IG-U-SHBID", this.A03).apply();
        }
    }

    public final void A06(String str) {
        C13150hy.A02(str, "value");
        if (!C13150hy.A05(str, this.A04)) {
            this.A04 = str;
            this.A06.edit().putString("IG-U-SHBTS", this.A04).apply();
        }
    }

    public final void A07(String str) {
        C13150hy.A02(str, "value");
        if (!C13150hy.A05(str, this.A05)) {
            this.A05 = str;
            this.A06.edit().putString("IG-U-TARGET", this.A05).apply();
        }
    }
}
