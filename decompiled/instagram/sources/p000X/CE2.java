package p000X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.CE2 */
public final class CE2 implements View.OnClickListener {
    public final /* synthetic */ CD5 A00;

    public CE2(CD5 cd5) {
        this.A00 = cd5;
    }

    public final void onClick(View view) {
        String str;
        int A05 = AnonymousClass0Z0.A05(1520272455);
        CD5 cd5 = this.A00;
        if (cd5.getActivity() != null) {
            CCZ.A07(cd5.A06, C27398CBr.ERROR, "error_page_learn_more");
            CD5 cd52 = this.A00;
            FragmentActivity activity = cd52.getActivity();
            AnonymousClass0C1 r2 = cd52.A07;
            Integer num = cd52.A08;
            AnonymousClass0a4.A06(num);
            switch (num.intValue()) {
                case 4:
                    str = "https://www.facebook.com/business/help/150420221693110";
                    break;
                case 8:
                    str = "https://www.facebook.com/help/148233965247823";
                    break;
                case C120125Dh.VIEW_TYPE_BADGE:
                    str = "https://www.facebook.com/business/help/155909647811305";
                    break;
                case 15:
                    str = "https://www.facebook.com/help/187316341316631";
                    break;
                default:
                    str = "https://www.facebook.com/help/instagram/186452768798716";
                    break;
            }
            AnonymousClass2UC r4 = new AnonymousClass2UC(activity, r2, str, AnonymousClass2UD.PROMOTE);
            r4.A04(this.A00.getModuleName());
            r4.A01();
        }
        AnonymousClass0Z0.A0C(-1883148082, A05);
    }
}
