package p000X;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters;

/* renamed from: X.DAI */
public final class DAI implements Comparable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final DefaultTrackSelector$Parameters A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DAI dai = (DAI) obj;
            if (!(this.A05 == dai.A05 && this.A03 == dai.A03 && this.A02 == dai.A02 && this.A01 == dai.A01 && this.A04 == dai.A04 && this.A00 == dai.A00)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0022 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: A00 */
    public final int compareTo(DAI dai) {
        int i;
        int i2 = this.A05;
        int i3 = i2;
        int i4 = dai.A05;
        if (i2 == i4 && (i2 = this.A03) == (i4 = dai.A03) && (i2 = this.A02) == (i4 = dai.A02)) {
            if (this.A06.A0G) {
                int i5 = dai.A00;
                int i6 = this.A00;
                if (i5 > i6) {
                    return 1;
                }
                if (i6 <= i5) {
                    return 0;
                }
            } else {
                int i7 = 1;
                if (i3 != 1) {
                    i7 = -1;
                }
                int i8 = this.A01;
                int i9 = dai.A01;
                if (!(i8 == i9 && (i8 = this.A04) == (i9 = dai.A04)) ? i8 > i9 : (i8 = this.A00) > (i9 = dai.A00)) {
                    i = 0;
                    if (i9 > i8) {
                        i = -1;
                    }
                } else {
                    i = 1;
                }
                return i7 * i;
            }
        } else if (i2 > i4) {
            return 1;
        } else {
            if (i4 > i2) {
                return -1;
            }
            return 0;
        }
        return -1;
    }

    public final int hashCode() {
        return (((((((((this.A05 * 31) + this.A03) * 31) + this.A02) * 31) + this.A01) * 31) + this.A04) * 31) + this.A00;
    }

    public DAI(Format format, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, int i) {
        this.A06 = defaultTrackSelector$Parameters;
        this.A05 = DAE.A02(i, false) ? 1 : 0;
        this.A03 = DAE.A04(format, defaultTrackSelector$Parameters.A09) ? 1 : 0;
        this.A02 = (format.A0D & 1) == 0 ? 0 : 1;
        this.A01 = format.A05;
        this.A04 = format.A0C;
        this.A00 = format.A04;
    }
}
