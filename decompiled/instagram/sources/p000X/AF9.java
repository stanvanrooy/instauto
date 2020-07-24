package p000X;

import android.content.Context;
import android.view.View;
import com.facebook.C0003R;
import com.instagram.simplewebview.SimpleWebViewActivity;

/* renamed from: X.AF9 */
public final class AF9 extends C100044Ua {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C53822Um A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AF9(C53822Um r1, int i, Context context) {
        super(i);
        this.A01 = r1;
        this.A00 = context;
    }

    public final void onClick(View view) {
        CNV cnv = this.A01.A04;
        CNV.A01(cnv, CNV.A00(cnv, "onboarding_guidelines_clicked"));
        String string = view.getResources().getString(C0003R.string.in_app_signup_catalog_selection_guidelines_navbar_title);
        Context context = this.A00;
        AnonymousClass0C1 r2 = this.A01.A02;
        C53742Uc r1 = new C53742Uc("https://help.instagram.com/1627591223954487");
        r1.A03 = string;
        SimpleWebViewActivity.A04(context, r2, r1.A00());
    }
}
