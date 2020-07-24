package p000X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.CFD */
public final class CFD implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C27398CBr A01;
    public final /* synthetic */ CD3 A02;
    public final /* synthetic */ AnonymousClass0C1 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public CFD(CD3 cd3, C27398CBr cBr, String str, FragmentActivity fragmentActivity, AnonymousClass0C1 r5, String str2) {
        this.A02 = cd3;
        this.A01 = cBr;
        this.A04 = str;
        this.A00 = fragmentActivity;
        this.A03 = r5;
        this.A05 = str2;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0Z0.A05(874669107);
        CCZ.A07(this.A02, this.A01, this.A04);
        new AnonymousClass2UC(this.A00, this.A03, this.A05, AnonymousClass2UD.PROMOTE).A01();
        AnonymousClass0Z0.A0C(1471692162, A052);
    }
}
