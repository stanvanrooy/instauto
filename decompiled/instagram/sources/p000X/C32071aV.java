package p000X;

/* renamed from: X.1aV  reason: invalid class name and case insensitive filesystem */
public final class C32071aV {
    public static C32081aW parseFromJson(C13080hr r3) {
        C32081aW r2 = new C32081aW();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("containermodule".equals(A0i)) {
                if (r3.A0g() != C13120hv.VALUE_NULL) {
                    r3.A0t();
                }
            } else if ("should_prefetch".equals(A0i)) {
                r2.A00 = r3.A0O();
            } else if ("should_prefetch_thumbnails".equals(A0i)) {
                r3.A0O();
            }
            r3.A0f();
        }
        return r2;
    }
}
