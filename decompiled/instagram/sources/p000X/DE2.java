package p000X;

import java.nio.ByteBuffer;

/* renamed from: X.DE2 */
public final class DE2 implements C29868DEd {
    public byte A00;
    public DEB A01;
    public DEB A02;
    public DEB A03;

    public final void ABR(ByteBuffer byteBuffer, int i) {
        byte b = 0;
        int A002 = DD7.A00(byteBuffer, i, 0);
        if (A002 != 0) {
            b = byteBuffer.get(A002);
        }
        this.A00 = b;
        Class<DEB> cls = DEB.class;
        DEB deb = (DEB) DD7.A01(byteBuffer, i, 1, cls);
        if (deb != null) {
            this.A03 = deb;
            DEB deb2 = (DEB) DD7.A01(byteBuffer, i, 2, cls);
            if (deb2 != null) {
                this.A01 = deb2;
                DEB deb3 = (DEB) DD7.A01(byteBuffer, i, 3, cls);
                if (deb3 != null) {
                    this.A02 = deb3;
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("point cannot be null");
    }
}
