package p000X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.DAX */
public final class DAX {
    public static final DAX A04 = new DAX(1.0f, 1.0f, false);
    public final float A00;
    public final float A01;
    public final int A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DAX dax = (DAX) obj;
            if (!(this.A01 == dax.A01 && this.A00 == dax.A00 && this.A03 == dax.A03)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((((527 + Float.floatToRawIntBits(this.A01)) * 31) + Float.floatToRawIntBits(this.A00)) * 31) + (this.A03 ? 1 : 0);
    }

    public DAX(float f, float f2, boolean z) {
        boolean z2 = true;
        D6U.A02(f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        D6U.A02(f2 <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? false : z2);
        this.A01 = f;
        this.A00 = f2;
        this.A03 = z;
        this.A02 = Math.round(f * 1000.0f);
    }
}
