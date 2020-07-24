package p000X;

import android.content.pm.ConfigurationInfo;

/* renamed from: X.BPT */
public final class BPT implements C25584BQq {
    public final /* synthetic */ BPP A00;

    public BPT(BPP bpp) {
        this.A00 = bpp;
    }

    public final C25521BOf ADg() {
        BPP bpp = this.A00;
        ConfigurationInfo configurationInfo = bpp.A00;
        if (configurationInfo != null) {
            return bpp.A03(configurationInfo.reqNavigation);
        }
        return bpp.A05(Constants.A0C);
    }
}
