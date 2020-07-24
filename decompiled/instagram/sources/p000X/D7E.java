package p000X;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: X.D7E */
public final class D7E {
    public static void A00(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(AnonymousClass000.A05("csd-", i), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }
}
