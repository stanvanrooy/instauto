package p000X;

/* renamed from: X.DWA */
public final class DWA {
    public static DWX parseFromJson(C13080hr r3) {
        DWX dwx = new DWX();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("timestamp".equals(A0i)) {
                dwx.A00 = r3.A0I();
            } else if ("value".equals(A0i)) {
                dwx.A01 = r3.A0I();
            }
            r3.A0f();
        }
        return dwx;
    }
}
