package com.instagram.common.p004ui.widget.imageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.Constants;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass40O;
import p000X.AnonymousClass7UJ;
import p000X.C34221eI;
import p000X.C34231eJ;
import p000X.C34241eK;
import p000X.C66712vv;
import p000X.C71763Cb;
import p000X.C72663Gk;

/* renamed from: com.instagram.common.ui.widget.imageview.RoundedCornerImageView */
public class RoundedCornerImageView extends IgImageView {
    public int A00;
    public View.OnLayoutChangeListener A01;
    public C34221eI A02;
    public boolean A03;
    public float A04;
    public int A05;
    public int A06;
    public int A07;
    public C71763Cb A08;
    public AnonymousClass40O A09;
    public C34241eK A0A;
    public boolean A0B;
    public boolean A0C;
    public final Paint A0D;
    public final RectF A0E;

    public static void setDrawable(RoundedCornerImageView roundedCornerImageView, Bitmap bitmap) {
        Matrix matrix;
        roundedCornerImageView.A0B = false;
        float f = roundedCornerImageView.A04;
        if (roundedCornerImageView.A02 == C34221eI.CENTER_CROP) {
            matrix = C72663Gk.A0C(bitmap.getWidth(), bitmap.getHeight(), (roundedCornerImageView.getWidth() - roundedCornerImageView.getPaddingLeft()) - roundedCornerImageView.getPaddingRight(), (roundedCornerImageView.getHeight() - roundedCornerImageView.getPaddingTop()) - roundedCornerImageView.getPaddingBottom(), roundedCornerImageView.A00, roundedCornerImageView.A03);
        } else {
            matrix = null;
        }
        super.setImageDrawable(new C66712vv(bitmap, f, matrix, roundedCornerImageView.A05));
    }

    public void setPlaceHolderColor(int i) {
        this.A0B = true;
        this.A0D.setColor(i);
        invalidate();
    }

    public final void A0A(MotionEvent motionEvent) {
        if (this.A08 == null) {
            this.A08 = new C71763Cb((View) this);
        }
        this.A08.A02(motionEvent);
    }

    public void setImageResource(int i) {
        throw new UnsupportedOperationException();
    }

    public void setImageURI(Uri uri) {
        throw new UnsupportedOperationException();
    }

    public void setRadius(float f) {
        this.A04 = f;
        if (this.A0A != null) {
            this.A0A = new C34241eK(this.A07, this.A06, f, this.A05);
        }
    }

    public void setStrokeColor(int i) {
        this.A06 = i;
        C34241eK r1 = this.A0A;
        if (r1 != null && r1.A01.getColor() != i) {
            r1.A01.setColor(i);
            r1.invalidateSelf();
        }
    }

    public void setStrokeEnabled(boolean z) {
        if (this.A0C != z) {
            this.A0C = z;
            invalidate();
        }
    }

    public void setStrokeWidth(int i) {
        this.A07 = i;
        C34241eK r2 = this.A0A;
        if (r2 != null) {
            float f = (float) i;
            if (Float.compare(f, r2.A01.getStrokeWidth()) != 0) {
                r2.A01.setStrokeWidth(f);
                r2.invalidateSelf();
            }
        } else if (i > 0) {
            this.A0A = new C34241eK(i, this.A06, this.A04, this.A05);
        }
    }

    private void A00(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A1w);
        this.A04 = (float) obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        this.A05 = obtainStyledAttributes.getInt(1, C34231eJ.A00(Constants.A0j));
        this.A07 = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
        int color = obtainStyledAttributes.getColor(2, 0);
        this.A06 = color;
        int i = this.A07;
        if (i > 0) {
            this.A0A = new C34241eK(i, color, this.A04, this.A05);
        }
        obtainStyledAttributes.recycle();
    }

    public final void onDraw(Canvas canvas) {
        C34241eK r0;
        super.onDraw(canvas);
        if (this.A0B) {
            RectF rectF = this.A0E;
            float f = this.A04;
            canvas.drawRoundRect(rectF, f, f, this.A0D);
        }
        if (this.A0C && (r0 = this.A0A) != null) {
            r0.draw(canvas);
        }
        C71763Cb r02 = this.A08;
        if (r02 != null && r02.A00 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            RectF rectF2 = new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) canvas.getWidth(), (float) canvas.getHeight());
            Paint paint = new Paint();
            paint.setColor(((int) (this.A08.A00 * 128.0f)) * 16777216);
            float f2 = this.A04;
            canvas.drawRoundRect(rectF2, f2, f2, paint);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0Z0.A06(897815248);
        super.onSizeChanged(i, i2, i3, i4);
        this.A0E.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()));
        C34241eK r6 = this.A0A;
        if (r6 != null) {
            RectF rectF = this.A0E;
            r6.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        AnonymousClass0Z0.A0D(-1417323995, A062);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int A052 = AnonymousClass0Z0.A05(1654531403);
        AnonymousClass40O r0 = this.A09;
        boolean z2 = false;
        if (r0 != null) {
            z = r0.onTouchEvent(motionEvent);
        } else {
            z = false;
        }
        if (super.onTouchEvent(motionEvent) || z) {
            z2 = true;
        }
        AnonymousClass0Z0.A0C(-251955689, A052);
        return z2;
    }

    public void setImageBitmap(Bitmap bitmap) {
        A04();
        View.OnLayoutChangeListener onLayoutChangeListener = this.A01;
        if (onLayoutChangeListener != null) {
            removeOnLayoutChangeListener(onLayoutChangeListener);
            this.A01 = null;
        }
        if (this.A02 != C34221eI.NONE && getWidth() == 0 && getHeight() == 0) {
            AnonymousClass7UJ r0 = new AnonymousClass7UJ(this, bitmap);
            this.A01 = r0;
            addOnLayoutChangeListener(r0);
            return;
        }
        setDrawable(this, bitmap);
    }

    public void setBitmapMirrored(boolean z) {
        this.A03 = z;
    }

    public void setBitmapShaderRotation(int i) {
        this.A00 = i;
    }

    public void setBitmapShaderScaleType(C34221eI r1) {
        this.A02 = r1;
    }

    public void setOnTouchListener(AnonymousClass40O r1) {
        this.A09 = r1;
    }

    public RoundedCornerImageView(Context context) {
        super(context);
        this.A0D = new Paint(1);
        this.A0E = new RectF();
        this.A0C = true;
        this.A0B = false;
        this.A02 = C34221eI.NONE;
        this.A04 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public RoundedCornerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0D = new Paint(1);
        this.A0E = new RectF();
        this.A0C = true;
        this.A0B = false;
        this.A02 = C34221eI.NONE;
        A00(attributeSet);
    }

    public RoundedCornerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0D = new Paint(1);
        this.A0E = new RectF();
        this.A0C = true;
        this.A0B = false;
        this.A02 = C34221eI.NONE;
        A00(attributeSet);
    }
}
