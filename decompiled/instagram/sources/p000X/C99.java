package p000X;

import android.os.Bundle;
import com.facebook.C0003R;

/* renamed from: X.C99 */
public final class C99 implements C7C {
    public final /* synthetic */ C96 A00;

    public final void BG0(String str) {
    }

    public C99(C96 c96) {
        this.A00 = c96;
    }

    public final void AtO() {
        C96.A04(this.A00);
    }

    public final void B6W() {
        C96 c96 = this.A00;
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", c96.A09.getToken());
        bundle.putString("ARG.PostInsights.Info.Title", c96.getResources().getString(C0003R.string.discovery_info_title));
        C100854Xk r1 = new C100854Xk();
        r1.setArguments(bundle);
        C96.A05(c96, r1, Constants.A0G);
    }
}
