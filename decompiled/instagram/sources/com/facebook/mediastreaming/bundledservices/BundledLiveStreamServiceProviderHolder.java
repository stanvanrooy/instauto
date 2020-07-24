package com.facebook.mediastreaming.bundledservices;

import com.facebook.mediastreaming.client.livestreaming.config.LiveStreamingConfig;
import com.facebook.mediastreaming.client.livestreaming.interfaces.ServiceProviderHolder;
import com.facebook.mediastreaming.opt.dvr.DvrConfig;
import com.facebook.mediastreaming.opt.muxer.CodecMuxerFactory;
import com.facebook.mediastreaming.opt.muxer.TempFileCreator;
import p000X.AW1;
import p000X.AnonymousClass0Y1;

public class BundledLiveStreamServiceProviderHolder extends ServiceProviderHolder {
    private native void initHybrid(LiveStreamingConfig liveStreamingConfig, DvrConfig dvrConfig, TempFileCreator tempFileCreator, CodecMuxerFactory codecMuxerFactory);

    public native LiveStreamSessionProbe getSessionProbe();

    static {
        AnonymousClass0Y1.A08("mediastreaming-bundledservices");
    }

    public BundledLiveStreamServiceProviderHolder(LiveStreamingConfig liveStreamingConfig, DvrConfig dvrConfig, TempFileCreator tempFileCreator) {
        initHybrid(liveStreamingConfig, dvrConfig, tempFileCreator, new AW1());
    }
}
