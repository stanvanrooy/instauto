package p000X;

/* renamed from: X.0u2  reason: invalid class name and case insensitive filesystem */
public final class C19780u2 implements C17120pi {
    public final void BfU(C13460iZ r3, Object obj) {
        C19770u1 r4 = (C19770u1) obj;
        r3.A0T();
        if (r4.A01 != null) {
            r3.A0d("share_target");
            AnonymousClass4UI.A00(r3, r4.A01);
        }
        String str = r4.A03;
        if (str != null) {
            r3.A0H("reel_id", str);
        }
        if (r4.A00 != null) {
            r3.A0d("live_video_share");
            C99964Tr.A00(r3, r4.A00);
        }
        String str2 = r4.A02;
        if (str2 != null) {
            r3.A0H("entry_point", str2);
        }
        AnonymousClass4RD.A00(r3, r4);
        r3.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return C99954Tq.parseFromJson(r2);
    }
}
