package p000X;

import android.graphics.Color;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.1hG  reason: invalid class name and case insensitive filesystem */
public final class C35991hG extends C35981hF {
    public final int[] A00 = {Color.parseColor("#A307BA"), Color.parseColor("#3897F0"), Color.parseColor("#70C050"), Color.parseColor("#FDCB5C"), Color.parseColor("#ED4956"), Color.parseColor("#794F17"), Color.parseColor("#3C3C3C")};

    public final String A02() {
        return "rainbow";
    }

    public final float[] A03() {
        return new float[]{0.05f, 0.23f, 0.34f, 0.5f, 0.76f, 0.85f, 0.92f};
    }

    public final C36001hH A00() {
        C36001hH r1 = new C36001hH();
        r1.A00 = 0.19269334f;
        r1.A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        return r1;
    }

    public final C36001hH A01() {
        C36001hH r1 = new C36001hH();
        r1.A00 = 0.78195995f;
        r1.A01 = 1.0f;
        return r1;
    }

    public final int[] A04() {
        return this.A00;
    }
}
