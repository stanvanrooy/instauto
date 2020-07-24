package com.instagram.creation.video.p030ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0003R;
import p000X.Constants;
import p000X.AnonymousClass8FH;
import p000X.C019000b;
import p000X.C15960no;
import p000X.C183997tb;
import p000X.C191048Ep;
import p000X.C191058Eq;

/* renamed from: com.instagram.creation.video.ui.VideoCaptureTimerView */
public class VideoCaptureTimerView extends FrameLayout implements AnonymousClass8FH {
    public Animation A00;
    public ImageView A01;
    public TextView A02;
    public C191058Eq A03;

    public final void AwW(C191048Ep r1) {
    }

    public final void Awb(C191048Ep r1) {
    }

    public final void Awc() {
    }

    public final void BJg() {
    }

    private void A00() {
        this.A02.setText(C15960no.A03((long) this.A03.A00()));
    }

    public final void AwX(C191048Ep r3, Integer num) {
        if (num == Constants.ZERO) {
            A00();
            setVisibility(0);
            this.A01.startAnimation(this.A00);
            return;
        }
        setVisibility(4);
        this.A01.clearAnimation();
    }

    public void setClipStackManager(C191058Eq r1) {
        this.A03 = r1;
        A00();
    }

    public final void AwY(C191048Ep r1) {
        A00();
    }

    public VideoCaptureTimerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public VideoCaptureTimerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VideoCaptureTimerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = getContext();
        inflate(context2, C0003R.layout.video_capture_timer_view, this);
        this.A01 = (ImageView) findViewById(C0003R.C0005id.video_capture_blinker);
        this.A02 = (TextView) findViewById(C0003R.C0005id.video_capture_timer);
        getContext();
        Integer A002 = C183997tb.A00(context2);
        if (A002 == Constants.A0C || A002 == Constants.A0N) {
            TextView textView = this.A02;
            getContext();
            textView.setTextColor(C019000b.A00(context2, C0003R.color.white));
        }
        getContext();
        this.A00 = AnimationUtils.loadAnimation(context2, C0003R.anim.recording_blinker);
    }
}
