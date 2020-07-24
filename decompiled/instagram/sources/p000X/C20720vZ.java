package p000X;

/* renamed from: X.0vZ  reason: invalid class name and case insensitive filesystem */
public final class C20720vZ implements C17120pi {
    public final void BfU(C13460iZ r3, Object obj) {
        C20700vX r4 = (C20700vX) obj;
        r3.A0T();
        if (r4.A00 != null) {
            r3.A0d("seen_marker");
            C58862ge r0 = r4.A00;
            r3.A0T();
            C58882gg.A00(r3, r0);
            r3.A0Q();
        }
        String str = r4.A01;
        if (str != null) {
            r3.A0H("message_user_id", str);
        }
        AnonymousClass3LW.A00(r3, r4);
        r3.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return C98914Po.parseFromJson(r2);
    }
}
