package com.instagram.util.regiontracking;

import android.graphics.Matrix;
import android.graphics.RectF;
import java.nio.ByteBuffer;
import p000X.AnonymousClass0Y1;

public class RegionTracker {
    public final float A00;
    public final long A01 = nativeCreateRegionTracker(true);
    public final Matrix A02 = new Matrix();
    public final RectF A03;

    public static native void nativeAddRegion(long j, float f, float f2, float f3, float f4);

    public static native long nativeCreateRegionTracker(boolean z);

    public static native void nativeDispose(long j);

    public static native RectF nativeUpdate(long j, ByteBuffer byteBuffer, int i, int i2, float[] fArr, boolean z);

    static {
        AnonymousClass0Y1.A08("regiontracking");
    }

    public RegionTracker(RectF rectF, float f) {
        this.A03 = rectF;
        this.A00 = f;
    }
}
