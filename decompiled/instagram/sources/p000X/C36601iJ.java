package p000X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.1iJ  reason: invalid class name and case insensitive filesystem */
public final class C36601iJ extends Drawable {
    public final Bitmap A00;
    public final boolean A01;
    public final Paint A02 = new Paint(7);
    public final RectF A03 = new RectF();

    public final int getOpacity() {
        return -3;
    }

    public final void draw(Canvas canvas) {
        this.A03.set(getBounds());
        if (this.A03.height() > this.A03.width()) {
            RectF rectF = this.A03;
            rectF.inset(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (rectF.height() - this.A03.width()) / 2.0f);
        } else if (this.A03.height() < this.A03.width()) {
            RectF rectF2 = this.A03;
            rectF2.inset((rectF2.width() - this.A03.height()) / 2.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
        canvas.drawOval(this.A03, this.A02);
    }

    public final int getIntrinsicHeight() {
        if (this.A01) {
            return Math.min(this.A00.getWidth(), this.A00.getHeight());
        }
        return this.A00.getHeight();
    }

    public final int getIntrinsicWidth() {
        if (this.A01) {
            return Math.min(this.A00.getWidth(), this.A00.getHeight());
        }
        return this.A00.getWidth();
    }

    public final void setAlpha(int i) {
        this.A02.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
    }

    public C36601iJ(Bitmap bitmap, boolean z) {
        float f;
        this.A00 = bitmap;
        Bitmap bitmap2 = this.A00;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
        this.A02.setShader(bitmapShader);
        this.A01 = z;
        Matrix matrix = new Matrix();
        if (this.A01) {
            float height = (float) this.A00.getHeight();
            float width = (float) this.A00.getWidth();
            float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            if (width > height) {
                f = (height - width) / 2.0f;
            } else {
                f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            matrix.setTranslate(f, height > width ? (width - height) / 2.0f : f2);
        }
        bitmapShader.setLocalMatrix(matrix);
    }
}
