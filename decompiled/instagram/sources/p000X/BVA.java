package p000X;

/* renamed from: X.BVA */
public final class BVA {
    public static BVB parseFromJson(C13080hr r3) {
        BVB bvb = new BVB();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("uri".equals(A0i) && r3.A0g() != C13120hv.VALUE_NULL) {
                r3.A0t();
            }
            r3.A0f();
        }
        return bvb;
    }
}
