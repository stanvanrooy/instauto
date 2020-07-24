package com.instagram.p009ui.widget.expandingtextview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.View;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass29T;
import p000X.AnonymousClass83T;
import p000X.AnonymousClass8LR;
import p000X.AnonymousClass8LS;
import p000X.AnonymousClass8LT;
import p000X.AnonymousClass8LU;
import p000X.C17700qf;
import p000X.C17710qg;
import p000X.C177117hL;

/* renamed from: com.instagram.ui.widget.expandingtextview.ExpandingEllipsizingTextView */
public class ExpandingEllipsizingTextView extends C177117hL {
    public int A00;
    public int A01;
    public int A02;
    public ValueAnimator A03;
    public AnonymousClass83T A04;
    public C17710qg A05;
    public boolean A06;
    public final ValueAnimator.AnimatorUpdateListener A07 = new AnonymousClass8LS(this);

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A01 = 0;
        this.A02 = 0;
        super.onTextChanged(charSequence, i, i2, i3);
    }

    private void A00() {
        if (this.A02 <= 0 || this.A01 <= 0) {
            StaticLayout staticLayout = new StaticLayout(this.A02, getPaint(), (getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight(), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
            this.A02 = AnonymousClass29T.A01(staticLayout) + getCompoundPaddingBottom() + getCompoundPaddingTop();
            this.A01 = staticLayout.getLineTop(Math.min(this.A00, staticLayout.getLineCount())) + getCompoundPaddingTop() + getCompoundPaddingBottom();
        }
    }

    private void A01(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A1I);
        this.A06 = obtainStyledAttributes.getBoolean(0, false);
        int integer = obtainStyledAttributes.getInteger(4, 0);
        this.A00 = integer;
        if (integer == 0) {
            this.A06 = false;
        }
        setIncludeFontPadding(false);
        obtainStyledAttributes.recycle();
        this.A04 = AnonymousClass83T.COLLAPSED;
        this.A05 = C17700qf.A00;
        setMaxLines(this.A00);
        super.setOnClickListener(new AnonymousClass8LR(this));
    }

    public final void A02(boolean z) {
        C17710qg r1;
        AnonymousClass83T r0 = this.A04;
        AnonymousClass83T r2 = AnonymousClass83T.COLLAPSED;
        if (r0 != r2) {
            if (this.A06 && z) {
                int height = getHeight();
                A00();
                int i = this.A01;
                if (height != i) {
                    ValueAnimator valueAnimator = this.A03;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        this.A03.removeAllUpdateListeners();
                        this.A03.cancel();
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{height, i});
                    this.A03 = ofInt;
                    ofInt.addUpdateListener(this.A07);
                    this.A03.addListener(new AnonymousClass8LT(this));
                    this.A03.start();
                    r1 = this.A05;
                    if (r1.A05() && z) {
                        ((AnonymousClass8LU) r1.A02()).Ax0();
                    }
                    this.A04 = r2;
                }
            }
            super.setMaxLines(this.A00);
            r1 = this.A05;
            ((AnonymousClass8LU) r1.A02()).Ax0();
            this.A04 = r2;
        }
    }

    public final void A03(boolean z) {
        C17710qg r1;
        AnonymousClass83T r0 = this.A04;
        AnonymousClass83T r2 = AnonymousClass83T.EXPANDED;
        if (r0 != r2) {
            if (this.A06 && z) {
                int height = getHeight();
                A00();
                int i = this.A02;
                if (height != i) {
                    ValueAnimator valueAnimator = this.A03;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        this.A03.removeAllUpdateListeners();
                        this.A03.cancel();
                    }
                    super.setMaxLines(Integer.MAX_VALUE);
                    ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{height, i});
                    this.A03 = ofInt;
                    ofInt.addUpdateListener(this.A07);
                    this.A03.start();
                    r1 = this.A05;
                    if (r1.A05() && z) {
                        ((AnonymousClass8LU) r1.A02()).B3G();
                    }
                    this.A04 = r2;
                }
            }
            super.setMaxLines(Integer.MAX_VALUE);
            r1 = this.A05;
            ((AnonymousClass8LU) r1.A02()).B3G();
            this.A04 = r2;
        }
    }

    public void setExpandState(AnonymousClass83T r4) {
        AnonymousClass83T r2 = this.A04;
        if (r2 == r4) {
            return;
        }
        if (r2 == AnonymousClass83T.EXPANDED) {
            A02(false);
        } else {
            A03(false);
        }
    }

    public void setMaxLines(int i) {
        this.A00 = i;
        super.setMaxLines(i);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        throw new UnsupportedOperationException("Can't override the onClickListener for this viewTry using EllipsizingTextView instead");
    }

    private int getCollapsedStateHeight() {
        A00();
        return this.A01;
    }

    private int getExpandedStateHeight() {
        A00();
        return this.A02;
    }

    public AnonymousClass83T getExpandState() {
        return this.A04;
    }

    public void setOnExpandedStateChangeListener(AnonymousClass8LU r2) {
        this.A05 = C17710qg.A00(r2);
    }

    public static void setEllipsizedMaxLines(ExpandingEllipsizingTextView expandingEllipsizingTextView, int i) {
        super.setMaxLines(i);
    }

    public ExpandingEllipsizingTextView(Context context) {
        super(context);
        A01(context, (AttributeSet) null);
    }

    public ExpandingEllipsizingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01(context, attributeSet);
    }

    public ExpandingEllipsizingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01(context, attributeSet);
    }
}
