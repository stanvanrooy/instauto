package p000X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.1eQ  reason: invalid class name and case insensitive filesystem */
public final class C34281eQ {
    public float A00;
    public int A01;
    public String A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C34281eQ) {
            C34281eQ r5 = (C34281eQ) obj;
            if (this.A01 == r5.A01 && Float.compare(r5.A00, this.A00) == 0) {
                String str = this.A02;
                String str2 = r5.A02;
                if (str != null) {
                    return str.equals(str2);
                }
                return str2 == null;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.A02;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = ((i * 31) + this.A01) * 31;
        float f = this.A00;
        if (f != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            i2 = Float.floatToIntBits(f);
        }
        return i3 + i2;
    }

    public C34281eQ() {
    }

    public C34281eQ(String str, int i, float f) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = f;
    }
}
