package p000X;

/* renamed from: X.0wa  reason: invalid class name and case insensitive filesystem */
public final class C21350wa implements C17120pi {
    public final void BfU(C13460iZ r3, Object obj) {
        C21340wZ r4 = (C21340wZ) obj;
        r3.A0T();
        String str = r4.A01;
        if (str != null) {
            r3.A0H("thread_id", str);
        }
        String str2 = r4.A00;
        if (str2 != null) {
            r3.A0H("new_title", str2);
        }
        AnonymousClass3LW.A00(r3, r4);
        r3.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return C98934Pq.parseFromJson(r2);
    }
}
