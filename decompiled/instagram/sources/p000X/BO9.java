package p000X;

import android.content.Intent;

/* renamed from: X.BO9 */
public final class BO9 implements C25584BQq {
    public final /* synthetic */ BO6 A00;

    public BO9(BO6 bo6) {
        this.A00 = bo6;
    }

    public final C25521BOf ADg() {
        BO6 bo6 = this.A00;
        Intent intent = bo6.A00;
        if (intent != null) {
            return bo6.A06(intent.getStringExtra("technology"));
        }
        return bo6.A05(Constants.A0C);
    }
}
