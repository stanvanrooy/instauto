package p000X;

import com.instagram.feed.media.Media__JsonHelper;

/* renamed from: X.0x6  reason: invalid class name and case insensitive filesystem */
public final class C21670x6 implements C17120pi {
    public final void BfU(C13460iZ r2, Object obj) {
        C21660x5 r3 = (C21660x5) obj;
        r2.A0T();
        if (r3.A01 != null) {
            r2.A0d("forward_media");
            Media__JsonHelper.A01(r2, r3.A01);
        }
        if (r3.A00 != null) {
            r2.A0d("direct_forwarding_params");
            C98994Pw.A00(r2, r3.A00);
        }
        AnonymousClass4RD.A00(r2, r3);
        r2.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return AnonymousClass4RO.parseFromJson(r2);
    }
}
