package p000X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;

/* renamed from: X.CDO */
public final class CDO implements View.OnClickListener {
    public final /* synthetic */ CD0 A00;

    public CDO(CD0 cd0) {
        this.A00 = cd0;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-1784750636);
        CCZ.A02(this.A00.A08, C27398CBr.REVIEW);
        CD0 cd0 = this.A00;
        CCf A002 = C27411CCe.A00(cd0.A08);
        CD3 cd3 = cd0.A08;
        if (cd3.A11) {
            cd0.A05.A05(cd3.A0Z, C27411CCe.A00(cd3).toString());
        } else if (cd3.A10 || cd3.A0u) {
            C16310oO.A00.A02();
            CDH cdh = new CDH();
            Bundle bundle = new Bundle();
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", cd0.A0C.getToken());
            cdh.setArguments(bundle);
            C52362Om r2 = new C52362Om(cd0.getActivity(), cd0.A08.A0Q);
            r2.A02 = cdh;
            r2.A02();
        } else {
            AnonymousClass1HD A03 = C16310oO.A00.A00().A03(cd3.A0Z, CCf.A01(cd0.getContext(), A002), cd0.A08.A0a, cd0.getString(C0003R.string.promote_preview_feed));
            FragmentActivity activity = cd0.getActivity();
            AnonymousClass0a4.A06(activity);
            Bundle bundle2 = new Bundle();
            bundle2.putString("IgSessionManager.SESSION_TOKEN_KEY", cd0.A0C.getToken());
            C52362Om r1 = new C52362Om(activity, cd0.A0C);
            r1.A08(A03, bundle2);
            r1.A02();
        }
        AnonymousClass0Z0.A0C(-1171746409, A05);
    }
}
