package p000X;

/* renamed from: X.DXW */
public final class DXW {
    public static DXZ parseFromJson(C13080hr r3) {
        DXZ dxz = new DXZ();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("id".equals(A0i)) {
                if (r3.A0g() != C13120hv.VALUE_NULL) {
                    r3.A0t();
                }
            } else if ("business_manager".equals(A0i)) {
                dxz.A00 = DXX.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dxz;
    }
}
