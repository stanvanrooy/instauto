package p000X;

import android.os.Bundle;

/* renamed from: X.DMW */
public final class DMW implements C30022DMz {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ C30012DMo A01;
    public final /* synthetic */ DMR A02;

    public DMW(DMR dmr, C30012DMo dMo, Bundle bundle) {
        this.A02 = dmr;
        this.A01 = dMo;
        this.A00 = bundle;
    }

    public final void B46(Throwable th) {
        Bundle bundle = new Bundle();
        bundle.putString("failure_reason", "upload_batch_fail");
        bundle.putString("family_device_id", (String) null);
        bundle.putString("failure_message", th.getMessage());
        bundle.putInt("num_of_retries", this.A01.A00 ^ true ? 1 : 0);
        DMR dmr = this.A02;
        C30006DMi dMi = dmr.A0R;
        DMR.A02(dmr, bundle);
        for (C30007DMj At6 : dMi.A01) {
            At6.At6(bundle);
        }
        C30012DMo dMo = this.A01;
        if (!dMo.A00) {
            DMR dmr2 = this.A02;
            dMo.A00 = true;
            DMR.A04(dmr2, dMo);
            return;
        }
        DMR.A03(this.A02, dMo);
    }

    public final /* bridge */ /* synthetic */ void BPj(Object obj, Bundle bundle) {
        this.A02.A0S.A00(this.A01.A07);
        this.A00.putLong("time_spent", System.currentTimeMillis() - this.A02.A0B);
        this.A00.putString("family_device_id", (String) null);
        if (bundle != null) {
            this.A00.putParcelable("matched_contact", bundle.getParcelable("matched_contact"));
        }
        C30006DMi dMi = this.A02.A0R;
        Bundle bundle2 = this.A00;
        for (C30007DMj At7 : dMi.A01) {
            At7.At7(bundle2);
        }
        DMR.A03(this.A02, this.A01);
    }
}
