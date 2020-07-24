package p000X;

/* renamed from: X.DXD */
public final class DXD {
    public static DXQ parseFromJson(C13080hr r3) {
        DXQ dxq = new DXQ();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("metrics".equals(A0i)) {
                dxq.A00 = DXF.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dxq;
    }
}
