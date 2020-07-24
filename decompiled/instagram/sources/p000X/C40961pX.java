package p000X;

import java.util.Set;

/* renamed from: X.1pX  reason: invalid class name and case insensitive filesystem */
public final class C40961pX implements C39681nJ {
    public final /* synthetic */ C40911pS A00;
    public final /* synthetic */ C31591Yx A01;
    public final /* synthetic */ C37671k2 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Set A05;
    public final /* synthetic */ Set A06;
    public final /* synthetic */ boolean A07;

    public C40961pX(C31591Yx r1, String str, Set set, C37671k2 r4, C40911pS r5, Set set2, boolean z, String str2) {
        this.A01 = r1;
        this.A03 = str;
        this.A06 = set;
        this.A02 = r4;
        this.A00 = r5;
        this.A05 = set2;
        this.A07 = z;
        this.A04 = str2;
    }

    public final void BV8(boolean z) {
        if (z) {
            this.A06.remove(this.A02);
            C31591Yx.A02(this.A01, this.A00, this.A03, this.A06, this.A05);
            this.A01.A06(new AnonymousClass89L(this));
        }
    }

    public final void BV9(boolean z) {
        C12670hC.A04(new C44801wm(this, z));
    }
}
