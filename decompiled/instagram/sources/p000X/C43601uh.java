package p000X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.1uh  reason: invalid class name and case insensitive filesystem */
public class C43601uh extends View {
    public float A00;
    public float A01 = 0.55f;
    public float A02 = 0.25f;
    public Drawable A03;
    public int[] A04;
    public final Paint A05 = new Paint();
    public final Paint A06 = new Paint();

    public final void A01(float f, float f2) {
        float f3 = f2;
        this.A05.setShader(new LinearGradient(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f3, f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, this.A04, (float[]) null, Shader.TileMode.CLAMP));
    }

    public void setBackgroundColorGradient(int[] iArr) {
        if (this.A04 != iArr) {
            this.A04 = iArr;
            A01((float) getMeasuredWidth(), (float) getMeasuredHeight());
            invalidate();
        }
    }

    public void setIconSizeFactor(float f) {
        if (f != this.A01) {
            this.A01 = f;
            invalidate();
        }
    }

    public void setIconTintColor(int i) {
        Drawable drawable = this.A03;
        if (drawable != null) {
            C55072a1.A06(drawable, i);
        }
    }

    public void setTranslationYFactor(float f) {
        if (f != this.A02) {
            this.A02 = f;
            invalidate();
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (this.A03 == drawable || super.verifyDrawable(drawable)) {
            return true;
        }
        return false;
    }

    public C43601uh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = getContext();
        this.A00 = C06220Of.A03(context2, 2);
        getContext();
        getContext();
        int A002 = C019000b.A00(context2, AnonymousClass1BA.A03(context2, C0003R.attr.backgroundColorSecondary));
        this.A06.setAntiAlias(true);
        Paint paint = this.A06;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.A06.setColor(A002);
        this.A05.setAntiAlias(true);
        this.A05.setStyle(style);
        this.A04 = new int[]{A002, A002};
        A01((float) getMeasuredWidth(), (float) getMeasuredHeight());
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(369715252);
        super.onAttachedToWindow();
        Drawable drawable = this.A03;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        AnonymousClass0Z0.A0D(1087062903, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(-253210578);
        super.onDetachedFromWindow();
        Drawable drawable = this.A03;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        AnonymousClass0Z0.A0D(-125706811, A062);
    }

    public final void onDraw(Canvas canvas) {
        float width = ((float) getWidth()) / 2.0f;
        float height = ((float) getHeight()) / 2.0f;
        canvas.drawCircle(width, height, width, this.A06);
        float f = width - this.A00;
        canvas.drawCircle(width, height, f, this.A05);
        Drawable drawable = this.A03;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.A03.getIntrinsicHeight();
            float f2 = f * 2.0f * this.A01;
            float f3 = (float) intrinsicWidth;
            float f4 = (float) intrinsicHeight;
            float min = Math.min(1.0f, Math.min(f2 / f3, f2 / f4));
            int round = Math.round(f3 * min);
            int round2 = Math.round(f4 * min);
            int round3 = Math.round(((float) (getWidth() - round)) / 2.0f);
            int round4 = Math.round(((float) (getHeight() - round2)) / 2.0f);
            this.A03.setBounds(round3, round4, round + round3, round2 + round4);
            this.A03.draw(canvas);
        }
        super.onDraw(canvas);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float measuredWidth = ((float) getMeasuredWidth()) - (this.A00 * 2.0f);
        A01(measuredWidth, measuredWidth);
        setTranslationY(((float) getMeasuredHeight()) * this.A02);
    }

    public void setBorderWidth(float f) {
        float A002 = C06220Of.A00(getContext(), f);
        if (this.A00 != A002) {
            this.A00 = A002;
            invalidate();
        }
    }

    public void setIconTintColorResource(int i) {
        setIconTintColor(C019000b.A00(getContext(), i));
    }

    public void setIconDrawable(int i) {
        setIconDrawable(C019000b.A03(getContext(), i));
    }

    public void setIconDrawable(Drawable drawable) {
        Drawable drawable2 = this.A03;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            this.A03 = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
            }
            invalidate();
        }
    }
}
