package p000X;

/* renamed from: X.1sQ  reason: invalid class name and case insensitive filesystem */
public final class C42481sQ {
    public static C42351sD parseFromJson(C13080hr r3) {
        C42351sD r2 = new C42351sD();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("has_post_capture_effects".equals(A0i)) {
                r2.A00 = r3.A0O();
            } else if ("is_recording_completed".equals(A0i)) {
                r2.A01 = r3.A0O();
            }
            r3.A0f();
        }
        return r2;
    }
}
