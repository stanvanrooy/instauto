package p000X;

import android.view.View;
import com.instagram.video.live.livewith.fragment.IgLiveWithGuestFragment;

/* renamed from: X.AOE */
public final class AOE implements Runnable {
    public final /* synthetic */ C23553AQx A00;

    public AOE(C23553AQx aQx) {
        this.A00 = aQx;
    }

    public final void run() {
        IgLiveWithGuestFragment igLiveWithGuestFragment = this.A00.A0K;
        AMI ami = igLiveWithGuestFragment.A0C;
        String str = igLiveWithGuestFragment.A0H;
        String str2 = igLiveWithGuestFragment.A0I;
        boolean Aec = igLiveWithGuestFragment.A02.Aec();
        ami.A03.A0C(str, str2, ((Integer) AnonymousClass0L6.A02(ami.A01, AnonymousClass0L7.LIVE_HEARTBEAT_POLLING_INTERVAL, "interval_in_ms", 3000, (AnonymousClass04H) null)).intValue(), false);
        ami.A00 = str;
        ami.A03.A0I(Aec);
        igLiveWithGuestFragment.A0J = true;
        View view = igLiveWithGuestFragment.A0G.A01.A00;
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
        }
        C12670hC.A04(igLiveWithGuestFragment.A0Q);
    }
}
