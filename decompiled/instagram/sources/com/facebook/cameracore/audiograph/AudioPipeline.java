package com.facebook.cameracore.audiograph;

import com.facebook.jni.HybridData;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p000X.AnonymousClass0Y1;
import p000X.C29966DJd;
import p000X.C88453sR;
import p000X.DK1;
import p000X.DK2;

public class AudioPipeline {
    public static int sAndroidAudioApi;
    public static boolean sIsNativeLibLoaded;
    public final DK2 mAudioDebugCallback;
    public final DK1 mAudioMixingCallback;
    public final AtomicBoolean mDestructed = new AtomicBoolean(false);
    public HybridData mHybridData;

    public static native int getDeviceBufferSizeInternal(int i);

    public static native float getDeviceSampleRateInternal(int i);

    private native HybridData initHybrid(int i, float f, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3);

    public native int createCaptureGraph(AudioCallback audioCallback);

    public native int enableMicNode(boolean z);

    public native int enableSpeakerNode(boolean z);

    public native AudioGraphClientProvider getAudioGraphClientProvider();

    public native float getAudioGraphSampleRate();

    public native String getDebugInfo();

    public native void onReceivedAudioMixingMode(int i);

    public native int startInput();

    public native int startOutput();

    public native int stopInput();

    public native int stopOutput();

    public native void updateOutputRouteState(int i);

    public static synchronized void loadNativeLib() {
        synchronized (AudioPipeline.class) {
            if (!sIsNativeLibLoaded) {
                AnonymousClass0Y1.A08("audiograph-native");
                sIsNativeLibLoaded = true;
            }
        }
    }

    public void handleDebugEvent(String str) {
        DK2 dk2 = this.mAudioDebugCallback;
        if (dk2 != null) {
            C88453sR r3 = dk2.A00;
            Map A00 = C29966DJd.A00(r3.A09, r3.A07, (AudioPipeline) null);
            A00.put("AP_FBADebugInfo", str);
            r3.A0B.A0J("audiopipeline_method_exceeded_time", A00);
        }
    }

    public boolean setAudioMixing(int i) {
        return C88453sR.A04(this.mAudioMixingCallback.A00, i);
    }

    public AudioPipeline(int i, float f, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, DK1 dk1, DK2 dk2) {
        loadNativeLib();
        this.mAudioMixingCallback = dk1;
        this.mAudioDebugCallback = dk2;
        int i5 = i;
        this.mHybridData = initHybrid(i5, f, 1, sAndroidAudioApi, 0, 1000, z, z2, z3);
    }
}
