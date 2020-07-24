package p000X;

import android.view.View;

/* renamed from: X.APJ */
public final class APJ extends C35681gl {
    public final /* synthetic */ AO9 A00;

    public APJ(AO9 ao9) {
        this.A00 = ao9;
    }

    public final boolean BR2(View view) {
        C13150hy.A02(view, "targetView");
        view.performHapticFeedback(1);
        AO9.A00(this.A00, false);
        return true;
    }
}
