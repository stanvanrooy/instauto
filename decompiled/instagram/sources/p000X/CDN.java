package p000X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;

/* renamed from: X.CDN */
public final class CDN implements View.OnClickListener {
    public final /* synthetic */ C27486CFc A00;
    public final /* synthetic */ C27481CEx A01;

    public CDN(C27486CFc cFc, C27481CEx cEx) {
        this.A00 = cFc;
        this.A01 = cEx;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-1229659557);
        C27480CEw cEw = this.A00.A03;
        C27481CEx cEx = this.A01;
        CCZ.A02(cEw.A00.A04, C27398CBr.QUICK_PROMOTE_SAVE_SETTING);
        CDB cdb = cEw.A00;
        CCf cCf = cEx.A03;
        FragmentActivity activity = cdb.getActivity();
        AnonymousClass0a4.A06(activity);
        CD3 cd3 = cdb.A04;
        if (cd3.A11) {
            cdb.A01.A05(cd3.A0Z, cCf.toString());
        } else if (!cd3.A10) {
            AnonymousClass2VY A002 = C16310oO.A00.A00();
            String str = cd3.A0Z;
            Context context = cdb.getContext();
            AnonymousClass0a4.A06(context);
            AnonymousClass1HD A03 = A002.A03(str, CCf.A01(context, cCf), cdb.A04.A0a, cdb.getString(C0003R.string.promote_preview_feed));
            Bundle bundle = new Bundle();
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", cdb.A08.getToken());
            C52362Om r1 = new C52362Om(activity, cdb.A08);
            r1.A08(A03, bundle);
            r1.A02();
        } else {
            C16310oO.A00.A02();
            CDH cdh = new CDH();
            Bundle bundle2 = new Bundle();
            bundle2.putString("IgSessionManager.SESSION_TOKEN_KEY", cdb.A08.getToken());
            cdh.setArguments(bundle2);
            C52362Om r12 = new C52362Om(activity, cdb.A04.A0Q);
            r12.A02 = cdh;
            r12.A02();
        }
        AnonymousClass0Z0.A0C(696604390, A05);
    }
}
