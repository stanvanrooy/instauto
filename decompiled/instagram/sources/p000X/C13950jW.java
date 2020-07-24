package p000X;

import android.content.SharedPreferences;

/* renamed from: X.0jW  reason: invalid class name and case insensitive filesystem */
public final class C13950jW {
    public final SharedPreferences A00;
    public final String A01;

    public final void A00(Long l) {
        SharedPreferences.Editor putLong;
        if (l == null) {
            putLong = this.A00.edit().remove(this.A01);
        } else {
            putLong = this.A00.edit().putLong(this.A01, l.longValue());
        }
        putLong.apply();
    }

    public C13950jW(SharedPreferences sharedPreferences, String str) {
        this.A00 = sharedPreferences;
        this.A01 = str;
    }
}
