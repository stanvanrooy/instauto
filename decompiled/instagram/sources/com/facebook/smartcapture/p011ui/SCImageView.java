package com.facebook.smartcapture.p011ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import p000X.AnonymousClass1EM;
import p000X.C25851Ap;

/* renamed from: com.facebook.smartcapture.ui.SCImageView */
public class SCImageView extends ImageView {
    private void A00(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A3D, i, 0);
            try {
                setImageResource(obtainStyledAttributes.getResourceId(0, 0));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void setImageResource(int i) {
        if (i != 0) {
            try {
                C25851Ap A00 = C25851Ap.A00(getResources(), i, getContext().getTheme());
                if (A00 != null) {
                    setImageDrawable(A00);
                } else {
                    super.setImageResource(i);
                }
            } catch (Exception unused) {
                super.setImageResource(i);
            }
        }
    }

    public SCImageView(Context context) {
        super(context);
        A00(context, (AttributeSet) null, 0);
    }

    public SCImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet, 0);
    }

    public SCImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet, i);
    }

    public SCImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00(context, attributeSet, i);
    }
}
