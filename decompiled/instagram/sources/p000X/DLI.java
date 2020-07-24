package p000X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* renamed from: X.DLI */
public interface DLI {
    void A9N(String str);

    void Bg2(MediaFormat mediaFormat);

    void BjK(int i);

    void Bll(MediaFormat mediaFormat);

    boolean BqI();

    void BuT(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    void Bui(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    void start();
}
