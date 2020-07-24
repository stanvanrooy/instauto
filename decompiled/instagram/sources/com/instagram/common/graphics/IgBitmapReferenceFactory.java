package com.instagram.common.graphics;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0Y1;

public class IgBitmapReferenceFactory {
    public static final Class TAG = IgBitmapReferenceFactory.class;
    public static Boolean sIsIgBitmapReferenceSupported;

    public static native IgBitmapReference nativeDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options);

    public static synchronized boolean isIgBitmapReferenceSupported() {
        boolean booleanValue;
        String str;
        RuntimeException runtimeException;
        synchronized (IgBitmapReferenceFactory.class) {
            if (sIsIgBitmapReferenceSupported == null) {
                int i = Build.VERSION.SDK_INT;
                if (i < 21 || i > 23 || Build.VERSION.CODENAME.equals("N")) {
                    sIsIgBitmapReferenceSupported = false;
                } else {
                    try {
                        System.currentTimeMillis();
                        if (i == 23) {
                            str = "igbitmap_runtime_for_v23";
                        } else {
                            str = "igbitmap_runtime_for_v21";
                        }
                        AnonymousClass0Y1.A08(str);
                        byte[] bArr = {-1, -40, -1, -32, 0, 16, 74, 70, 73, 70, 0, 1, 1, 1, 0, 96, 0, 96, 0, 0, -1, -31, 0, 22, 69, 120, 105, 102, 0, 0, 73, 73, 42, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -37, 0, 67, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, -1, -37, 0, 67, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, -1, -64, 0, 17, 8, 0, 1, 0, 1, 3, 1, 34, 0, 2, 17, 1, 3, 17, 1, -1, -60, 0, 21, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, -1, -60, 0, 20, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -60, 0, 20, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -60, 0, 20, 17, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -38, 0, 12, 3, 1, 0, 2, 17, 3, 17, 0, 63, 0, -65, Byte.MIN_VALUE, 1, -1, -39};
                        Bitmap orCreateBitmap = nativeDecodeByteArray(bArr, 0, 309, new BitmapFactory.Options()).getOrCreateBitmap();
                        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, 309);
                        if (decodeByteArray.getHeight() == orCreateBitmap.getHeight() && decodeByteArray.getWidth() == orCreateBitmap.getWidth()) {
                            for (int i2 = 0; i2 < decodeByteArray.getWidth(); i2++) {
                                int i3 = 0;
                                while (i3 < decodeByteArray.getHeight()) {
                                    if (decodeByteArray.getPixel(i2, i3) == orCreateBitmap.getPixel(i2, i3)) {
                                        i3++;
                                    } else {
                                        runtimeException = new RuntimeException("the decoded image has wrong data");
                                    }
                                }
                            }
                            System.currentTimeMillis();
                            sIsIgBitmapReferenceSupported = true;
                        } else {
                            runtimeException = new RuntimeException("the decoded image has a wrong size");
                        }
                        throw runtimeException;
                    } catch (Throwable th) {
                        AnonymousClass0QD.A06("IgBitmapReferenceFactory", "failed_to_decode", th);
                        sIsIgBitmapReferenceSupported = false;
                    }
                }
                if (sIsIgBitmapReferenceSupported == null) {
                    throw new RuntimeException("Failed to init sIsIgBitmapReferenceSupported");
                }
            }
            booleanValue = sIsIgBitmapReferenceSupported.booleanValue();
        }
        return booleanValue;
    }
}
