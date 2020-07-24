package p000X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.1cR  reason: invalid class name and case insensitive filesystem */
public final class C33141cR implements View.OnAttachStateChangeListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C27501Ic A01;

    public final void onViewDetachedFromWindow(View view) {
    }

    public C33141cR(C27501Ic r1, Activity activity) {
        this.A01 = r1;
        this.A00 = activity;
    }

    public final void onViewAttachedToWindow(View view) {
        C27501Ic.A02(this.A01, this.A00);
    }
}
