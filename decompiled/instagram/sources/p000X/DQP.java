package p000X;

import com.instagram.music.common.model.DownloadedTrack;

/* renamed from: X.DQP */
public final class DQP implements Runnable {
    public final /* synthetic */ DownloadedTrack A00;
    public final /* synthetic */ DQO A01;

    public DQP(DQO dqo, DownloadedTrack downloadedTrack) {
        this.A01 = dqo;
        this.A00 = downloadedTrack;
    }

    public final void run() {
        DQO dqo = this.A01;
        C87873rU r1 = dqo.A03;
        if (r1.A00) {
            r1.A00 = false;
            DownloadedTrack downloadedTrack = this.A00;
            if (downloadedTrack != null) {
                dqo.A02.B0k(downloadedTrack);
                for (DQQ B0k : this.A01.A03.A03) {
                    B0k.B0k(this.A00);
                }
                return;
            }
            dqo.A02.B0n();
            for (DQQ B0n : this.A01.A03.A03) {
                B0n.B0n();
            }
        }
    }
}
