package p000X;

import android.content.Context;
import com.facebook.C0003R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.CIh */
public final class CIh extends C689130g {
    public C26008Be2 A00;
    public C27581CJa A01;
    public String A02;
    public final List A03 = new ArrayList();
    public final Context A04;
    public final C27561CId A05;
    public final C27564CIi A06;
    public final C27565CIj A07;
    public final C103594dm A08;
    public final CJ0 A09;

    public static void A00(CIh cIh) {
        cIh.clear();
        String str = cIh.A02;
        if (str != null) {
            cIh.addModel(str, new C27563CIf(false, (Integer) null, (Integer) null, (Integer) null, (Integer) null), cIh.A07);
        }
        for (C27586CJf cJf : cIh.A03) {
            C27581CJa cJa = cIh.A01;
            if (cJa == null) {
                cJa = C27581CJa.LIST;
            }
            cIh.addModel(cJf, cJa, cIh.A09);
        }
        C26008Be2 be2 = cIh.A00;
        if (be2 != null) {
            C25963BdH bdH = be2.A01;
            if (bdH != null) {
                String str2 = bdH.A00;
                boolean z = be2.A03;
                int i = C0003R.C0004drawable.instagram_chevron_up_outline_24;
                if (z) {
                    i = C0003R.C0004drawable.instagram_chevron_down_outline_24;
                }
                cIh.addModel(str2, new C27563CIf(true, (Integer) null, (Integer) null, (Integer) null, Integer.valueOf(i)), cIh.A05);
            }
            C26008Be2 be22 = cIh.A00;
            if (!be22.A03) {
                C25963BdH bdH2 = be22.A00;
                if (bdH2 != null) {
                    cIh.addModel(bdH2.A00, new C27563CIf(false, Integer.valueOf(C0003R.dimen.bottom_sheet_zero_padding), Integer.valueOf(C0003R.dimen.bullet_policy_vertical_padding), (Integer) null, (Integer) null), cIh.A06);
                }
                for (C26006Be0 be0 : Collections.unmodifiableList(cIh.A00.A02)) {
                    cIh.addModel(be0.A00.A00(), cIh.A08);
                }
            }
        }
        cIh.updateListView();
    }

    public CIh(Context context, CJ3 cj3, CJ4 cj4) {
        this.A04 = context;
        CJ0 cj0 = new CJ0(context, cj3, false);
        this.A09 = cj0;
        C27565CIj cIj = new C27565CIj(context);
        this.A07 = cIj;
        C27564CIi cIi = new C27564CIi(context);
        this.A06 = cIi;
        C27561CId cId = new C27561CId(context, cj4);
        this.A05 = cId;
        C103594dm r2 = new C103594dm(context);
        this.A08 = r2;
        init(cj0, cIj, cIi, cId, r2);
    }
}
