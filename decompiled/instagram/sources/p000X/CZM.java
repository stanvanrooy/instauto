package p000X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.CZM */
public final class CZM implements AnonymousClass0PS {
    public final /* synthetic */ AnonymousClass0PS A00;
    public final /* synthetic */ AnonymousClass1VL A01;

    public CZM(AnonymousClass1VL r1, AnonymousClass0PS r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void B7H(View view, int i, ViewGroup viewGroup) {
        view.setTag(this.A01.A02(view));
        this.A00.B7H(view, i, viewGroup);
    }
}
