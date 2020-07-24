package com.instagram.p009ui.widget.inlineerror;

import android.animation.LayoutTransition;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass9A3;
import p000X.C019000b;

/* renamed from: com.instagram.ui.widget.inlineerror.InlineErrorMessageView */
public class InlineErrorMessageView extends LinearLayout {
    public static final TimeInterpolator A09 = new DecelerateInterpolator();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Drawable A04;
    public View A05;
    public TextView A06;
    public String A07;
    public boolean A08;

    private void A02(Context context, AttributeSet attributeSet) {
        setOrientation(1);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A2X);
            this.A03 = obtainStyledAttributes.getResourceId(0, 0);
            this.A00 = obtainStyledAttributes.getResourceId(1, 0);
            this.A07 = obtainStyledAttributes.getString(3);
            Context context2 = getContext();
            this.A02 = obtainStyledAttributes.getColor(4, C019000b.A00(context2, C0003R.color.igds_secondary_text));
            getContext();
            this.A01 = obtainStyledAttributes.getColor(2, C019000b.A00(context2, C0003R.color.igds_error_or_destructive));
            obtainStyledAttributes.recycle();
        }
    }

    private void A00() {
        if (this.A06 == null) {
            this.A06 = (TextView) LayoutInflater.from(getContext()).inflate(C0003R.layout.inline_error_text_view, this, false);
            boolean z = false;
            View childAt = getChildAt(0);
            if (childAt != null) {
                z = true;
            }
            AnonymousClass0a4.A0C(z, "InlineErrorMessageView has no children; it has to wrap at least one view.");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.A06.getLayoutParams();
            marginLayoutParams2.leftMargin = marginLayoutParams.leftMargin;
            marginLayoutParams2.rightMargin = marginLayoutParams.rightMargin;
            addView(this.A06);
        }
    }

    private void A01() {
        if (this.A07 != null && !this.A08) {
            A00();
            this.A06.setVisibility(0);
            this.A06.setText(this.A07);
            this.A06.setTextColor(this.A02);
        }
    }

    private void A04(boolean z) {
        int i;
        View view = this.A05;
        if (view == null) {
            return;
        }
        if (z && (i = this.A00) != 0) {
            view.setBackgroundResource(i);
        } else if (!z) {
            view.setBackgroundDrawable(this.A04);
            Drawable drawable = this.A04;
            if (drawable != null) {
                drawable.jumpToCurrentState();
            }
        }
    }

    public final void A05() {
        TextView textView = this.A06;
        if (textView != null) {
            boolean z = this.A08;
            this.A08 = false;
            textView.setVisibility(8);
            if (z) {
                A04(false);
            }
            A01();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r0.getVisibility() != 0) goto L_0x001b;
     */
    public final void A06(String str) {
        boolean z;
        if (str != null && !str.trim().isEmpty()) {
            boolean z2 = this.A08;
            TextView textView = this.A06;
            if (textView != null) {
                z = true;
            }
            z = false;
            this.A08 = true;
            A00();
            this.A06.setVisibility(0);
            this.A06.setText(str);
            this.A06.setTextColor(this.A01);
            if (!z2) {
                A04(true);
            }
            if (!z) {
                this.A06.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                this.A06.animate().alpha(1.0f).setDuration(200).setInterpolator(A09).start();
            }
        }
    }

    public void setHint(String str) {
        this.A07 = str;
        A01();
    }

    public static void A03(ViewGroup viewGroup) {
        AnonymousClass0a4.A06(viewGroup);
        LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
        if (layoutTransition == null) {
            layoutTransition = new LayoutTransition();
            viewGroup.setLayoutTransition(layoutTransition);
        }
        layoutTransition.enableTransitionType(4);
        viewGroup.setClipChildren(false);
    }

    public final void onFinishInflate() {
        int A062 = AnonymousClass0Z0.A06(883834395);
        super.onFinishInflate();
        getViewTreeObserver().addOnPreDrawListener(new AnonymousClass9A3(this));
        A01();
        AnonymousClass0Z0.A0D(-1027431541, A062);
    }

    public InlineErrorMessageView(Context context) {
        super(context);
        A02(context, (AttributeSet) null);
    }

    public InlineErrorMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02(context, attributeSet);
    }

    public InlineErrorMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02(context, attributeSet);
    }
}
