package com.instagram.common.p004ui.text;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.instagram.common.p004ui.base.IgTextView;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EM;
import p000X.C06220Of;
import p000X.C104864fw;
import p000X.CM5;
import p000X.CM6;
import p000X.CM7;
import p000X.CM9;

/* renamed from: com.instagram.common.ui.text.AlternatingTextView */
public class AlternatingTextView extends IgTextView {
    public int A00;
    public ValueAnimator A01;
    public List A02;
    public boolean A03;
    public boolean A04;
    public int A05;
    public int A06;

    public static int getMeasuredTextWidth(AlternatingTextView alternatingTextView) {
        alternatingTextView.measure(0, 0);
        return alternatingTextView.getMeasuredWidth();
    }

    public static void A00(AlternatingTextView alternatingTextView) {
        if (alternatingTextView.A04) {
            A02(alternatingTextView, 1, 0);
        } else {
            A03(alternatingTextView, getMeasuredTextWidth(alternatingTextView), 0);
        }
        alternatingTextView.A01.addListener(new CM5(alternatingTextView));
        alternatingTextView.A01.setStartDelay((long) alternatingTextView.A06);
        alternatingTextView.A01.start();
    }

    public static void A01(AlternatingTextView alternatingTextView) {
        CharSequence charSequence;
        if (alternatingTextView.A00 < alternatingTextView.A02.size()) {
            charSequence = (CharSequence) alternatingTextView.A02.get(alternatingTextView.A00);
        } else {
            charSequence = "";
        }
        alternatingTextView.setText(charSequence);
    }

    public static void A02(AlternatingTextView alternatingTextView, int i, int i2) {
        alternatingTextView.A01.removeAllListeners();
        alternatingTextView.A01.cancel();
        alternatingTextView.A01.setFloatValues(new float[]{(float) i, (float) i2});
        alternatingTextView.A01.addUpdateListener(new C104864fw(alternatingTextView));
        alternatingTextView.A01.setDuration((long) alternatingTextView.A05);
    }

    public static void A03(AlternatingTextView alternatingTextView, int i, int i2) {
        alternatingTextView.A01.removeAllListeners();
        alternatingTextView.A01.cancel();
        alternatingTextView.A01.setIntValues(new int[]{i, i2});
        alternatingTextView.A01.addUpdateListener(new CM6(alternatingTextView, alternatingTextView.getMeasuredHeight()));
        alternatingTextView.A01.setDuration((long) alternatingTextView.A05);
    }

    public final void A04() {
        if (!this.A03 && this.A02.size() >= 2) {
            this.A03 = true;
            if (isLaidOut()) {
                A00(this);
            } else {
                C06220Of.A0b(this, new CM9(this));
            }
        }
    }

    public final void A05(List list) {
        this.A02 = list;
        this.A00 = 0;
        A01(this);
        if (this.A03) {
            this.A01.pause();
            this.A01.removeAllUpdateListeners();
            C06220Of.A0c(this, new CM7(this));
        }
    }

    public int getCurrentTextIndex() {
        return this.A00;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0Z0.A06(1296699796);
        if (this.A03) {
            this.A01.resume();
        }
        super.onAttachedToWindow();
        AnonymousClass0Z0.A0D(-2028254052, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0Z0.A06(-1125503557);
        this.A01.pause();
        super.onDetachedFromWindow();
        AnonymousClass0Z0.A0D(1627886878, A062);
    }

    public AlternatingTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AlternatingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AlternatingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A02 = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A07);
        this.A05 = obtainStyledAttributes.getInt(1, 1500);
        this.A06 = obtainStyledAttributes.getInt(2, 3000);
        this.A04 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        this.A01 = new ValueAnimator();
    }
}
