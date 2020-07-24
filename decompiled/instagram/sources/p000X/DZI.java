package p000X;

/* renamed from: X.DZI */
public final class DZI {
    public static DZV parseFromJson(C13080hr r3) {
        DZV dzv = new DZV();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("value".equals(A0i)) {
                dzv.A00 = r3.A0I();
            }
            r3.A0f();
        }
        return dzv;
    }
}
