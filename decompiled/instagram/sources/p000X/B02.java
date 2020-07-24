package p000X;

/* renamed from: X.B02 */
public final class B02 {
    public static B03 parseFromJson(C13080hr r3) {
        B03 b03 = new B03();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("data".equals(A0i)) {
                b03.A00 = B01.parseFromJson(r3);
            }
            r3.A0f();
        }
        return b03;
    }
}
