package p000X;

import com.facebook.common.dextricks.DexStore;
import com.google.android.exoplayer2.source.TrackGroupArray;

/* renamed from: X.D65 */
public final class D65 implements DAW {
    public int A00;
    public boolean A01;
    public boolean A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08 = C29686D4x.A00((long) 15000);
    public final long A09;
    public final D6Q A0A;
    public final boolean A0B;

    public static void A00(int i, int i2, String str, String str2) {
        boolean z = false;
        if (i >= i2) {
            z = true;
        }
        D6U.A04(z, AnonymousClass000.A0J(str, " cannot be less than ", str2));
    }

    public final void BFG() {
        this.A00 = 0;
        this.A01 = false;
    }

    public final void BSL(DAR[] darArr, TrackGroupArray trackGroupArray, DAK dak) {
        int length;
        boolean z;
        int i;
        int i2 = 0;
        while (true) {
            length = darArr.length;
            if (i2 < length) {
                if (darArr[i2].AYr() == 2 && dak.A02[i2] != null) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                z = false;
                break;
            }
        }
        this.A02 = z;
        int i3 = this.A03;
        if (i3 == -1) {
            i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                if (dak.A02[i4] != null) {
                    switch (darArr[i4].AYr()) {
                        case 0:
                            i = 36438016;
                            break;
                        case 1:
                            i = 3538944;
                            break;
                        case 2:
                            i = 32768000;
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
                    i3 += i;
                }
            }
        }
        this.A00 = i3;
        this.A0A.A02(i3);
    }

    public final void onReleased() {
        this.A00 = 0;
        this.A01 = false;
        this.A0A.A01();
    }

    public final void onStopped() {
        this.A00 = 0;
        this.A01 = false;
        this.A0A.A01();
    }

    public D65() {
        D6Q d6q = new D6Q();
        A00(2500, 0, "bufferForPlaybackMs", "0");
        A00(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        A00(15000, 2500, "minBufferAudioMs", "bufferForPlaybackMs");
        A00(50000, 2500, "minBufferVideoMs", "bufferForPlaybackMs");
        A00(15000, 5000, "minBufferAudioMs", "bufferForPlaybackAfterRebufferMs");
        A00(50000, 5000, "minBufferVideoMs", "bufferForPlaybackAfterRebufferMs");
        A00(50000, 15000, "maxBufferMs", "minBufferAudioMs");
        A00(50000, 50000, "maxBufferMs", "minBufferVideoMs");
        A00(0, 0, "backBufferDurationMs", "0");
        this.A0A = d6q;
        long A002 = C29686D4x.A00((long) 50000);
        this.A09 = A002;
        this.A07 = A002;
        this.A06 = C29686D4x.A00((long) 2500);
        this.A05 = C29686D4x.A00((long) 5000);
        this.A03 = -1;
        this.A0B = true;
        this.A04 = C29686D4x.A00((long) 0);
    }

    public final boolean Bmb(long j, long j2, float f, boolean z) {
        long j3;
        boolean z2 = true;
        boolean z3 = false;
        if (this.A0A.A00() >= this.A00) {
            z3 = true;
        }
        if (this.A02) {
            j3 = this.A09;
        } else {
            j3 = this.A08;
        }
        if (f > 1.0f) {
            if (f != 1.0f) {
                j3 = Math.round(((double) j3) * ((double) f));
            }
            j3 = Math.min(j3, this.A07);
        }
        if (j < j3) {
            if (!this.A0B && z3) {
                z2 = false;
            }
            this.A01 = z2;
        } else if (j >= this.A07 || z3) {
            this.A01 = false;
        }
        return this.A01;
    }

    public final boolean Bnc(long j, float f, boolean z, boolean z2) {
        long j2;
        if (f != 1.0f) {
            j = Math.round(((double) j) / ((double) f));
        }
        if (z) {
            j2 = this.A05;
        } else {
            j2 = this.A06;
        }
        if (j2 <= 0 || j >= j2) {
            return true;
        }
        if (this.A0B || this.A0A.A00() < this.A00) {
            return false;
        }
        return true;
    }

    public final C29736D7a AFn() {
        return this.A0A;
    }

    public final long AGW() {
        return this.A04;
    }

    public final boolean Be1() {
        return false;
    }
}
