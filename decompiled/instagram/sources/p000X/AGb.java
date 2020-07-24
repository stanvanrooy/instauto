package p000X;

import com.instagram.video.player.common.LiveVideoDebugStatsView;
import java.util.TimerTask;

/* renamed from: X.AGb */
public final class AGb extends TimerTask {
    public final /* synthetic */ LiveVideoDebugStatsView A00;

    public AGb(LiveVideoDebugStatsView liveVideoDebugStatsView) {
        this.A00 = liveVideoDebugStatsView;
    }

    public final void run() {
        synchronized (this.A00) {
            LiveVideoDebugStatsView liveVideoDebugStatsView = this.A00;
            C23279AGc[] aGcArr = liveVideoDebugStatsView.A08;
            int i = liveVideoDebugStatsView.A01;
            aGcArr[i] = new C23279AGc(liveVideoDebugStatsView.A06, liveVideoDebugStatsView.A03, liveVideoDebugStatsView.A04, liveVideoDebugStatsView.A02, liveVideoDebugStatsView.A05);
            int i2 = i + 1;
            int length = aGcArr.length;
            int i3 = i2 % length;
            liveVideoDebugStatsView.A01 = i3;
            int i4 = liveVideoDebugStatsView.A00;
            if (i3 == i4) {
                liveVideoDebugStatsView.A00 = (i4 + 1) % length;
            }
        }
        this.A00.postInvalidate();
    }
}
