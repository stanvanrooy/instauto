package p000X;

import com.facebook.react.uimanager.UIManagerModule;

/* renamed from: X.A96 */
public final class A96 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C23043A0y A01;
    public final /* synthetic */ A3o A02;
    public final /* synthetic */ UIManagerModule A03;

    public A96(UIManagerModule uIManagerModule, A3o a3o, int i, C23043A0y a0y) {
        this.A03 = uIManagerModule;
        this.A02 = a3o;
        this.A00 = i;
        this.A01 = a0y;
    }

    public final void run() {
        this.A02.synchronouslyUpdateViewOnUIThread(this.A00, this.A01);
    }
}
