package p000X;

import java.nio.ByteBuffer;

/* renamed from: X.DCq */
public final class DCq implements C29871DEg {
    public byte A00;
    public DDY A01;
    public DDY A02;
    public DDX A03;
    public DDV A04;
    public DDV A05;
    public DDU A06;

    public final void ABl(ByteBuffer byteBuffer, int i) {
        Class<DDY> cls = DDY.class;
        this.A02 = (DDY) C29825DCj.A02(byteBuffer, i, 0, cls);
        this.A01 = (DDY) C29825DCj.A02(byteBuffer, i, 1, cls);
        Class<DDV> cls2 = DDV.class;
        this.A05 = (DDV) C29825DCj.A02(byteBuffer, i, 2, cls2);
        this.A04 = (DDV) C29825DCj.A02(byteBuffer, i, 3, cls2);
        byte b = 0;
        int A012 = C29825DCj.A01(byteBuffer, i, 4);
        if (A012 != 0) {
            b = byteBuffer.get(A012);
        }
        this.A00 = b;
        this.A03 = (DDX) C29825DCj.A02(byteBuffer, i, 5, DDX.class);
        this.A06 = (DDU) C29825DCj.A02(byteBuffer, i, 6, DDU.class);
    }
}
