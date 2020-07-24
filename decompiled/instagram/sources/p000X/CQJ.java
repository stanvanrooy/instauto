package p000X;

import android.content.Context;
import com.facebook.C0003R;
import java.util.List;

/* renamed from: X.CQJ */
public final class CQJ implements C27729COx {
    public final /* synthetic */ CQG A00;

    public final void BCl(String str) {
    }

    public CQJ(CQG cqg) {
        this.A00 = cqg;
    }

    public final void B47(boolean z, String str, Throwable th) {
        C13150hy.A02(str, "query");
        CQG.A00(this.A00, CQX.A00);
        CQM cqm = this.A00.A01;
        if (cqm != null) {
            CQF cqf = cqm.A00;
            Context context = cqf.getContext();
            if (context == null) {
                C13150hy.A00();
            }
            C13150hy.A01(context, "context!!");
            if (cqf.isResumed()) {
                AnonymousClass5F9.A00(context, C0003R.string.network_error);
            }
        }
    }

    public final void B8V(List list, boolean z, boolean z2, String str) {
        C13150hy.A02(list, "items");
        C13150hy.A02(str, "query");
        CQG.A00(this.A00, new CQP(this, z, list, z2));
    }

    public final void BPf(C27690CNk cNk, boolean z, String str) {
        C13150hy.A02(cNk, "response");
        C13150hy.A02(str, "query");
        CQG.A00(this.A00, new CQR(cNk));
        List AOJ = cNk.AOJ();
        C13150hy.A01(AOJ, "response.items");
        B8V(AOJ, z, cNk.Abr(), str);
    }

    public final boolean isEmpty() {
        return this.A00.A00.A02.isEmpty();
    }
}
