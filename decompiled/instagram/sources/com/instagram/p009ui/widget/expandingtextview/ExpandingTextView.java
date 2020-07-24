package com.instagram.p009ui.widget.expandingtextview;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Html;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass11J;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass1PB;
import p000X.AnonymousClass6Rw;
import p000X.C147366Rq;
import p000X.C147396Rt;
import p000X.C147406Ru;
import p000X.C147546Sk;
import p000X.C37811kG;
import p000X.C38931m5;

/* renamed from: com.instagram.ui.widget.expandingtextview.ExpandingTextView */
public class ExpandingTextView extends TextView {
    public int A00;
    public C147366Rq A01;
    public AnonymousClass0C1 A02;
    public AnonymousClass6Rw A03;
    public CharSequence A04;
    public boolean A05;
    public boolean A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public CharSequence A0C;
    public Integer A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;

    private void A02(Context context, AttributeSet attributeSet) {
        super.setEllipsize((TextUtils.TruncateAt) null);
        setMovementMethod(LinkMovementMethod.getInstance());
        setHighlightColor(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A1J);
        this.A05 = obtainStyledAttributes.getBoolean(5, true);
        if (obtainStyledAttributes.getString(3) != null) {
            this.A0C = Html.fromHtml(obtainStyledAttributes.getString(3));
        } else {
            this.A0C = "…";
        }
        this.A09 = obtainStyledAttributes.getColor(4, getCurrentTextColor());
        A00();
        this.A08 = obtainStyledAttributes.getInteger(2, 10);
        this.A0E = obtainStyledAttributes.getBoolean(0, false);
        this.A07 = obtainStyledAttributes.getInteger(1, 500);
        obtainStyledAttributes.recycle();
        this.A0D = Constants.ONE;
        this.A03 = null;
        this.A0B = getMaxLines();
        this.A00 = getMaxLines();
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
    }

    private void A00() {
        if (this.A09 != getCurrentTextColor()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A0C);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.A09), 0, this.A0C.length(), 17);
            this.A0C = spannableStringBuilder;
        }
    }

    private void A01(int i) {
        if (!this.A0E) {
            setMaxLines(i);
            return;
        }
        setMaxLines(getLineCount());
        int abs = Math.abs(getLineCount() - i);
        if (abs > 0) {
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "maxLines", new int[]{i});
            ofInt.setDuration((long) Math.min(this.A08 * abs, this.A07));
            ofInt.start();
            return;
        }
        setMaxLines(i);
    }

    public static void A03(ExpandingTextView expandingTextView) {
        Integer num = expandingTextView.A0D;
        Integer num2 = Constants.ZERO;
        if (num == num2) {
            if (expandingTextView.A05) {
                expandingTextView.A01(expandingTextView.A00);
            }
            expandingTextView.A0D = Constants.ONE;
            return;
        }
        expandingTextView.A01(expandingTextView.getTextLayoutParams().A00(expandingTextView.A04).getLineCount());
        AnonymousClass6Rw r0 = expandingTextView.A03;
        if (r0 != null) {
            r0.B3G();
        }
        expandingTextView.A0D = num2;
    }

    private AnonymousClass1PB getTextLayoutParams() {
        return new AnonymousClass1PB(getPaint(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, false, Layout.Alignment.ALIGN_NORMAL);
    }

    public void setEllipsisTextColor(int i) {
        this.A09 = i;
        A00();
        this.A0G = true;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        throw new UnsupportedOperationException("Can't override the onClickListener for this view");
    }

    public int getMaxLines() {
        return this.A0B;
    }

    public final void onMeasure(int i, int i2) {
        int A062 = AnonymousClass0Z0.A06(-984091330);
        super.onMeasure(i, i2);
        if (this.A0G || this.A0A != getMeasuredWidth()) {
            this.A0F = true;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            CharSequence A012 = C37811kG.A01("", this.A04, this.A0C, this.A0B, getTextLayoutParams());
            if (this.A06) {
                String charSequence = A012.toString();
                AnonymousClass0C1 r2 = this.A02;
                AnonymousClass11J.A00(r2);
                AnonymousClass11J.A00(this.A01);
                C38931m5 r1 = new C38931m5(r2, new SpannableStringBuilder(charSequence));
                r1.A02(new C147406Ru(this));
                r1.A01(new C147396Rt(this));
                spannableStringBuilder.append(r1.A00());
            } else {
                spannableStringBuilder.append(A012);
            }
            if (A012.length() != this.A04.length()) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append(this.A0C);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.A09), length, spannableStringBuilder.length(), 33);
            }
            spannableStringBuilder.setSpan(new C147546Sk(this), 0, spannableStringBuilder.length(), 33);
            setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
            this.A0F = false;
            this.A0G = false;
            this.A0A = getMeasuredWidth();
            super.onMeasure(i, i2);
        }
        AnonymousClass0Z0.A0D(-993703981, A062);
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (!this.A0F) {
            this.A04 = charSequence;
            this.A0G = true;
        }
    }

    public void setMaxLines(int i) {
        super.setMaxLines(i);
        this.A0B = i;
        this.A0G = true;
    }

    public void setOnExpandedStateChangeListener(AnonymousClass6Rw r1) {
        this.A03 = r1;
    }

    public ExpandingTextView(Context context) {
        super(context);
        A02(context, (AttributeSet) null);
    }

    public ExpandingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02(context, attributeSet);
    }

    public ExpandingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02(context, attributeSet);
    }
}
