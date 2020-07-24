package p000X;

/* renamed from: X.BCQ */
public final class BCQ {
    public static BCR parseFromJson(C13080hr r3) {
        BCR bcr = new BCR();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("name".equals(A0i)) {
                if (r3.A0g() != C13120hv.VALUE_NULL) {
                    r3.A0t();
                }
            } else if ("organic".equals(A0i)) {
                bcr.A00 = BCM.parseFromJson(r3);
            }
            r3.A0f();
        }
        return bcr;
    }
}
