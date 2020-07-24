package p000X;

/* renamed from: X.0ph  reason: invalid class name and case insensitive filesystem */
public final class C17110ph implements C17120pi {
    public final void BfU(C13460iZ r3, Object obj) {
        C17080pe r4 = (C17080pe) obj;
        r3.A0T();
        String str = r4.A00;
        if (str != null) {
            r3.A0H("story_chat_id", str);
        }
        r3.A0I("is_request", r4.A01);
        AnonymousClass3LW.A00(r3, r4);
        r3.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return C98924Pp.parseFromJson(r2);
    }
}
