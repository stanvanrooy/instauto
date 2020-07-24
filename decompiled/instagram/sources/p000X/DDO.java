package p000X;

import java.nio.ByteBuffer;

/* renamed from: X.DDO */
public final class DDO implements C29871DEg {
    public final void ABl(ByteBuffer byteBuffer, int i) {
        int i2;
        int A01 = C29825DCj.A01(byteBuffer, i, 0);
        if (A01 != 0) {
            i2 = A01 + byteBuffer.getInt(A01);
        } else {
            i2 = 0;
        }
        if (i2 != 0) {
            C29825DCj.A03(byteBuffer, i2);
        }
        int A012 = C29825DCj.A01(byteBuffer, i, 1);
        if (A012 != 0) {
            byteBuffer.getFloat(A012);
        }
        int A013 = C29825DCj.A01(byteBuffer, i, 2);
        if (A013 != 0) {
            byteBuffer.getFloat(A013);
        }
    }
}
