package p000X;

/* renamed from: X.1m2  reason: invalid class name and case insensitive filesystem */
public final class C38901m2 {
    public static C38911m3 parseFromJson(C13080hr r3) {
        C38911m3 r2 = new C38911m3();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("media".equals(A0i)) {
                r2.A00 = AnonymousClass1NJ.A00(r3);
            }
            r3.A0f();
        }
        if (r2.A00 != null) {
            r2.A02 = Constants.ZERO;
        }
        AnonymousClass0a4.A07(r2.A02, "ClipsItemType not defined on parsed item");
        return r2;
    }
}
