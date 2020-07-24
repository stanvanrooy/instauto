package p000X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.facebook.C0003R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CJN */
public final class CJN extends C689130g {
    public C27586CJf A00;
    public C27581CJa A01;
    public String A02;
    public String A03;
    public final Context A04;
    public final C27593CJm A05;
    public final C27594CJn A06;
    public final C27564CIi A07;
    public final C146056Mg A08;
    public final List A09 = new ArrayList();
    public final List A0A = new ArrayList();
    public final C29381Pr A0B;
    public final C27565CIj A0C;
    public final CJ0 A0D;

    public static void A00(CJN cjn) {
        C27586CJf cJf;
        C27586CJf cJf2;
        C25963BdH bdH;
        cjn.clear();
        String str = cjn.A03;
        if (str != null) {
            cjn.addModel(str, new C27563CIf(false, (Integer) null, (Integer) null, (Integer) null, (Integer) null), cjn.A0C);
        }
        List list = cjn.A0A;
        if (list == null || list.isEmpty()) {
            cJf = null;
        } else {
            cJf = null;
            for (C27586CJf cJf3 : cjn.A0A) {
                if (cJf3.A05) {
                    cJf = cJf3;
                }
                cjn.addModel(cJf3, cjn.A01, cjn.A0D);
            }
        }
        if (cjn.A00 != null && cjn.A01 == C27581CJa.RADIO_BUTTONS) {
            boolean z = false;
            if (cJf != null) {
                cJf2 = cJf;
            } else {
                cJf2 = (C27586CJf) cjn.A0A.get(0);
            }
            if (!(cJf2 == null || (bdH = cJf2.A00) == null)) {
                cjn.addModel(bdH.A00, new C27563CIf(false, (Integer) null, (Integer) null, (Integer) null, (Integer) null), cjn.A07);
                AnonymousClass6NM r6 = new AnonymousClass6NM();
                Resources resources = cjn.A04.getResources();
                C146056Mg r2 = C146056Mg.HIDE_AD_BUTTON;
                C146056Mg r1 = cjn.A08;
                int i = C0003R.string.submit_report_action_button_text;
                if (r2 == r1) {
                    i = C0003R.string.hide_ad_action_button_text;
                }
                r6.A03 = new C25963BdH(resources.getString(i));
                r6.A00 = AnonymousClass6NO.REPORT_CONTENT;
                if (cJf != null) {
                    z = true;
                }
                cjn.addModel(r6, new C27599CJs(0, z), cjn.A06);
            }
        }
        if (!cjn.A09.isEmpty()) {
            if (!TextUtils.isEmpty(cjn.A02)) {
                cjn.addModel(cjn.A02, new C27563CIf(false, Integer.valueOf(C0003R.dimen.bottom_sheet_zero_padding), Integer.valueOf(C0003R.dimen.row_padding), (Integer) null, (Integer) null), cjn.A07);
            }
            AnonymousClass6NM r3 = (AnonymousClass6NM) cjn.A09.get(0);
            switch (r3.A00.ordinal()) {
                case 0:
                    cjn.addModel(r3, new C27599CJs(0, true), cjn.A06);
                    break;
                case 2:
                case 4:
                case 5:
                case 9:
                    cjn.addModel(r3, new C27599CJs(0, true), cjn.A05);
                    break;
            }
        }
        cjn.addModel((Object) null, cjn.A0B);
        cjn.updateListView();
    }

    public final void A01(String str, String str2, List list, List list2, C27586CJf cJf, C27581CJa cJa) {
        this.A03 = str;
        this.A02 = str2;
        this.A0A.clear();
        if (list != null && !list.isEmpty()) {
            this.A0A.addAll(list);
        }
        this.A09.clear();
        if (list2 != null && !list2.isEmpty()) {
            this.A09.addAll(list2);
        }
        this.A00 = cJf;
        this.A01 = cJa;
        A00(this);
    }

    public CJN(Context context, CJ3 cj3, C27600CJt cJt, C146056Mg r8, boolean z) {
        this.A04 = context;
        this.A0D = new CJ0(context, cj3, !z);
        this.A0C = new C27565CIj(context);
        this.A07 = new C27564CIi(context);
        this.A06 = new C27594CJn(context, cJt);
        this.A05 = new C27593CJm(context, cJt);
        C29381Pr r2 = new C29381Pr();
        this.A0B = r2;
        r2.A00(context.getResources().getDimensionPixelSize(C0003R.dimen.bottom_sheet_bottom));
        this.A08 = r8;
        init(this.A0D, this.A0C, this.A07, this.A06, this.A05, this.A0B);
    }
}
