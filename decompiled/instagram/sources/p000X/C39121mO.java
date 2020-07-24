package p000X;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.1mO  reason: invalid class name and case insensitive filesystem */
public final class C39121mO {
    public static C39131mP A01(int i, int i2, float f, boolean z) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        boolean z2 = false;
        if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            z2 = true;
        }
        AnonymousClass0a4.A0A(z2);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (!z && (mode == Integer.MIN_VALUE || mode == 1073741824)) {
            float f2 = (float) size;
            if (f2 < ((float) size2) / f) {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((int) (f2 * f), C25913Bc3.MAX_SIGNED_POWER_OF_TWO);
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, C25913Bc3.MAX_SIGNED_POWER_OF_TWO);
                return new C39131mP(makeMeasureSpec2, makeMeasureSpec);
            }
        }
        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (((float) size2) / f), C25913Bc3.MAX_SIGNED_POWER_OF_TWO);
        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, C25913Bc3.MAX_SIGNED_POWER_OF_TWO);
        return new C39131mP(makeMeasureSpec2, makeMeasureSpec);
    }

    public static int A00(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if ((mode == Integer.MIN_VALUE || mode == 1073741824) && size < size2) {
            size2 = size;
        }
        return View.MeasureSpec.makeMeasureSpec(size2, C25913Bc3.MAX_SIGNED_POWER_OF_TWO);
    }
}
