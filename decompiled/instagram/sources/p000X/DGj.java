package p000X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.ArrayList;

/* renamed from: X.DGj */
public final class DGj {
    public static DHI parseFromJson(C13080hr r4) {
        DHI dhi = new DHI();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("header".equals(A0i)) {
                dhi.A00 = DHC.parseFromJson(r4);
            } else if (DialogModule.KEY_TITLE.equals(A0i)) {
                dhi.A01 = DHD.parseFromJson(r4);
            } else if ("actions".equals(A0i)) {
                ArrayList arrayList = null;
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        C29936DHm parseFromJson = DHB.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                }
                dhi.A02 = arrayList;
            }
            r4.A0f();
        }
        return dhi;
    }
}
