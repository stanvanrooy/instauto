package p000X;

/* renamed from: X.DVN */
public final class DVN {
    public static DVW parseFromJson(C13080hr r3) {
        DVW dvw = new DVW();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("state".equals(A0i)) {
                C9P.A00(r3.A0r());
            } else if ("metrics".equals(A0i)) {
                dvw.A00 = DVS.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dvw;
    }
}
