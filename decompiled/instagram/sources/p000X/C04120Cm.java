package p000X;

import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0Cm  reason: invalid class name and case insensitive filesystem */
public final class C04120Cm {
    public static C04120Cm A07;
    public static final long A08 = TimeUnit.MINUTES.toMillis(2);
    public long A00;
    public final Lock A01 = new ReentrantLock();
    public volatile StatFs A02 = null;
    public volatile StatFs A03 = null;
    public volatile File A04;
    public volatile File A05;
    public volatile boolean A06 = false;

    public static StatFs A00(StatFs statFs, File file) {
        if (file != null && file.exists()) {
            if (statFs == null) {
                try {
                    return new StatFs(file.getAbsolutePath());
                } catch (IllegalArgumentException unused) {
                } catch (Throwable th) {
                    throw C29340Cw9.A00(th);
                }
            } else {
                statFs.restat(file.getAbsolutePath());
                return statFs;
            }
        }
        return null;
    }

    public static synchronized C04120Cm A01() {
        C04120Cm r0;
        synchronized (C04120Cm.class) {
            if (A07 == null) {
                A07 = new C04120Cm();
            }
            r0 = A07;
        }
        return r0;
    }

    private void A02() {
        if (this.A01.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.A00 > A08) {
                    A04(this);
                }
            } finally {
                this.A01.unlock();
            }
        }
    }

    public static void A03(C04120Cm r2) {
        if (!r2.A06) {
            r2.A01.lock();
            try {
                if (!r2.A06) {
                    r2.A05 = Environment.getDataDirectory();
                    r2.A04 = Environment.getExternalStorageDirectory();
                    A04(r2);
                    r2.A06 = true;
                }
            } finally {
                r2.A01.unlock();
            }
        }
    }

    public static void A04(C04120Cm r2) {
        r2.A03 = A00(r2.A03, r2.A05);
        r2.A02 = A00(r2.A02, r2.A04);
        r2.A00 = SystemClock.uptimeMillis();
    }

    public final boolean A08() {
        if (A05(Constants.ZERO) < OdexSchemeArtXdex.MIN_DISK_FREE_FOR_MIXED_MODE) {
            return true;
        }
        return false;
    }

    public final long A05(Integer num) {
        StatFs statFs;
        A03(this);
        A02();
        if (num == Constants.ZERO) {
            statFs = this.A03;
        } else {
            statFs = this.A02;
        }
        if (statFs != null) {
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return 0;
    }

    public final long A06(Integer num) {
        StatFs statFs;
        A03(this);
        A02();
        if (num == Constants.ZERO) {
            statFs = this.A03;
        } else {
            statFs = this.A02;
        }
        if (statFs != null) {
            return statFs.getBlockSizeLong() * statFs.getFreeBlocksLong();
        }
        return -1;
    }

    public final long A07(Integer num) {
        StatFs statFs;
        A03(this);
        A02();
        if (num == Constants.ZERO) {
            statFs = this.A03;
        } else {
            statFs = this.A02;
        }
        if (statFs != null) {
            return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
        }
        return -1;
    }

    public final boolean A09(Integer num, long j) {
        A03(this);
        long A052 = A05(num);
        if (A052 <= 0 || A052 < j) {
            return true;
        }
        return false;
    }
}
