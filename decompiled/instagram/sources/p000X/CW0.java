package p000X;

/* renamed from: X.CW0 */
public final class CW0 {
    public static CWH parseFromJson(C13080hr r3) {
        CWH cwh = new CWH();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("live_active_question_event".equals(A0i)) {
                cwh.A00 = C27894CVi.parseFromJson(r3);
            }
            r3.A0f();
        }
        return cwh;
    }
}
