package p000X;

import java.nio.ByteBuffer;

/* renamed from: X.DDI */
public final class DDI extends C29877DEm implements C29869DEe {
    public final void ABR(ByteBuffer byteBuffer, int i) {
        if (DD3.A04(byteBuffer, i, 0) != null) {
            int A00 = DD3.A00(byteBuffer, i, 1);
            if (A00 != 0) {
                byteBuffer.getFloat(A00);
            }
            int A002 = DD3.A00(byteBuffer, i, 2);
            if (A002 != 0) {
                byteBuffer.getFloat(A002);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("name cannot be null");
    }
}
