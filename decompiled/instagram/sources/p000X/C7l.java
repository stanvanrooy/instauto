package p000X;

import android.view.View;
import com.instagram.business.insights.controller.InsightsStoryViewerController;
import com.instagram.business.insights.fragment.InsightsContentFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.C7l */
public final class C7l implements C225709nb {
    public final /* synthetic */ InsightsContentFragment A00;
    public final /* synthetic */ Integer A01;

    public C7l(InsightsContentFragment insightsContentFragment, Integer num) {
        this.A00 = insightsContentFragment;
        this.A01 = num;
    }

    public final void B71(View view, String str) {
        InsightsContentFragment.A00(this.A00, Constants.A0C, Constants.A0A, this.A01, Constants.A0Y);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        InsightsContentFragment insightsContentFragment = this.A00;
        new C28341Li(insightsContentFragment.getContext(), insightsContentFragment.A03, AnonymousClass1L8.A00(insightsContentFragment)).A02(InsightsStoryViewerController.A00(arrayList, insightsContentFragment.A03), insightsContentFragment.A01.A01(insightsContentFragment, AnonymousClass1OY.BUSINESS_INSIGHTS));
        this.A00.A04 = new WeakReference(view);
    }
}
