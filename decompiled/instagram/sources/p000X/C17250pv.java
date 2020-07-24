package p000X;

/* renamed from: X.0pv  reason: invalid class name and case insensitive filesystem */
public final class C17250pv implements C17120pi {
    public final void BfU(C13460iZ r3, Object obj) {
        C17240pu r4 = (C17240pu) obj;
        r3.A0T();
        String str = r4.A02;
        if (str != null) {
            r3.A0H("media_id", str);
        }
        String str2 = r4.A03;
        if (str2 != null) {
            r3.A0H("poll_id", str2);
        }
        r3.A0F("viewer_vote", r4.A00);
        String str3 = r4.A04;
        if (str3 != null) {
            r3.A0H("radio_type", str3);
        }
        String str4 = r4.A05;
        if (str4 != null) {
            r3.A0H("reel_viewer_module_name", str4);
        }
        String str5 = r4.A01;
        if (str5 != null) {
            r3.A0H("media_delivery_class", str5);
        }
        AnonymousClass3LW.A00(r3, r4);
        r3.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return C99344Rh.parseFromJson(r2);
    }
}
