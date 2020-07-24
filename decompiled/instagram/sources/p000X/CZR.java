package p000X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.CZR */
public final class CZR implements AnonymousClass0PS {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0PS A01;

    public CZR(Context context, AnonymousClass0PS r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    public final void B7H(View view, int i, ViewGroup viewGroup) {
        view.setTag(CZS.A00(view));
        this.A01.B7H(view, i, viewGroup);
    }
}
