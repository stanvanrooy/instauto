package p000X;

import java.util.ArrayList;

/* renamed from: X.1sL  reason: invalid class name and case insensitive filesystem */
public final class C42431sL {
    public static C42291s7 parseFromJson(C13080hr r4) {
        C42291s7 r2 = new C42291s7();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("next_publish_id".equals(A0i)) {
                r2.A00 = r4.A0I();
            } else {
                ArrayList arrayList = null;
                if ("media_publish_sent_id_list".equals(A0i)) {
                    if (r4.A0g() == C13120hv.START_ARRAY) {
                        arrayList = new ArrayList();
                        while (r4.A0p() != C13120hv.END_ARRAY) {
                            Integer valueOf = Integer.valueOf(r4.A0I());
                            if (valueOf != null) {
                                arrayList.add(valueOf);
                            }
                        }
                    }
                    r2.A02 = arrayList;
                } else if ("media_success_sent_id_list".equals(A0i)) {
                    if (r4.A0g() == C13120hv.START_ARRAY) {
                        arrayList = new ArrayList();
                        while (r4.A0p() != C13120hv.END_ARRAY) {
                            Integer valueOf2 = Integer.valueOf(r4.A0I());
                            if (valueOf2 != null) {
                                arrayList.add(valueOf2);
                            }
                        }
                    }
                    r2.A03 = arrayList;
                } else if ("media_abandon_sent_id_list".equals(A0i)) {
                    if (r4.A0g() == C13120hv.START_ARRAY) {
                        arrayList = new ArrayList();
                        while (r4.A0p() != C13120hv.END_ARRAY) {
                            Integer valueOf3 = Integer.valueOf(r4.A0I());
                            if (valueOf3 != null) {
                                arrayList.add(valueOf3);
                            }
                        }
                    }
                    r2.A01 = arrayList;
                } else if ("is_publish_ready_sent".equals(A0i)) {
                    r2.A04 = r4.A0O();
                }
            }
            r4.A0f();
        }
        return r2;
    }
}
