package p000X;

/* renamed from: X.DWJ */
public final class DWJ {
    public static DWR parseFromJson(C13080hr r3) {
        DWR dwr = new DWR();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("node".equals(A0i)) {
                dwr.A00 = C30200DVm.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dwr;
    }
}
