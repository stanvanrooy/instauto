package p000X;

import java.nio.ByteBuffer;

/* renamed from: X.DE9 */
public final class DE9 extends DE7 implements C29868DEd {
    public final void ABR(ByteBuffer byteBuffer, int i) {
        float[] A04 = DD7.A04(byteBuffer, i, 0);
        if (A04 != null) {
            this.A01 = A04;
            this.A00 = A04.length;
            return;
        }
        throw new IllegalArgumentException("values cannot be null");
    }
}
