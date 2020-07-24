package p000X;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.instagram.video.live.livewith.fragment.IgLiveWithGuestFragment;

/* renamed from: X.AOC */
public final class AOC implements View.OnClickListener {
    public final /* synthetic */ IgLiveWithGuestFragment A00;

    public AOC(IgLiveWithGuestFragment igLiveWithGuestFragment) {
        this.A00 = igLiveWithGuestFragment;
    }

    public final void onClick(View view) {
        long elapsedRealtime;
        int A05 = AnonymousClass0Z0.A05(-1367409694);
        AnonymousClass7E0 r8 = this.A00.A09;
        Long l = r8.A04;
        if (l == null) {
            elapsedRealtime = 0;
        } else {
            elapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
        }
        AnonymousClass0P4 A02 = AnonymousClass7E0.A02(r8, Constants.A14, Constants.A0N);
        A02.A0C("response_time", Double.valueOf(((double) elapsedRealtime) / 1000.0d));
        AnonymousClass0WN.A01(r8.A0A).BcG(A02);
        IgLiveWithGuestFragment.A02(this.A00, true, (Bundle) null);
        AnonymousClass0Z0.A0C(1492360361, A05);
    }
}
