package com.facebook.photos.upload.uploaders.ssim;

import android.graphics.Bitmap;
import com.facebook.jni.HybridClassBase;
import p000X.AnonymousClass0Y1;

public class SSIMAccelerater extends HybridClassBase {
    private native void initHybrid();

    public native float calculateSSIM(Bitmap bitmap, Bitmap bitmap2);

    static {
        AnonymousClass0Y1.A08("ssim_accelerater");
    }

    public SSIMAccelerater() {
        initHybrid();
    }
}
