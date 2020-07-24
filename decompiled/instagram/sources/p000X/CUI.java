package p000X;

import android.view.View;

/* renamed from: X.CUI */
public final class CUI implements View.OnClickListener {
    public final /* synthetic */ C53822Um A00;
    public final /* synthetic */ CUR A01;

    public CUI(C53822Um r1, CUR cur) {
        this.A00 = r1;
        this.A01 = cur;
    }

    public final void onClick(View view) {
        String str;
        int A05 = AnonymousClass0Z0.A05(259381561);
        C53822Um r4 = this.A00;
        CUR cur = this.A01;
        Integer num = cur.A00;
        Integer num2 = Constants.ZERO;
        if (num != num2) {
            cur.A00 = num2;
            r4.A03.notifyDataSetChanged();
            CUT cut = r4.A05;
            String str2 = r4.A09;
            Object obj = cut.A05.get(cur);
            CUW cuw = CUW.LOADING;
            if (obj != cuw) {
                cut.A05.put(cur, cuw);
                C15890nh r2 = new C15890nh(cut.A02);
                r2.A09 = Constants.A0N;
                String str3 = cut.A04;
                Object[] objArr = new Object[1];
                switch (cur.A01.intValue()) {
                    case 1:
                        str = "BUSINESS_MANAGER";
                        break;
                    case 2:
                        str = "SHARED_WITH_BUSINESS";
                        break;
                    default:
                        str = "FACEBOOK_PAGE";
                        break;
                }
                objArr[0] = str;
                r2.A0C = C06360Ot.formatString(str3, objArr);
                r2.A0A("initially_selected_catalog_id", str2);
                r2.A0A("max_id", cur.AQs());
                r2.A06(CUP.class, false);
                C17850qu A03 = r2.A03();
                A03.A00 = new CUJ(cut, cur);
                C28351Lj.A00(cut.A00, cut.A01, A03);
            }
            CNV cnv = r4.A04;
            Integer num3 = cur.A01;
            AnonymousClass0P4 A002 = CNV.A00(cnv, "catalog_load_more_start");
            A002.A0G("products_source_type", CUS.A01(num3));
            CNV.A01(cnv, A002);
        }
        AnonymousClass0Z0.A0C(-1617499242, A05);
    }
}
