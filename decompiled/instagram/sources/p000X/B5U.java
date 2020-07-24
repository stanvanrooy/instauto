package p000X;

import android.os.PowerManager;

/* renamed from: X.B5U */
public final class B5U extends B5T {
    public final boolean A01(int i) {
        return this.A00.isWakeLockLevelSupported(i);
    }

    public B5U(PowerManager powerManager) {
        super(powerManager);
    }
}
