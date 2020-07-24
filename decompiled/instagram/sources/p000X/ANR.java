package p000X;

import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.video.live.livewith.fragment.IgLiveWithGuestFragment;

/* renamed from: X.ANR */
public final class ANR implements CVA {
    public final /* synthetic */ IgLiveWithGuestFragment A00;

    public final void Acl() {
    }

    public final void Bok(int i) {
    }

    public ANR(IgLiveWithGuestFragment igLiveWithGuestFragment) {
        this.A00 = igLiveWithGuestFragment;
    }

    public final void Bfo(boolean z) {
        AO7 ao7 = this.A00.A0G;
        TextView textView = ao7.A01.A02;
        int i = C0003R.string.live_label;
        if (z) {
            i = C0003R.string.live_qa_label;
        }
        textView.setText(i);
        TextView textView2 = ao7.A01.A02;
        int i2 = C0003R.C0004drawable.live_label_background;
        if (z) {
            i2 = C0003R.C0004drawable.live_qa_label_background;
        }
        textView2.setBackgroundResource(i2);
    }
}
