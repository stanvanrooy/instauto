package com.instagram.feed.p005ui.text;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1b5;
import p000X.C54302Wt;

/* renamed from: com.instagram.feed.ui.text.IgLikeTextView */
public class IgLikeTextView extends BulletAwareTextView {
    public AnonymousClass1b5 A00 = new AnonymousClass1b5(this);

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.A00.A06(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return (AccessibilityNodeProvider) this.A00.A00;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int A05 = AnonymousClass0Z0.A05(-726500127);
        Layout layout = getLayout();
        boolean z2 = false;
        if (layout != null) {
            z = C54302Wt.A00(motionEvent, layout, this);
        } else {
            z = false;
        }
        if (z || super.onTouchEvent(motionEvent)) {
            z2 = true;
        }
        AnonymousClass0Z0.A0C(1462814487, A05);
        return z2;
    }

    public IgLikeTextView(Context context) {
        super(context);
    }

    public IgLikeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IgLikeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
