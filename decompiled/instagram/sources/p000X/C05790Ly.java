package p000X;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* renamed from: X.0Ly  reason: invalid class name and case insensitive filesystem */
public final class C05790Ly {
    public static boolean A00;

    public static SharedPreferences A01(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        if (A00) {
            return new AnonymousClass249(str, sharedPreferences, AnonymousClass00B.A01);
        }
        return sharedPreferences;
    }

    public static SharedPreferences A00(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (A00) {
            return new AnonymousClass249("default_shared_prefs", defaultSharedPreferences, AnonymousClass00B.A01);
        }
        return defaultSharedPreferences;
    }
}
