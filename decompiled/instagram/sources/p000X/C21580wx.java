package p000X;

import com.instagram.debug.memorydump.MemoryDumpUploadJob;

/* renamed from: X.0wx  reason: invalid class name and case insensitive filesystem */
public final class C21580wx implements C17120pi {
    public final void BfU(C13460iZ r3, Object obj) {
        C21570ww r4 = (C21570ww) obj;
        r3.A0T();
        String str = r4.A00;
        if (str != null) {
            r3.A0H("thread_id", str);
        }
        String str2 = r4.A01;
        if (str2 != null) {
            r3.A0H(MemoryDumpUploadJob.EXTRA_USER_ID, str2);
        }
        AnonymousClass3LW.A00(r3, r4);
        r3.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return C98904Pn.parseFromJson(r2);
    }
}
