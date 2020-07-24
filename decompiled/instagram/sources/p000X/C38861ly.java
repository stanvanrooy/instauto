package p000X;

/* renamed from: X.1ly  reason: invalid class name and case insensitive filesystem */
public final class C38861ly {
    public static C38871lz parseFromJson(C13080hr r3) {
        C38871lz r1 = new C38871lz();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("stories".equals(A0i)) {
                r1.A08 = AnonymousClass2CI.parseFromJson(r3);
            } else if ("channel".equals(A0i)) {
                r1.A02 = C39921nm.parseFromJson(r3);
            } else if ("media".equals(A0i)) {
                r1.A0B = AnonymousClass1NJ.A00(r3);
            } else if ("account_recs_3up".equals(A0i)) {
                r1.A0C = C43401uM.parseFromJson(r3);
            } else if ("account_rec".equals(A0i)) {
                r1.A0F = C51882Mm.parseFromJson(r3);
            } else if ("igtv".equals(A0i)) {
                r1.A06 = C173697bU.parseFromJson(r3);
            } else if ("shopping".equals(A0i)) {
                r1.A0A = AnonymousClass9XF.parseFromJson(r3);
            } else if ("shopping_carousel".equals(A0i)) {
                r1.A09 = AnonymousClass9UA.parseFromJson(r3);
            } else if ("rec_cover".equals(A0i)) {
                r1.A04 = AnonymousClass5JM.parseFromJson(r3);
            } else if ("igtv_channel".equals(A0i)) {
                r1.A05 = C172767Zv.parseFromJson(r3);
            } else if ("media_location_map".equals(A0i)) {
                r1.A07 = C28718ClY.parseFromJson(r3);
            } else if ("clips".equals(A0i)) {
                r1.A03 = C38881m0.parseFromJson(r3);
            } else if ("bloks_app".equals(A0i)) {
                r1.A01 = C221539gX.parseFromJson(r3);
            } else if ("guide".equals(A0i)) {
                r1.A0E = C120905Gl.parseFromJson(r3);
            } else if ("guide_channel".equals(A0i)) {
                r1.A0D = C472422u.parseFromJson(r3);
            }
            r3.A0f();
        }
        return r1.A00();
    }
}
