package p000X;

import android.view.View;
import com.facebook.C0003R;
import com.instagram.business.insights.fragment.InsightsPostGridFragment;

/* renamed from: X.C8K */
public final class C8K implements View.OnClickListener {
    public final /* synthetic */ InsightsPostGridFragment A00;

    public C8K(InsightsPostGridFragment insightsPostGridFragment) {
        this.A00 = insightsPostGridFragment;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-1335994621);
        InsightsPostGridFragment insightsPostGridFragment = this.A00;
        Integer[] A002 = Constants.ZERO(5);
        int length = A002.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = insightsPostGridFragment.getString(C8c.A00(A002[i]));
        }
        Integer num = Constants.A0K;
        Integer num2 = Constants.A0J;
        String A003 = C27312C8f.A00(Constants.ZERO);
        C8R c8r = insightsPostGridFragment.A01;
        AnonymousClass0a4.A06(c8r);
        insightsPostGridFragment.A04(num, num2, A003, C0003R.string.post_grid_filter_post_type_title, ((C8L) c8r).A01.intValue(), strArr);
        AnonymousClass0Z0.A0C(-1684017747, A05);
    }
}
