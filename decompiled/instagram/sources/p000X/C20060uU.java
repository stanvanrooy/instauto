package p000X;

/* renamed from: X.0uU  reason: invalid class name and case insensitive filesystem */
public final class C20060uU implements C17120pi {
    public final void BfU(C13460iZ r2, Object obj) {
        C20050uT r3 = (C20050uT) obj;
        r2.A0T();
        if (r3.A01 != null) {
            r2.A0d("profile");
            AnonymousClass1O2.A03(r2, r3.A01);
        }
        if (r3.A00 != null) {
            r2.A0d("direct_forwarding_params");
            C98994Pw.A00(r2, r3.A00);
        }
        AnonymousClass4RD.A00(r2, r3);
        r2.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return AnonymousClass4RN.parseFromJson(r2);
    }
}
