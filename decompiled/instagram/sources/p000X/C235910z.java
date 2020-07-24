package p000X;

import android.content.SharedPreferences;

/* renamed from: X.10z  reason: invalid class name and case insensitive filesystem */
public final class C235910z implements AnonymousClass0C2 {
    public SharedPreferences A00;
    public AnonymousClass111 A01;
    public AnonymousClass114 A02;
    public AnonymousClass0C1 A03;
    public final C23300zv A04;

    public static C235910z A00(AnonymousClass0C1 r2) {
        return (C235910z) r2.AVA(C235910z.class, new AnonymousClass110(r2));
    }

    public final void A01() {
        C15890nh r2 = new C15890nh(this.A03);
        r2.A0C = "linked_accounts/get_linkage_status/";
        r2.A09 = Constants.A0N;
        r2.A06(AnonymousClass2LY.class, false);
        C17850qu A032 = r2.A03();
        A032.A00 = new AnonymousClass2LZ(this);
        C12810hQ.A04(A032, 289, 3, true, true, 0);
    }

    public String getPrefKeyPrefixLastSyncedMsForUser() {
        return AnonymousClass000.A0J(this.A03.A04(), "_", "pref_key_prefix_last_synced_ms");
    }

    public void setForceSync(boolean z) {
        this.A00.edit().putBoolean("pref_key_force_sync", z).apply();
    }

    public C235910z(AnonymousClass0C1 r3) {
        this.A01 = AnonymousClass111.A00(r3);
        this.A02 = AnonymousClass114.A00(r3);
        this.A03 = r3;
        this.A00 = C14190ju.A01(r3).A03(Constants.A0g);
        this.A04 = C23300zv.A00(r3);
    }

    public final void onUserSessionStart(boolean z) {
        int A032 = AnonymousClass0Z0.A03(-855127580);
        if (!z) {
            setForceSync(true);
        }
        AnonymousClass0Z0.A0A(1917162595, A032);
    }

    public final void onUserSessionWillEnd(boolean z) {
    }
}
