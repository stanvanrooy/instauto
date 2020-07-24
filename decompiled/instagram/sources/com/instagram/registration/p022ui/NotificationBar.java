package com.instagram.registration.p022ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.facebook.C0003R;
import p000X.Constants;
import p000X.C135975rE;
import p000X.C135995rG;

/* renamed from: com.instagram.registration.ui.NotificationBar */
public class NotificationBar extends TextView {
    public Animation A00;
    public Integer A01 = Constants.A0C;
    public Context A02;
    public Animation A03;
    public final Runnable A04 = new C135995rG(this);

    private void A00(Context context) {
        this.A02 = context;
        this.A00 = AnimationUtils.loadAnimation(context, C0003R.anim.notification_slide_down);
        Animation loadAnimation = AnimationUtils.loadAnimation(this.A02, C0003R.anim.notification_slide_up);
        this.A03 = loadAnimation;
        loadAnimation.setAnimationListener(new C135975rE(this));
    }

    public static void A01(NotificationBar notificationBar) {
        if (notificationBar.A02 != null) {
            notificationBar.startAnimation(notificationBar.A03);
        }
        notificationBar.A01 = Constants.A0C;
    }

    public final void A02() {
        if (this.A01 == Constants.ONE) {
            A01(this);
        }
    }

    public final void A03() {
        if (this.A01 != Constants.A0C) {
            removeCallbacks(this.A04);
            A01(this);
        }
    }

    public final void A04(String str, int i, int i2) {
        removeCallbacks(this.A04);
        if (this.A01 != Constants.A0C) {
            A01(this);
        }
        this.A01 = Constants.ONE;
        setText(str);
        setTextColor(i2);
        setBackground(new ColorDrawable(i));
        setVisibility(0);
        startAnimation(this.A00);
    }

    public NotificationBar(Context context) {
        super(context);
        A00(context);
    }

    public NotificationBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }

    public NotificationBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context);
    }
}
