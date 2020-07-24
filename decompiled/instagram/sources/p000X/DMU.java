package p000X;

import android.os.Bundle;

/* renamed from: X.DMU */
public final class DMU implements C30022DMz {
    public final /* synthetic */ DMR A00;
    public final /* synthetic */ String A01;

    public DMU(DMR dmr, String str) {
        this.A00 = dmr;
        this.A01 = str;
    }

    public final void B46(Throwable th) {
        this.A00.A0L = false;
        Bundle bundle = new Bundle();
        bundle.putString("failure_reason", "close_session_fail");
        bundle.putString("family_device_id", this.A01);
        bundle.putString("failure_message", th.getMessage());
        DMR dmr = this.A00;
        C30006DMi dMi = dmr.A0R;
        DMR.A02(dmr, bundle);
        for (C30007DMj Awy : dMi.A01) {
            Awy.Awy(bundle);
        }
    }

    public final /* bridge */ /* synthetic */ void BPj(Object obj, Bundle bundle) {
        if (((DN9) obj) != null) {
            CN4 cn4 = this.A00.A0U;
            System.currentTimeMillis();
            String A04 = cn4.A02.A04();
            if (A04 != null) {
                cn4.A01.edit().putLong(AnonymousClass000.A0E(A04, "LAST_UPLOAD_SUCCESS_TS"), 0).apply();
            }
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("full_upload", false);
            bundle2.putLong("last_upload_success_time", this.A00.A0U.A00());
            bundle2.putLong("time_spent", System.currentTimeMillis() - this.A00.A0B);
            bundle2.putInt("num_of_retries", this.A00.A0O.A03);
            bundle2.putString("ccu_session_id", this.A00.A0G);
            Boolean bool = true;
            bundle2.putBoolean("in_sync", bool.booleanValue());
            bundle2.putString("family_device_id", this.A01);
            for (C30007DMj Awz : this.A00.A0R.A01) {
                Awz.Awz(bundle2);
            }
        }
        this.A00.A0L = false;
    }
}
