package p000X;

import java.util.ArrayList;

/* renamed from: X.DGf */
public final class DGf {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    public static DGb parseFromJson(C13080hr r4) {
        C29920DGw dGw;
        DGb dGb = new DGb();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("fbpay_experience_enabled".equals(A0i)) {
                dGb.A04 = r4.A0O();
            } else {
                ? r2 = 0;
                if ("payment_session_id".equals(A0i)) {
                    if (r4.A0g() != C13120hv.VALUE_NULL) {
                        r2 = r4.A0t();
                    }
                    dGb.A01 = r2;
                } else if ("payment_security".equals(A0i)) {
                    dGb.A00 = DGh.parseFromJson(r4);
                } else if ("screen_order".equals(A0i)) {
                    if (r4.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList = new ArrayList();
                        while (r4.A0p() != C13120hv.END_ARRAY) {
                            String A0r = r4.A0r();
                            if (A0r != null && !A0r.isEmpty()) {
                                if (A0r.equalsIgnoreCase("UPFRONT_CONSOLIDATED_INFO")) {
                                    dGw = C29920DGw.UPFRONT_CONSOLIDATED_INFO;
                                } else if (A0r.equalsIgnoreCase("UPFRONT_SHIPPING_ADDRESS")) {
                                    dGw = C29920DGw.UPFRONT_SHIPPING_ADDRESS;
                                } else if (A0r.equalsIgnoreCase("UPFRONT_CONTACT_INFO")) {
                                    dGw = C29920DGw.UPFRONT_CONTACT_INFO;
                                } else if (A0r.equalsIgnoreCase("UPFRONT_PAYMENT_CREDENTIAL")) {
                                    dGw = C29920DGw.UPFRONT_PAYMENT_CREDENTIAL;
                                } else if (A0r.equalsIgnoreCase("CHECKOUT")) {
                                    dGw = C29920DGw.CHECKOUT;
                                } else if (A0r.equalsIgnoreCase("PAYMENT_CONFIRMATION")) {
                                    dGw = C29920DGw.PAYMENT_CONFIRMATION;
                                }
                                arrayList.add(dGw);
                            }
                            dGw = C29920DGw.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                            arrayList.add(dGw);
                        }
                        r2 = arrayList;
                    }
                    dGb.A03 = r2;
                } else if ("checkout_screen_components".equals(A0i)) {
                    if (r4.A0g() == C13120hv.START_ARRAY) {
                        ArrayList arrayList2 = new ArrayList();
                        while (r4.A0p() != C13120hv.END_ARRAY) {
                            DGe parseFromJson = DGd.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                        r2 = arrayList2;
                    }
                    dGb.A02 = r2;
                }
            }
            r4.A0f();
        }
        return dGb;
    }
}
