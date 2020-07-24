package p000X;

import com.instagram.realtimeclient.RealtimeProtocol;

/* renamed from: X.0x3  reason: invalid class name and case insensitive filesystem */
public final class C21640x3 implements C17120pi {
    public final void BfU(C13460iZ r3, Object obj) {
        C21630x2 r4 = (C21630x2) obj;
        r3.A0T();
        String str = r4.A02;
        if (str != null) {
            r3.A0H("thread_id", str);
        }
        String str2 = r4.A01;
        if (str2 != null) {
            r3.A0H(RealtimeProtocol.DIRECT_V2_THEME_ID, str2);
        }
        if (r4.A00 != null) {
            r3.A0d("theme_info");
            C58922gk.A00(r3, r4.A00);
        }
        AnonymousClass3LW.A00(r3, r4);
        r3.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return C98814Pe.parseFromJson(r2);
    }
}
