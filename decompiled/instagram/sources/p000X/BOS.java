package p000X;

import android.os.Build;
import java.util.Arrays;

/* renamed from: X.BOS */
public final class BOS implements C25584BQq {
    public final /* synthetic */ BQV A00;

    public BOS(BQV bqv) {
        this.A00 = bqv;
    }

    public final C25521BOf ADg() {
        if (Build.VERSION.SDK_INT < 21) {
            return this.A00.A05(Constants.A0N);
        }
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr != null) {
            return this.A00.A08(Arrays.asList(strArr));
        }
        return this.A00.A05(Constants.A0C);
    }
}
