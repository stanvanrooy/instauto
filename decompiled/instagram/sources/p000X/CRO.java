package p000X;

import com.facebook.C0003R;
import java.util.List;

/* renamed from: X.CRO */
public final class CRO implements C27729COx {
    public final /* synthetic */ CRL A00;

    public final void BCl(String str) {
    }

    public CRO(CRL crl) {
        this.A00 = crl;
    }

    public final void B47(boolean z, String str, Throwable th) {
        C13150hy.A02(str, "query");
        this.A00.A03.A0B(false);
        CRL.A00(this.A00, C27785CRd.A00);
        CRS crs = this.A00.A01;
        if (crs != null) {
            AnonymousClass5F9.A00(crs.A00.getContext(), C0003R.string.network_error);
        }
    }

    public final void B8V(List list, boolean z, boolean z2, String str) {
        C13150hy.A02(list, "items");
        C13150hy.A02(str, "query");
        CRL.A00(this.A00, new CRJ(this, z, list, z2));
    }

    public final void BPf(C27690CNk cNk, boolean z, String str) {
        C13150hy.A02(cNk, "response");
        C13150hy.A02(str, "query");
        C27797CRp cRp = this.A00.A03;
        cRp.A00 = cNk.A00;
        cRp.A0B(true);
        CRL.A00(this.A00, new CRZ(cNk));
        List AOJ = cNk.AOJ();
        C13150hy.A01(AOJ, "response.items");
        B8V(AOJ, z, cNk.Abr(), str);
    }

    public final boolean isEmpty() {
        return this.A00.A00.A02.isEmpty();
    }
}
