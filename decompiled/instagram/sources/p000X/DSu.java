package p000X;

/* renamed from: X.DSu */
public final class DSu {
    public static C30150DSw parseFromJson(C13080hr r3) {
        C30150DSw dSw = new C30150DSw();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("status_event".equals(A0i)) {
                dSw.A00 = DSt.parseFromJson(r3);
            }
            r3.A0f();
        }
        return dSw;
    }
}
