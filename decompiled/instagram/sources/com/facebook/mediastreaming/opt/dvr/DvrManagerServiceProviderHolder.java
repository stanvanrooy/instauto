package com.facebook.mediastreaming.opt.dvr;

import com.facebook.mediastreaming.client.livestreaming.interfaces.ServiceProviderHolder;
import com.facebook.mediastreaming.opt.muxer.CodecMuxerFactory;
import com.facebook.mediastreaming.opt.muxer.TempFileCreator;
import java.io.File;
import p000X.AW1;
import p000X.AnonymousClass0Y1;

public class DvrManagerServiceProviderHolder extends ServiceProviderHolder {
    private native void initHybrid(DvrConfig dvrConfig, TempFileCreator tempFileCreator, CodecMuxerFactory codecMuxerFactory);

    public native File getDvrOutputFile();

    public native int getMuxState();

    static {
        AnonymousClass0Y1.A08("mediastreaming-dvr");
    }

    public DvrManagerServiceProviderHolder(DvrConfig dvrConfig, TempFileCreator tempFileCreator) {
        this(dvrConfig, tempFileCreator, (CodecMuxerFactory) null);
    }

    public DvrManagerServiceProviderHolder(DvrConfig dvrConfig, TempFileCreator tempFileCreator, CodecMuxerFactory codecMuxerFactory) {
        initHybrid(dvrConfig, tempFileCreator, codecMuxerFactory == null ? new AW1() : codecMuxerFactory);
    }
}
