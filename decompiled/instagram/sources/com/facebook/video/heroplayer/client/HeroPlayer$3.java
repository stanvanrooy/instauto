package com.facebook.video.heroplayer.client;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import p000X.C45791yV;

public class HeroPlayer$3 extends ResultReceiver {
    public final /* synthetic */ C45791yV A00;
    public final /* synthetic */ Runnable A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeroPlayer$3(C45791yV r2, Runnable runnable) {
        super((Handler) null);
        this.A00 = r2;
        this.A01 = runnable;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        this.A01.run();
    }
}
