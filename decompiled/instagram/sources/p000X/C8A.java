package p000X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.business.insights.controller.InsightsStoryViewerController;
import com.instagram.business.insights.fragment.BaseGridInsightsFragment;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.C8A */
public final class C8A extends BaseGridInsightsFragment implements C53932Vb {
    public InsightsStoryViewerController A00;
    public WeakReference A01;

    public final String getModuleName() {
        return "insights_mixed_grid";
    }

    public final C06590Pq getSession() {
        Bundle bundle = this.mArguments;
        AnonymousClass0a4.A06(bundle);
        return AnonymousClass0J1.A06(bundle);
    }

    public final void BJ1(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            AnonymousClass5F9.A03(activity, str, 1);
            C27355CAa.A03((AnonymousClass0C1) getSession(), "top_stories", str, C14100jl.A01(getSession()));
        }
    }

    public final void BJW(List list, AnonymousClass1OY r12) {
        View view;
        if (!list.isEmpty() && getActivity() != null) {
            AnonymousClass0C1 r8 = (AnonymousClass0C1) getSession();
            boolean z = false;
            String APo = ((AnonymousClass1NJ) list.get(0)).APo();
            C13300iJ A0c = ((AnonymousClass1NJ) list.get(0)).A0c(r8);
            AnonymousClass1OY r9 = r12;
            if (r12 == AnonymousClass1OY.BUSINESS_INSIGHTS) {
                z = true;
            }
            WeakReference weakReference = this.A01;
            if (weakReference == null || weakReference.get() == null) {
                view = this.mRecyclerView;
            } else {
                view = (View) this.A01.get();
            }
            this.A00.A02(C17020pY.A00().A0Q(r8).A0J(APo, new C249816v(A0c), z, list), 0, C06220Of.A0A(view), getActivity(), r8, r9);
        }
    }

    public final void Bj2(List list) {
        super.Bj2(list);
        if (list.size() == 1) {
            this.mEmptyView.setVisibility(0);
        } else {
            this.mEmptyView.setVisibility(8);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0Z0.A02(1202969912);
        super.onCreate(bundle);
        InsightsStoryViewerController insightsStoryViewerController = new InsightsStoryViewerController(getActivity());
        this.A00 = insightsStoryViewerController;
        registerLifecycleListener(insightsStoryViewerController);
        AnonymousClass0Z0.A09(-519239323, A02);
    }

    public final void onDestroy() {
        int A02 = AnonymousClass0Z0.A02(287205909);
        unregisterLifecycleListener(this.A00);
        super.onDestroy();
        AnonymousClass0Z0.A09(1751839898, A02);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mEmptyView.setText(C0003R.string.mixed_grid_empty);
        C8R c8r = this.A01;
        if (c8r != null) {
            ((C8N) c8r).A06(this);
        }
    }
}
