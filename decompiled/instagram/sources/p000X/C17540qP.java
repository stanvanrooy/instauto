package p000X;

import android.content.Context;
import android.content.DialogInterface;

/* renamed from: X.0qP  reason: invalid class name and case insensitive filesystem */
public final class C17540qP extends C17550qQ {
    public C138795vq A00;

    public final C138795vq A00() {
        if (this.A00 == null) {
            this.A00 = new C138795vq();
        }
        return this.A00;
    }

    public C17540qP(Context context) {
        C17560qR r1 = new C17560qR();
        C16670oy.A04("gdpr_consent", r1);
        C16670oy.A04("underage_appeal", r1);
        C16620ot.A01().A03("gdpr", new C17590qU(context));
    }

    public final void A01(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        C139255xJ.A02(context, onClickListener, onClickListener2);
    }
}
