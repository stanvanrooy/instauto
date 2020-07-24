package p000X;

import android.view.View;
import com.facebook.C0003R;
import com.instagram.business.insights.fragment.InsightsPostGridFragment;

/* renamed from: X.C8F */
public final class C8F implements View.OnClickListener {
    public final /* synthetic */ InsightsPostGridFragment A00;

    public C8F(InsightsPostGridFragment insightsPostGridFragment) {
        this.A00 = insightsPostGridFragment;
    }

    public final void onClick(View view) {
        C26808Bst[] bstArr;
        int A05 = AnonymousClass0Z0.A05(-1828681569);
        InsightsPostGridFragment insightsPostGridFragment = this.A00;
        if (C27296C7m.A00(Constants.ONE).equals(insightsPostGridFragment.A01())) {
            bstArr = this.A00.A02;
        } else {
            bstArr = this.A00.A01;
        }
        int length = bstArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = insightsPostGridFragment.getString(bstArr[i].A00);
        }
        Integer num = Constants.A0K;
        Integer num2 = Constants.A0J;
        String A002 = C27312C8f.A00(Constants.A0C);
        C8R c8r = insightsPostGridFragment.A01;
        AnonymousClass0a4.A06(c8r);
        C26808Bst bst = ((C8L) c8r).A00;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                if (bstArr[i2] == bst) {
                    break;
                }
                i2++;
            } else {
                i2 = 0;
                break;
            }
        }
        insightsPostGridFragment.A04(num, num2, A002, C0003R.string.post_grid_filter_metric_title, i2, strArr);
        AnonymousClass0Z0.A0C(1681286311, A05);
    }
}
