package p000X;

import android.view.View;
import com.facebook.C0003R;
import com.instagram.business.insights.fragment.InsightsStoryGridFragment;

/* renamed from: X.C8T */
public final class C8T implements View.OnClickListener {
    public final /* synthetic */ InsightsStoryGridFragment A00;

    public C8T(InsightsStoryGridFragment insightsStoryGridFragment) {
        this.A00 = insightsStoryGridFragment;
    }

    public final void onClick(View view) {
        C26808Bst[] bstArr;
        int length;
        String str;
        int A05 = AnonymousClass0Z0.A05(1461437507);
        InsightsStoryGridFragment insightsStoryGridFragment = this.A00;
        String[] strArr = new String[insightsStoryGridFragment.A02.length];
        int i = 0;
        while (true) {
            bstArr = insightsStoryGridFragment.A02;
            length = bstArr.length;
            if (i >= length) {
                break;
            }
            strArr[i] = insightsStoryGridFragment.getString(bstArr[i].A00);
            i++;
        }
        Integer num = Constants.A09;
        Integer num2 = Constants.A08;
        if (1 - Constants.ZERO.intValue() != 0) {
            str = "ORDER";
        } else {
            str = "TIME_FRAME";
        }
        C8R c8r = insightsStoryGridFragment.A01;
        AnonymousClass0a4.A06(c8r);
        C26808Bst bst = ((C8M) c8r).A00;
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
        insightsStoryGridFragment.A04(num, num2, str, C0003R.string.post_grid_filter_metric_title, i2, strArr);
        AnonymousClass0Z0.A0C(-780634537, A05);
    }
}
