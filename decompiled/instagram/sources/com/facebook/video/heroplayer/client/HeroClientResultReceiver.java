package com.facebook.video.heroplayer.client;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

public class HeroClientResultReceiver extends ResultReceiver {
    public Runnable A00;

    public HeroClientResultReceiver(Runnable runnable) {
        super((Handler) null);
        this.A00 = runnable;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        Runnable runnable = this.A00;
        if (runnable != null) {
            runnable.run();
        }
        this.A00 = null;
    }
}
