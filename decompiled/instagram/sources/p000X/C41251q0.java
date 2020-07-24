package p000X;

import android.content.SharedPreferences;

/* renamed from: X.1q0  reason: invalid class name and case insensitive filesystem */
public final class C41251q0 extends AnonymousClass0L1 {
    public final /* synthetic */ C37531jo A00;

    public final void A00() {
        AnonymousClass0C1 r7 = this.A00.A07;
        if (AnonymousClass2XP.A00 == null) {
            AnonymousClass2XP.A00 = C05750Lu.A00("SupportedCapabilitiesPreferences");
        }
        SharedPreferences sharedPreferences = AnonymousClass2XP.A00;
        long j = -1;
        if (sharedPreferences != null) {
            j = sharedPreferences.getLong("LastTimeSupportedCapabilitiesUpdated", -1);
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (j < 0 || currentTimeMillis >= 86400000) {
            C95324Au r1 = new C95324Au(r7);
            C17850qu A002 = AnonymousClass2XP.A00(r7);
            A002.A00 = r1;
            C12810hQ.A02(A002);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41251q0(C37531jo r3) {
        super("sendSupportedCameraCapabilities", 382);
        this.A00 = r3;
    }
}
