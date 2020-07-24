package p000X;

import com.facebook.C0003R;
import java.util.List;

/* renamed from: X.CSL */
public final class CSL implements C27729COx {
    public final /* synthetic */ CS8 A00;

    public final void BCl(String str) {
    }

    public CSL(CS8 cs8) {
        this.A00 = cs8;
    }

    public final void B47(boolean z, String str, Throwable th) {
        C13150hy.A02(str, "query");
        this.A00.A03.A0B(false);
        CS8.A00(this.A00, CT4.A00);
        CS9 cs9 = this.A00.A01;
        if (cs9 != null) {
            AnonymousClass5F9.A00(cs9.A00.requireContext(), C0003R.string.network_error);
        }
    }

    public final void B8V(List list, boolean z, boolean z2, String str) {
        C13150hy.A02(list, "items");
        C13150hy.A02(str, "query");
        CS8.A00(this.A00, new CSZ(this, z, list, z2));
    }

    public final void BPf(C27690CNk cNk, boolean z, String str) {
        C13150hy.A02(cNk, "response");
        C13150hy.A02(str, "query");
        CTH cth = this.A00.A03;
        cth.A00 = cNk.A00;
        cth.A0B(true);
        List AOJ = cNk.AOJ();
        C13150hy.A01(AOJ, "response.items");
        B8V(AOJ, z, cNk.Abr(), str);
    }

    public final boolean isEmpty() {
        return this.A00.A00.A01.isEmpty();
    }
}
