package com.facebook.video.heroplayer.client;

import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi;
import p000X.C40431oe;
import p000X.C40691p4;
import p000X.C45931yr;

public final class WarmupPool$2 extends ResultReceiver {
    public final /* synthetic */ C45931yr A00;
    public final /* synthetic */ HeroPlayerServiceApi A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WarmupPool$2(HeroPlayerServiceApi heroPlayerServiceApi, C45931yr r3) {
        super((Handler) null);
        this.A01 = heroPlayerServiceApi;
        this.A00 = r3;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        try {
            this.A01.BaF(this.A00.A00, false);
        } catch (RemoteException e) {
            C40431oe.A05("WarmupPool", e, "RemoteException when release player", new Object[0]);
        }
        C40691p4 r0 = this.A00.A01;
        if (r0 != null) {
            r0.release();
        }
    }
}
