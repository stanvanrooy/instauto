package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import p000X.AnonymousClass0YD;
import p000X.C79543dc;

public class Bitmaps {
    public static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);

    static {
        AnonymousClass0YD.A01("imagepipeline");
    }

    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        boolean z = true;
        boolean z2 = false;
        if (bitmap2.getConfig() == bitmap.getConfig()) {
            z2 = true;
        }
        C79543dc.A03(z2);
        C79543dc.A03(bitmap.isMutable());
        boolean z3 = false;
        if (bitmap.getWidth() == bitmap2.getWidth()) {
            z3 = true;
        }
        C79543dc.A03(z3);
        if (bitmap.getHeight() != bitmap2.getHeight()) {
            z = false;
        }
        C79543dc.A03(z);
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }
}
