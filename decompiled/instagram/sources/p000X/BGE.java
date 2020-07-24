package p000X;

import com.facebook.react.uimanager.BaseViewManager;
import java.util.Random;
import sun.misc.Unsafe;

/* renamed from: X.BGE */
public abstract class BGE extends Number {
    public static final int A01 = Runtime.getRuntime().availableProcessors();
    public static final ThreadLocal A02 = new ThreadLocal();
    public static final Random A03 = new Random();
    public static final long A04;
    public static final long A05;
    public static final Unsafe A06;
    public volatile transient BGG[] A00;
    public volatile transient long base;
    public volatile transient int busy;

    public long A01(long j, long j2) {
        return j + j2;
    }

    static {
        try {
            Unsafe A002 = A00();
            A06 = A002;
            Class<BGE> cls = BGE.class;
            A04 = A002.objectFieldOffset(cls.getDeclaredField("base"));
            A05 = A06.objectFieldOffset(cls.getDeclaredField(BaseViewManager.STATE_BUSY));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0094, code lost:
        if (r12.A00 != r2) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0096, code lost:
        r3 = new p000X.BGG[(r6 << 1)];
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009b, code lost:
        if (r1 >= r6) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009d, code lost:
        r3[r1] = r2[r1];
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a4, code lost:
        r12.A00 = r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00d9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x001b A[SYNTHETIC] */
    public final void A02(long j, int[] iArr, boolean z) {
        int i;
        boolean z2;
        int length;
        int length2;
        int[] iArr2 = iArr;
        if (iArr == null) {
            iArr2 = new int[1];
            A02.set(iArr2);
            i = A03.nextInt();
            if (i == 0) {
                i = 1;
            }
            iArr2[0] = i;
        } else {
            i = iArr[0];
        }
        while (true) {
            boolean z3 = false;
            while (true) {
                BGG[] bggArr = this.A00;
                long j2 = j;
                if (bggArr != null && (length = bggArr.length) > 0) {
                    BGG bgg = bggArr[(length - 1) & i];
                    if (bgg == null) {
                        if (this.busy == 0) {
                            BGG bgg2 = new BGG(j2);
                            if (this.busy == 0 && A06.compareAndSwapInt(this, A05, 0, 1)) {
                                try {
                                    BGG[] bggArr2 = this.A00;
                                    if (bggArr2 != null && (length2 = bggArr2.length) > 0) {
                                        int i2 = (length2 - 1) & i;
                                        if (bggArr2[i2] == null) {
                                            bggArr2[i2] = bgg2;
                                            z2 = true;
                                            this.busy = 0;
                                            if (z2) {
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
                                    this.busy = 0;
                                    throw th;
                                }
                            }
                        }
                        z3 = false;
                    } else if (!z) {
                        z = true;
                    } else {
                        long j3 = bgg.value;
                        if (!bgg.A00(j3, A01(j3, j2))) {
                            if (length < A01 && this.A00 == bggArr) {
                                if (z3) {
                                    if (this.busy == 0 && A06.compareAndSwapInt(this, A05, 0, 1)) {
                                        break;
                                    }
                                } else {
                                    z3 = true;
                                }
                            }
                            z3 = false;
                        } else {
                            return;
                        }
                    }
                    int i3 = i ^ (i << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    i = i4 ^ (i4 << 5);
                    iArr2[0] = i;
                } else if (this.busy != 0 || this.A00 != bggArr || !A06.compareAndSwapInt(this, A05, 0, 1)) {
                    long j4 = this.base;
                    if (A06.compareAndSwapLong(this, A04, j4, A01(j4, j2))) {
                        return;
                    }
                } else if (this.A00 == bggArr) {
                    BGG[] bggArr3 = new BGG[2];
                    bggArr3[i & 1] = new BGG(j2);
                    this.A00 = bggArr3;
                    z2 = true;
                    this.busy = 0;
                    if (z2) {
                        return;
                    }
                }
                z2 = false;
                this.busy = 0;
                if (z2) {
                }
            }
            this.busy = 0;
        }
    }

    public final boolean A03(long j, long j2) {
        return A06.compareAndSwapLong(this, A04, j, j2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new p000X.BCH());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
    public static Unsafe A00() {
        return Unsafe.getUnsafe();
    }
}
