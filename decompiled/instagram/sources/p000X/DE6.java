package p000X;

import java.nio.ByteBuffer;

/* renamed from: X.DE6 */
public final class DE6 extends DED implements C29869DEe {
    public final void ABR(ByteBuffer byteBuffer, int i) {
        this.A03 = byteBuffer.get(i) & 255;
        this.A02 = byteBuffer.get(i + 1) & 255;
        this.A01 = byteBuffer.get(i + 2) & 255;
        this.A00 = byteBuffer.get(i + 3) & 255;
    }
}
