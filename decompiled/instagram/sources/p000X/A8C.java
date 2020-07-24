package p000X;

import com.facebook.react.bridge.Callback;

/* renamed from: X.A8C */
public final class A8C implements C23136A9b {
    public final Callback A00;
    public final C23043A0y A01;
    public final /* synthetic */ A8K A02;

    public A8C(A8K a8k, C23043A0y a0y, Callback callback) {
        this.A02 = a8k;
        this.A01 = a0y;
        this.A00 = callback;
    }

    public final void execute() {
        A83 a83 = this.A02.A0L;
        C23043A0y a0y = this.A01;
        Callback callback = this.A00;
        A0Z a0z = a83.A0A;
        if (a0y == null) {
            a0z.A02();
            return;
        }
        int i = 0;
        a0z.A02 = false;
        if (a0y.hasKey("duration")) {
            i = a0y.getInt("duration");
        }
        if (a0y.hasKey(A8u.A00(Constants.ZERO))) {
            a0z.A04.A02(a0y.getMap(A8u.A00(Constants.ZERO)), i);
            a0z.A02 = true;
        }
        if (a0y.hasKey(A8u.A00(Constants.ONE))) {
            a0z.A06.A02(a0y.getMap(A8u.A00(Constants.ONE)), i);
            a0z.A02 = true;
        }
        if (a0y.hasKey(A8u.A00(Constants.A0C))) {
            a0z.A05.A02(a0y.getMap(A8u.A00(Constants.A0C)), i);
            a0z.A02 = true;
        }
        if (a0z.A02 && callback != null) {
            a0z.A01 = new A92(a0z, callback);
        }
    }
}
