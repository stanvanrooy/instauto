package p000X;

import android.view.View;
import com.facebook.react.bridge.ReactSoftException;

/* renamed from: X.A8D */
public final class A8D extends A9H {
    public final /* synthetic */ A8K A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public A8D(A8K a8k, int i) {
        super(a8k, i);
        this.A00 = a8k;
    }

    public final void execute() {
        A83 a83 = this.A00.A0L;
        int i = this.A00;
        synchronized (a83) {
            C228039ra.A00();
            if (!a83.A06.get(i)) {
                ReactSoftException.logSoftException("SoftAssertions", new C228149rp(AnonymousClass000.A06("View with tag ", i, " is not registered as a root view")));
            }
            a83.A08((View) a83.A05.get(i));
            a83.A06.delete(i);
        }
    }
}
