package p000X;

import java.nio.ByteBuffer;

/* renamed from: X.DDD */
public abstract class DDD implements C29871DEg {
    public float[] A00;
    public DDG[] A01;

    public void ABl(ByteBuffer byteBuffer, int i) {
        this.A00 = C29825DCj.A05(byteBuffer, i, 2);
        this.A01 = (DDG[]) C29825DCj.A07(byteBuffer, i, 3, DDG.class);
    }
}
