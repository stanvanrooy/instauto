package p000X;

import java.nio.ByteBuffer;

/* renamed from: X.DDG */
public final class DDG implements C29871DEg {
    public byte A00;
    public C29831DCs A01;
    public C29831DCs A02;

    public final void ABl(ByteBuffer byteBuffer, int i) {
        byte b = 0;
        int A012 = C29825DCj.A01(byteBuffer, i, 0);
        if (A012 != 0) {
            b = byteBuffer.get(A012);
        }
        this.A00 = b;
        Class<C29831DCs> cls = C29831DCs.class;
        this.A01 = (C29831DCs) C29825DCj.A02(byteBuffer, i, 1, cls);
        this.A02 = (C29831DCs) C29825DCj.A02(byteBuffer, i, 2, cls);
    }
}
