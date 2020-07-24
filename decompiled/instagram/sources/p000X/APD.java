package p000X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.video.live.livewith.fragment.IgLiveWithGuestFragment;

/* renamed from: X.APD */
public final class APD implements Runnable {
    public final /* synthetic */ IgLiveWithGuestFragment A00;

    public APD(IgLiveWithGuestFragment igLiveWithGuestFragment) {
        this.A00 = igLiveWithGuestFragment;
    }

    public final void run() {
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null && activity.getWindow() != null) {
            this.A00.getActivity().getWindow().addFlags(128);
        }
    }
}
