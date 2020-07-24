package p000X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.0Kr  reason: invalid class name and case insensitive filesystem */
public final class C05480Kr {
    public static final String[] A03 = {"CookiePrefsFile.*", "UserCookiePrefsFile_.*", "AuthHeaderPrefs.*", "ig_crash_log_session"};
    public final Context A00;
    public final SharedPreferences A01;
    public final AnonymousClass0Fz A02;

    public C05480Kr(Context context, AnonymousClass0Fz r2, SharedPreferences sharedPreferences) {
        this.A00 = context;
        this.A02 = r2;
        this.A01 = sharedPreferences;
    }
}
