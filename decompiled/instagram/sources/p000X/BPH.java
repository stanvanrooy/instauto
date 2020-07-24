package p000X;

import android.os.Build;

/* renamed from: X.BPH */
public final class BPH implements C25584BQq {
    public final /* synthetic */ BQV A00;

    public BPH(BQV bqv) {
        this.A00 = bqv;
    }

    public final C25521BOf ADg() {
        if (Build.VERSION.SDK_INT < 23) {
            return this.A00.A05(Constants.A0N);
        }
        return this.A00.A06(Build.VERSION.SECURITY_PATCH);
    }
}
