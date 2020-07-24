package p000X;

/* renamed from: X.0q8  reason: invalid class name and case insensitive filesystem */
public final class C17370q8 implements C17120pi {
    public final void BfU(C13460iZ r3, Object obj) {
        C17360q7 r4 = (C17360q7) obj;
        r3.A0T();
        String str = r4.A02;
        if (str != null) {
            r3.A0H("media_id", str);
        }
        String str2 = r4.A01;
        if (str2 != null) {
            r3.A0H("group_poll_id", str2);
        }
        r3.A0F("vote_index", r4.A00);
        AnonymousClass3LW.A00(r3, r4);
        r3.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return C98894Pm.parseFromJson(r2);
    }
}
