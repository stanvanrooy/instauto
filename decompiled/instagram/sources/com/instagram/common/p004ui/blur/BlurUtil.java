package com.instagram.common.p004ui.blur;

import android.graphics.Bitmap;
import p000X.AnonymousClass0NI;
import p000X.AnonymousClass19L;
import p000X.C05700Lp;

/* renamed from: com.instagram.common.ui.blur.BlurUtil */
public class BlurUtil {
    public static volatile boolean sBoxBlurLibLoaded;
    public static volatile boolean sLibrariesLoaded;
    public static volatile boolean sStackBlurLibLoaded;

    public static native void functionToBlur(Bitmap bitmap, int i, int i2);

    public static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);

    public static void blurInPlace(Bitmap bitmap, int i) {
        if (!sLibrariesLoaded) {
            return;
        }
        if (sBoxBlurLibLoaded && bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            nativeIterativeBoxBlur(bitmap, 2, i);
        } else if (sStackBlurLibLoaded) {
            functionToBlur(bitmap, i, AnonymousClass0NI.A01().A03());
        }
    }

    public static Bitmap blur(Bitmap bitmap, float f, int i) {
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(((float) bitmap.getWidth()) * f), Math.round(((float) bitmap.getHeight()) * f), false);
        blurInPlace(createScaledBitmap, i);
        return createScaledBitmap;
    }

    public static void loadLibraries() {
        C05700Lp.A00().ADc(new AnonymousClass19L());
    }
}
