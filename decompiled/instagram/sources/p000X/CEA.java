package p000X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;

/* renamed from: X.CEA */
public final class CEA implements View.OnClickListener {
    public final /* synthetic */ CE6 A00;

    public CEA(CE6 ce6) {
        this.A00 = ce6;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(293413637);
        CCZ.A07(this.A00.A07, C27398CBr.INTERESTS_SELECTION, "done_button");
        CE6 ce6 = this.A00;
        CDA cda = ce6.A08;
        CD3 cd3 = ce6.A07;
        ImmutableList A09 = ImmutableList.A09(ce6.A05.A02);
        C27452CDu cDu = cd3.A08;
        String str = cDu.A02;
        String str2 = cDu.A03;
        int i = cDu.A01;
        int i2 = cDu.A00;
        ImmutableList A002 = cDu.A00();
        ImmutableList A01 = cDu.A01();
        cDu.A02();
        C27452CDu cDu2 = new C27452CDu();
        cDu2.A02 = str;
        cDu2.A03 = str2;
        cDu2.A01 = i;
        cDu2.A00 = i2;
        cDu2.A04 = A002;
        cDu2.A05 = A01;
        cDu2.A06 = A09;
        cd3.A08 = cDu2;
        CDA.A00(cda, Constants.A12);
        FragmentActivity activity = this.A00.getActivity();
        AnonymousClass0a4.A06(activity);
        activity.onBackPressed();
        AnonymousClass0Z0.A0C(-1208984687, A05);
    }
}
