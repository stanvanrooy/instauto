package com.facebook.mediastreaming.opt.transport.rtmpandvp;

import android.content.Context;
import com.facebook.mediastreaming.opt.transport.SSLFactoryHolder;
import com.facebook.mediastreaming.opt.transport.TransportSinkFactoryHolder;
import p000X.AW4;
import p000X.AnonymousClass0Y1;
import p000X.BM5;

public class RtmpAndVpTransportSinkFactoryHolder extends TransportSinkFactoryHolder {
    private native void initHybrid(SSLFactoryHolder sSLFactoryHolder, boolean z);

    static {
        AnonymousClass0Y1.A08("mediastreaming-transport");
    }

    public RtmpAndVpTransportSinkFactoryHolder(Context context, boolean z) {
        AW4 aw4;
        if (z) {
            synchronized (AW4.class) {
                if (AW4.A00 == null) {
                    AW4.A00 = new BM5();
                }
                aw4 = new AW4(context);
            }
        } else {
            aw4 = null;
        }
        initHybrid(aw4, z);
    }
}
