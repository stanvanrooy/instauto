package p000X;

/* renamed from: X.0zb  reason: invalid class name and case insensitive filesystem */
public final class C23120zb implements C17120pi {
    public final /* synthetic */ C17830qs A00;

    public C23120zb(C17830qs r1) {
        this.A00 = r1;
    }

    public final void BfU(C13460iZ r3, Object obj) {
        C158706q4 r4 = (C158706q4) obj;
        r3.A0T();
        r3.A0F("sub_share_id", r4.A00);
        r3.A0I("is_configured_in_server", r4.A02);
        String str = r4.A01;
        if (str != null) {
            r3.A0H("parent_media_id", str);
        }
        r3.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return C158696q3.parseFromJson(r2);
    }
}
