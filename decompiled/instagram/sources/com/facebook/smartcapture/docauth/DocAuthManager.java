package com.facebook.smartcapture.docauth;

import android.content.Context;
import android.graphics.Rect;
import com.facebook.jni.HybridData;
import com.facebook.smartcapture.flow.IdCaptureConfig;
import java.lang.ref.WeakReference;
import p000X.Constants;
import p000X.AnonymousClass0Y1;
import p000X.C4Q;

public class DocAuthManager {
    public static final boolean HAS_LOADED_NATIVE_LIBRARY;
    public float mAlignmentScaleX;
    public int mBytesPerPixel;
    public Context mContext;
    public WeakReference mDelegate;
    public HybridData mHybridData;
    public IdCaptureConfig mIdCaptureConfig;
    public boolean mIsImageProcessingRunning = true;
    public int mPreviewHeight;
    public Rect mPreviewRegionOfInterest;
    public int mPreviewWidth;

    public static native HybridData initHybrid(boolean z, boolean z2);

    private native DocAuthResult processImageBuffer(byte[] bArr, int i, int i2, float f, int i3, int i4, int i5, int i6, int i7);

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r10.mIdCaptureConfig.A01() == p000X.C27238C4f.A02) goto L_0x0010;
     */
    public synchronized void onPreviewFrame(byte[] bArr) {
        boolean z;
        Integer num;
        if (HAS_LOADED_NATIVE_LIBRARY) {
            z = true;
        }
        z = false;
        if (z && this.mIsImageProcessingRunning && this.mHybridData != null) {
            int i = this.mPreviewWidth;
            int i2 = this.mPreviewHeight;
            float f = this.mAlignmentScaleX;
            Rect rect = this.mPreviewRegionOfInterest;
            int i3 = rect.left;
            int i4 = rect.top;
            DocAuthResult processImageBuffer = processImageBuffer(bArr, i, i2, f, i3, i4, rect.right - i3, rect.bottom - i4, this.mBytesPerPixel);
            C4Q c4q = (C4Q) this.mDelegate.get();
            if (!(processImageBuffer == null || c4q == null || (num = c4q.A01) == Constants.A0j || num == Constants.A14 || num == Constants.A12) || (this.mIdCaptureConfig.A0C && processImageBuffer != null)) {
                throw null;
            }
        }
    }

    static {
        boolean z;
        try {
            AnonymousClass0Y1.A08("smartcapture_id");
            z = true;
        } catch (UnsatisfiedLinkError unused) {
            z = false;
        }
        HAS_LOADED_NATIVE_LIBRARY = z;
    }

    public DocAuthManager(Context context, IdCaptureConfig idCaptureConfig) {
        this.mContext = context;
        this.mIdCaptureConfig = idCaptureConfig;
    }
}
