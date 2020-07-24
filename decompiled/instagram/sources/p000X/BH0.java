package p000X;

import android.os.Looper;

/* renamed from: X.BH0 */
public final class BH0 {
    public static final BH0 A02;
    public final Looper A00;
    public final C25362BGa A01;

    static {
        BH4 bh4 = new BH4();
        if (bh4.A01 == null) {
            bh4.A01 = new BH9();
        }
        if (bh4.A00 == null) {
            bh4.A00 = Looper.getMainLooper();
        }
        A02 = new BH0(bh4.A01, bh4.A00);
    }

    public /* synthetic */ BH0(C25362BGa bGa, Looper looper) {
        this.A01 = bGa;
        this.A00 = looper;
    }
}
