package p000X;

/* renamed from: X.0v3  reason: invalid class name and case insensitive filesystem */
public final class C20410v3 implements C17120pi {
    public final void BfU(C13460iZ r3, Object obj) {
        C20400v2 r4 = (C20400v2) obj;
        r3.A0T();
        if (r4.A00 != null) {
            r3.A0d("status_reply");
            AnonymousClass4RF.A00(r3, r4.A00);
        }
        String str = r4.A01;
        if (str != null) {
            r3.A0H("status_author_id", str);
        }
        AnonymousClass4RD.A00(r3, r4);
        r3.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return AnonymousClass4RE.parseFromJson(r2);
    }
}
