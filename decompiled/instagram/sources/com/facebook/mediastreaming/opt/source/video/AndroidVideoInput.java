package com.facebook.mediastreaming.opt.source.video;

import com.facebook.mediastreaming.opt.common.SurfaceHolder;
import com.facebook.mediastreaming.opt.source.SurfaceTextureHolder;
import p000X.AW7;

public interface AndroidVideoInput {
    boolean enableCaptureRenderer();

    boolean enableSecondInputSurface();

    AW7 getFrameSchedulerFactory();

    void removeErrorListener(AndroidExternalVideoSource androidExternalVideoSource);

    void setErrorListener(AndroidExternalVideoSource androidExternalVideoSource);

    void setOutputSurface(int i, SurfaceHolder surfaceHolder);

    void setOutputSurface(SurfaceTextureHolder surfaceTextureHolder, boolean z);

    void startRenderingToOutput();

    void stopRenderingToOutput();
}
