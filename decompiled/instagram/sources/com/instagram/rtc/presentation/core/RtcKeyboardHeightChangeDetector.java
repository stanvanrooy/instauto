package com.instagram.rtc.presentation.core;

import android.app.Activity;
import androidx.lifecycle.OnLifecycleEvent;
import p000X.AnonymousClass1AD;
import p000X.C13150hy;
import p000X.C1662977d;
import p000X.C1663077f;
import p000X.C18730sK;
import p000X.C18750sM;
import p000X.C27511Id;

public final class RtcKeyboardHeightChangeDetector implements AnonymousClass1AD {
    public boolean A00;
    public final Activity A01;
    public final C18750sM A02 = C18730sK.A00(C1663077f.A00);

    public RtcKeyboardHeightChangeDetector(Activity activity) {
        C13150hy.A02(activity, "activity");
        this.A01 = activity;
    }

    @OnLifecycleEvent(C1662977d.ON_RESUME)
    public final void resume() {
        if (!this.A00) {
            ((C27511Id) this.A02.getValue()).BOP(this.A01);
            this.A00 = true;
        }
    }

    @OnLifecycleEvent(C1662977d.ON_START)
    public final void start() {
        if (!this.A00) {
            ((C27511Id) this.A02.getValue()).BOP(this.A01);
            this.A00 = true;
        }
    }

    @OnLifecycleEvent(C1662977d.ON_PAUSE)
    public final void stopDetector() {
        if (this.A00) {
            ((C27511Id) this.A02.getValue()).BP6();
            this.A00 = false;
        }
    }
}
