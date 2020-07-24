package p000X;

import java.nio.ByteBuffer;

/* renamed from: X.DE1 */
public final class DE1 extends C29855DDq implements C29869DEe {
    public final void ABR(ByteBuffer byteBuffer, int i) {
        DED[] dedArr = (DED[]) DD3.A07(byteBuffer, i, 0, 4, DE6.class);
        if (dedArr != null) {
            this.A01 = dedArr;
            this.A00 = dedArr.length;
            return;
        }
        throw new IllegalArgumentException("colors cannot be null");
    }
}
