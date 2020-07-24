package com.facebook.smartcapture.p011ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import p000X.AnonymousClass1EM;

/* renamed from: com.facebook.smartcapture.ui.ResourcesTextView */
public class ResourcesTextView extends TextView {
    private void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A3A);
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            setContentDescription(context.getText(resourceId));
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId2 != 0) {
            setHint(context.getText(resourceId2));
        }
        int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
        if (resourceId3 != 0) {
            setImeActionLabel(context.getText(resourceId3), getImeActionId());
        }
        int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId4 != 0) {
            setText(context.getText(resourceId4));
        }
        obtainStyledAttributes.recycle();
    }

    public ResourcesTextView(Context context) {
        super(context);
    }

    public ResourcesTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public ResourcesTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    public ResourcesTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00(context, attributeSet);
    }
}
