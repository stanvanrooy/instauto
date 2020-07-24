package p000X;

import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactSoftException;

/* renamed from: X.A8B */
public final class A8B extends A9H {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final /* synthetic */ A8K A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public A8B(A8K a8k, int i, int i2, boolean z, boolean z2) {
        super(a8k, i);
        this.A03 = a8k;
        this.A00 = i2;
        this.A02 = z;
        this.A01 = z2;
    }

    public final void execute() {
        if (!this.A02) {
            A83 a83 = this.A03.A0L;
            int i = this.A00;
            int i2 = this.A00;
            boolean z = this.A01;
            synchronized (a83) {
                if (!z) {
                    a83.A07.A00(i2, (ViewParent) null);
                } else {
                    View view = (View) a83.A05.get(i);
                    if (i2 == i || !(view instanceof ViewParent)) {
                        if (a83.A06.get(i)) {
                            ReactSoftException.logSoftException("SoftAssertions", new C228149rp(AnonymousClass000.A06("Cannot block native responder on ", i, " that is a root view")));
                        }
                        a83.A07.A00(i2, view.getParent());
                    } else {
                        a83.A07.A00(i2, (ViewParent) view);
                    }
                }
            }
            return;
        }
        A8t a8t = this.A03.A0L.A07;
        a8t.A01 = -1;
        ViewParent viewParent = a8t.A00;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(false);
            a8t.A00 = null;
        }
    }
}
