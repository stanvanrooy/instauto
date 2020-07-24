package com.instagram.util.creation;

import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0Y1;

public class RenderBridge {
    public static boolean A00;
    public static final Class A01 = RenderBridge.class;

    public static native int computeHistogram(int i, int[] iArr);

    public static native long configureImage(String str);

    public static native int mirrorAndComputeHistogram(int i, int[] iArr);

    public static native int mirrorImage(int i);

    public static native int readRenderResult(int i, int i2);

    public static native long saveAndClearCachedImageCropped(int i, String str, boolean z, boolean z2, int i2, boolean z3, int i3, int i4, int i5, int i6);

    public static native long saveAndClearCachedImageFull(int i, String str, boolean z, boolean z2, int i2, boolean z3);

    public static native long saveAndKeepCachedImageCropped(int i, String str, boolean z, boolean z2, int i2, boolean z3, int i3, int i4, int i5, int i6);

    public static synchronized boolean A00() {
        boolean z;
        synchronized (RenderBridge.class) {
            if (!A00) {
                try {
                    AnonymousClass0Y1.A08("glcommon");
                    AnonymousClass0Y1.A08("cj_moz");
                    A00 = true;
                } catch (UnsatisfiedLinkError e) {
                    AnonymousClass0DB.A05(A01, "Could not load native library", e);
                }
            }
            z = A00;
        }
        return z;
    }
}
