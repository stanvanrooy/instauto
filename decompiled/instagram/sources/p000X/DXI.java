package p000X;

/* renamed from: X.DXI */
public final class DXI {
    public static DXO parseFromJson(C13080hr r3) {
        DXO dxo = new DXO();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("impressions".equals(A0i)) {
                dxo.A00 = DXJ.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dxo;
    }
}
