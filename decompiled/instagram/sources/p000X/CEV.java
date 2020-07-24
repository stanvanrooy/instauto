package p000X;

import android.view.View;
import java.util.List;

/* renamed from: X.CEV */
public final class CEV implements View.OnClickListener {
    public final /* synthetic */ C27459CEb A00;
    public final /* synthetic */ C27481CEx A01;

    public CEV(C27459CEb cEb, C27481CEx cEx) {
        this.A00 = cEb;
        this.A01 = cEx;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-1301659863);
        C27480CEw cEw = this.A00.A0D;
        C27481CEx cEx = this.A01;
        CCZ.A07(cEw.A00.A04, C27398CBr.QUICK_PROMOTE_SAVE_SETTING, "quick_promote_setting_row");
        boolean z = false;
        if (!cEx.A08) {
            CDB cdb = cEw.A00;
            C27481CEx cEx2 = cdb.A05;
            if (cEx2 != null) {
                cEx2.A08 = false;
            }
            cEx.A08 = true;
            cdb.A05 = cEx;
        }
        CDB cdb2 = cEw.A00;
        CDD cdd = cdb2.A03;
        List list = cEw.A01;
        C27481CEx cEx3 = cdb2.A05;
        cdd.A01 = list;
        cdd.A00 = cEx3;
        cdd.notifyDataSetChanged();
        CDB cdb3 = cEw.A00;
        C27434CDc cDc = cdb3.A02;
        if (cDc != null) {
            if (cdb3.A04.A05() && CDV.A06(cdb3.A05)) {
                z = true;
            }
            cDc.A02(z);
        }
        AnonymousClass0Z0.A0C(1138011520, A05);
    }
}
