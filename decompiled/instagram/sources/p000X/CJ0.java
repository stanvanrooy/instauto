package p000X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.CJ0 */
public final class CJ0 extends C689230h {
    public final Context A00;
    public final CJ3 A01;
    public final boolean A02;

    public final void A72(C29491Qc r2, Object obj, Object obj2) {
        r2.A00(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public CJ0(Context context, CJ3 cj3, boolean z) {
        this.A00 = context;
        this.A01 = cj3;
        this.A02 = z;
    }

    public final View AaJ(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = AnonymousClass0Z0.A03(2056004866);
        if (view == null) {
            view = LayoutInflater.from(this.A00).inflate(C0003R.layout.reporting_report_tag_row, (ViewGroup) null);
            view.setTag(new CJ1(view));
        }
        CJ1 cj1 = (CJ1) view.getTag();
        C27586CJf cJf = (C27586CJf) obj;
        C27581CJa cJa = (C27581CJa) obj2;
        CJ3 cj3 = this.A01;
        boolean z = this.A02;
        cj1.A02.setText(cJf.A01.A00);
        C33781dU.A00(cj1.A02, Constants.ONE);
        cj1.A00.setOnClickListener(new CJ2(cj3, cJf));
        if (z) {
            cj1.A00.setPadding(0, 0, 0, 0);
            TextView textView = cj1.A02;
            textView.setHeight(textView.getResources().getDimensionPixelSize(C0003R.dimen.fixed_tag_row_height));
        } else {
            int dimensionPixelSize = cj1.A00.getResources().getDimensionPixelSize(C0003R.dimen.row_text_padding);
            cj1.A00.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
            ViewGroup.LayoutParams layoutParams = cj1.A02.getLayoutParams();
            layoutParams.height = -2;
            cj1.A02.setLayoutParams(layoutParams);
        }
        switch (cJa.ordinal()) {
            case 0:
            case 1:
                cj1.A01.setVisibility(8);
                break;
            case 2:
                cj1.A01.setVisibility(0);
                cj1.A01.setChecked(cJf.A05);
                break;
        }
        cj3.BIn(cJf);
        AnonymousClass0Z0.A0A(1246337017, A03);
        return view;
    }
}
