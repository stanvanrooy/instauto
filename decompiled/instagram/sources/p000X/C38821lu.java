package p000X;

/* renamed from: X.1lu  reason: invalid class name and case insensitive filesystem */
public final class C38821lu {
    public static C38831lv parseFromJson(C13080hr r3) {
        String A0t;
        C38831lv r2 = new C38831lv();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("layout_type".equals(A0i)) {
                if (r3.A0g() == C13120hv.VALUE_NULL) {
                    A0t = null;
                } else {
                    A0t = r3.A0t();
                }
                r2.A03 = A0t;
            } else if ("layout_content".equals(A0i)) {
                r2.A01 = C38841lw.parseFromJson(r3);
            } else if ("explore_item_info".equals(A0i)) {
                r2.A00 = C39411ms.parseFromJson(r3);
            }
            r3.A0f();
        }
        C39431mu r0 = (C39431mu) C39431mu.A01.get(r2.A03);
        if (r0 == null) {
            r0 = C39431mu.INVALID;
        }
        r2.A02 = r0;
        return r2;
    }
}
