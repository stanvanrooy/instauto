package p000X;

import java.util.ArrayList;

/* renamed from: X.1Gb  reason: invalid class name and case insensitive filesystem */
public final class C26991Gb {
    public static C27041Gg parseFromJson(C13080hr r4) {
        C27041Gg r3 = new C27041Gg();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("responses".equals(A0i)) {
                ArrayList arrayList = null;
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        AnonymousClass5II parseFromJson = AnonymousClass5IG.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                }
                r3.A00 = arrayList;
            }
            r4.A0f();
        }
        return r3;
    }
}
