package p000X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.1n0  reason: invalid class name and case insensitive filesystem */
public final class C39491n0 extends Drawable implements AnonymousClass18C {
    public boolean A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Matrix A04;
    public final Paint A05;
    public final Paint A06;
    public final Paint A07;
    public final Paint A08;
    public final Paint A09;
    public final Paint A0A;
    public final Runnable A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public final void B70(AnonymousClass1GK r1) {
    }

    public final void B72(AnonymousClass1GK r1, int i) {
    }

    public final int getOpacity() {
        return -1;
    }

    public static void A00(C39491n0 r10, Bitmap bitmap) {
        float f;
        float f2;
        int i = r10.A02 - ((r10.A03 + r10.A01) << 1);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        Rect rect2 = new Rect(0, 0, i, i);
        Matrix matrix = r10.A04;
        int width = rect2.width();
        int height = rect2.height();
        int width2 = rect.width();
        int height2 = rect.height();
        int i2 = width2 * height;
        int i3 = width * height2;
        float f3 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        if (i2 > i3) {
            f = ((float) height) / ((float) height2);
            f2 = (((float) width) - (((float) width2) * f)) * 0.5f;
        } else {
            f = ((float) width) / ((float) width2);
            f3 = (((float) height) - (((float) height2) * f)) * 0.5f;
            f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        matrix.reset();
        matrix.setScale(f, f);
        matrix.postTranslate((float) Math.round(f2), (float) Math.round(f3));
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, r10.A04, r10.A06);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        r10.A08.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        C12670hC.A04(r10.A0B);
    }

    public final void A01(Bitmap bitmap) {
        if (bitmap == null) {
            AnonymousClass0QD.A02("CircularUrlDrawable#setBitmap with null bitmap", "");
        } else if (this.A0D) {
            C05700Lp.A00().ADc(new C41771qs(this, bitmap));
        } else {
            A00(this, bitmap);
        }
    }

    public final void AtI(AnonymousClass1GK r2, C36591iI r3) {
        A01(r3.A00);
    }

    public final int getIntrinsicHeight() {
        return this.A02;
    }

    public final int getIntrinsicWidth() {
        return this.A02;
    }

    public final void setAlpha(int i) {
        this.A08.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A08.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        canvas.translate((float) bounds.left, (float) bounds.top);
        int i = this.A02 >> 1;
        if (this.A0E) {
            float f = (float) i;
            canvas.drawCircle(f, f, f, this.A07);
        }
        if (this.A01 > 0 && (this.A0C || this.A00)) {
            float f2 = (float) i;
            canvas.drawCircle(f2, f2, f2, this.A09);
        }
        if (this.A03 > 0 && (this.A0C || this.A00)) {
            float f3 = (float) i;
            canvas.drawCircle(f3, f3, (float) (i - this.A01), this.A0A);
        }
        int i2 = (this.A02 - ((this.A03 + this.A01) << 1)) >> 1;
        canvas.save();
        float f4 = (float) (this.A03 + this.A01);
        canvas.translate(f4, f4);
        if (this.A0C) {
            float f5 = (float) i2;
            canvas.drawCircle(f5, f5, f5, this.A05);
        }
        if (this.A00) {
            float f6 = (float) i2;
            canvas.drawCircle(f6, f6, f6, this.A08);
        }
        canvas.restoreToCount(save);
    }

    public C39491n0(int i, int i2, int i3, int i4, int i5, int i6, boolean z, ImageUrl imageUrl) {
        this.A04 = new Matrix();
        this.A08 = new Paint(3);
        this.A05 = new Paint(1);
        this.A06 = new Paint(3);
        this.A0A = new Paint(1);
        this.A09 = new Paint(1);
        this.A07 = new Paint(1);
        this.A0B = new C39501n1(this);
        this.A0D = z;
        this.A03 = i2;
        this.A01 = i4;
        this.A02 = i;
        Paint paint = this.A08;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.A0A.setStyle(style);
        this.A0A.setStrokeWidth((float) i2);
        this.A0A.setColor(i3);
        Paint paint2 = this.A09;
        Paint.Style style2 = Paint.Style.FILL;
        paint2.setStyle(style2);
        this.A09.setStrokeWidth((float) i4);
        this.A09.setColor(i5);
        boolean z2 = false;
        this.A0C = i6 != 0;
        this.A05.setStyle(style2);
        this.A05.setColor(i6);
        this.A07.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.A07.setStyle(style2);
        if (i3 == 0 && i2 > 0) {
            z2 = true;
        }
        this.A0E = z2;
        if (imageUrl != null) {
            AnonymousClass1GH A0C2 = AnonymousClass12C.A0c.A0C(imageUrl);
            A0C2.A02(this);
            A0C2.A01();
        }
    }

    public C39491n0(int i, int i2, int i3, int i4, ImageUrl imageUrl) {
        this(i, i2, i3, 0, 0, i4, false, imageUrl);
    }
}
