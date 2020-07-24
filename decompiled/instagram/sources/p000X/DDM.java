package p000X;

import java.nio.ByteBuffer;

/* renamed from: X.DDM */
public final class DDM extends C29865DEa implements C29869DEe {
    public final void ABR(ByteBuffer byteBuffer, int i) {
        byte[] A05 = DD3.A05(byteBuffer, i, 1);
        if (A05 != null) {
            this.A00 = A05;
            return;
        }
        throw new IllegalArgumentException("audio content cannot be null");
    }
}
