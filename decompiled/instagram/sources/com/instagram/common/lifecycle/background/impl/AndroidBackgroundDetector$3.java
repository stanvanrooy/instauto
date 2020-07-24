package com.instagram.common.lifecycle.background.impl;

import androidx.lifecycle.OnLifecycleEvent;
import com.facebook.react.modules.appstate.AppStateModule;
import p000X.AnonymousClass0NE;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass1AD;
import p000X.C1662977d;

public class AndroidBackgroundDetector$3 implements AnonymousClass1AD {
    public final /* synthetic */ AnonymousClass0NE A00;

    public AndroidBackgroundDetector$3(AnonymousClass0NE r1) {
        this.A00 = r1;
    }

    @OnLifecycleEvent(C1662977d.ON_STOP)
    public void onAppBackgrounded() {
        AnonymousClass0NE r1 = this.A00;
        r1.A01 = false;
        AnonymousClass0NE.A00(r1, AppStateModule.APP_STATE_BACKGROUND);
        AnonymousClass0NE r0 = this.A00;
        AnonymousClass0ZA.A0E(r0.A01, r0.A04, -1497485129);
    }

    @OnLifecycleEvent(C1662977d.ON_START)
    public void onAppForegrounded() {
        AnonymousClass0NE r1 = this.A00;
        r1.A01 = true;
        r1.A02 = true;
        AnonymousClass0NE.A00(r1, "foreground");
        AnonymousClass0NE r0 = this.A00;
        AnonymousClass0ZA.A0E(r0.A01, r0.A05, 1895206157);
    }
}
