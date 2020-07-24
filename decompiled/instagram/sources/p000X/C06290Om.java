package p000X;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Callable;

/* renamed from: X.0Om  reason: invalid class name and case insensitive filesystem */
public final class C06290Om implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewTreeObserver A02;
    public final /* synthetic */ Callable A03;

    public C06290Om(Handler handler, ViewTreeObserver viewTreeObserver, View view, Callable callable) {
        this.A00 = handler;
        this.A02 = viewTreeObserver;
        this.A01 = view;
        this.A03 = callable;
    }

    public final boolean onPreDraw() {
        AnonymousClass0ZA.A07(this.A00, (Object) null);
        if (this.A02.isAlive()) {
            this.A02.removeOnPreDrawListener(this);
        } else {
            this.A01.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        try {
            return ((Boolean) this.A03.call()).booleanValue();
        } catch (Exception e) {
            AnonymousClass0QD.A05("ViewUtil#runOnNextPreDrawWithTimeout", e.getMessage(), e);
            return true;
        }
    }
}
