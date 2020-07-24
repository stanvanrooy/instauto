package p000X;

import android.view.View;
import com.facebook.C0003R;
import com.instagram.business.insights.fragment.InsightsStoryGridFragment;

/* renamed from: X.C8S */
public final class C8S implements View.OnClickListener {
    public final /* synthetic */ InsightsStoryGridFragment A00;

    public C8S(InsightsStoryGridFragment insightsStoryGridFragment) {
        this.A00 = insightsStoryGridFragment;
    }

    public final void onClick(View view) {
        Integer[] numArr;
        int length;
        String str;
        int A05 = AnonymousClass0Z0.A05(1543092988);
        InsightsStoryGridFragment insightsStoryGridFragment = this.A00;
        String[] strArr = new String[InsightsStoryGridFragment.A05.length];
        int i = 0;
        while (true) {
            numArr = InsightsStoryGridFragment.A05;
            length = numArr.length;
            if (i >= length) {
                break;
            }
            strArr[i] = insightsStoryGridFragment.getString(C26809Bsu.A00(numArr[i]));
            i++;
        }
        Integer num = Constants.A09;
        Integer num2 = Constants.A08;
        if (1 - Constants.ONE.intValue() != 0) {
            str = "ORDER";
        } else {
            str = "TIME_FRAME";
        }
        C8R c8r = insightsStoryGridFragment.A01;
        AnonymousClass0a4.A06(c8r);
        Integer num3 = ((C8M) c8r).A01;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                if (numArr[i2] == num3) {
                    break;
                }
                i2++;
            } else {
                i2 = 0;
                break;
            }
        }
        insightsStoryGridFragment.A04(num, num2, str, C0003R.string.post_grid_filter_time_period_title, i2, strArr);
        AnonymousClass0Z0.A0C(292041951, A05);
    }
}
