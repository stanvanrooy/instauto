package p000X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.CDW */
public final class CDW {
    public C27493CFj A00 = C27493CFj.A01;
    public final View A01;
    public final TextView A02;
    public final C27398CBr A03;
    public final CD8 A04;
    public final CGD A05;
    public final CD3 A06;
    public final C17740qj A07 = new C17740qj();
    public final AnonymousClass0PD A08 = new AnonymousClass0PD(new Handler(Looper.getMainLooper()), new CDU(this), 300);
    public final View A09;
    public final View A0A;
    public final View A0B;

    public static void A01(CDW cdw, int i, boolean z) {
        cdw.A02.setVisibility(0);
        cdw.A01.setVisibility(8);
        if (z) {
            cdw.A02.setText(StringFormatUtil.formatStrLocaleSafe("%,d", (Object) Integer.valueOf(i)));
        } else {
            cdw.A02.setText(C0003R.string.promote_audience_potential_reach_number_unavailable);
        }
    }

    public static void A02(CDW cdw, Integer num) {
        int i;
        View view;
        int i2;
        A00(cdw.A0B);
        A00(cdw.A09);
        A00(cdw.A0A);
        if (num != null) {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                case 3:
                    i = C0003R.string.promote_audience_potential_reach_too_broad;
                    break;
                case 2:
                    i = C0003R.string.promote_audience_potential_reach_too_specific;
                    break;
                case 4:
                    i = C0003R.string.promote_audience_potential_reach_great;
                    break;
                default:
                    i = C0003R.string.promote_audience_potential_reach_unavailable;
                    break;
            }
            switch (intValue) {
                case 0:
                    view = cdw.A09;
                    i2 = C0003R.color.grey_2;
                    break;
                case 1:
                case 3:
                    view = cdw.A0A;
                    break;
                case 2:
                    view = cdw.A0B;
                    break;
                case 4:
                    view = cdw.A09;
                    i2 = C0003R.color.green_5;
                    break;
                default:
                    return;
            }
            i2 = C0003R.color.red_5;
            View findViewById = view.findViewById(C0003R.C0005id.reach_rating_bar);
            TextView textView = (TextView) view.findViewById(C0003R.C0005id.reach_rating_text);
            findViewById.setBackgroundColor(C019000b.A00(view.getContext(), i2));
            textView.setVisibility(0);
            textView.setText(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if (r2 == p000X.Constants.ZERO) goto L_0x002c;
     */
    public final void A03(C27452CDu cDu) {
        boolean z;
        if (!this.A05.A00.containsKey(cDu)) {
            this.A08.A01(new C27493CFj(cDu));
            return;
        }
        C25995Bdp bdp = (C25995Bdp) this.A05.A00.get(cDu);
        int i = bdp.A00;
        if (!(i == 0 || (r2 = bdp.A01) == null)) {
            z = true;
        }
        z = false;
        A01(this, i, z);
        A02(this, bdp.A01);
    }

    public CDW(C27398CBr cBr, View view, CD3 cd3, CD8 cd8) {
        this.A03 = cBr;
        TextView textView = (TextView) view.findViewById(C0003R.C0005id.potential_reach_number_view);
        this.A02 = textView;
        textView.setText(C0003R.string.promote_audience_potential_reach_number_unavailable);
        this.A01 = view.findViewById(C0003R.C0005id.potential_reach_progress_bar);
        this.A0B = view.findViewById(C0003R.C0005id.rating_too_specific_bar_container);
        this.A09 = view.findViewById(C0003R.C0005id.rating_great_bar_container);
        this.A0A = view.findViewById(C0003R.C0005id.rating_too_broad_bar_container);
        this.A06 = cd3;
        this.A04 = cd8;
        this.A05 = cd3.A09;
        this.A08.A00 = new CGH(this);
        A01(this, 0, false);
    }

    public static void A00(View view) {
        view.findViewById(C0003R.C0005id.reach_rating_bar).setBackgroundColor(C019000b.A00(view.getContext(), C0003R.color.grey_2));
        ((TextView) view.findViewById(C0003R.C0005id.reach_rating_text)).setVisibility(8);
    }
}
