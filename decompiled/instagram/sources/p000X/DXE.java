package p000X;

/* renamed from: X.DXE */
public final class DXE {
    public static DXN parseFromJson(C13080hr r3) {
        DXN dxn = new DXN();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("metrics".equals(A0i)) {
                dxn.A00 = DXI.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dxn;
    }
}
