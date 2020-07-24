package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import java.util.Locale;
import p000X.AnonymousClass0FW;
import p000X.AnonymousClass0YD;
import p000X.C191628Hf;
import p000X.C25272BBn;
import p000X.C29340Cw9;
import p000X.C29346CwF;
import p000X.C29355CwO;
import p000X.C29376Cwp;
import p000X.C29386Cwz;
import p000X.C29466CyL;
import p000X.C29488Cyh;
import p000X.C79543dc;

public abstract class DalvikPurgeableDecoder implements C29466CyL {
    public static final byte[] EOI = {-1, -39};
    public final C29355CwO mUnpooledBitmapsCounter = C25272BBn.A00();

    public static native void nativePinBitmap(Bitmap bitmap);

    public abstract Bitmap decodeByteArrayAsPurgeable(C29488Cyh cyh, BitmapFactory.Options options);

    public abstract Bitmap decodeJPEGByteArrayAsPurgeable(C29488Cyh cyh, int i, BitmapFactory.Options options);

    public C29488Cyh decodeJPEGFromEncodedImage(C29376Cwp cwp, Bitmap.Config config, Rect rect, int i) {
        return decodeJPEGFromEncodedImageWithColorSpace(cwp, config, rect, i, (ColorSpace) null);
    }

    static {
        AnonymousClass0YD.A01("imagepipeline");
    }

    public static boolean endsWithEOI(C29488Cyh cyh, int i) {
        C29386Cwz cwz = (C29386Cwz) cyh.A06();
        if (i >= 2 && cwz.A00(i - 2) == -1 && cwz.A00(i - 1) == -39) {
            return true;
        }
        return false;
    }

    public C29488Cyh decodeFromEncodedImageWithColorSpace(C29376Cwp cwp, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        int A04 = cwp.A04();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = A04;
        options.inMutable = true;
        if (Build.VERSION.SDK_INT >= 26) {
            AnonymousClass0FW.A00(options, colorSpace);
        }
        C29488Cyh A06 = cwp.A06();
        C79543dc.A01(A06);
        try {
            return pinBitmap(decodeByteArrayAsPurgeable(A06, options));
        } finally {
            C29488Cyh.A03(A06);
        }
    }

    public C29488Cyh decodeJPEGFromEncodedImageWithColorSpace(C29376Cwp cwp, Bitmap.Config config, Rect rect, int i, ColorSpace colorSpace) {
        int A04 = cwp.A04();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = A04;
        options.inMutable = true;
        if (Build.VERSION.SDK_INT >= 26) {
            AnonymousClass0FW.A00(options, colorSpace);
        }
        C29488Cyh A06 = cwp.A06();
        C79543dc.A01(A06);
        try {
            return pinBitmap(decodeJPEGByteArrayAsPurgeable(A06, i, options));
        } finally {
            C29488Cyh.A03(A06);
        }
    }

    public C29488Cyh pinBitmap(Bitmap bitmap) {
        C79543dc.A01(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.mUnpooledBitmapsCounter.A05(bitmap)) {
                return C29488Cyh.A01(bitmap, this.mUnpooledBitmapsCounter.A04());
            }
            int A01 = C29346CwF.A01(bitmap);
            bitmap.recycle();
            throw new C191628Hf(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", new Object[]{Integer.valueOf(A01), Integer.valueOf(this.mUnpooledBitmapsCounter.A00()), Long.valueOf(this.mUnpooledBitmapsCounter.A03()), Integer.valueOf(this.mUnpooledBitmapsCounter.A01()), Integer.valueOf(this.mUnpooledBitmapsCounter.A02())}));
        } catch (Exception e) {
            bitmap.recycle();
            throw C29340Cw9.A00(e);
        }
    }
}
