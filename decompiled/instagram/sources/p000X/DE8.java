package p000X;

import java.nio.ByteBuffer;

/* renamed from: X.DE8 */
public final class DE8 extends DE7 implements C29869DEe {
    public final void ABR(ByteBuffer byteBuffer, int i) {
        float[] A06 = DD3.A06(byteBuffer, i, 0);
        if (A06 != null) {
            this.A01 = A06;
            this.A00 = A06.length;
            return;
        }
        throw new IllegalArgumentException("values cannot be null");
    }
}
