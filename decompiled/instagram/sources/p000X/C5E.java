package p000X;

import android.view.View;

/* renamed from: X.C5E */
public final class C5E implements View.OnClickListener {
    public final /* synthetic */ C4m A00;

    public C5E(C4m c4m) {
        this.A00 = c4m;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(406654734);
        C4m c4m = this.A00;
        B7F b7f = c4m.A0G;
        if (b7f != null) {
            b7f.A00();
            c4m.A0G = null;
        }
        c4m.A0I = false;
        AnonymousClass0Z0.A0C(-1241652376, A05);
    }
}
