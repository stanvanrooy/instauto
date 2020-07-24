package p000X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.1qt  reason: invalid class name and case insensitive filesystem */
public final class C41781qt implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ C35761gt A00;

    public C41781qt(C35761gt r1) {
        this.A00 = r1;
    }

    public final boolean onPreDraw() {
        this.A00.A02.getViewTreeObserver().removeOnPreDrawListener(this);
        View view = this.A00.A02;
        view.setTranslationY((float) (view.getHeight() >> 2));
        return false;
    }
}
