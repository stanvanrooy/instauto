package com.instagram.shopping.widget.productcard;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass9E5;
import p000X.C71763Cb;

public class ShoppingClickableTextContainer extends LinearLayout {
    public C71763Cb A00;
    public AnonymousClass9E5 A01;

    public final void onDraw(Canvas canvas) {
        setAlpha(((1.0f - this.A00.A00) * 0.3f) + 0.7f);
        super.onDraw(canvas);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int A05 = AnonymousClass0Z0.A05(1639095938);
        AnonymousClass9E5 r0 = this.A01;
        boolean z2 = false;
        if (r0 != null) {
            z = r0.onTouchEvent(motionEvent);
        } else {
            z = false;
        }
        if (super.onTouchEvent(motionEvent) || z) {
            z2 = true;
        }
        AnonymousClass0Z0.A0C(-1275305276, A05);
        return z2;
    }

    public void setOnTouchListener(AnonymousClass9E5 r1) {
        this.A01 = r1;
    }

    public ShoppingClickableTextContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    public ShoppingClickableTextContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShoppingClickableTextContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
        this.A00 = new C71763Cb((View) this);
    }
}
