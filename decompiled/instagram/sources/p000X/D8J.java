package p000X;

import android.media.MediaCodec;
import android.os.Build;

/* renamed from: X.D8J */
public final class D8J {
    public static boolean A00(Exception exc) {
        if (Build.VERSION.SDK_INT < 21 || !(exc instanceof MediaCodec.CodecException) || !((MediaCodec.CodecException) exc).isTransient()) {
            return false;
        }
        return true;
    }
}
