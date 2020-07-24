package p000X;

/* renamed from: X.AJU */
public final class AJU {
    public static AJV parseFromJson(C13080hr r3) {
        AJV ajv = new AJV();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("live_video_wave_event".equals(A0i)) {
                ajv.A00 = AJT.parseFromJson(r3);
            }
            r3.A0f();
        }
        return ajv;
    }
}
