package com.facebook.caffe2;

import com.facebook.jni.HybridData;
import com.instagram.camera.effect.p016mq.voltron.IgArVoltronModuleLoader;
import java.nio.Buffer;
import p000X.AnonymousClass0Y1;

public class Caffe2$NativePeer {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(byte[] bArr, byte[] bArr2, String str);

    public native void copyOutputIndex(int i, Buffer buffer);

    public native void forceInlineExecution();

    public native String getOutputName(int i);

    public native int[] getOutputTensorDims(int i);

    public native int getOutputTensorNum();

    public native long getPredictorPointer();

    public native String getString0TensorDataByName(String str);

    public native void getTensorDataByName(String str, Buffer buffer);

    public native int[] getTensorDimsByName(String str);

    public native void runPredictor();

    public native void setInput(int i, int i2, int[] iArr, Buffer buffer);

    public native void setInputByName(String str, int i, int[] iArr, Buffer buffer);

    public native void setStringArrayInput(int i, int i2, int[] iArr, String[] strArr);

    public native void setStringArrayInputByName(String str, int i, int[] iArr, String[] strArr);

    static {
        AnonymousClass0Y1.A08(IgArVoltronModuleLoader.CAFFE2_VOLTRON_MODULE_NAME);
    }
}
