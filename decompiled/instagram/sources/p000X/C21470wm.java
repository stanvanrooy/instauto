package p000X;

/* renamed from: X.0wm  reason: invalid class name and case insensitive filesystem */
public final class C21470wm implements C17120pi {
    public final void BfU(C13460iZ r3, Object obj) {
        C21460wl r4 = (C21460wl) obj;
        r3.A0T();
        if (r4.A01 != null) {
            r3.A0d("thead_key");
            C55372aW.A00(r3, r4.A01);
        }
        String str = r4.A03;
        if (str != null) {
            r3.A0H("message_id", str);
        }
        r3.A0F("selected_option_index", r4.A00);
        String str2 = r4.A02;
        if (str2 != null) {
            r3.A0H("client_context", str2);
        }
        AnonymousClass3LW.A00(r3, r4);
        r3.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return C99034Qb.parseFromJson(r2);
    }
}
