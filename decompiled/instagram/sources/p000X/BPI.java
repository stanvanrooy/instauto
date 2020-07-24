package p000X;

import android.os.Build;

/* renamed from: X.BPI */
public final class BPI implements C25584BQq {
    public final /* synthetic */ BQV A00;

    public BPI(BQV bqv) {
        this.A00 = bqv;
    }

    public final C25521BOf ADg() {
        if (Build.VERSION.SDK_INT < 23) {
            return this.A00.A05(Constants.A0N);
        }
        return this.A00.A06(Build.VERSION.BASE_OS);
    }
}
