package com.instagram.p009ui.widget.bouncyufibutton;

import android.content.Context;
import android.util.AttributeSet;
import com.instagram.common.p004ui.colorfilter.ColorFilterAlphaImageView;
import p000X.C29891Rr;
import p000X.C32121ac;

/* renamed from: com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView */
public class IgBouncyUfiButtonImageView extends ColorFilterAlphaImageView implements C32121ac, C29891Rr {
    public final void Art(float f, boolean z) {
        Aru(f, z, false);
    }

    public final void A06() {
        setScaleX(1.0f);
        setScaleY(1.0f);
        setAlpha(1.0f);
    }

    public final void Aru(float f, boolean z, boolean z2) {
        setScaleX(f);
        setScaleY(f);
        if (!z) {
            f = 1.0f;
        }
        setAlpha(f);
    }

    public IgBouncyUfiButtonImageView(Context context) {
        super(context);
    }

    public IgBouncyUfiButtonImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IgBouncyUfiButtonImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
