package p000X;

import android.view.View;

/* renamed from: X.A8n */
public final class A8n extends A9H {
    public final int A00;
    public final /* synthetic */ A8K A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public A8n(A8K a8k, int i, int i2) {
        super(a8k, i);
        this.A01 = a8k;
        this.A00 = i2;
    }

    public final void execute() {
        A83 a83 = this.A01.A0L;
        int i = this.A00;
        int i2 = this.A00;
        View view = (View) a83.A05.get(i);
        if (view != null) {
            view.sendAccessibilityEvent(i2);
            return;
        }
        throw new A0k(AnonymousClass000.A05("Could not find view with tag ", i));
    }
}
