package com.facebook.cameracore.mediapipeline.arengineservices.igeffectservicehost;

import android.content.Context;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.PluginConfigProvider;
import com.facebook.jni.HybridData;
import p000X.AnonymousClass0C1;

public class IgPluginConfigProvider extends PluginConfigProvider {
    public static native HybridData initHybrid(Context context);

    public IgPluginConfigProvider(Context context, AnonymousClass0C1 r3) {
        this.mHybridData = initHybrid(context);
    }
}
