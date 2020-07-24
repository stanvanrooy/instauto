package p000X;

import android.view.View;
import com.facebook.C0003R;
import java.util.HashMap;

/* renamed from: X.AMJ */
public final class AMJ extends C38681lf {
    public final /* synthetic */ AN3 A00;

    public AMJ(AN3 an3) {
        this.A00 = an3;
    }

    public final void B0G() {
        AN2 an2 = this.A00.A00;
        if (an2 != null) {
            an2.A01 = null;
            C23467ANo aNo = an2.A00;
            if (aNo != null) {
                AMF amf = aNo.A09;
                HashMap hashMap = aNo.A05.A0I;
                if (amf.A09) {
                    if (amf.A06 == null) {
                        amf.A06 = hashMap;
                        AnonymousClass0ZA.A09(amf.A0A, new AMX(amf), 2000, -797219816);
                    }
                    AMG amg = amf.A0H.A0K;
                    AMS ams = amg.A05;
                    if (ams.A06 == null) {
                        View findViewById = ams.A0B.findViewById(C0003R.C0005id.ssi_broadcaster_button);
                        ams.A06 = findViewById;
                        findViewById.setVisibility(0);
                        AMG.A01(amg, amg.A05.A06);
                    }
                    amg.A05.A06.setVisibility(0);
                }
            }
            AN2.A00(an2);
        }
    }
}
