package p000X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.1pG  reason: invalid class name and case insensitive filesystem */
public final class C40791pG extends Drawable implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener, C40801pH {
    public int A00;
    public int A01;
    public Drawable A02;
    public Integer A03 = Constants.ZERO;
    public final ValueAnimator A04 = ValueAnimator.ofInt(new int[]{0, 255});
    public final Matrix A05 = new Matrix();
    public final Matrix A06 = new Matrix();
    public final Drawable A07;

    public final int getOpacity() {
        return -3;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    private void A00() {
        float f;
        float f2;
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.A02.getIntrinsicHeight());
            Matrix matrix = this.A05;
            Drawable drawable2 = this.A02;
            matrix.reset();
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            int intrinsicHeight = drawable2.getIntrinsicHeight();
            int i = this.A00;
            int i2 = intrinsicWidth * i;
            int i3 = this.A01;
            int i4 = i3 * intrinsicHeight;
            float f3 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            if (i2 > i4) {
                f = ((float) i) / ((float) intrinsicHeight);
                f2 = (((float) i3) - (((float) intrinsicWidth) * f)) * 0.5f;
            } else {
                f = ((float) i3) / ((float) intrinsicWidth);
                f3 = (((float) i) - (((float) intrinsicHeight) * f)) * 0.5f;
                f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            matrix.setScale(f, f);
            matrix.postTranslate((float) ((int) (f2 + 0.5f)), (float) ((int) (f3 + 0.5f)));
        }
        Drawable drawable3 = this.A07;
        drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), this.A07.getIntrinsicHeight());
        invalidateSelf();
    }

    public static void A01(StringBuilder sb, String str, Drawable drawable) {
        String name;
        if (drawable != null) {
            sb.append(str);
            sb.append(":");
            if (drawable instanceof C40801pH) {
                sb.append(",image:");
                name = ((C40801pH) drawable).ANJ();
            } else if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (bitmap != null) {
                    sb.append("bmp:");
                    sb.append(bitmap.getWidth());
                    sb.append("x");
                    sb.append(bitmap.getHeight());
                    return;
                }
                return;
            } else {
                sb.append(",drawable (no bitmap info):");
                name = drawable.getClass().getName();
            }
            sb.append(name);
        }
    }

    public final String ANJ() {
        String str;
        StringBuilder sb = new StringBuilder("[TransitionAnimationDrawable:");
        A01(sb, "source", this.A02);
        sb.append(", src mat:");
        sb.append(this.A05.toShortString());
        A01(sb, ", target", this.A07);
        sb.append(", src mat:");
        sb.append(this.A06.toShortString());
        sb.append(", State:");
        switch (this.A03.intValue()) {
            case 1:
                str = "IN_TRANSITION";
                break;
            case 2:
                str = "POST_TRANSITION";
                break;
            default:
                str = "PRE_TRANSITION";
                break;
        }
        sb.append(str);
        sb.append(", animation:");
        sb.append(this.A04.getAnimatedFraction());
        sb.append("]");
        return sb.toString();
    }

    public final void draw(Canvas canvas) {
        if (!(this.A03 == Constants.A0C || this.A02 == null)) {
            int saveCount = canvas.getSaveCount();
            canvas.save();
            canvas.concat(this.A05);
            this.A02.draw(canvas);
            canvas.restoreToCount(saveCount);
        }
        if (this.A03 != Constants.ZERO) {
            this.A07.draw(canvas);
        }
    }

    public final int getIntrinsicHeight() {
        return this.A00;
    }

    public final int getIntrinsicWidth() {
        return this.A01;
    }

    public final void onAnimationEnd(Animator animator) {
        this.A03 = Constants.A0C;
        this.A07.setAlpha(255);
        this.A02 = null;
    }

    public final void onAnimationStart(Animator animator) {
        this.A03 = Constants.ONE;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A07.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        this.A01 = rect.width();
        this.A00 = rect.height();
        A00();
    }

    public C40791pG(Drawable drawable, Drawable drawable2) {
        this.A02 = drawable;
        this.A07 = drawable2;
        drawable2.setAlpha(0);
        this.A01 = this.A07.getIntrinsicWidth();
        this.A00 = this.A07.getIntrinsicHeight();
        this.A04.addListener(this);
        this.A04.addUpdateListener(this);
        A00();
    }
}
