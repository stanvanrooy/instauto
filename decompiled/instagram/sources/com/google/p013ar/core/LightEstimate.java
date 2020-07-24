package com.google.p013ar.core;

/* renamed from: com.google.ar.core.LightEstimate */
public class LightEstimate {
    private native long[] nativeAcquireEnvironmentalHdrCubeMap(long j, long j2);

    public static native long nativeCreateLightEstimate(long j);

    public static native void nativeDestroyLightEstimate(long j, long j2);

    private native void nativeGetColorCorrection(long j, long j2, float[] fArr, int i);

    private native void nativeGetEnvironmentalHdrAmbientSphericalHarmonics(long j, long j2, float[] fArr);

    private native void nativeGetEnvironmentalHdrMainLightDirection(long j, long j2, float[] fArr);

    private native void nativeGetEnvironmentalHdrMainLightIntensity(long j, long j2, float[] fArr);

    private native float nativeGetPixelIntensity(long j, long j2);

    private native int nativeGetState(long j, long j2);

    private native long nativeGetTimestamp(long j, long j2);

    public final void finalize() {
        super.finalize();
    }
}
