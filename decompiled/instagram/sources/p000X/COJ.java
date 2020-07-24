package p000X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0003R;
import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.COJ */
public final class COJ extends C29121Or {
    public final Context A00;
    public final C27707COb A01;

    public final void A72(C29491Qc r2, Object obj, Object obj2) {
        r2.A00(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public COJ(Context context, C27707COb cOb) {
        this.A00 = context;
        this.A01 = cOb;
    }

    public final void A6f(int i, View view, Object obj, Object obj2) {
        String str;
        int A03 = AnonymousClass0Z0.A03(-1021623193);
        COY coy = (COY) view.getTag();
        C27707COb cOb = this.A01;
        C27706COa cOa = (C27706COa) obj;
        C13300iJ r3 = cOa.A01;
        coy.A00.setOnClickListener(new COI(cOb, cOa));
        coy.A03.setUrl(r3.ASv());
        coy.A02.setText(r3.AZn());
        C466820l.A05(coy.A02, r3.A0s());
        String AMN = r3.AMN();
        if (cOa.A00 > 0) {
            Resources resources = coy.A00.getResources();
            int i2 = cOa.A00;
            str = resources.getQuantityString(C0003R.plurals.suggested_products_count, i2, new Object[]{Integer.valueOf(i2)});
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(AMN)) {
                AMN = StringFormatUtil.formatStrLocaleSafe("%s ∙ %s", AMN, str);
            } else {
                AMN = str;
            }
        }
        if (TextUtils.isEmpty(AMN)) {
            coy.A01.setVisibility(8);
        } else {
            coy.A01.setVisibility(0);
            coy.A01.setText(AMN);
        }
        AnonymousClass0Z0.A0A(856688957, A03);
    }

    public final View ABB(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0Z0.A03(-1059649954);
        View inflate = LayoutInflater.from(this.A00).inflate(C0003R.layout.highlighted_products_partner_row, viewGroup, false);
        inflate.setTag(new COY(inflate));
        AnonymousClass0Z0.A0A(-1980144584, A03);
        return inflate;
    }
}
