package com.facebook.cameracore.mediapipeline.engine;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.nio.ByteBuffer;

public class EngineImageUtil {
    public static void getBytes(String str, ByteBuffer byteBuffer) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        if (decodeFile != null) {
            decodeFile.copyPixelsToBuffer(byteBuffer);
        }
    }

    public static void getBytesFromByteArray(byte[] bArr, int i, ByteBuffer byteBuffer) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, options);
        if (decodeByteArray != null) {
            decodeByteArray.copyPixelsToBuffer(byteBuffer);
        }
    }

    public static int[] getDimension(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return new int[]{options.outWidth, options.outHeight};
    }

    public static int[] getDimensionFromByteArray(byte[] bArr, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, i, options);
        return new int[]{options.outWidth, options.outHeight};
    }
}
