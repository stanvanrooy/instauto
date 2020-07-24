package p000X;

import android.graphics.PointF;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Oz  reason: invalid class name and case insensitive filesystem */
public final class C06420Oz {
    public static float A01(float f, float f2, float f3, float f4, float f5) {
        return A02(f, f2, f3, f4, f5, false);
    }

    public static float A02(float f, float f2, float f3, float f4, float f5, boolean z) {
        float f6 = f3 - f2;
        float f7 = f5 - f4;
        float f8 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        if (f6 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            f8 = (f - f2) / f6;
        }
        float f9 = (f8 * f7) + f4;
        if (z) {
            return A00(f9, f4, f5);
        }
        return f9;
    }

    public static PointF A04(List list) {
        PointF pointF = new PointF(0.5f, 0.5f);
        if (list.size() == 1) {
            pointF.set((PointF) list.get(0));
        } else if (list.size() == 2) {
            pointF.set((((PointF) list.get(0)).x + ((PointF) list.get(1)).x) / 2.0f, (((PointF) list.get(0)).y + ((PointF) list.get(1)).y) / 2.0f);
            return pointF;
        } else if (list.size() > 2) {
            AnonymousClass0NO[] r10 = new AnonymousClass0NO[list.size()];
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                PointF pointF2 = (PointF) it.next();
                r10[i] = new AnonymousClass0NO((double) pointF2.x, (double) pointF2.y);
                i++;
            }
            float[] A03 = AnonymousClass0NN.A03(r10);
            pointF.set(A03[0], A03[1]);
            return pointF;
        }
        return pointF;
    }

    public static float A00(float f, float f2, float f3) {
        return Math.min(Math.max(f2, f3), Math.max(Math.min(f2, f3), f));
    }

    public static int A03(int i, int i2, int i3) {
        return Math.min(Math.max(i2, i3), Math.max(Math.min(i2, i3), i));
    }
}
