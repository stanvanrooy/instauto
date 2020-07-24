package p000X;

/* renamed from: X.0uc  reason: invalid class name and case insensitive filesystem */
public final class C20140uc implements C17120pi {
    public final void BfU(C13460iZ r2, Object obj) {
        C20130ub r3 = (C20130ub) obj;
        r2.A0T();
        if (r3.A00 != null) {
            r2.A0d("ar_effect");
            C56402cR.A00(r2, r3.A00);
        }
        if (r3.A01 != null) {
            r2.A0d("direct_forwarding_params");
            C98994Pw.A00(r2, r3.A01);
        }
        AnonymousClass4RD.A00(r2, r3);
        r2.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return AnonymousClass4RR.parseFromJson(r2);
    }
}
