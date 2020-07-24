package p000X;

import android.content.SharedPreferences;

/* renamed from: X.0yY  reason: invalid class name and case insensitive filesystem */
public final class C22510yY implements AnonymousClass0R5, C06570Po, C06580Pp {
    public String A00;
    public final SharedPreferences A01;
    public final C06590Pq A02;
    public final String A03;

    public final void onSessionIsEnding() {
    }

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static C22510yY A00(C06590Pq r2) {
        return (C22510yY) r2.AVA(C22510yY.class, new C22520yZ(r2));
    }

    public final void A01(String str) {
        if (!str.equals(this.A00)) {
            this.A00 = str;
            if (this.A02.AgN()) {
                this.A01.edit().putString(this.A03, str).apply();
            }
        }
    }

    public final String Aar() {
        return this.A00;
    }

    public C22510yY(C06590Pq r3, SharedPreferences sharedPreferences) {
        this.A02 = r3;
        String A05 = C05210Iq.A05(r3);
        this.A03 = A05;
        this.A01 = sharedPreferences;
        if (this.A02.AgN()) {
            this.A00 = sharedPreferences.getString(A05, (String) null);
        }
    }
}
