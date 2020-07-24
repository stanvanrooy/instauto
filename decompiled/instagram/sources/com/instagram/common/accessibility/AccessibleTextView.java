package com.instagram.common.accessibility;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.instagram.common.p004ui.base.IgTextView;
import p000X.C58432fw;

public class AccessibleTextView extends IgTextView {
    public C58432fw A00 = new C58432fw(this);

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.A00.A06(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return (AccessibilityNodeProvider) this.A00.A00;
    }

    public AccessibleTextView(Context context) {
        super(context);
    }

    public AccessibleTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AccessibleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
