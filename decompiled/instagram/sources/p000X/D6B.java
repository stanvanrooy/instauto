package p000X;

import com.facebook.react.uimanager.BaseViewManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.D6B */
public final class D6B {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final C39961nq A05;
    public final Integer A06;
    public final AtomicBoolean A07;
    public final AtomicBoolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final D2M A0B;

    public final long A00(boolean z, long j) {
        int i;
        int i2;
        float f;
        float f2;
        Integer num;
        if (this.A05 == null || this.A09) {
            return 0;
        }
        try {
            C200008hB.A01("getIntentBasedLowWatermarkUs");
            if (z) {
                C39961nq r0 = this.A05;
                i2 = r0.A07;
                i = r0.A06;
                f = r0.A01;
            } else {
                C39961nq r02 = this.A05;
                i2 = r02.A04;
                i = r02.A03;
                f = r02.A00;
            }
            if (this.A05 == null || !((num = this.A06) == Constants.ONE || num == Constants.A0C || num == Constants.A0Y || num == Constants.A0N)) {
                f2 = 1.0f;
            } else {
                f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            return (long) (f2 * Math.min(((float) (((long) i2) * 1000)) + (f * ((float) j)), (float) (((long) i) * 1000)));
        } finally {
            C200008hB.A00();
        }
    }

    public D6B(boolean z, C39961nq r6, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, boolean z2, int i, int i2, int i3, int i4, int i5, Integer num, D2M d2m) {
        this.A09 = z;
        this.A05 = r6;
        this.A08 = atomicBoolean;
        this.A07 = atomicBoolean2;
        this.A0A = z2;
        this.A03 = ((long) i) * 1000;
        this.A02 = ((long) i2) * 1000;
        this.A04 = ((long) i3) * 1000;
        this.A01 = ((long) i4) * 1000;
        this.A00 = ((long) i5) * 1000;
        this.A06 = num;
        this.A0B = d2m;
    }
}
