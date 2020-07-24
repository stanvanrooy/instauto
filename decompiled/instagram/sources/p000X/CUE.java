package p000X;

import com.facebook.C0003R;
import com.instagram.model.shopping.ProductSource;

/* renamed from: X.CUE */
public final class CUE extends C17920r1 {
    public final /* synthetic */ C53822Um A00;
    public final /* synthetic */ C27862CUc A01;
    public final /* synthetic */ Integer A02;

    public CUE(C53822Um r1, C27862CUc cUc, Integer num) {
        this.A00 = r1;
        this.A01 = cUc;
        this.A02 = num;
    }

    public final void onFail(C43791v5 r9) {
        int A03 = AnonymousClass0Z0.A03(-598564030);
        super.onFail(r9);
        CUL cul = this.A00.A03;
        Throwable th = null;
        cul.A01.A00 = null;
        CUL.A00(cul);
        AnonymousClass5F9.A00(this.A00.getContext(), C0003R.string.product_source_network_error);
        CNV cnv = this.A00.A04;
        C27862CUc cUc = this.A01;
        String str = cUc.A01;
        String str2 = cUc.A02;
        Integer num = this.A02;
        if (r9.A02()) {
            th = r9.A01;
        }
        AnonymousClass0P4 A002 = CNV.A00(cnv, "catalog_selection_failure");
        A002.A0G("catalog_id", str);
        A002.A0G("products_source_name", str2);
        A002.A0G("products_source_type", CUS.A01(num));
        if (th != null) {
            A002.A0H("error_message", th.getMessage());
        }
        CNV.A01(cnv, A002);
        AnonymousClass0Z0.A0A(-1822435525, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0Z0.A03(2110829908);
        super.onStart();
        CNV cnv = this.A00.A04;
        C27862CUc cUc = this.A01;
        String str = cUc.A01;
        String str2 = cUc.A02;
        Integer num = this.A02;
        AnonymousClass0P4 A002 = CNV.A00(cnv, "catalog_selection_start");
        A002.A0G("catalog_id", str);
        A002.A0G("products_source_name", str2);
        A002.A0G("products_source_type", CUS.A01(num));
        CNV.A01(cnv, A002);
        AnonymousClass0Z0.A0A(217690366, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(359231841);
        int A032 = AnonymousClass0Z0.A03(-1648528793);
        super.onSuccess((C28691Ms) obj);
        CUL cul = this.A00.A03;
        cul.A01.A01 = this.A01.A01;
        CUL.A00(cul);
        CUL cul2 = this.A00.A03;
        cul2.A01.A00 = null;
        CUL.A00(cul2);
        AnonymousClass0C1 r2 = this.A00.A02;
        String str = this.A01.A01;
        C27665CMj.A05(r2, C53502Ta.CATALOG);
        r2.A06.A2C = str;
        CNV cnv = this.A00.A04;
        C27862CUc cUc = this.A01;
        String str2 = cUc.A01;
        String str3 = cUc.A02;
        Integer num = this.A02;
        cnv.A00 = new ProductSource(str2, C53502Ta.CATALOG);
        AnonymousClass0P4 A002 = CNV.A00(cnv, "catalog_selection_success");
        A002.A0G("catalog_id", str2);
        A002.A0G("products_source_name", str3);
        A002.A0G("products_source_type", CUS.A01(num));
        CNV.A01(cnv, A002);
        C53822Um r22 = this.A00;
        AnonymousClass0C1 r1 = r22.A02;
        if (!C52952Qw.A0F(r1)) {
            r1.A06.A09 = C468621e.ONBOARDED;
        }
        AnonymousClass1EW.A03(r22.getActivity()).ACu(true);
        this.A00.A0A = true;
        AnonymousClass0Z0.A0A(129254442, A032);
        AnonymousClass0Z0.A0A(-1762686446, A03);
    }
}
