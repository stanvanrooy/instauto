package p000X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CNf */
public final class CNf implements C27729COx {
    public final /* synthetic */ C27685CNe A00;

    public CNf(C27685CNe cNe) {
        this.A00 = cNe;
    }

    public final void B47(boolean z, String str, Throwable th) {
        C13150hy.A02(str, "query");
        this.A00.A02.A05(C53502Ta.COLLECTION, th);
        C27685CNe.A00(this.A00, C27694CNo.A00);
    }

    public final void B8V(List list, boolean z, boolean z2, String str) {
        C13150hy.A02(list, "items");
        C13150hy.A02(str, "query");
        C27685CNe.A00(this.A00, new C27687CNh(this, z, list, z2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r3.length() == 0) goto L_0x0009;
     */
    public final void BCl(String str) {
        boolean z;
        if (str != null) {
            z = false;
        }
        z = true;
        if (z) {
            this.A00.A02.A03(C53502Ta.COLLECTION);
        }
    }

    public final void BPf(C27690CNk cNk, boolean z, String str) {
        C13150hy.A02(cNk, "response");
        C13150hy.A02(str, "query");
        List<C27702CNw> AOJ = cNk.AOJ();
        C13150hy.A01(AOJ, "response.items");
        ArrayList arrayList = new ArrayList(AnonymousClass10K.A00(AOJ, 10));
        for (C27702CNw cNw : AOJ) {
            C13150hy.A01(cNw, "it");
            arrayList.add(cNw.A02);
        }
        boolean z2 = false;
        if (str.length() == 0) {
            z2 = true;
        }
        if (z2) {
            this.A00.A02.A04(C53502Ta.COLLECTION, cNk.AOJ().size(), cNk.Abr(), arrayList);
        }
        List AOJ2 = cNk.AOJ();
        C13150hy.A01(AOJ2, "response.items");
        B8V(AOJ2, z, cNk.Abr(), str);
    }

    public final boolean isEmpty() {
        return this.A00.A00.A01.isEmpty();
    }
}
