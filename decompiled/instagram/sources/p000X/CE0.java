package p000X;

import android.content.Context;
import com.facebook.C0003R;

/* renamed from: X.CE0 */
public final class CE0 extends C17920r1 {
    public final /* synthetic */ CD5 A00;

    public CE0(CD5 cd5) {
        this.A00 = cd5;
    }

    public final void onFail(C43791v5 r6) {
        String str;
        int A03 = AnonymousClass0Z0.A03(-634050558);
        Throwable th = r6.A01;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = "";
        }
        CCZ.A0E(this.A00.A06, C27398CBr.ERROR, "take_page_onwership", str);
        this.A00.A05.A03(false);
        CD5 cd5 = this.A00;
        String string = cd5.getString(C0003R.string.promote_error_claim_page_failed);
        Context context = cd5.getContext();
        if (context != null) {
            AnonymousClass5F9.A03(context, string, 0);
        }
        AnonymousClass0Z0.A0A(-2042258319, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-612814221);
        int A032 = AnonymousClass0Z0.A03(-1298767173);
        CD3 cd3 = this.A00.A06;
        C27398CBr cBr = C27398CBr.ERROR;
        CCZ.A0A(cd3, cBr, "claim");
        CD5 cd5 = this.A00;
        CD5.A03(cd5, true);
        cd5.A04.A00(cd5, cBr);
        AnonymousClass0Z0.A0A(1147380143, A032);
        AnonymousClass0Z0.A0A(1279482107, A03);
    }
}
