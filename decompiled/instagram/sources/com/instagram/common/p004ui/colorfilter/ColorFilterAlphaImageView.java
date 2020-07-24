package com.instagram.common.p004ui.colorfilter;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.util.AttributeSet;
import android.widget.ImageView;
import p000X.AnonymousClass1EM;
import p000X.C26771Ff;

/* renamed from: com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView */
public class ColorFilterAlphaImageView extends ImageView {
    public int A00 = 255;
    public int A01 = 255;
    public ColorFilter A02;
    public ColorFilter A03;
    public int A04 = 255;
    public int A05 = 255;

    private void A03(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A0n);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            setContentDescription(context.getText(resourceId));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            this.A03 = C26771Ff.A00(obtainStyledAttributes.getColor(4, 0));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            this.A01 = obtainStyledAttributes.getInt(5, 255);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.A02 = C26771Ff.A00(obtainStyledAttributes.getColor(1, 0));
        } else {
            this.A02 = this.A03;
        }
        if (obtainStyledAttributes.hasValue(2)) {
            this.A04 = obtainStyledAttributes.getInt(2, 255);
        }
        if (obtainStyledAttributes.hasValue(3)) {
            this.A00 = obtainStyledAttributes.getInt(3, 255);
        }
        obtainStyledAttributes.recycle();
        A02();
    }

    public ColorFilter getActiveColorFilter() {
        return this.A02;
    }

    public int getDisabledAlpha() {
        return this.A00;
    }

    public ColorFilter getNormalColorFilter() {
        return this.A03;
    }

    public void setActiveAlpha(int i) {
        this.A04 = i;
        A02();
    }

    public void setActiveColorFilter(int i) {
        ColorFilter A002;
        if (i == 0) {
            A002 = null;
        } else {
            A002 = C26771Ff.A00(i);
        }
        this.A02 = A002;
        A02();
    }

    public void setDisabledAlpha(int i) {
        this.A00 = i;
        A02();
    }

    public void setImageAlpha(int i) {
        this.A05 = i;
        A02();
    }

    public void setNormalAlpha(int i) {
        this.A01 = i;
        A02();
    }

    public void setNormalColorFilter(int i) {
        ColorFilter A002;
        if (i == 0) {
            A002 = null;
        } else {
            A002 = C26771Ff.A00(i);
        }
        this.A03 = A002;
        A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        if (r0 != false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (A05() != false) goto L_0x0013;
     */
    private void A02() {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        ColorFilter colorFilter;
        boolean z4 = true;
        if (!isDuplicateParentStateEnabled()) {
            z = isEnabled();
            if (z) {
            }
            z4 = false;
        } else {
            int[] drawableState = getDrawableState();
            int length = drawableState.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                } else if (16842910 == drawableState[i2]) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        z2 = false;
                        break;
                    } else if (16842913 == drawableState[i3]) {
                        z2 = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (!z2) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            z3 = false;
                            break;
                        } else if (16842919 == drawableState[i4]) {
                            z3 = true;
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
            }
            z4 = false;
        }
        if (!z) {
            i = this.A00;
            colorFilter = this.A03;
        } else if (z4) {
            colorFilter = this.A02;
            i = this.A04;
        } else {
            colorFilter = this.A03;
            i = this.A01;
        }
        setColorFilter(colorFilter);
        super.setImageAlpha(Math.round((((float) i) / 255.0f) * ((float) this.A05)));
    }

    public final void A04(int i, int i2) {
        setNormalColorFilter(i);
        setActiveColorFilter(i2);
        A02();
    }

    public boolean A05() {
        if (isSelected() || isPressed()) {
            return true;
        }
        return false;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        A02();
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        A02();
    }

    public ColorFilterAlphaImageView(Context context) {
        super(context);
    }

    public ColorFilterAlphaImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03(context, attributeSet);
    }

    public ColorFilterAlphaImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A03(context, attributeSet);
    }
}
