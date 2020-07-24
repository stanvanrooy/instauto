package com.instagram.creation.photo.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.AttributeSet;
import p000X.AnonymousClass8G5;
import p000X.C183297sD;
import p000X.C183467sW;

public class LayoutImageView extends C183297sD {
    public boolean A00;
    public AnonymousClass8G5 A01;

    public final void A09() {
        if (this.A00) {
            AnonymousClass8G5 r1 = new AnonymousClass8G5();
            this.A01 = r1;
            r1.A00 = 1.0f;
            setOnTouchListener(r1);
            this.A01.A01 = new C183467sW(this);
        }
    }

    public final void A0A(Bitmap bitmap, int i) {
        int width;
        int height;
        float f;
        float f2;
        boolean z = false;
        if ((i / 90) % 2 != 0) {
            z = true;
        }
        if (z) {
            width = bitmap.getHeight();
            height = bitmap.getWidth();
        } else {
            width = bitmap.getWidth();
            height = bitmap.getHeight();
        }
        float f3 = (float) getLayoutParams().width;
        float f4 = (float) getLayoutParams().height;
        float f5 = (float) width;
        float f6 = f5 / f3;
        float f7 = (float) height;
        float f8 = f7 / f4;
        if (f6 < f8) {
            f2 = f6 * f4;
            f = f5;
        } else {
            f = f3 * f8;
            f2 = f7;
        }
        float round = (float) Math.round((f5 - f) / 2.0f);
        float round2 = (float) Math.round((f7 - f2) / 2.0f);
        float f9 = f5 - round;
        float f10 = f7 - round2;
        RectF rectF = new RectF(round, round2, f9, f10);
        if (z) {
            rectF = new RectF(round2, round, f10, f9);
        }
        A05(1.0f, 10.0f, rectF);
    }

    public void setTouchEnabled(boolean z) {
        this.A00 = z;
    }

    public LayoutImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public LayoutImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = true;
    }
}
