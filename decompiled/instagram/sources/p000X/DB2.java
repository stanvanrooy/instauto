package p000X;

import android.media.MediaCodec;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

/* renamed from: X.DB2 */
public final class DB2 {
    public MediaCodec.BufferInfo A00;
    public final WeakReference A01;

    public DB2(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.A01 = new WeakReference(byteBuffer);
        this.A00 = bufferInfo;
    }
}
