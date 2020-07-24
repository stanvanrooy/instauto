package p000X;

/* renamed from: X.1uO  reason: invalid class name and case insensitive filesystem */
public final class C43421uO {
    public static C43431uP parseFromJson(C13080hr r3) {
        C43431uP r1 = new C43431uP();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("user_card".equals(A0i)) {
                r1.A06 = C43441uQ.parseFromJson(r3);
            } else if ("upsell_fbc_card".equals(A0i)) {
                r1.A02 = AnonymousClass20S.parseFromJson(r3);
            } else if ("upsell_ci_card".equals(A0i)) {
                r1.A00 = AnonymousClass20S.parseFromJson(r3);
            } else if ("upsell_see_all_su_card".equals(A0i)) {
                r1.A03 = AnonymousClass20S.parseFromJson(r3);
            } else if ("upsell_complete_profile_card".equals(A0i)) {
                r1.A01 = AnonymousClass20S.parseFromJson(r3);
            }
            r3.A0f();
        }
        r1.A00();
        return r1;
    }
}
