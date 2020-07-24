package p000X;

/* renamed from: X.0w6  reason: invalid class name and case insensitive filesystem */
public final class C21050w6 implements C17120pi {
    public final void BfU(C13460iZ r3, Object obj) {
        C21040w5 r4 = (C21040w5) obj;
        r3.A0T();
        String str = r4.A00;
        if (str != null) {
            r3.A0H("thread_id", str);
        }
        r3.A0I("is_mentions_mute", r4.A01);
        AnonymousClass3LW.A00(r3, r4);
        r3.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return C98864Pj.parseFromJson(r2);
    }
}
