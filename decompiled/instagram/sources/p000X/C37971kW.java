package p000X;

import java.util.ArrayList;

/* renamed from: X.1kW  reason: invalid class name and case insensitive filesystem */
public final class C37971kW {
    public static C38361l9 parseFromJson(C13080hr r4) {
        C38361l9 r3 = new C38361l9();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            ArrayList arrayList = null;
            if ("request_status".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    r4.A0t();
                }
            } else if ("qp_data".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        C38391lC parseFromJson = C38381lB.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                }
                r3.A01 = arrayList;
            } else if ("extra_info".equals(A0i)) {
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        AnonymousClass4YA parseFromJson2 = AnonymousClass4Y9.parseFromJson(r4);
                        if (parseFromJson2 != null) {
                            arrayList.add(parseFromJson2);
                        }
                    }
                }
                r3.A00 = arrayList;
            } else {
                AnonymousClass1N4.A01(r3, A0i, r4);
            }
            r4.A0f();
        }
        return r3;
    }
}
