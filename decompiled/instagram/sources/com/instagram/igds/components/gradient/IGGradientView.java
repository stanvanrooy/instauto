package com.instagram.igds.components.gradient;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass0OW;
import p000X.AnonymousClass1EM;

public class IGGradientView extends View {
    public static GradientDrawable A00(GradientDrawable.Orientation orientation, int i) {
        return new GradientDrawable(orientation, new int[]{AnonymousClass0OW.A04(i, 1.0f), AnonymousClass0OW.A04(i, 0.75f), AnonymousClass0OW.A04(i, 0.5f), AnonymousClass0OW.A04(i, 0.25f), AnonymousClass0OW.A04(i, 0.1f), AnonymousClass0OW.A04(i, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER)});
    }

    private void A01(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A2A);
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.values()[obtainStyledAttributes.getInt(2, 0)];
            int color = obtainStyledAttributes.getColor(1, 0);
            float f = obtainStyledAttributes.getFloat(0, 0.2f);
            obtainStyledAttributes.recycle();
            if (((float) (color >>> 24)) / 255.0f == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                color |= -16777216;
            }
            setBackground(A00(orientation, AnonymousClass0OW.A04(color, f)));
        }
    }

    public IGGradientView(Context context) {
        super(context);
        A01((AttributeSet) null);
    }

    public IGGradientView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01(attributeSet);
    }

    public IGGradientView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01(attributeSet);
    }

    public IGGradientView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01(attributeSet);
    }
}
