package p000X;

/* renamed from: X.1aG  reason: invalid class name and case insensitive filesystem */
public final class C31931aG {
    public static C31941aH parseFromJson(C13080hr r3) {
        String A0t;
        C31941aH r2 = new C31941aH();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("music_info".equals(A0i)) {
                r2.A00 = C31951aI.parseFromJson(r3);
            } else if ("original_sound_info".equals(A0i)) {
                r2.A01 = C31971aK.parseFromJson(r3);
            } else if ("featured_label".equals(A0i)) {
                if (r3.A0g() == C13120hv.VALUE_NULL) {
                    A0t = null;
                } else {
                    A0t = r3.A0t();
                }
                r2.A02 = A0t;
            }
            r3.A0f();
        }
        return r2;
    }
}
