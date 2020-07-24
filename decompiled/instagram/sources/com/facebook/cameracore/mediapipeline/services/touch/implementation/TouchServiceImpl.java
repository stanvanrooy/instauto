package com.facebook.cameracore.mediapipeline.services.touch.implementation;

import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchService;
import com.facebook.jni.HybridData;
import p000X.C30502DdS;
import p000X.C30511Ddi;

public class TouchServiceImpl extends TouchService {
    public final C30502DdS mGestureProcessor = new C30502DdS(this);

    public interface HitTestCallback {
        void hitTestResult(long j, boolean z);
    }

    public static native HybridData initHybrid();

    public native void enqueueForHitTest(Gesture gesture, HitTestCallback hitTestCallback);

    public native void sendGesture(Gesture gesture);

    public C30502DdS getGestureProcessor() {
        return this.mGestureProcessor;
    }

    public void setTouchConfig(C30511Ddi ddi) {
        C30502DdS ddS = this.mGestureProcessor;
        if (ddS != null) {
            ddS.A0A = ddi;
            C30502DdS.A03(ddS);
        }
    }

    public TouchServiceImpl() {
        super(initHybrid());
    }
}
