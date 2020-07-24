package p000X;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Callable;

/* renamed from: X.0Ol  reason: invalid class name and case insensitive filesystem */
public final class C06280Ol implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener A01;
    public final /* synthetic */ ViewTreeObserver A02;
    public final /* synthetic */ Callable A03;

    public C06280Ol(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener, View view, Callable callable) {
        this.A02 = viewTreeObserver;
        this.A01 = onPreDrawListener;
        this.A00 = view;
        this.A03 = callable;
    }

    public final void run() {
        ViewTreeObserver viewTreeObserver;
        if (this.A02.isAlive()) {
            viewTreeObserver = this.A02;
        } else {
            viewTreeObserver = this.A00.getViewTreeObserver();
        }
        viewTreeObserver.removeOnPreDrawListener(this.A01);
        try {
            this.A03.call();
        } catch (Exception e) {
            AnonymousClass0QD.A05("ViewUtil#runOnNextPreDrawWithTimeout", e.getMessage(), e);
        }
    }
}
