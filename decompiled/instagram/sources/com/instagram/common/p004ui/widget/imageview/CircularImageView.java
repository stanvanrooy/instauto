package com.instagram.common.p004ui.widget.imageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass1GF;
import p000X.AnonymousClass1GG;
import p000X.C26771Ff;
import p000X.C36601iJ;
import p000X.C41831r0;
import p000X.C41841r1;

/* renamed from: com.instagram.common.ui.widget.imageview.CircularImageView */
public class CircularImageView extends IgImageView {
    public int A00;
    public boolean A01;
    public int A02;
    public int A03;
    public AnonymousClass1GF A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Rect A08;

    private void A00() {
        setOutlineProvider(new AnonymousClass1GG(this));
        setClipToOutline(true);
    }

    private Rect getPaddingAffordanceRect() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (this.A07) {
            i = getPaddingLeft();
        } else {
            i = 0;
        }
        if (this.A07) {
            i2 = getPaddingTop();
        } else {
            i2 = 0;
        }
        if (this.A07) {
            i3 = getPaddingRight();
        } else {
            i3 = 0;
        }
        if (this.A07) {
            i4 = getPaddingBottom();
        }
        return new Rect(i, i2, i3, i4);
    }

    public final void A0A(int i, int i2) {
        if (i != 0) {
            this.A03 = i;
            AnonymousClass1GF r0 = this.A04;
            if (r0 == null) {
                AnonymousClass1GF r02 = new AnonymousClass1GF(i, i2);
                this.A04 = r02;
                this.A00 = r02.A00.getAlpha();
            } else {
                r0.A00.setStrokeWidth((float) i);
                this.A04.A00.setColor(i2);
            }
        }
        invalidate();
    }

    public int getStrokeWidth() {
        return this.A03;
    }

    public void setImageBitmap(Bitmap bitmap) {
        C36601iJ r1;
        if (bitmap != null) {
            r1 = new C36601iJ(bitmap, this.A01);
        } else {
            r1 = null;
        }
        super.setImageDrawable(r1);
    }

    public void setImageDrawable(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            int color = ((ColorDrawable) drawable).getColor();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(color);
            gradientDrawable.setShape(1);
            super.setImageDrawable(gradientDrawable);
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof C36601iJ) || (drawable instanceof GradientDrawable) || (drawable instanceof LayerDrawable) || (drawable instanceof C41831r0) || (drawable instanceof C41841r1) || (drawable instanceof InsetDrawable) || (drawable instanceof ShapeDrawable) || drawable == null) {
            super.setImageDrawable(drawable);
        } else {
            AnonymousClass0QD.A01("CircularImageView", "Explicitly whitelisted class set as image drawable");
            super.setImageDrawable(drawable);
        }
        A02(getPaddingAffordanceRect());
    }

    public void setImageResource(int i) {
        throw new UnsupportedOperationException("Use setImageDrawable or setImageBitmap");
    }

    public void setImageURI(Uri uri) {
        throw new UnsupportedOperationException("Use setImageDrawable or setImageBitmap");
    }

    public void setStrokeAlpha(int i) {
        AnonymousClass1GF r0 = this.A04;
        if (r0 != null) {
            r0.setAlpha(i);
        }
    }

    private void A02(Rect rect) {
        Drawable drawable = getDrawable();
        if (this.A06 && drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = this.A03;
            drawable.setBounds(rect.left + bounds.left + i, rect.top + bounds.top + i, (bounds.right - rect.right) - i, (bounds.bottom - rect.bottom) - i);
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        AnonymousClass1GF r0 = this.A04;
        if (r0 != null) {
            r0.draw(canvas);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0Z0.A06(229240072);
        super.onSizeChanged(i, i2, i3, i4);
        if (this.A04 != null) {
            if (getBackground() != null) {
                getBackground().getPadding(this.A08);
            } else {
                this.A08.set(0, 0, 0, 0);
            }
            Rect paddingAffordanceRect = getPaddingAffordanceRect();
            A02(paddingAffordanceRect);
            int i5 = paddingAffordanceRect.left;
            Rect rect = this.A08;
            this.A04.setBounds(new Rect(i5 + rect.left, paddingAffordanceRect.top + rect.top, (getWidth() - paddingAffordanceRect.bottom) - this.A08.right, (getHeight() - paddingAffordanceRect.top) - this.A08.bottom));
        }
        AnonymousClass0Z0.A0D(1332306114, A062);
    }

    public void setPressed(boolean z) {
        super.setPressed(z);
        if (this.A05 && z) {
            setColorFilter(C26771Ff.A00(this.A02));
        }
    }

    public void setCenterCrop(boolean z) {
        this.A01 = z;
    }

    public void setDarkenOnPress(boolean z) {
        this.A05 = z;
    }

    public void setFitImageInsideStroke(boolean z) {
        this.A06 = z;
    }

    public CircularImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public CircularImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircularImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A08 = new Rect();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A0h);
            int color = obtainStyledAttributes.getColor(2, 0);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            this.A07 = obtainStyledAttributes.getBoolean(3, false);
            this.A06 = obtainStyledAttributes.getBoolean(4, false);
            this.A02 = obtainStyledAttributes.getColor(1, 1711276032);
            this.A01 = obtainStyledAttributes.getBoolean(0, false);
            this.A05 = false;
            obtainStyledAttributes.recycle();
            A0A(dimensionPixelSize, color);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            A00();
        }
    }
}
