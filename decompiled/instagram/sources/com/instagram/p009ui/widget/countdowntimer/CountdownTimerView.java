package com.instagram.p009ui.widget.countdowntimer;

import android.content.Context;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.p009ui.widget.gradientspinner.GradientSpinner;
import p000X.AnonymousClass0ZA;
import p000X.C151756eF;
import p000X.C151776eH;
import p000X.C151786eI;

/* renamed from: com.instagram.ui.widget.countdowntimer.CountdownTimerView */
public class CountdownTimerView extends FrameLayout {
    public AlphaAnimation A00;
    public TextView A01;
    public C151776eH A02;
    public GradientSpinner A03;
    public C151786eI A04;
    public int A05;

    public final void A00() {
        this.A03.A08();
        this.A03.setVisibility(0);
        this.A01.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        this.A01.setTextSize(0, (float) getResources().getDimensionPixelSize(C0003R.dimen.countdown_text_size));
        this.A01.setVisibility(0);
        C151786eI r3 = new C151786eI(this.A05, 1000, new C151756eF(this));
        this.A04 = r3;
        AnonymousClass0ZA.A0D(r3.A02, Message.obtain());
    }

    public void setCallback(C151776eH r1) {
        this.A02 = r1;
    }

    public void setNumTicks(int i) {
        this.A05 = i;
    }

    public CountdownTimerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public CountdownTimerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CountdownTimerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A05 = 3;
        LayoutInflater.from(getContext()).inflate(C0003R.layout.layout_countdown_timer, this);
        this.A03 = (GradientSpinner) findViewById(C0003R.C0005id.countdown_timer_spinner);
        this.A01 = (TextView) findViewById(C0003R.C0005id.countdown_timer_title_text);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.5f);
        this.A00 = alphaAnimation;
        alphaAnimation.setDuration(1000);
        this.A00.setRepeatCount(-1);
        this.A00.setRepeatMode(2);
    }
}
