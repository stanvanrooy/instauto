package p000X;

import java.nio.ByteBuffer;

/* renamed from: X.DDF */
public abstract class DDF extends DDD implements C29871DEg {
    public C29871DEg A00;
    public C29871DEg[] A01;

    public Class A00() {
        return !(this instanceof DDU) ? !(this instanceof DDV) ? !(this instanceof DDW) ? !(this instanceof DDX) ? C29833DCu.class : C29834DCv.class : DCp.class : C29831DCs.class : DDL.class;
    }

    public final void ABl(ByteBuffer byteBuffer, int i) {
        super.ABl(byteBuffer, i);
        Class A002 = A00();
        this.A00 = C29825DCj.A02(byteBuffer, i, 0, A002);
        this.A01 = C29825DCj.A07(byteBuffer, i, 1, A002);
    }
}
