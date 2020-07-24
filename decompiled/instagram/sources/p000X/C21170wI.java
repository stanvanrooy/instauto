package p000X;

import com.instagram.realtimeclient.RealtimeProtocol;

/* renamed from: X.0wI  reason: invalid class name and case insensitive filesystem */
public final class C21170wI implements C17120pi {
    public final void BfU(C13460iZ r3, Object obj) {
        C21160wH r4 = (C21160wH) obj;
        r3.A0T();
        String str = r4.A00;
        if (str != null) {
            r3.A0H("thread_id", str);
        }
        r3.A0I(RealtimeProtocol.DIRECT_V2_APPROVAL_REQUIRED_FOR_NEW_MEMBERS, r4.A01);
        AnonymousClass3LW.A00(r3, r4);
        r3.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return C98834Pg.parseFromJson(r2);
    }
}
