package p000X;

import android.view.View;
import com.facebook.C0003R;
import com.instagram.business.insights.fragment.InsightsPostGridFragment;

/* renamed from: X.C8U */
public final class C8U implements View.OnClickListener {
    public final /* synthetic */ InsightsPostGridFragment A00;

    public C8U(InsightsPostGridFragment insightsPostGridFragment) {
        this.A00 = insightsPostGridFragment;
    }

    public final void onClick(View view) {
        Integer[] numArr;
        int length;
        int A05 = AnonymousClass0Z0.A05(-1543724600);
        InsightsPostGridFragment insightsPostGridFragment = this.A00;
        String[] strArr = new String[InsightsPostGridFragment.A06.length];
        int i = 0;
        while (true) {
            numArr = InsightsPostGridFragment.A06;
            length = numArr.length;
            if (i >= length) {
                break;
            }
            strArr[i] = insightsPostGridFragment.getString(C26809Bsu.A00(numArr[i]));
            i++;
        }
        Integer num = Constants.A0K;
        Integer num2 = Constants.A0J;
        String A002 = C27312C8f.A00(Constants.ONE);
        C8R c8r = insightsPostGridFragment.A01;
        AnonymousClass0a4.A06(c8r);
        Integer num3 = ((C8L) c8r).A02;
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
        insightsPostGridFragment.A04(num, num2, A002, C0003R.string.post_grid_filter_time_period_title, i2, strArr);
        AnonymousClass0Z0.A0C(-494905266, A05);
    }
}
