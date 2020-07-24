package p000X;

import java.util.Collection;
import java.util.Map;

/* renamed from: X.1u1  reason: invalid class name and case insensitive filesystem */
public final class C43211u1 extends C43221u2 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C43161tv A01;
    public final /* synthetic */ boolean A02;

    public C43211u1(C43161tv r1, boolean z, int i) {
        this.A01 = r1;
        this.A02 = z;
        this.A00 = i;
    }

    public final void A00(Map map) {
        if (this.A02) {
            Collection values = map.values();
            int i = this.A00;
            C43161tv r0 = this.A01;
            C46471zn.A01(values, i, r0.A03, r0.A04, r0.A02, r0.A07, r0.A01);
        }
    }
}
