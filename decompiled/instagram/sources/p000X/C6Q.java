package p000X;

import android.view.View;
import com.instagram.business.insights.fragment.AccountInsightsNativeFragment;

/* renamed from: X.C6Q */
public final class C6Q implements AnonymousClass1NY {
    public final /* synthetic */ AccountInsightsNativeFragment A00;

    public C6Q(AccountInsightsNativeFragment accountInsightsNativeFragment) {
        this.A00 = accountInsightsNativeFragment;
    }

    public final void BBJ(AnonymousClass2O9 r5) {
        this.A00.mQPView.removeAllViews();
        AccountInsightsNativeFragment accountInsightsNativeFragment = this.A00;
        accountInsightsNativeFragment.A03.A05(r5, (Object) null, accountInsightsNativeFragment.A02);
        AccountInsightsNativeFragment accountInsightsNativeFragment2 = this.A00;
        View A02 = accountInsightsNativeFragment2.A03.A02(0, (View) null, accountInsightsNativeFragment2.mQPView);
        this.A00.A03.A04(0, A02);
        this.A00.mQPView.addView(A02);
    }
}
