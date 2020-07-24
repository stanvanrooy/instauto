package p000X;

import android.content.SharedPreferences;
import android.os.Build;

/* renamed from: X.0ju  reason: invalid class name and case insensitive filesystem */
public final class C14190ju implements AnonymousClass0C2 {
    public final AnonymousClass0OT A00;
    public final AnonymousClass0C1 A01;

    public static C14190ju A01(AnonymousClass0C1 r2) {
        return (C14190ju) r2.AVA(C14190ju.class, new C16200oC(r2));
    }

    public final SharedPreferences A03(Integer num) {
        return C05790Ly.A01(StoredPreferences.A00, AnonymousClass000.A0J(this.A01.A04(), "_", C14200jv.A00(num)));
    }

    public final void onUserSessionWillEnd(boolean z) {
        if (z) {
            this.A00.ADc(new C53512Tb(this));
        }
    }

    public C14190ju(AnonymousClass0C1 r1, AnonymousClass0OT r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public static SharedPreferences A00(String str, Integer num) {
        return C05790Ly.A01(StoredPreferences.A00, AnonymousClass000.A0J(str, "_", C14200jv.A00(num)));
    }

    public static void A02(C14190ju r4, Integer num) {
        AnonymousClass0a4.A0A(C14200jv.A01(num));
        r4.A03(num).edit().clear().apply();
        if (Build.VERSION.SDK_INT >= 24) {
            StoredPreferences.A00.deleteSharedPreferences(AnonymousClass000.A0J(r4.A01.A04(), "_", C14200jv.A00(num)));
        }
    }

    public final void onUserSessionStart(boolean z) {
        AnonymousClass0Z0.A0A(-1817267936, AnonymousClass0Z0.A03(-948955858));
    }
}
