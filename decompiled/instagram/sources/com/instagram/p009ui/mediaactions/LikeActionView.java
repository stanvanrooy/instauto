package com.instagram.p009ui.mediaactions;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.C019000b;
import p000X.C27181Gu;
import p000X.C32121ac;
import p000X.C32131ad;

/* renamed from: com.instagram.ui.mediaactions.LikeActionView */
public class LikeActionView extends ImageView implements C32121ac {
    public final void A00() {
        setScaleX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        setScaleY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        setAlpha(1.0f);
    }

    public final void Aru(float f, boolean z, boolean z2) {
        setScaleX(f);
        setScaleY(f);
        if (z) {
            f = (float) C27181Gu.A00((double) f, (double) getAlpha(), 1.0d);
        }
        setAlpha(f);
    }

    public LikeActionView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public LikeActionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LikeActionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setImageDrawable(C019000b.A03(context, C32131ad.A00));
    }
}
