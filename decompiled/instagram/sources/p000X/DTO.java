package p000X;

/* renamed from: X.DTO */
public final class DTO {
    public static DTP parseFromJson(C13080hr r3) {
        DTP dtp = new DTP();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("state".equals(A0i)) {
                dtp.A02 = C9P.A00(r3.A0r());
            } else if ("metrics".equals(A0i)) {
                dtp.A00 = C30301DZj.parseFromJson(r3);
            } else if ("error".equals(A0i)) {
                dtp.A01 = C9V.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dtp;
    }
}
