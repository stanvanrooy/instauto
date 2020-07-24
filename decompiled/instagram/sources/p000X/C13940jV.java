package p000X;

import android.content.SharedPreferences;

/* renamed from: X.0jV  reason: invalid class name and case insensitive filesystem */
public final class C13940jV {
    public final SharedPreferences A00;
    public final String A01;

    public final void A00(String str) {
        this.A00.edit().putString(this.A01, str).apply();
    }

    public C13940jV(SharedPreferences sharedPreferences, String str) {
        this.A00 = sharedPreferences;
        this.A01 = str;
    }
}
