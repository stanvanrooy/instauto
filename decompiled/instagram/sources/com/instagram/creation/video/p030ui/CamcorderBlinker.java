package com.instagram.creation.video.p030ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.facebook.C0003R;
import com.instagram.common.p004ui.colorfilter.ColorFilterAlphaImageView;
import p000X.Constants;
import p000X.AnonymousClass8FH;
import p000X.C06220Of;
import p000X.C191048Ep;
import p000X.C191058Eq;

/* renamed from: com.instagram.creation.video.ui.CamcorderBlinker */
public class CamcorderBlinker extends ColorFilterAlphaImageView implements AnonymousClass8FH {
    public Animation A00;
    public int A01;
    public C191058Eq A02;

    public final void AwW(C191048Ep r1) {
    }

    public final void BJg() {
    }

    private void A00() {
        if (this.A02 != null) {
            getDrawable().getIntrinsicWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.setMargins((int) Math.max(((((double) this.A02.A00()) / 60000.0d) * ((double) this.A01)) - ((double) C06220Of.A05(getResources().getDisplayMetrics(), 1)), 0.0d), 0, 0, 0);
            setLayoutParams(marginLayoutParams);
        }
    }

    public final void A06() {
        boolean z = false;
        if (60000 - this.A02.A00() <= 0) {
            z = true;
        }
        if (z) {
            clearAnimation();
            setVisibility(8);
            return;
        }
        startAnimation(this.A00);
        setVisibility(0);
        A00();
    }

    public final void AwX(C191048Ep r2, Integer num) {
        if (num == Constants.A0C || num == Constants.ZERO) {
            clearAnimation();
            setVisibility(8);
            return;
        }
        startAnimation(this.A00);
        setVisibility(0);
    }

    public final void Awb(C191048Ep r2) {
        startAnimation(this.A00);
        setVisibility(0);
        A00();
    }

    public void setClipStackManager(C191058Eq r1) {
        this.A02 = r1;
        A00();
    }

    public final void Awc() {
        clearAnimation();
        setVisibility(8);
    }

    public final void AwY(C191048Ep r1) {
        A00();
    }

    public CamcorderBlinker(Context context) {
        super(context);
        Context context2 = getContext();
        this.A01 = C06220Of.A09(context2);
        getContext();
        this.A00 = AnimationUtils.loadAnimation(context2, C0003R.anim.camcorder_blinker);
    }

    public CamcorderBlinker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = getContext();
        this.A01 = C06220Of.A09(context2);
        getContext();
        this.A00 = AnimationUtils.loadAnimation(context2, C0003R.anim.camcorder_blinker);
    }

    public CamcorderBlinker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = getContext();
        this.A01 = C06220Of.A09(context2);
        getContext();
        this.A00 = AnimationUtils.loadAnimation(context2, C0003R.anim.camcorder_blinker);
    }
}
