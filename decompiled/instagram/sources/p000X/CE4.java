package p000X;

import android.view.View;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.CE4 */
public final class CE4 implements View.OnClickListener {
    public final /* synthetic */ CE5 A00;

    public CE4(CE5 ce5) {
        this.A00 = ce5;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(1808148022);
        CCZ.A07(this.A00.A03, C27398CBr.AGE_AND_GENDER_SELECTION, "done_button");
        CE5 ce5 = this.A00;
        CDA cda = ce5.A04;
        CD3 cd3 = ce5.A03;
        int i = ce5.A01;
        int i2 = ce5.A00;
        List list = ce5.A0A;
        C27452CDu cDu = cd3.A08;
        String str = cDu.A02;
        String str2 = cDu.A03;
        cDu.A00();
        ImmutableList A01 = cDu.A01();
        ImmutableList A02 = cDu.A02();
        C27452CDu cDu2 = new C27452CDu();
        cDu2.A02 = str;
        cDu2.A03 = str2;
        cDu2.A01 = i;
        cDu2.A00 = i2;
        cDu2.A04 = list;
        cDu2.A05 = A01;
        cDu2.A06 = A02;
        cd3.A08 = cDu2;
        CDA.A00(cda, Constants.A12);
        this.A00.getActivity().onBackPressed();
        AnonymousClass0Z0.A0C(216636770, A05);
    }
}
