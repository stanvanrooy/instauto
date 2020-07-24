package p000X;

import android.content.SharedPreferences;

/* renamed from: X.1Bc  reason: invalid class name and case insensitive filesystem */
public final class C25971Bc implements C06570Po, C06580Pp {
    public String A00;
    public final SharedPreferences A01;
    public final C06590Pq A02;
    public final C25991Be A03;
    public final String A04;

    public final void onSessionIsEnding() {
    }

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static C25971Bc A00(C06590Pq r2) {
        return (C25971Bc) r2.AVA(C25971Bc.class, new C25981Bd(r2));
    }

    public final void A01(String str) {
        if (!str.equals(this.A00)) {
            this.A00 = str;
            if (this.A02.AgN()) {
                this.A01.edit().putString(this.A04, str).apply();
            }
        }
    }

    public C25971Bc(SharedPreferences sharedPreferences, C25991Be r4, C06590Pq r5) {
        String str;
        this.A02 = r5;
        String A05 = C05210Iq.A05(r5);
        this.A04 = A05;
        this.A03 = r4;
        this.A01 = sharedPreferences;
        if (A05 != null) {
            str = sharedPreferences.getString(A05, "");
        } else {
            str = null;
        }
        this.A00 = str;
    }
}
