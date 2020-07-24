package com.instagram.debug.network;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.nio.ByteBuffer;
import java.util.Locale;
import p000X.AnonymousClass1C4;
import p000X.AnonymousClass1CB;
import p000X.C06590Pq;
import p000X.C14250k8;
import p000X.C15190mU;
import p000X.C256019m;
import p000X.C26211Cc;

public class NetworkShapingServiceLayer implements C14250k8 {
    public static final String TAG = "IgNetworkDebugDevTools";
    public final C14250k8 mDelegate;
    public final C06590Pq mSession;

    public C26211Cc startRequest(AnonymousClass1C4 r6, C256019m r7, AnonymousClass1CB r8) {
        final long sleepTimePerChunk = DebugNetworkShapingConfigurationFactory.createNetworkShapingServiceLayerConfiguration(this.mSession).getSleepTimePerChunk();
        if (sleepTimePerChunk > 0) {
            r8.A04(new C15190mU() {
                public void onNewData(AnonymousClass1C4 r7, C256019m r8, ByteBuffer byteBuffer) {
                    long limit = (sleepTimePerChunk * ((long) byteBuffer.limit())) / OdexSchemeArtXdex.STATE_PGO_NEEDED;
                    String.format(Locale.US, "Slowing down network download by %dms: %s", new Object[]{Long.valueOf(limit), r7.A04.toString()});
                    try {
                        Thread.sleep(limit);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        return this.mDelegate.startRequest(r6, r7, r8);
    }

    public NetworkShapingServiceLayer(C06590Pq r1, C14250k8 r2) {
        this.mSession = r1;
        this.mDelegate = r2;
    }
}
