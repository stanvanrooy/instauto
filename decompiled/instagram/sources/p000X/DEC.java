package p000X;

import java.nio.ByteBuffer;

/* renamed from: X.DEC */
public final class DEC extends DEK implements C29869DEe {
    public final void ABR(ByteBuffer byteBuffer, int i) {
        this.A00 = byteBuffer.getFloat(i);
        this.A01 = byteBuffer.getFloat(i + 4);
    }
}
