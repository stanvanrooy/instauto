package p000X;

import android.util.Pair;

/* renamed from: X.B4h */
public final /* synthetic */ class B4h implements C60332jj {
    public final Pair A00;
    public final C62552nu A01;

    public B4h(C62552nu r1, Pair pair) {
        this.A01 = r1;
        this.A00 = pair;
    }

    public final Object BrJ(C60302jg r4) {
        C62552nu r2 = this.A01;
        Pair pair = this.A00;
        synchronized (r2) {
            r2.A00.remove(pair);
        }
        return r4;
    }
}
