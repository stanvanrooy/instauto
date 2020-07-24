package com.facebook.cameracore.mediapipeline.dataproviders.volume.implementation;

import android.content.Context;
import android.os.Handler;
import android.provider.Settings;
import com.facebook.cameracore.mediapipeline.dataproviders.volume.interfaces.VolumeDataProvider;
import com.facebook.jni.HybridData;
import p000X.AEQ;

public class VolumeDataProviderImpl extends VolumeDataProvider {
    public final Context A00;
    public final AEQ A01 = new AEQ(new Handler(), this.A00, this);

    private native HybridData initHybrid();

    public final synchronized void destroy() {
        this.A00.getContentResolver().unregisterContentObserver(this.A01);
    }

    public native void setData(int i, boolean z);

    public VolumeDataProviderImpl(Context context) {
        this.mHybridData = initHybrid();
        this.A00 = context;
        this.A00.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.A01);
    }
}
