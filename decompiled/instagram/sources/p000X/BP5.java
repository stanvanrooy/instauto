package p000X;

import android.icu.util.TimeZone;
import android.os.Build;

/* renamed from: X.BP5 */
public final class BP5 implements C25584BQq {
    public final /* synthetic */ C25576BQi A00;

    public BP5(C25576BQi bQi) {
        this.A00 = bQi;
    }

    public final C25521BOf ADg() {
        if (Build.VERSION.SDK_INT < 24) {
            return this.A00.A05(Constants.A0N);
        }
        return this.A00.A06(TimeZone.getDefault().getID());
    }
}
