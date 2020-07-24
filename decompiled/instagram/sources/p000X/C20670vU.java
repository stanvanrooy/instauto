package p000X;

/* renamed from: X.0vU  reason: invalid class name and case insensitive filesystem */
public final class C20670vU implements C17120pi {
    public final void BfU(C13460iZ r3, Object obj) {
        C20660vT r4 = (C20660vT) obj;
        r3.A0T();
        if (r4.A00 != null) {
            r3.A0d("thread_key");
            C55372aW.A00(r3, r4.A00);
        }
        String str = r4.A02;
        if (str != null) {
            r3.A0H("item_id", str);
        }
        String str2 = r4.A01;
        if (str2 != null) {
            r3.A0H("original_message_client_context", str2);
        }
        AnonymousClass3LW.A00(r3, r4);
        r3.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return C99024Qa.parseFromJson(r2);
    }
}
