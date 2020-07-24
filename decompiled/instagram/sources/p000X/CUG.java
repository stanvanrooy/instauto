package p000X;

import android.content.Context;
import android.view.View;
import com.facebook.C0003R;
import com.instagram.model.shopping.ProductSource;

/* renamed from: X.CUG */
public final class CUG implements View.OnClickListener {
    public final /* synthetic */ C27861CUb A00;
    public final /* synthetic */ C53822Um A01;
    public final /* synthetic */ C27862CUc A02;

    public CUG(C53822Um r1, C27862CUc cUc, C27861CUb cUb) {
        this.A01 = r1;
        this.A02 = cUc;
        this.A00 = cUb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0028, code lost:
        if (r1 <= 0) goto L_0x002a;
     */
    public final void onClick(View view) {
        boolean z;
        int A05 = AnonymousClass0Z0.A05(-2117866176);
        C53822Um r5 = this.A01;
        C27862CUc cUc = this.A02;
        Integer num = this.A00.A01;
        r5.A04.A02(new ProductSource(cUc.A01, C53502Ta.CATALOG, cUc.A02));
        Integer num2 = cUc.A00;
        if (num2 != null) {
            int intValue = num2.intValue();
            z = true;
        }
        z = false;
        if (!Boolean.valueOf(z).booleanValue()) {
            Context context = r5.getContext();
            if (context != null) {
                C112564sq.A02(context, context.getString(C0003R.string.product_source_empty_catalog_title), context.getString(C0003R.string.product_source_empty_catalog_description));
            }
        } else if (r5.A0C) {
            CUL cul = r5.A03;
            cul.A01.A01 = cUc.A01;
            CUL.A00(cul);
        } else {
            CUL cul2 = r5.A03;
            C27866CUg cUg = cul2.A01;
            if (cUg.A00 == null) {
                boolean z2 = false;
                if (r5.A06.A00 == Constants.ZERO) {
                    z2 = true;
                }
                if (!z2) {
                    String str = cUc.A01;
                    if (!str.equals(cUg.A01)) {
                        cUg.A00 = str;
                        CUL.A00(cul2);
                        AnonymousClass0C1 r0 = r5.A02;
                        String str2 = cUc.A01;
                        C15890nh r2 = new C15890nh(r0);
                        r2.A09 = Constants.ONE;
                        r2.A0C = AnonymousClass40t.$const$string(209);
                        r2.A09(AnonymousClass0C5.$const$string(212), str2);
                        r2.A06(AnonymousClass1N4.class, false);
                        r2.A0G = true;
                        C17850qu A03 = r2.A03();
                        A03.A00 = new CUE(r5, cUc, num);
                        C12810hQ.A02(A03);
                    }
                }
            }
        }
        AnonymousClass0Z0.A0C(-1814237343, A05);
    }
}
