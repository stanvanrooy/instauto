package p000X;

/* renamed from: X.CLZ */
public final class CLZ {
    public static C27634CLb parseFromJson(C13080hr r3) {
        C27634CLb cLb = new C27634CLb();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("error".equals(A0i)) {
                r3.A0I();
            } else if ("ig_financial_entity".equals(A0i)) {
                cLb.A00 = C27633CLa.parseFromJson(r3);
            }
            r3.A0f();
        }
        return cLb;
    }
}
