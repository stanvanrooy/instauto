package p000X;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import java.util.Random;

/* renamed from: X.DT8 */
public final class DT8 implements DTA {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final Bitmap A05;
    public final Rect A06 = new Rect();
    public final C74303Ni A07;
    public final Random A08 = new Random();

    public final void A9Q(DT9 dt9, int i, int i2, long j) {
        this.A07.AZp(this.A06);
        Rect rect = this.A06;
        if (rect.left != 0 || rect.top != 0 || rect.right != 0 || rect.bottom != 0) {
            float nextFloat = 0.65f + ((1.0f - 0.65f) * this.A08.nextFloat());
            PointF pointF = dt9.A0A;
            Rect rect2 = this.A06;
            int i3 = rect2.left;
            int i4 = rect2.right;
            pointF.x = (float) (i3 + Math.round(((float) (i4 - i3)) * this.A08.nextFloat()));
            PointF pointF2 = dt9.A0A;
            Rect rect3 = this.A06;
            int i5 = rect3.top;
            pointF2.y = (float) i5;
            PointF pointF3 = dt9.A0C;
            pointF3.x = pointF2.x;
            float round = (float) (i5 + Math.round(((float) (rect3.bottom - i5)) * 0.75f));
            float f = this.A04;
            pointF3.y = round + f + ((this.A01 - f) * this.A08.nextFloat());
            PointF pointF4 = dt9.A0D;
            float f2 = this.A02;
            float f3 = -f2;
            pointF4.x = f3 + ((f2 - f3) * this.A08.nextFloat());
            dt9.A0D.y = 500.0f;
            float f4 = this.A03;
            dt9.A04 = f4 + ((this.A00 - f4) * dt9.A06);
            dt9.A06 = nextFloat * 3.0f;
            dt9.A05 = (float) (-0.3141592700403172d + ((0.3141592700403172d - -0.3141592700403172d) * ((double) this.A08.nextFloat())));
            dt9.A07 = 1.0f;
            dt9.A03 = 1.0f;
            dt9.A09 = this.A05;
        }
    }

    public DT8(C74303Ni r2, Bitmap bitmap, float f, float f2, float f3, float f4, float f5) {
        this.A07 = r2;
        this.A05 = bitmap;
        this.A02 = f;
        this.A03 = f2;
        this.A00 = f3;
        this.A04 = f4;
        this.A01 = f5;
    }
}
