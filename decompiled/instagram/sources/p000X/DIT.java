package p000X;

import android.media.AudioTrack;
import com.instagram.arlink.fragment.ArLinkScanControllerImpl;

/* renamed from: X.DIT */
public final class DIT {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public final DIY A05;

    public static void A00(DIT dit, int i) {
        dit.A00 = i;
        if (i == 0) {
            dit.A03 = 0;
            dit.A01 = -1;
            dit.A02 = System.nanoTime() / 1000;
            dit.A04 = ArLinkScanControllerImpl.ERROR_DELAY_MS;
        } else if (i == 1) {
            dit.A04 = ArLinkScanControllerImpl.ERROR_DELAY_MS;
        } else if (i == 2 || i == 3) {
            dit.A04 = 10000000;
        } else if (i == 4) {
            dit.A04 = 500000;
        } else {
            throw new IllegalStateException();
        }
    }

    public DIT(AudioTrack audioTrack) {
        if (C25948Bd0.A00 >= 19) {
            DIY diy = new DIY(audioTrack);
            this.A05 = diy;
            if (diy != null) {
                A00(this, 0);
                return;
            }
            return;
        }
        this.A05 = null;
        A00(this, 3);
    }
}
