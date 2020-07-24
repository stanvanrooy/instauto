package p000X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.1ts  reason: invalid class name and case insensitive filesystem */
public final class C43131ts implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ C43121tr A00;

    public C43131ts(C43121tr r1) {
        this.A00 = r1;
    }

    public final boolean onPreDraw() {
        this.A00.A00.getViewTreeObserver().removeOnPreDrawListener(this);
        View view = this.A00.A00;
        view.setTranslationY((float) (view.getHeight() >> 2));
        return false;
    }
}
