package p000X;

import android.view.View;

/* renamed from: X.0Oh  reason: invalid class name and case insensitive filesystem */
public final class C06240Oh implements View.OnLayoutChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ Runnable A01;

    public C06240Oh(View view, Runnable runnable) {
        this.A00 = view;
        this.A01 = runnable;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.A00.removeOnLayoutChangeListener(this);
        this.A01.run();
    }
}
