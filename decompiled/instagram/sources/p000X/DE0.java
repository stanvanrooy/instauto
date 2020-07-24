package p000X;

import java.nio.ByteBuffer;

/* renamed from: X.DE0 */
public final class DE0 extends DEJ implements C29868DEd {
    public final void ABR(ByteBuffer byteBuffer, int i) {
        byte b = 0;
        int A00 = DD7.A00(byteBuffer, i, 0);
        if (A00 != 0) {
            b = byteBuffer.get(A00);
        }
        this.A00 = b;
        Class<DEB> cls = DEB.class;
        this.A01 = (DEK) DD7.A01(byteBuffer, i, 1, cls);
        this.A02 = (DEK) DD7.A01(byteBuffer, i, 2, cls);
    }
}
