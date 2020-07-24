package p000X;

import android.view.View;

/* renamed from: X.0Oi  reason: invalid class name and case insensitive filesystem */
public final class C06250Oi implements View.OnLayoutChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C31541Ys A01;
    public final /* synthetic */ Runnable A02;

    public C06250Oi(C31541Ys r1, Runnable runnable, View view) {
        this.A01 = r1;
        this.A02 = runnable;
        this.A00 = view;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (((Boolean) this.A01.apply((Object) null)).booleanValue()) {
            this.A02.run();
            this.A00.removeOnLayoutChangeListener(this);
        }
    }
}
