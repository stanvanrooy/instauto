package p000X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.DMT */
public final class DMT implements C30022DMz {
    public final /* synthetic */ int A00;
    public final /* synthetic */ DNC A01;
    public final /* synthetic */ DMR A02;
    public final /* synthetic */ List A03;

    public DMT(DMR dmr, List list, int i, DNC dnc) {
        this.A02 = dmr;
        this.A03 = list;
        this.A00 = i;
        this.A01 = dnc;
    }

    public final void B46(Throwable th) {
        Bundle bundle = new Bundle();
        bundle.putString("failure_reason", "create_session_fail");
        bundle.putString("failure_message", th.getMessage());
        bundle.putBoolean("full_upload", false);
        bundle.putInt("num_of_retries", this.A02.A04);
        bundle.putString("family_device_id", this.A02.A0P.A00());
        DMR dmr = this.A02;
        C30006DMi dMi = dmr.A0R;
        DMR.A02(dmr, bundle);
        for (C30007DMj Ayf : dMi.A01) {
            Ayf.Ayf(bundle);
        }
        DMR dmr2 = this.A02;
        int i = dmr2.A04 - 1;
        dmr2.A04 = i;
        if (i >= 0) {
            DMR.A05(dmr2, this.A01, this.A03, this.A00);
        } else {
            DMR.A01(dmr2);
        }
    }

    public final /* bridge */ /* synthetic */ void BPj(Object obj, Bundle bundle) {
        DN2 dn2 = (DN2) obj;
        DMR dmr = this.A02;
        List unmodifiableList = Collections.unmodifiableList(this.A03);
        if (new DN4(dn2).A00.A01.A01 != null) {
            dmr.A0G = new DN4(dn2).A00.A01.A01;
            DMX dmx = dmr.A0O;
            C30020DMx dMx = new DN4(dn2).A00.A01.A00;
            dmx.A00 = dMx.A00.intValue();
            dmx.A01 = dMx.A01.intValue();
            dmx.A02 = dMx.A02.intValue();
            dmx.A03 = dMx.A03.intValue();
            dmx.A04 = (long) dMx.A04.intValue();
            boolean booleanValue = Boolean.valueOf(new DN4(dn2).A00.A01.A03).booleanValue();
            if (!booleanValue) {
                DN4 dn4 = new DN4(dn2);
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                for (DN8 dn8 : dn4.A00.A01.A02) {
                    String str = dn8.A01;
                    String str2 = dn8.A00;
                    if (str != null && !str.isEmpty() && !hashSet.contains(str)) {
                        hashSet.add(str);
                        C30021DMy dMy = new C30021DMy(Long.parseLong(str), str2);
                        dMy.A00 = Constants.ZERO;
                        arrayList.add(dMy);
                    }
                }
                dmr.A0S.A00.A8d();
                dmr.A0S.A00(arrayList);
            }
            Bundle bundle2 = new Bundle();
            if (bundle != null) {
                bundle2.putParcelable("matched_contact", bundle.getParcelable("matched_contact"));
            }
            bundle2.putBoolean("in_sync", booleanValue);
            bundle2.putBoolean("full_upload", false);
            bundle2.putString("root_hash", dmr.A0U.A01());
            bundle2.putInt("processed_contact_count", dmr.A02);
            bundle2.putLong("last_upload_success_time", dmr.A0U.A00());
            bundle2.putLong("time_spent", System.currentTimeMillis() - dmr.A0B);
            bundle2.putInt("num_of_retries", dmr.A04);
            bundle2.putString("ccu_session_id", dmr.A0G);
            bundle2.putString("family_device_id", (String) null);
            for (C30007DMj Ayg : dmr.A0R.A01) {
                Ayg.Ayg(bundle2);
            }
            dmr.A0S.A00(unmodifiableList);
            DMR.A01(dmr);
            return;
        }
        Bundle bundle3 = new Bundle();
        bundle3.putString("failure_reason", "create_session_fail");
        bundle3.putInt("num_of_retries", dmr.A04);
        bundle3.putString("failure_message", "create session result is null");
        C30006DMi dMi = dmr.A0R;
        DMR.A02(dmr, bundle3);
        for (C30007DMj Ayf : dMi.A01) {
            Ayf.Ayf(bundle3);
        }
        DMR.A01(dmr);
    }
}
