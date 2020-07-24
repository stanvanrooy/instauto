package p000X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.Arrays;

/* renamed from: X.1eC  reason: invalid class name and case insensitive filesystem */
public final class C34171eC {
    public float A00;
    public int A01;
    public int A02;
    public float[] A03;
    public final Paint A04 = new Paint(1);
    public final Paint A05 = new Paint(1);
    public final Path A06 = new Path();
    public final Path A07 = new Path();
    public final RectF A08 = new RectF();
    public final RectF A09 = new RectF();

    public static C34171eC A00(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return new C34171eC(context);
        }
        return new C34171eC(context, attributeSet);
    }

    private void A01() {
        this.A05.setColor(this.A01);
        if (this.A01 == 0) {
            this.A05.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        } else {
            this.A05.setXfermode((Xfermode) null);
        }
        this.A04.setColor(this.A02);
        this.A04.setStyle(Paint.Style.STROKE);
        this.A04.setStrokeWidth(this.A00);
        this.A07.setFillType(Path.FillType.EVEN_ODD);
    }

    private void A02() {
        this.A07.reset();
        this.A07.addRect(this.A09, Path.Direction.CW);
        Path path = this.A07;
        RectF rectF = this.A08;
        float[] fArr = this.A03;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fArr, direction);
        this.A06.reset();
        this.A06.addRoundRect(this.A08, this.A03, direction);
    }

    public final void A03(int i, int i2) {
        float f = (float) i;
        float f2 = (float) i2;
        this.A09.set(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f, f2);
        float f3 = this.A00 / 2.0f;
        this.A08.set(f3, f3, f - f3, f2 - f3);
        A02();
    }

    public final void A04(Canvas canvas) {
        canvas.drawPath(this.A07, this.A05);
        canvas.drawPath(this.A06, this.A04);
    }

    public final boolean A05(int i) {
        float[] fArr = this.A03;
        int length = fArr.length;
        int i2 = 0;
        float f = -1.0f;
        while (true) {
            if (i2 >= length) {
                break;
            }
            float f2 = fArr[i2];
            if (f == -1.0f) {
                f = f2;
            } else if (f != f2) {
                f = -1.0f;
                break;
            }
            i2++;
        }
        float f3 = (float) i;
        if (f == f3) {
            return false;
        }
        float[] fArr2 = new float[8];
        this.A03 = fArr2;
        Arrays.fill(fArr2, f3);
        A02();
        return true;
    }

    public C34171eC(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0003R.dimen.default_corner_radius);
        float[] fArr = new float[8];
        this.A03 = fArr;
        Arrays.fill(fArr, (float) dimensionPixelSize);
        this.A00 = (float) context.getResources().getDimensionPixelSize(C0003R.dimen.default_stroke_radius);
        this.A02 = C019000b.A00(context, C0003R.color.black_6_transparent);
        this.A01 = C019000b.A00(context, C0003R.color.white);
        A01();
    }

    public C34171eC(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A3C);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0003R.dimen.default_corner_radius);
        dimensionPixelSize = obtainStyledAttributes != null ? obtainStyledAttributes.getDimensionPixelOffset(1, dimensionPixelSize) : dimensionPixelSize;
        this.A03 = new float[]{(float) obtainStyledAttributes.getDimensionPixelOffset(4, dimensionPixelSize), (float) obtainStyledAttributes.getDimensionPixelOffset(4, dimensionPixelSize), (float) obtainStyledAttributes.getDimensionPixelOffset(5, dimensionPixelSize), (float) obtainStyledAttributes.getDimensionPixelOffset(5, dimensionPixelSize), (float) obtainStyledAttributes.getDimensionPixelOffset(3, dimensionPixelSize), (float) obtainStyledAttributes.getDimensionPixelOffset(3, dimensionPixelSize), (float) obtainStyledAttributes.getDimensionPixelOffset(2, dimensionPixelSize), (float) obtainStyledAttributes.getDimensionPixelOffset(2, dimensionPixelSize)};
        this.A00 = (float) obtainStyledAttributes.getDimensionPixelOffset(7, context.getResources().getDimensionPixelSize(C0003R.dimen.default_stroke_radius));
        this.A02 = obtainStyledAttributes.getColor(6, C019000b.A00(context, C0003R.color.black_6_transparent));
        this.A01 = obtainStyledAttributes.getColor(0, C019000b.A00(context, C0003R.color.transparent));
        obtainStyledAttributes.recycle();
        A01();
    }
}
