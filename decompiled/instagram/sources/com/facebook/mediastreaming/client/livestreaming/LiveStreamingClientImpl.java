package com.facebook.mediastreaming.client.livestreaming;

import android.os.Handler;
import com.facebook.jni.HybridData;
import com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient;
import com.facebook.mediastreaming.client.livestreaming.config.LiveStreamingConfig;
import com.facebook.mediastreaming.opt.source.video.AndroidVideoInput;
import com.facebook.mediastreaming.opt.transport.SSLFactoryHolder;
import com.facebook.mediastreaming.opt.transport.TraceEventObserverHolder;
import com.facebook.mediastreaming.opt.transport.TransportCallbacks;
import com.facebook.mediastreaming.opt.transport.TransportSinkFactoryHolder;
import java.util.List;
import p000X.AVv;
import p000X.AnonymousClass0Y1;
import p000X.BV4;
import p000X.C30570Dew;

public class LiveStreamingClientImpl implements LiveStreamingClient {
    public final HybridData mHybridData;
    public final C30570Dew mSessionCallbacksDelegate;
    public final AVv mTransportCallbacksDelegate;

    public LiveStreamingClientImpl(LiveStreamingConfig liveStreamingConfig, AndroidVideoInput androidVideoInput, List list, LiveStreamingClient.LiveStreamingSessionCallbacks liveStreamingSessionCallbacks, Handler handler, TransportCallbacks transportCallbacks, TransportSinkFactoryHolder transportSinkFactoryHolder, SSLFactoryHolder sSLFactoryHolder, List list2, BV4 bv4, TraceEventObserverHolder traceEventObserverHolder) {
        C30570Dew dew = new C30570Dew(liveStreamingSessionCallbacks, handler);
        this.mSessionCallbacksDelegate = dew;
        AVv aVv = new AVv(transportCallbacks, handler);
        this.mTransportCallbacksDelegate = aVv;
        List list3 = list;
        this.mHybridData = initHybrid(liveStreamingConfig, dew, androidVideoInput, list3, aVv, transportSinkFactoryHolder, (SSLFactoryHolder) null, list2, (TraceEventObserverHolder) null);
    }

    public static native HybridData initHybrid(LiveStreamingConfig liveStreamingConfig, LiveStreamingClient.LiveStreamingSessionCallbacks liveStreamingSessionCallbacks, AndroidVideoInput androidVideoInput, List list, TransportCallbacks transportCallbacks, TransportSinkFactoryHolder transportSinkFactoryHolder, SSLFactoryHolder sSLFactoryHolder, List list2, TraceEventObserverHolder traceEventObserverHolder);

    public native void pause(boolean z);

    public native void resume();

    public native void start();

    public native void stop(boolean z);

    public native void updateAspectRatio(float f);

    public native void updateConfig(LiveStreamingConfig liveStreamingConfig);

    static {
        AnonymousClass0Y1.A08("mediastreaming");
    }
}
