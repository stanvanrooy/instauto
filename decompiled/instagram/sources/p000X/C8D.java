package p000X;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.business.insights.controller.InsightsStoryViewerController;
import com.instagram.business.insights.fragment.BaseGridInsightsFragment;
import com.instagram.model.reels.Reel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.C8D */
public final class C8D extends BaseGridInsightsFragment implements C225709nb, C53932Vb {
    public C27325C8u A00;
    public InsightsStoryViewerController A01;
    public WeakReference A02;

    public final String getModuleName() {
        return "product_insights_story_grid";
    }

    public final void B71(View view, String str) {
        C27355CAa cAa = this.A00;
        Integer num = Constants.A0C;
        Integer num2 = Constants.A0A;
        Integer num3 = Constants.A08;
        Integer num4 = Constants.A0L;
        Bundle bundle = this.mArguments;
        AnonymousClass0a4.A06(bundle);
        cAa.A06(num, num2, num3, num4, (Map) null, bundle.getString("ARG.Grid.ProductId", ""));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        AnonymousClass1OY r5 = AnonymousClass1OY.BUSINESS_INSIGHTS;
        Context context = getContext();
        AnonymousClass0a4.A06(context);
        new C28341Li(context, (AnonymousClass0C1) getSession(), AnonymousClass1L8.A00(this)).A02(InsightsStoryViewerController.A00(arrayList, (AnonymousClass0C1) getSession()), this.A01.A01(this, r5));
        this.A02 = new WeakReference(view);
    }

    public final void BJ1(String str) {
        FragmentActivity activity = getActivity();
        AnonymousClass0a4.A06(activity);
        AnonymousClass5F9.A03(activity, str, 1);
        AnonymousClass0C1 r2 = this.A03;
        C27355CAa.A03(r2, "story_grid", str, C14100jl.A01(r2));
    }

    public final void BJW(List list, AnonymousClass1OY r10) {
        if (!list.isEmpty()) {
            boolean z = false;
            String APo = ((AnonymousClass1NJ) list.get(0)).APo();
            C13300iJ A0c = ((AnonymousClass1NJ) list.get(0)).A0c(this.A03);
            AnonymousClass1OY r7 = r10;
            if (r10 == AnonymousClass1OY.BUSINESS_INSIGHTS) {
                z = true;
            }
            Reel A0J = C17020pY.A00().A0Q(this.A03).A0J(APo, new C249816v(A0c), z, list);
            InsightsStoryViewerController insightsStoryViewerController = this.A01;
            RectF A0A = C06220Of.A0A((View) this.A02.get());
            FragmentActivity activity = getActivity();
            AnonymousClass0a4.A06(activity);
            insightsStoryViewerController.A02(A0J, 0, A0A, activity, this.A03, r7);
        }
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(-1607431393);
        unregisterLifecycleListener(this.A01);
        super.onDestroy();
        AnonymousClass0Z0.A09(338701660, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mEmptyView.setText(C0003R.string.partner_story_grid_empty_message);
        C8R c8r = this.A01;
        if (c8r != null) {
            ((C8O) c8r).A06(this);
        }
    }
}
