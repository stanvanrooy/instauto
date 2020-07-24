package p000X;

import com.instagram.video.live.p038ui.postlive.IgLivePostLiveBroadcasterAdapter;
import java.io.File;

/* renamed from: X.AO4 */
public final class AO4 implements Runnable {
    public final /* synthetic */ AQ5 A00;
    public final /* synthetic */ File A01;
    public final /* synthetic */ boolean A02;

    public AO4(AQ5 aq5, File file, boolean z) {
        this.A00 = aq5;
        this.A01 = file;
        this.A02 = z;
    }

    public final void run() {
        IgLivePostLiveBroadcasterAdapter igLivePostLiveBroadcasterAdapter;
        C23470ANr aNr = this.A00.A09;
        if (aNr != null) {
            File file = this.A01;
            boolean z = this.A02;
            if (C23470ANr.A02(aNr)) {
                aNr.A0a.A03((String) null);
            }
            C23467ANo aNo = aNr.A08;
            if (aNo != null) {
                C23470ANr aNr2 = aNo.A05;
                if (!aNr2.A0M && file != null) {
                    aNr2.A0H = file.getPath();
                    C2103495h r3 = aNo.A0A;
                    if (!(file == null || (igLivePostLiveBroadcasterAdapter = r3.A05) == null)) {
                        r3.A08 = file;
                        igLivePostLiveBroadcasterAdapter.A03 = true;
                        igLivePostLiveBroadcasterAdapter.A09.A06(IgLivePostLiveBroadcasterAdapter.A00(igLivePostLiveBroadcasterAdapter));
                    }
                    r3.A0A = z;
                    AnonymousClass79M r32 = aNo.A05.A0b;
                    AnonymousClass0P4 A002 = AnonymousClass79M.A00(r32, Constants.A0G);
                    A002.A0A("fully_recorded", Boolean.valueOf(z));
                    AnonymousClass0WN.A01(r32.A0N).BcG(A002);
                }
                CVK cvk = aNo.A04;
                cvk.A06.hide();
                CVL cvl = cvk.A02;
                if (cvl != null) {
                    cvl.A00.clear();
                }
                aNo.A04.A05.A8y();
                C23467ANo.A04(aNo, false);
            }
        }
    }
}
