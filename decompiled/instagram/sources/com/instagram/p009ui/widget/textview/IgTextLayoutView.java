package com.instagram.p009ui.widget.textview;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass19g;
import p000X.C32411bC;
import p000X.C54302Wt;

/* renamed from: com.instagram.ui.widget.textview.IgTextLayoutView */
public class IgTextLayoutView extends View {
    public Layout A00;
    public C32411bC A01;
    public final int A02;

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.A01.A06(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return (AccessibilityNodeProvider) this.A01.A00;
    }

    public CharSequence getTextForAccessibility() {
        Layout layout = this.A00;
        if (layout == null) {
            return "";
        }
        return layout.getText();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        if (this.A00 != null) {
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            this.A00.draw(canvas);
        }
        canvas.restore();
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getClass().getName());
        accessibilityNodeInfo.setText(getTextForAccessibility());
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A00 != null) {
            setMeasuredDimension(getPaddingLeft() + getPaddingRight() + this.A00.getWidth(), getPaddingTop() + getPaddingBottom() + this.A00.getHeight());
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A05 = AnonymousClass0Z0.A05(-1347815446);
        Layout layout = this.A00;
        boolean z = false;
        if (layout == null) {
            i = -173329971;
        } else {
            if (C54302Wt.A00(motionEvent, layout, this) || super.onTouchEvent(motionEvent)) {
                z = true;
            }
            i = 1681844219;
        }
        AnonymousClass0Z0.A0C(i, A05);
        return z;
    }

    public void setTextLayout(Layout layout) {
        if (layout.getText() instanceof Spanned) {
            if (layout.getText() instanceof Spannable) {
                AnonymousClass19g.A00(getContext()).A2t((Spannable) layout.getText(), -1);
            }
            if (Build.VERSION.SDK_INT > 20) {
                int lineCount = layout.getLineCount();
                float f = (float) this.A02;
                if (lineCount > 0) {
                    f += ((float) (layout.getLineTop(lineCount) - layout.getLineTop(lineCount - 1))) * (layout.getSpacingMultiplier() - 1.0f);
                }
                setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), (int) (f + layout.getSpacingAdd()));
            }
            this.A00 = layout;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("CommentText must be spanned text");
    }

    public IgTextLayoutView(Context context) {
        this(context, (AttributeSet) null);
        this.A01 = new C32411bC(this);
    }

    public IgTextLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
        this.A01 = new C32411bC(this);
    }

    public IgTextLayoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setFocusable(true);
        this.A02 = getPaddingBottom();
        this.A01 = new C32411bC(this);
    }
}
