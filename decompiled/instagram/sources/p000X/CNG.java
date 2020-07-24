package p000X;

/* renamed from: X.CNG */
public final class CNG {
    public static C27690CNk parseFromJson(C13080hr r3) {
        C27690CNk cNk = new C27690CNk();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if (C193418Ps.$const$string(137).equals(A0i)) {
                cNk.A01 = C27700CNu.parseFromJson(r3);
            } else if ("product_source".equals(A0i)) {
                cNk.A00 = C27678CMx.parseFromJson(r3);
            } else {
                AnonymousClass1N4.A01(cNk, A0i, r3);
            }
            r3.A0f();
        }
        return cNk;
    }
}
