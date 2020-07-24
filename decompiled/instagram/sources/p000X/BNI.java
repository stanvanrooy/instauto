package p000X;

import android.provider.Settings;

/* renamed from: X.BNI */
public final class BNI implements C25584BQq {
    public final /* synthetic */ BNF A00;

    public BNI(BNF bnf) {
        this.A00 = bnf;
    }

    public final C25521BOf ADg() {
        BNF bnf = this.A00;
        return bnf.A02(((float) Settings.System.getInt(bnf.A00, "screen_brightness", -1)) / 255.0f);
    }
}
