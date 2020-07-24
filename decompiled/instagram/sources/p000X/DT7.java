package p000X;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.Random;

/* renamed from: X.DT7 */
public final class DT7 implements DTA {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final Bitmap A06;
    public final Rect A07 = new Rect();
    public final C74303Ni A08;
    public final Random A09 = new Random();

    public final void A9Q(DT9 dt9, int i, int i2, long j) {
        this.A08.AZp(this.A07);
        Rect rect = this.A07;
        if (rect.left != 0 || rect.top != 0 || rect.right != 0 || rect.bottom != 0) {
            float nextFloat = 0.15f + ((1.0f - 0.15f) * this.A09.nextFloat());
            PointF pointF = dt9.A0A;
            Rect rect2 = this.A07;
            int i3 = rect2.left;
            pointF.x = (float) (i3 + Math.round(((float) (rect2.right - i3)) * ((this.A09.nextFloat() * 0.7f) + 0.15f)));
            PointF pointF2 = dt9.A0A;
            Rect rect3 = this.A07;
            int i4 = rect3.top;
            pointF2.y = (float) (i4 + Math.round(((float) (rect3.bottom - i4)) * ((this.A09.nextFloat() * 0.6f) + 0.33f)));
            if (this.A05 == 1) {
                dt9.A0C.x = ((float) this.A07.left) + (((float) i) * (0.05f + ((0.15f - 0.05f) * this.A09.nextFloat())));
            } else {
                dt9.A0C.x = ((float) this.A07.left) * (0.95f + ((1.0f - 0.95f) * this.A09.nextFloat()));
            }
            PointF pointF3 = dt9.A0C;
            Rect rect4 = this.A07;
            int i5 = rect4.top;
            float round = (float) (i5 + Math.round(((float) (rect4.bottom - i5)) * 0.75f));
            float f = this.A04;
            pointF3.y = round + f + ((this.A01 - f) * this.A09.nextFloat());
            PointF pointF4 = dt9.A0D;
            float f2 = this.A02;
            float f3 = -f2;
            pointF4.x = f3 + ((f2 - f3) * this.A09.nextFloat());
            dt9.A0D.y = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            float f4 = this.A03;
            dt9.A04 = f4 + ((this.A00 - f4) * dt9.A06);
            dt9.A06 = nextFloat * 1.2f;
            dt9.A05 = (float) (-0.3141592700403172d + ((0.3141592700403172d - -0.3141592700403172d) * ((double) this.A09.nextFloat())));
            dt9.A07 = 1.0f;
            dt9.A03 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            dt9.A09 = this.A06;
        }
    }

    public DT7(C74303Ni r2, int i, Bitmap bitmap, float f, float f2, float f3, float f4, float f5) {
        this.A08 = r2;
        this.A05 = i;
        this.A06 = bitmap;
        this.A02 = f;
        this.A03 = f2;
        this.A00 = f3;
        this.A04 = f4;
        this.A01 = f5;
    }
}
