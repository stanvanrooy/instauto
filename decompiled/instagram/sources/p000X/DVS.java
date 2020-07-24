package p000X;

/* renamed from: X.DVS */
public final class DVS {
    public static DVX parseFromJson(C13080hr r3) {
        DVX dvx = new DVX();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("reach".equals(A0i)) {
                dvx.A00 = DVT.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dvx;
    }
}
