package p000X;

import android.content.Context;
import com.facebook.C0003R;

/* renamed from: X.CE1 */
public final class CE1 extends C17920r1 {
    public final /* synthetic */ CD5 A00;

    public CE1(CD5 cd5) {
        this.A00 = cd5;
    }

    public final void onFail(C43791v5 r6) {
        String str;
        int A03 = AnonymousClass0Z0.A03(-1776560730);
        Throwable th = r6.A01;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = "";
        }
        CCZ.A0E(this.A00.A06, C27398CBr.ERROR, "page_created", str);
        this.A00.A05.A03(false);
        CD5 cd5 = this.A00;
        String string = cd5.getString(C0003R.string.promote_error_create_page_failed);
        Context context = cd5.getContext();
        if (context != null) {
            AnonymousClass5F9.A03(context, string, 0);
        }
        AnonymousClass0Z0.A0A(-376347712, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-524479763);
        int A032 = AnonymousClass0Z0.A03(1549225339);
        CD3 cd3 = this.A00.A06;
        C27398CBr cBr = C27398CBr.ERROR;
        CCZ.A0A(cd3, cBr, "page_created");
        CD5 cd5 = this.A00;
        CD5.A03(cd5, true);
        cd5.A04.A00(cd5, cBr);
        AnonymousClass0Z0.A0A(863650522, A032);
        AnonymousClass0Z0.A0A(1918503228, A03);
    }
}
