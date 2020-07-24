package p000X;

import android.media.MediaCodec;

/* renamed from: X.D8n */
public final class D8n {
    public final MediaCodec.CryptoInfo.Pattern A00 = new MediaCodec.CryptoInfo.Pattern(0, 0);
    public final MediaCodec.CryptoInfo A01;

    public static void A00(D8n d8n, int i, int i2) {
        d8n.A00.set(i, i2);
        d8n.A01.setPattern(d8n.A00);
    }

    public D8n(MediaCodec.CryptoInfo cryptoInfo) {
        this.A01 = cryptoInfo;
    }
}
