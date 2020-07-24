package p000X;

import com.facebook.react.bridge.Callback;

/* renamed from: X.A92 */
public final class A92 implements Runnable {
    public final /* synthetic */ Callback A00;
    public final /* synthetic */ A0Z A01;

    public A92(A0Z a0z, Callback callback) {
        this.A01 = a0z;
        this.A00 = callback;
    }

    public final void run() {
        this.A00.invoke(Boolean.TRUE);
    }
}
