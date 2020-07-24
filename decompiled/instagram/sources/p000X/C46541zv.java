package p000X;

/* renamed from: X.1zv  reason: invalid class name and case insensitive filesystem */
public final class C46541zv {
    public static C46551zw parseFromJson(C13080hr r3) {
        C46551zw r2 = new C46551zw();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("beforeRenderBitrate".equals(A0i)) {
                r2.A01 = r3.A0I();
            } else if ("afterRenderBitrate".equals(A0i)) {
                r2.A00 = r3.A0I();
            }
            r3.A0f();
        }
        return r2;
    }
}
