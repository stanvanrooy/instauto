package com.instagram.creation.photo.edit.tint;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import p000X.Constants;
import p000X.AnonymousClass0P2;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1EA;
import p000X.AnonymousClass1EB;
import p000X.AnonymousClass1EG;
import p000X.C019000b;
import p000X.C175457eX;
import p000X.C175467eY;
import p000X.C175477eZ;
import p000X.C175487ea;
import p000X.C26771Ff;

public class IgTintColorPicker extends FrameLayout implements View.OnTouchListener {
    public int A00;
    public int A01;
    public TextView A02;
    public AnonymousClass1EG A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Drawable A08;
    public Drawable A09;
    public LayerDrawable A0A;
    public AnonymousClass1EB A0B;
    public C175487ea A0C;
    public boolean A0D;
    public boolean A0E;
    public Paint A0F;

    public final void onDraw(Canvas canvas) {
        this.A0F.setColor(-65536);
        this.A01 = getWidth() / ((this.A06 << 1) + 1);
        for (int i = 0; i < this.A06; i++) {
            this.A0F.setColor(C175477eZ.A00(getContext(), Constants.ZERO(9)[i], this.A0D));
            Canvas canvas2 = canvas;
            if (this.A00 == i) {
                LayerDrawable layerDrawable = this.A0A;
                int i2 = this.A07;
                int i3 = this.A01;
                int i4 = i3 + (i3 >> 1) + ((i3 * i) << 1);
                int height = getHeight() >> 1;
                int i5 = i2 >> 1;
                layerDrawable.setBounds(i4 - i5, height - i5, i4 + i5, height + i5);
                this.A0A.draw(canvas);
            } else {
                int i6 = this.A01;
                float f = (float) (i6 + (i6 >> 1) + ((i6 * i) << 1));
                float height2 = (float) (getHeight() >> 1);
                canvas.drawCircle(f, height2, (float) (this.A01 >> 1), this.A0F);
                if (i == 0) {
                    this.A0F.setColor(this.A05);
                    float f2 = ((float) this.A01) / 3.0f;
                    canvas2.drawLine(f + f2, height2 - f2, f - f2, height2 + f2, this.A0F);
                }
            }
        }
    }

    public void setAdjustingShadows(boolean z) {
        if (this.A0D != z) {
            int A002 = C175477eZ.A00(getContext(), Constants.ZERO(9)[this.A00], z);
            this.A09.setColorFilter(C26771Ff.A00(A002));
            this.A08.setColorFilter(C26771Ff.A00(A002));
            this.A0D = z;
            invalidate();
        }
    }

    public void setCurrentColor(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            if (this.A0A != null) {
                int A002 = C175477eZ.A00(getContext(), Constants.ZERO(9)[i], this.A0D);
                this.A09.setColorFilter(C26771Ff.A00(A002));
                this.A08.setColorFilter(C26771Ff.A00(A002));
            }
            C175487ea r0 = this.A0C;
            if (r0 != null) {
                r0.BRe(i);
            }
            invalidate();
        }
    }

    public void setOnTintColorChangeListener(C175487ea r2) {
        this.A0C = r2;
        if (r2 != null) {
            r2.BRe(this.A00);
        }
    }

    private int getCenterY() {
        return getHeight() >> 1;
    }

    private int getCurrentTintAsValue() {
        return this.A00;
    }

    private int getLeftBound() {
        return this.A01;
    }

    public boolean getAdjustingShadows() {
        return this.A0D;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int i = this.A01;
        int width = getWidth() - this.A01;
        int height = view.getHeight();
        int i2 = i >> 1;
        float f = (float) i2;
        if (x > f && x < ((float) (i2 + width)) && y > ((float) (height >> 2))) {
            int i3 = (int) ((x - f) / ((((float) width) * 1.0f) / ((float) this.A06)));
            if (motionEvent.getActionMasked() == 1) {
                if (i3 == this.A04 && i3 != 0) {
                    this.A0C.Ax6();
                }
                this.A04 = i3;
            }
            if (motionEvent.getActionMasked() == 0 && this.A0E && i3 != this.A00) {
                this.A02.setVisibility(0);
                this.A02.setPadding(0, (getHeight() >> 1) + (this.A01 >> 1), 0, 0);
                postDelayed(new C175467eY(this), 2500);
                this.A0E = false;
            }
            setCurrentColor(i3);
        }
        return true;
    }

    public void setNux(TextView textView) {
        this.A02 = textView;
    }

    public IgTintColorPicker(Context context) {
        this(context, (AttributeSet) null);
    }

    public IgTintColorPicker(Context context, AttributeSet attributeSet) {
        super(AnonymousClass1BA.A05(context, C0003R.attr.tintPickerStyle), attributeSet);
        Resources resources = context.getResources();
        Paint paint = new Paint();
        this.A0F = paint;
        paint.setColor(resources.getColor(C0003R.color.grey_5));
        this.A0F.setFlags(1);
        this.A0F.setStrokeWidth((float) resources.getDimensionPixelSize(C0003R.dimen.seek_bar_width));
        this.A06 = Constants.ZERO(9).length;
        Context context2 = getContext();
        this.A05 = AnonymousClass1BA.A01(context2, C0003R.attr.tintPickerLineColor);
        getContext();
        getContext();
        LayerDrawable layerDrawable = (LayerDrawable) C019000b.A03(context2, AnonymousClass1BA.A03(context2, C0003R.attr.tintPickerKnob));
        this.A0A = layerDrawable;
        this.A09 = layerDrawable.findDrawableByLayerId(C0003R.C0005id.seek_bar_knob_outer_circle);
        this.A08 = this.A0A.findDrawableByLayerId(C0003R.C0005id.seek_bar_knob_inner_circle);
        getContext();
        this.A07 = resources.getDimensionPixelSize(AnonymousClass1BA.A03(context2, C0003R.attr.tintPickerSelectedSize));
        getContext();
        int A002 = C175477eZ.A00(context2, Constants.ZERO, this.A0D);
        this.A09.setColorFilter(C26771Ff.A00(A002));
        this.A08.setColorFilter(C26771Ff.A00(A002));
        AnonymousClass1EB A003 = AnonymousClass0P2.A00();
        this.A0B = A003;
        AnonymousClass1EA A012 = AnonymousClass1EA.A01(4.0d, 4.0d);
        AnonymousClass1EG A004 = A003.A00();
        this.A03 = A004;
        A004.A06(A012);
        A004.A07(new C175457eX(this));
        this.A0E = true;
        this.A0D = true;
        setOnTouchListener(this);
        setWillNotDraw(false);
    }
}
