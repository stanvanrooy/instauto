package p000X;

import android.content.pm.ApplicationInfo;

/* renamed from: X.BPF */
public final class BPF implements C25584BQq {
    public final /* synthetic */ BOF A00;

    public BPF(BOF bof) {
        this.A00 = bof;
    }

    public final C25521BOf ADg() {
        BOF bof = this.A00;
        ApplicationInfo applicationInfo = bof.A01;
        if (applicationInfo != null) {
            return bof.A06(applicationInfo.dataDir);
        }
        return bof.A05(Constants.A0C);
    }
}
