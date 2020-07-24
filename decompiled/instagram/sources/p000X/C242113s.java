package p000X;

import android.content.SharedPreferences;

/* renamed from: X.13s  reason: invalid class name and case insensitive filesystem */
public final class C242113s implements AnonymousClass0C2 {
    public final AnonymousClass0C1 A00;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public C242113s(AnonymousClass0C1 r1) {
        this.A00 = r1;
    }

    public final void onUserSessionStart(boolean z) {
        int A03 = AnonymousClass0Z0.A03(533783574);
        SharedPreferences A032 = C14190ju.A01(this.A00).A03(Constants.A0n);
        AnonymousClass0C1 r2 = this.A00;
        AnonymousClass0L7 r5 = AnonymousClass0L7.REELS_V2_CONFIG;
        A032.edit().putString((String) AnonymousClass0L6.A02(r2, r5, "definition_key", " ", (AnonymousClass04H) null), (String) AnonymousClass0L6.A02(this.A00, r5, "definition", "a", (AnonymousClass04H) null)).apply();
        AnonymousClass0Z0.A0A(-1656144244, A03);
    }
}
