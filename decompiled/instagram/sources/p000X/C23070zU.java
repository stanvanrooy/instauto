package p000X;

import com.instagram.debug.memorydump.MemoryDumpUploadJob;

/* renamed from: X.0zU  reason: invalid class name and case insensitive filesystem */
public final class C23070zU implements C17120pi {
    public final void BfU(C13460iZ r3, Object obj) {
        r3.A0T();
        String str = ((C23060zT) obj).A00;
        if (str != null) {
            r3.A0H(MemoryDumpUploadJob.EXTRA_USER_ID, str);
        }
        r3.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return C98954Ps.parseFromJson(r2);
    }
}
