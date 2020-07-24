package p000X;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Callable;

/* renamed from: X.0Oo  reason: invalid class name and case insensitive filesystem */
public final class C06310Oo implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewTreeObserver A01;
    public final /* synthetic */ Callable A02;

    public C06310Oo(ViewTreeObserver viewTreeObserver, View view, Callable callable) {
        this.A01 = viewTreeObserver;
        this.A00 = view;
        this.A02 = callable;
    }

    public final boolean onPreDraw() {
        if (this.A01.isAlive()) {
            this.A01.removeOnPreDrawListener(this);
        } else {
            this.A00.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        try {
            return ((Boolean) this.A02.call()).booleanValue();
        } catch (Exception unused) {
            return true;
        }
    }
}
