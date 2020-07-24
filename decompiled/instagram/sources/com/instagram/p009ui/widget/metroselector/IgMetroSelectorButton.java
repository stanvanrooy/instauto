package com.instagram.p009ui.widget.metroselector;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import com.facebook.C0003R;
import p000X.Constants;
import p000X.AnonymousClass1E8;
import p000X.AnonymousClass1EB;
import p000X.AnonymousClass1EG;
import p000X.AnonymousClass7OW;
import p000X.AnonymousClass7QW;
import p000X.AnonymousClass7QX;
import p000X.AnonymousClass7QY;
import p000X.C06390Ow;

/* renamed from: com.instagram.ui.widget.metroselector.IgMetroSelectorButton */
public class IgMetroSelectorButton extends CompoundButton {
    public float A00 = 1.0f;
    public Integer A01;
    public int A02;
    public int A03;
    public Drawable A04;
    public LayerDrawable A05;
    public AnonymousClass1EG A06;
    public AnonymousClass7QY A07;
    public final AnonymousClass1E8 A08 = new AnonymousClass7QW(this);

    private AnonymousClass1EG getSpring() {
        if (this.A06 == null) {
            AnonymousClass1EG A002 = new AnonymousClass1EB(AnonymousClass7OW.A00()).A00();
            A002.A06(AnonymousClass7QX.A00);
            A002.A06 = false;
            A002.A05(1.0d, true);
            A002.A07(this.A08);
            this.A06 = A002;
        }
        return this.A06;
    }

    private void A00(Context context) {
        boolean z;
        Resources resources = context.getResources();
        this.A03 = resources.getDimensionPixelSize(C0003R.dimen.metro_selector_default_ring_button_size);
        this.A02 = resources.getDimensionPixelSize(C0003R.dimen.metro_selector_selected_ring_button_size);
        int dimensionPixelSize = resources.getDimensionPixelSize(C0003R.dimen.metro_selector_selected_ring_button_inner_circle_size);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C0003R.dimen.metro_selector_selected_ring_button_inner_circle_padding);
        Drawable A002 = C06390Ow.A00(context, C0003R.C0004drawable.selectable_ring_button);
        this.A04 = A002;
        int i = this.A03;
        A002.setBounds(0, 0, i, i);
        LayerDrawable layerDrawable = (LayerDrawable) C06390Ow.A00(context, C0003R.C0004drawable.selected_ring_button);
        this.A05 = layerDrawable;
        Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(C0003R.C0005id.selected_ring_button_outer_ring);
        int i2 = this.A02;
        findDrawableByLayerId.setBounds(0, 0, i2, i2);
        int i3 = dimensionPixelSize + dimensionPixelSize2;
        this.A05.findDrawableByLayerId(C0003R.C0005id.selected_ring_button_inner_circle).setBounds(dimensionPixelSize2, dimensionPixelSize2, i3, i3);
        Integer num = Constants.ZERO;
        this.A01 = num;
        if (2 - num.intValue() != 0) {
            z = true;
        } else {
            z = false;
        }
        setClickable(z);
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float measuredWidth = ((float) getMeasuredWidth()) / 2.0f;
        float measuredHeight = ((float) getMeasuredHeight()) / 2.0f;
        switch (this.A01.intValue()) {
            case 0:
            case 1:
                canvas.save();
                float f = this.A00;
                float f2 = ((float) this.A03) / 2.0f;
                canvas.translate((measuredWidth - f2) * f, f * (measuredHeight - f2));
                float f3 = this.A00;
                canvas.scale(f3, f3, getPivotX(), getPivotY());
                this.A04.draw(canvas);
                canvas.restore();
                return;
            case 2:
                canvas.save();
                float f4 = ((float) this.A02) / 2.0f;
                canvas.translate(measuredWidth - f4, measuredHeight - f4);
                this.A05.draw(canvas);
                canvas.restore();
                return;
            default:
                return;
        }
    }

    public final void toggle() {
        super.toggle();
    }

    public void setToggleListener(AnonymousClass7QY r1) {
        this.A07 = r1;
    }

    public IgMetroSelectorButton(Context context) {
        super(context);
        A00(context);
    }

    public IgMetroSelectorButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }

    public IgMetroSelectorButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context);
    }
}
