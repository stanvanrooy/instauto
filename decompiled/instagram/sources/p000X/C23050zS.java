package p000X;

import com.instagram.debug.memorydump.MemoryDumpUploadJob;

/* renamed from: X.0zS  reason: invalid class name and case insensitive filesystem */
public final class C23050zS implements C17120pi {
    public final void BfU(C13460iZ r3, Object obj) {
        C23010zO r4 = (C23010zO) obj;
        r3.A0T();
        String str = r4.A01;
        if (str != null) {
            r3.A0H(MemoryDumpUploadJob.EXTRA_USER_ID, str);
        }
        String str2 = r4.A00;
        if (str2 != null) {
            r3.A0H("pending_media_key", str2);
        }
        r3.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return AnonymousClass4S2.parseFromJson(r2);
    }
}
