package p000X;

import android.os.Bundle;
import com.facebook.C0003R;

/* renamed from: X.CMF */
public final class CMF {
    public static final void A01(AnonymousClass2TH r5, CMD cmd, C51312Ke r7, CML cml, C25654BTn bTn, int[] iArr) {
        r5.A0L = cml.A04;
        r5.A0F = r7;
        if (iArr != null) {
            r5.A01(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
        if (!bTn.A01()) {
            CMO cmo = new CMO(cmd);
            r5.A04 = C0003R.C0004drawable.instagram_arrow_back_24;
            r5.A0B = cmo;
            return;
        }
        r5.A04 = 0;
        r5.A0B = null;
    }

    public static CMG A00(AnonymousClass0C1 r3, CMD cmd, CML cml, String str, String str2, String str3) {
        CMM.A00(r3).A00.put(cml.A01, cml);
        Bundle bundle = new Bundle();
        bundle.putString("extra_category_id", cml.A01);
        bundle.putString("extra_surface_name", str);
        bundle.putString("extra_entity_id", str2);
        bundle.putString("extra_analytics_module", str3);
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r3.getToken());
        CMG cmg = new CMG();
        cmg.setArguments(bundle);
        cmg.A03 = cmd;
        return cmg;
    }
}
