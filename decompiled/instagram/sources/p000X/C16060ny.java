package p000X;

import android.os.Process;

/* renamed from: X.0ny  reason: invalid class name and case insensitive filesystem */
public final class C16060ny extends C16070nz {
    public final int A00;

    public C16060ny(Class cls, C12900hZ r3, C15830nb r4, int i) {
        super(cls, r3, r4, true);
        this.A00 = i;
    }

    /* renamed from: A01 */
    public final C28731Mw then(C33861dc r5) {
        boolean z = false;
        if (this.A00 > -20) {
            z = true;
        }
        int threadPriority = Process.getThreadPriority(Process.myTid());
        if (z) {
            Process.setThreadPriority(this.A00);
        }
        C28731Mw r2 = (C28731Mw) super.then(r5);
        C17190pp A002 = r5.A00("X-IG-ANDROID-FROM-DISK-CACHE");
        if (A002 != null) {
            r2.BgK(Long.parseLong(A002.A01));
        }
        Process.setThreadPriority(threadPriority);
        return r2;
    }
}
