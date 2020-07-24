package p000X;

import android.content.pm.ApplicationInfo;

/* renamed from: X.BPE */
public final class BPE implements C25584BQq {
    public final /* synthetic */ BOF A00;

    public BPE(BOF bof) {
        this.A00 = bof;
    }

    public final C25521BOf ADg() {
        BOF bof = this.A00;
        ApplicationInfo applicationInfo = bof.A01;
        if (applicationInfo != null) {
            return bof.A03(applicationInfo.theme);
        }
        return bof.A05(Constants.A0C);
    }
}
