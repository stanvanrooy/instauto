package p000X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.1iz  reason: invalid class name and case insensitive filesystem */
public final class C37021iz {
    public float A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public int A01;
    public int A02 = 0;
    public C15920nk A03;
    public Integer A04;
    public boolean A05;

    public final synchronized void A00(long j) {
        if (j >= 100) {
            this.A00 += ((float) j) / 1048576.0f;
            this.A02++;
        }
    }

    public C37021iz(C15920nk r2, Integer num, int i, boolean z) {
        this.A03 = r2;
        this.A04 = num;
        this.A01 = i;
        this.A05 = z;
    }
}
