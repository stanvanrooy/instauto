package p000X;

import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.realtimeclient.RealtimeProtocol;

/* renamed from: X.0xL  reason: invalid class name and case insensitive filesystem */
public final class C21820xL implements C17120pi {
    public final void BfU(C13460iZ r3, Object obj) {
        C21810xK r4 = (C21810xK) obj;
        r3.A0T();
        Boolean bool = r4.A00;
        if (bool != null) {
            r3.A0I(RealtimeProtocol.USERS_IS_MESSAGING_PSEUDO_BLOCKING, bool.booleanValue());
        }
        String str = r4.A01;
        if (str != null) {
            r3.A0H(MemoryDumpUploadJob.EXTRA_USER_ID, str);
        }
        AnonymousClass3LW.A00(r3, r4);
        r3.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return C98824Pf.parseFromJson(r2);
    }
}
