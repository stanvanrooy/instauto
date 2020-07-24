package p000X;

import com.facebook.common.dextricks.DexStore;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.D64 */
public final class D64 implements DAW {
    public float A00;
    public int A01;
    public long A02;
    public long A03;
    public boolean A04;
    public final C25947Bcz A05;
    public final D2M A06;
    public final D6Q A07;
    public final AtomicBoolean A08;
    public final AtomicBoolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final int A0C;
    public final D6B A0D;
    public final D4G A0E;
    public final boolean A0F;

    public final long AGW() {
        return 0;
    }

    public final void BFG() {
        this.A01 = 0;
        this.A04 = false;
    }

    public final boolean Be1() {
        return false;
    }

    public final void onReleased() {
        this.A01 = 0;
        this.A04 = false;
        this.A07.A01();
    }

    public final void onStopped() {
        this.A01 = 0;
        this.A04 = false;
        this.A07.A01();
    }

    public final void BSL(DAR[] darArr, TrackGroupArray trackGroupArray, DAK dak) {
        int i;
        int i2 = this.A0C;
        if (i2 == -1) {
            i2 = 0;
            for (int i3 = 0; i3 < darArr.length; i3++) {
                if (dak.A02[i3] != null) {
                    switch (darArr[i3].AYr()) {
                        case 0:
                            i = 16777216;
                            break;
                        case 1:
                            i = 3538944;
                            break;
                        case 2:
                            i = 13107200;
                            break;
                        case 3:
                        case 4:
                        case 5:
                            i = DexStore.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
                            break;
                        case 6:
                            i = 0;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    i2 += i;
                }
            }
        }
        this.A01 = i2;
        this.A07.A02(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0045, code lost:
        if (r0.A01() == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0100, code lost:
        if (r14 == false) goto L_0x0104;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0098 A[Catch:{ all -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x009b A[Catch:{ all -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00d5 A[Catch:{ all -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00df A[Catch:{ all -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x00f4 A[Catch:{ all -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x00fc A[Catch:{ all -> 0x010a }] */
    public final boolean Bmb(long j, long j2, float f, boolean z) {
        boolean z2;
        long A002;
        boolean z3;
        long j3;
        int i;
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        AtomicBoolean atomicBoolean3;
        try {
            C200008hB.A01("shouldContinueLoading");
            boolean z4 = false;
            if (!this.A0A || (atomicBoolean3 = this.A08) == null || !atomicBoolean3.get()) {
                AtomicBoolean atomicBoolean4 = this.A09;
                if (atomicBoolean4 == null || !atomicBoolean4.get()) {
                    if (this.A0B && !z) {
                        z4 = true;
                    }
                }
            }
            boolean z5 = false;
            if (z4) {
                return false;
            }
            boolean z6 = false;
            if (this.A07.A00() >= this.A01) {
                z6 = true;
            }
            D6B d6b = this.A0D;
            C25947Bcz bcz = this.A05;
            if (bcz != null) {
                z2 = true;
            }
            z2 = false;
            long j4 = j2;
            if (d6b.A0A && (atomicBoolean2 = d6b.A07) != null && atomicBoolean2.get()) {
                A002 = d6b.A03;
            } else if (d6b.A08.get()) {
                A002 = d6b.A02;
            } else {
                if (!z) {
                    A002 = d6b.A04;
                    if (A002 > 0) {
                    }
                }
                A002 = d6b.A00(z2, j4);
                if (A002 <= 0) {
                    A002 = d6b.A01;
                }
            }
            D6B d6b2 = this.A0D;
            C25947Bcz bcz2 = this.A05;
            if (bcz2 != null) {
                z3 = true;
                if (!bcz2.A01()) {
                }
                if (d6b2.A0A && (atomicBoolean = d6b2.A07) != null && atomicBoolean.get()) {
                    j3 = d6b2.A03;
                } else if (d6b2.A08.get()) {
                    j3 = d6b2.A02;
                } else {
                    if (!z) {
                        j3 = d6b2.A04;
                        if (j3 > 0) {
                        }
                    }
                    boolean z7 = z3;
                    C39961nq r1 = d6b2.A05;
                    if (r1 != null && !d6b2.A09) {
                        if (z3) {
                            i = r1.A05;
                        } else {
                            i = r1.A02;
                        }
                        long A003 = d6b2.A00(z7, j4);
                        if (A003 != 0) {
                            j3 = A003 + (((long) i) * 1000);
                            if (j3 <= 0) {
                                j3 = d6b2.A00;
                            }
                        }
                    }
                    j3 = 0;
                    if (j3 <= 0) {
                    }
                }
                float f2 = f;
                if (f > 1.0f) {
                    if (f != 1.0f) {
                        A002 = Math.round(((double) A002) * ((double) f2));
                    }
                    A002 = Math.min(A002, j3);
                }
                if (j >= A002) {
                    if (this.A0F || !z6) {
                        z5 = true;
                    }
                } else if (j <= j3) {
                }
                this.A04 = z5;
                boolean z8 = this.A04;
                C200008hB.A00();
                return z8;
            }
            z3 = false;
            if (d6b2.A0A || (atomicBoolean = d6b2.A07) != null || atomicBoolean.get()) {
            }
            float f22 = f;
            if (f > 1.0f) {
            }
            if (j >= A002) {
            }
            this.A04 = z5;
            boolean z82 = this.A04;
            C200008hB.A00();
            return z82;
        } finally {
            C200008hB.A00();
        }
    }

    public final boolean Bnc(long j, float f, boolean z, boolean z2) {
        long j2;
        if (f != 1.0f) {
            j = Math.round(((double) j) / ((double) f));
        }
        if (!z) {
            j2 = (long) (((float) this.A03) * this.A00);
        } else if (z2) {
            j2 = (long) (D2M.A00(this.A06, 12) * 1000);
        } else {
            j2 = this.A02;
        }
        if (j2 <= 0 || j >= j2) {
            return true;
        }
        if (this.A0F || this.A07.A00() < this.A01) {
            return false;
        }
        return true;
    }

    public D64(D6Q d6q, int i, int i2, int i3, boolean z, D6B d6b, D2M d2m, C25947Bcz bcz, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, boolean z2, D4G d4g) {
        D6U.A04(i >= 0, AnonymousClass000.A0J("mBufferForPlaybackMs", " cannot be less than ", "0"));
        D6U.A04(i2 >= 0, AnonymousClass000.A0J("mBufferForPlaybackAfterRebufferMs", " cannot be less than ", "0"));
        this.A07 = d6q;
        this.A03 = ((long) i) * 1000;
        this.A00 = 1.0f;
        this.A02 = ((long) i2) * 1000;
        this.A06 = d2m;
        this.A0C = i3;
        this.A0F = true;
        this.A0B = z;
        this.A0D = d6b;
        this.A05 = bcz;
        this.A09 = atomicBoolean;
        this.A08 = atomicBoolean2;
        this.A0A = z2;
        this.A0E = d4g;
    }

    public final C29736D7a AFn() {
        return this.A07;
    }
}
