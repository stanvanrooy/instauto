package p000X;

/* renamed from: X.DZY */
public final class DZY {
    public static C30295DZd parseFromJson(C13080hr r3) {
        C30295DZd dZd = new C30295DZd();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("actions".equals(A0i)) {
                dZd.A00 = C30292DZa.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dZd;
    }
}
