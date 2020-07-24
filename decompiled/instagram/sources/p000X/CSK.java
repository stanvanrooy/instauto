package p000X;

import com.facebook.C0003R;
import java.util.List;

/* renamed from: X.CSK */
public final class CSK implements C27729COx {
    public final /* synthetic */ CSB A00;

    public final void BCl(String str) {
    }

    public CSK(CSB csb) {
        this.A00 = csb;
    }

    public final void B47(boolean z, String str, Throwable th) {
        C13150hy.A02(str, "query");
        this.A00.A03.A0A(str, (List) null, Boolean.valueOf(z), (Boolean) null, false);
        CSB.A00(this.A00, CT3.A00);
        CSC csc = this.A00.A01;
        if (csc != null) {
            AnonymousClass5F9.A00(csc.A00.requireContext(), C0003R.string.network_error);
        }
    }

    public final void B8V(List list, boolean z, boolean z2, String str) {
        C13150hy.A02(list, "items");
        C13150hy.A02(str, "query");
        CTH cth = this.A00.A03;
        cth.A0A(str, list, Boolean.valueOf(z), Boolean.valueOf(z2), true);
        CSB.A00(this.A00, new CSG(this, z, list, z2));
    }

    public final void BPf(C27690CNk cNk, boolean z, String str) {
        C13150hy.A02(cNk, "response");
        C13150hy.A02(str, "query");
        List AOJ = cNk.AOJ();
        C13150hy.A01(AOJ, "response.items");
        B8V(AOJ, z, cNk.Abr(), str);
    }

    public final boolean isEmpty() {
        return this.A00.A00.A01.isEmpty();
    }
}
