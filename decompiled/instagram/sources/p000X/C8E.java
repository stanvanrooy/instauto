package p000X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.business.insights.fragment.BaseGridInsightsFragment;
import com.instagram.modal.ModalActivity;
import java.util.Map;

/* renamed from: X.C8E */
public final class C8E extends BaseGridInsightsFragment implements C225709nb {
    public C27324C8t A00;

    public final String getModuleName() {
        return "product_insights_post_grid";
    }

    public final void B71(View view, String str) {
        C27355CAa cAa = this.A00;
        Integer num = Constants.A0C;
        Integer num2 = Constants.A06;
        Integer num3 = Constants.A0J;
        Integer num4 = Constants.A0L;
        Bundle bundle = this.mArguments;
        AnonymousClass0a4.A06(bundle);
        cAa.A06(num, num2, num3, num4, (Map) null, bundle.getString("ARG.Grid.ProductId", ""));
        C146776Pc A0T = AnonymousClass2UZ.A00().A0T(str);
        A0T.A0D = true;
        Bundle A002 = A0T.A00();
        FragmentActivity activity = getActivity();
        AnonymousClass0a4.A06(activity);
        C59032gv r2 = new C59032gv(this.A03, ModalActivity.class, AnonymousClass0C5.$const$string(383), A002, activity);
        r2.A0A = ModalActivity.A05;
        FragmentActivity activity2 = getActivity();
        AnonymousClass0a4.A06(activity2);
        r2.A06(activity2);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mEmptyView.setText(C0003R.string.partner_post_grid_empty_message);
        C8R c8r = this.A01;
        if (c8r != null) {
            ((C8P) c8r).A06(this);
        }
    }
}
