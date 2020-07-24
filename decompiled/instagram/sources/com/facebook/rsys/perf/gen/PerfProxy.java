package com.facebook.rsys.perf.gen;

import com.facebook.djinni.msys.infra.McfReference;

public abstract class PerfProxy {
    public abstract void actionEndHandler(McfReference mcfReference, McfReference mcfReference2);

    public abstract void actionStartHandler(McfReference mcfReference);

    public abstract void markerEndHandler(McfReference mcfReference);

    public abstract void markerPointHandler(McfReference mcfReference, String str);

    public abstract void markerStartHandler(McfReference mcfReference);
}
