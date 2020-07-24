package p000X;

import android.app.ActivityManager;

/* renamed from: X.BRD */
public final class BRD {
    public final long A00;
    public final ActivityManager.MemoryInfo A01;

    public BRD(ActivityManager.MemoryInfo memoryInfo, long j) {
        this.A01 = memoryInfo;
        this.A00 = j;
    }
}
