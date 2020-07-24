package com.instagram.util.jpeg;

import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0Y1;

public class JpegBridge {
    public static boolean A00;
    public static final Class A01 = JpegBridge.class;

    public static native float[] calcBWpoint(int i);

    public static native int calcCDF(int i);

    public static native NativeImage decodeCroppedJpeg(String str, int i, int i2, int i3, int i4);

    public static native NativeImage decodeFullJpeg(String str);

    public static native String getJpegLibraryNameNative();

    public static native String getJpegLibraryVersionNative();

    public static native int loadBufferToTexture(long j, int i, int i2);

    public static native int loadCDF(int i);

    public static native NativeImage readFramebuffer(int i, int i2);

    public static native int releaseNativeBuffer(int i);

    public static native NativeImage rotateImage(NativeImage nativeImage, int i);

    public static native int saveImage(NativeImage nativeImage, String str, int i, boolean z);

    public static native String saveImageFromGlContext(String str, int i, int i2, int i3);

    public static native NativeImage scaleImage(NativeImage nativeImage, int i, int i2);

    public static native int uploadTexture(NativeImage nativeImage);

    public static synchronized boolean A00() {
        boolean z;
        synchronized (JpegBridge.class) {
            if (!A00) {
                try {
                    AnonymousClass0Y1.A08("glcommon");
                    AnonymousClass0Y1.A08("cj_moz");
                    A00 = true;
                } catch (UnsatisfiedLinkError e) {
                    AnonymousClass0DB.A05(A01, "Could not load native library", e);
                    AnonymousClass0QD.A09("jpegbridge_load_error", e);
                }
            }
            z = A00;
        }
        return z;
    }
}
