package p000X;

/* renamed from: X.AKP */
public final class AKP {
    public static C23384AKj parseFromJson(C13080hr r3) {
        C23384AKj aKj = new C23384AKj();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("live_video_comment_event".equals(A0i)) {
                aKj.A00 = AKG.parseFromJson(r3);
            }
            r3.A0f();
        }
        return aKj;
    }
}
