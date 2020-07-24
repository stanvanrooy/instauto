package p000X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.B9I */
public final class B9I {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public boolean A04;
    public boolean A05;
    public final AVM A06;
    public final Map A07 = new HashMap();

    public B9I(AVM avm, boolean z) {
        this.A06 = avm;
        this.A05 = z;
        this.A02 = avm.now();
        this.A00 = 0;
        this.A01 = 0;
        this.A03 = 0;
    }
}
