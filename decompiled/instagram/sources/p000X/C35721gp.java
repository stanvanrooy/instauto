package p000X;

import android.view.View;

/* renamed from: X.1gp  reason: invalid class name and case insensitive filesystem */
public final class C35721gp implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C35691gm A00;

    public C35721gp(C35691gm r1) {
        this.A00 = r1;
    }

    public final void onViewAttachedToWindow(View view) {
        C35691gm r1 = this.A00;
        r1.A07.A07(r1);
    }

    public final void onViewDetachedFromWindow(View view) {
        C35691gm r1 = this.A00;
        r1.A07.A08(r1);
    }
}
