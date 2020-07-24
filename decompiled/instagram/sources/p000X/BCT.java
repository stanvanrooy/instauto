package p000X;

/* renamed from: X.BCT */
public final class BCT {
    public static BCU parseFromJson(C13080hr r3) {
        BCU bcu = new BCU();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("hashtags".equals(A0i)) {
                bcu.A00 = BCS.parseFromJson(r3);
            } else if ("organic".equals(A0i)) {
                bcu.A01 = BCO.parseFromJson(r3);
            }
            r3.A0f();
        }
        return bcu;
    }
}
