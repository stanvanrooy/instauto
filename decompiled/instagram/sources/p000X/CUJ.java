package p000X;

import com.facebook.C0003R;
import java.util.Collections;
import java.util.List;

/* renamed from: X.CUJ */
public final class CUJ extends C17920r1 {
    public final /* synthetic */ CUT A00;
    public final /* synthetic */ CUR A01;

    public CUJ(CUT cut, CUR cur) {
        this.A00 = cut;
        this.A01 = cur;
    }

    public final void onFail(C43791v5 r8) {
        Throwable th;
        int A03 = AnonymousClass0Z0.A03(-1884766479);
        super.onFail(r8);
        this.A00.A05.put(this.A01, CUW.NEEDS_RETRY);
        CUR cur = this.A01;
        Integer num = Constants.ONE;
        cur.A00 = num;
        C27864CUe cUe = this.A00.A03;
        if (r8.A02()) {
            th = r8.A01;
        } else {
            th = null;
        }
        CUL cul = cUe.A00.A03;
        cur.A00 = num;
        CUL.A00(cul);
        AnonymousClass5F9.A00(cUe.A00.getContext(), C0003R.string.product_source_network_error);
        CNV cnv = cUe.A00.A04;
        Integer num2 = cur.A01;
        AnonymousClass0P4 A002 = CNV.A00(cnv, "catalog_load_more_failure");
        A002.A0G("products_source_type", CUS.A01(num2));
        if (th != null) {
            A002.A0H("error_message", th.getMessage());
        }
        CNV.A01(cnv, A002);
        AnonymousClass0Z0.A0A(210220493, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(210287294);
        CUU cuu = (CUU) obj;
        int A032 = AnonymousClass0Z0.A03(-885008352);
        super.onSuccess(cuu);
        this.A00.A05.put(this.A01, CUW.LOADED);
        C27864CUe cUe = this.A00.A03;
        CUR cur = this.A01;
        List unmodifiableList = Collections.unmodifiableList(cuu.A01);
        boolean z = cuu.A02;
        String AQs = cuu.AQs();
        CUL cul = cUe.A00.A03;
        cur.A00 = Constants.A0C;
        cur.A05 = z;
        cur.A02 = AQs;
        cur.A04.addAll(unmodifiableList);
        CUL.A00(cul);
        CNV cnv = cUe.A00.A04;
        Integer num = cur.A01;
        AnonymousClass0P4 A002 = CNV.A00(cnv, "catalog_load_more_success");
        A002.A0G("products_source_type", CUS.A01(num));
        CNV.A01(cnv, A002);
        AnonymousClass0Z0.A0A(1987231898, A032);
        AnonymousClass0Z0.A0A(385102232, A03);
    }
}
