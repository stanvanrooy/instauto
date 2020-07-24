package p000X;

import java.util.ArrayList;

/* renamed from: X.AKG */
public final class AKG {
    public static AKR parseFromJson(C13080hr r4) {
        AKR akr = new AKR();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            ArrayList arrayList = null;
            if ("comments".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        AKS parseFromJson = AKN.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                }
                akr.A03 = arrayList;
            } else if ("system_comments".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        AKJ parseFromJson2 = AKK.parseFromJson(r4);
                        if (parseFromJson2 != null) {
                            arrayList.add(parseFromJson2);
                        }
                    }
                }
                akr.A04 = arrayList;
            } else if (AnonymousClass0C5.$const$string(77).equals(A0i)) {
                r4.A0I();
            } else if ("pinned_comment".equals(A0i)) {
                akr.A02 = AKN.parseFromJson(r4);
            } else if ("live_seconds_per_comment".equals(A0i)) {
                akr.A00 = r4.A0I();
            } else if ("comment_muted".equals(A0i)) {
                akr.A05 = r4.A0O();
            } else if ("user_pay_supporters_info".equals(A0i)) {
                akr.A01 = AKF.parseFromJson(r4);
            } else {
                AnonymousClass1N4.A01(akr, A0i, r4);
            }
            r4.A0f();
        }
        if (akr.A03 == null) {
            akr.A03 = new ArrayList();
        }
        if (akr.A04 == null) {
            akr.A04 = new ArrayList();
        }
        return akr;
    }
}
