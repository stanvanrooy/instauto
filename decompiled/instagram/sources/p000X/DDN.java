package p000X;

import java.nio.ByteBuffer;

/* renamed from: X.DDN */
public final class DDN implements C29871DEg {
    public float A00;
    public float A01;

    public final void ABl(ByteBuffer byteBuffer, int i) {
        this.A01 = byteBuffer.getFloat(i);
        this.A00 = byteBuffer.getFloat(i + 4);
    }

    public DDN() {
    }

    public DDN(float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
    }
}
