package p000X;

import java.nio.ByteBuffer;
import java.util.HashMap;

/* renamed from: X.DD2 */
public final class DD2 extends C29835DCw implements C29869DEe {
    public final void ABR(ByteBuffer byteBuffer, int i) {
        byte[] A05 = DD3.A05(byteBuffer, i, 0);
        if (A05 != null) {
            this.A03 = A05;
            this.A01 = (C29866DEb) DD3.A01(byteBuffer, i, 1, DD5.class);
            DD9[] dd9Arr = (DD9[]) DD3.A08(byteBuffer, i, 2, DD9.class);
            if (dd9Arr != null) {
                this.A04 = dd9Arr;
                int i2 = 0;
                int A00 = DD3.A00(byteBuffer, i, 3);
                if (A00 != 0) {
                    i2 = byteBuffer.getInt(A00);
                }
                this.A00 = i2;
                this.A02 = new HashMap();
                for (DDK ddk : this.A04) {
                    ddk.A02.A00(this.A02);
                }
                return;
            }
            throw new IllegalArgumentException("scenes cannot be null");
        }
        throw new IllegalArgumentException("manifest cannot be null");
    }
}
