package com.instagram.wellbeing.timespent.p039ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass19g;
import p000X.AnonymousClass1EM;

/* renamed from: com.instagram.wellbeing.timespent.ui.GradientTextView */
public class GradientTextView extends TextView {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence Aon;
        if (charSequence == null) {
            Aon = null;
        } else {
            Aon = AnonymousClass19g.A00(getContext()).Aon(charSequence, -1);
        }
        super.setText(Aon, bufferType);
    }

    private void A00(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A25);
        this.A01 = obtainStyledAttributes.getColor(1, 0);
        this.A03 = obtainStyledAttributes.getColor(3, 0);
        this.A04 = obtainStyledAttributes.getColor(4, 0);
        this.A02 = obtainStyledAttributes.getColor(2, 0);
        this.A00 = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = AnonymousClass0Z0.A06(-1795332671);
        int i5 = i3;
        int i6 = i4;
        int i7 = i2;
        super.onSizeChanged(i, i7, i5, i6);
        if (!(i == i5 && i7 == i6)) {
            getPaint().setShader(new LinearGradient(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) i7, (float) i, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, new int[]{this.A01, this.A03, this.A04, this.A02, this.A00}, new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0.25f, 0.5f, 0.75f, 1.0f}, Shader.TileMode.CLAMP));
            getPaint().setDither(true);
        }
        AnonymousClass0Z0.A0D(594995189, A06);
    }

    public void setContent(CharSequence charSequence) {
        setText(charSequence);
    }

    public GradientTextView(Context context) {
        super(context);
    }

    public GradientTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(attributeSet);
    }

    public GradientTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(attributeSet);
    }
}
