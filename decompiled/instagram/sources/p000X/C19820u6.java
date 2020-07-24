package p000X;

/* renamed from: X.0u6  reason: invalid class name and case insensitive filesystem */
public final class C19820u6 implements C17120pi {
    public final void BfU(C13460iZ r3, Object obj) {
        C19810u5 r4 = (C19810u5) obj;
        r3.A0T();
        String str = r4.A02;
        if (str != null) {
            r3.A0H("reel_id", str);
        }
        if (r4.A01 != null) {
            r3.A0d("story_share");
            C56302cH.A00(r3, r4.A01);
        }
        String str2 = r4.A03;
        if (str2 != null) {
            r3.A0H("reel_viewer_module_name", str2);
        }
        if (r4.A00 != null) {
            r3.A0d("direct_forwarding_params");
            C98994Pw.A00(r3, r4.A00);
        }
        AnonymousClass4RD.A00(r3, r4);
        r3.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return AnonymousClass4RU.parseFromJson(r2);
    }
}
