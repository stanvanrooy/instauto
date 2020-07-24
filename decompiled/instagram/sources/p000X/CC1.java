package p000X;

import android.view.View;

/* renamed from: X.CC1 */
public final class CC1 implements View.OnClickListener {
    public final /* synthetic */ CCQ A00;

    public CC1(CCQ ccq) {
        this.A00 = ccq;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-1187345589);
        CCZ.A07(this.A00.A04, C27398CBr.CONNECT_FACEBOOK_PAGE, "skip_button");
        CD8 cd8 = this.A00.A01;
        CC0 cc0 = new CC0(this);
        AnonymousClass0C1 r3 = cd8.A0D;
        String str = cd8.A04.A0R;
        C15890nh r2 = new C15890nh(r3);
        r2.A09 = Constants.ONE;
        r2.A0C = "ads/promote/skip_page_connection/";
        r2.A09("fb_auth_token", str);
        r2.A06(C23661AWy.class, false);
        C17850qu A03 = r2.A03();
        A03.A00 = cc0;
        cd8.A09.schedule(A03);
        AnonymousClass0Z0.A0C(-1423683655, A05);
    }
}
