package p000X;

import android.os.Build;
import android.os.PowerManager;

/* renamed from: X.B5T */
public abstract class B5T {
    public static B5T A01;
    public final PowerManager A00;

    public boolean A01(int i) {
        boolean z;
        B5S b5s = (B5S) this;
        Boolean bool = (Boolean) b5s.A00.get(i);
        if (bool == null) {
            try {
                PowerManager.WakeLock A002 = AnonymousClass0ZP.A00(b5s.A00, i, "PowerManagerWakeLockLevelCompat");
                if (A002 != null) {
                    AnonymousClass0ZP.A04(A002, 500);
                    AnonymousClass0ZP.A02(A002);
                    z = true;
                    bool = Boolean.valueOf(z);
                    b5s.A00.put(i, bool);
                }
            } catch (RuntimeException unused) {
            }
            z = false;
            bool = Boolean.valueOf(z);
            b5s.A00.put(i, bool);
        }
        return bool.booleanValue();
    }

    public static synchronized B5T A00(PowerManager powerManager) {
        B5T b5t;
        B5T b5s;
        synchronized (B5T.class) {
            if (A01 == null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    b5s = new B5U(powerManager);
                } else {
                    b5s = new B5S(powerManager);
                }
                A01 = b5s;
            }
            b5t = A01;
        }
        return b5t;
    }

    public B5T(PowerManager powerManager) {
        this.A00 = powerManager;
    }
}
