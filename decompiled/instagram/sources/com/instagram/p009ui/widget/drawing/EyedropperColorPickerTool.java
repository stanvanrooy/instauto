package com.instagram.p009ui.widget.drawing;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass0OW;
import p000X.AnonymousClass1EG;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass2LX;
import p000X.AnonymousClass3a8;
import p000X.AnonymousClass3a9;
import p000X.AnonymousClass8AL;
import p000X.C25913Bc3;
import p000X.C26771Ff;
import p000X.C92803zk;

/* renamed from: com.instagram.ui.widget.drawing.EyedropperColorPickerTool */
public class EyedropperColorPickerTool extends View {
    public float A00;
    public float A01;
    public Drawable A02;
    public Drawable A03;
    public C92803zk A04;
    public float A05;
    public final AnonymousClass2LX A06;
    public final float A07;
    public final float A08;
    public final Paint A09;
    public final Paint A0A;

    public void setColor(int i) {
        this.A09.setColor(i);
        ColorFilter A002 = C26771Ff.A00(AnonymousClass0OW.A06(i, -1));
        Drawable drawable = this.A03;
        if (drawable != null) {
            drawable.setColorFilter(A002);
        }
        Drawable drawable2 = this.A02;
        if (drawable2 != null) {
            drawable2.setColorFilter(A002);
        }
        invalidate();
    }

    private float getButtonRadius() {
        return (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) / 2.0f) + this.A07;
    }

    private void setIconBounds(Drawable drawable) {
        float buttonRadius = getButtonRadius() * 2.0f;
        float min = Math.min(((float) Math.sqrt((double) ((buttonRadius * buttonRadius) / 2.0f))) - this.A05, ((float) drawable.getIntrinsicWidth()) / 2.0f);
        float f = this.A01;
        float f2 = this.A00;
        drawable.setBounds((int) (f - min), (int) (f2 - min), (int) (f + min), (int) (f2 + min));
    }

    public final void onDraw(Canvas canvas) {
        float buttonRadius = getButtonRadius();
        canvas.drawCircle(this.A01, this.A00, buttonRadius - this.A07, this.A09);
        canvas.drawCircle(this.A01, this.A00, buttonRadius - this.A07, this.A0A);
        float A002 = (float) ((AnonymousClass1EG) this.A04.get()).A00();
        if (this.A03 != null) {
            canvas.save();
            canvas.rotate(-45.0f * A002, this.A01, this.A00);
            this.A03.setAlpha((int) ((1.0f - A002) * 255.0f));
            this.A03.draw(canvas);
            canvas.restore();
        }
        if (this.A02 != null) {
            canvas.save();
            canvas.rotate((1.0f - A002) * 45.0f, this.A01, this.A00);
            this.A02.setAlpha((int) (A002 * 255.0f));
            this.A02.draw(canvas);
            canvas.restore();
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A01 = ((float) getWidth()) / 2.0f;
        this.A00 = (((float) getHeight()) - this.A01) - ((float) getPaddingBottom());
        Drawable drawable = this.A03;
        if (drawable != null) {
            setIconBounds(drawable);
            this.A03.setAlpha(255);
        }
        Drawable drawable2 = this.A02;
        if (drawable2 != null) {
            setIconBounds(drawable2);
            this.A02.setAlpha(0);
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (((float) getResources().getDisplayMetrics().widthPixels) * this.A08), C25913Bc3.MAX_SIGNED_POWER_OF_TWO), i2);
    }

    public EyedropperColorPickerTool(Context context) {
        this(context, (AttributeSet) null);
    }

    public EyedropperColorPickerTool(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EyedropperColorPickerTool(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A06 = new AnonymousClass3a8(this);
        TypedArray typedArray = null;
        try {
            typedArray = getContext().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A1K);
            this.A08 = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, Math.min(typedArray.getFloat(2, -1.0f), 1.0f));
            this.A07 = typedArray.getDimension(4, 3.0f);
            this.A05 = typedArray.getDimension(3, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            this.A03 = typedArray.getDrawable(1);
            this.A02 = typedArray.getDrawable(0);
            typedArray.recycle();
            Paint paint = new Paint(1);
            this.A0A = paint;
            paint.setColor(-1);
            this.A0A.setStyle(Paint.Style.STROKE);
            this.A0A.setStrokeWidth(this.A07);
            Paint paint2 = new Paint(1);
            this.A09 = paint2;
            paint2.setStyle(Paint.Style.FILL);
            setColor(-1);
            this.A04 = AnonymousClass8AL.A00(new AnonymousClass3a9(this));
        } catch (Throwable th) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }
}
