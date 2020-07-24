package p000X;

import java.nio.ByteBuffer;

/* renamed from: X.DDQ */
public final class DDQ extends C29867DEc implements C29868DEd {
    public final void ABR(ByteBuffer byteBuffer, int i) {
        this.A01 = byteBuffer.getFloat(i);
        this.A00 = byteBuffer.getFloat(i + 4);
    }
}
