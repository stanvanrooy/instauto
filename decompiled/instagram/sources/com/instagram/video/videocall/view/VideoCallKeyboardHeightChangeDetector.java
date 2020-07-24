package com.instagram.video.videocall.view;

import android.app.Activity;
import androidx.lifecycle.OnLifecycleEvent;
import p000X.AnonymousClass1AD;
import p000X.C1662977d;
import p000X.C27501Ic;
import p000X.C27511Id;

public class VideoCallKeyboardHeightChangeDetector implements AnonymousClass1AD {
    public boolean A00;
    public final Activity A01;
    public final C27511Id A02 = new C27501Ic();

    @OnLifecycleEvent(C1662977d.ON_RESUME)
    public void resume() {
        if (!this.A00) {
            this.A02.BOP(this.A01);
            this.A00 = true;
        }
    }

    @OnLifecycleEvent(C1662977d.ON_START)
    public void start() {
        if (!this.A00) {
            this.A02.BOP(this.A01);
            this.A00 = true;
        }
    }

    @OnLifecycleEvent(C1662977d.ON_PAUSE)
    public void stopDetector() {
        if (this.A00) {
            this.A02.BP6();
            this.A00 = false;
        }
    }

    public VideoCallKeyboardHeightChangeDetector(Activity activity) {
        this.A01 = activity;
    }
}
