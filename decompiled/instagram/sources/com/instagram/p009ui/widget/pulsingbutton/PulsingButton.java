package com.instagram.p009ui.widget.pulsingbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.C0003R;
import p000X.AnonymousClass1LT;
import p000X.C06490Pg;

/* renamed from: com.instagram.ui.widget.pulsingbutton.PulsingButton */
public class PulsingButton extends FrameLayout {
    public final AnimatorSet A00;
    public final ImageView A01;
    public final ImageView A02;
    public final ImageView A03;

    public void setButtonResource(int i) {
        this.A01.setImageResource(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
    }

    public void setPulsingEnabled(boolean z) {
        if (z && !this.A00.isStarted()) {
            this.A03.setVisibility(0);
            this.A02.setVisibility(0);
            this.A00.start();
        } else if (!z) {
            this.A03.setVisibility(8);
            this.A02.setVisibility(8);
            if (this.A00.isStarted()) {
                this.A00.end();
            }
        }
    }

    public final void A00(int i) {
        Context context = getContext();
        Drawable A022 = AnonymousClass1LT.A02(context, C0003R.C0004drawable.pulse_circle_inner, i);
        getContext();
        Drawable A023 = AnonymousClass1LT.A02(context, C0003R.C0004drawable.pulse_circle_outer, i);
        this.A02.setImageDrawable(A022);
        this.A03.setImageDrawable(A023);
    }

    public PulsingButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public PulsingButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PulsingButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(getContext()).inflate(C0003R.layout.pulsing_image_view, this, true);
        this.A03 = (ImageView) inflate.findViewById(C0003R.C0005id.pulse_circle_outer);
        this.A02 = (ImageView) inflate.findViewById(C0003R.C0005id.pulse_circle_inner);
        this.A01 = (ImageView) inflate.findViewById(C0003R.C0005id.pulse_icon);
        AnimatorSet animatorSet = new AnimatorSet();
        this.A00 = animatorSet;
        animatorSet.playTogether(new Animator[]{C06490Pg.A00(this.A03), C06490Pg.A00(this.A02)});
    }
}
