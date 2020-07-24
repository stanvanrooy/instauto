package p000X;

/* renamed from: X.DWM */
public final class DWM {
    public static C30225DWl parseFromJson(C13080hr r3) {
        C30225DWl dWl = new C30225DWl();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("posts_count".equals(A0i)) {
                dWl.A00 = r3.A0I();
            }
            r3.A0f();
        }
        return dWl;
    }
}
