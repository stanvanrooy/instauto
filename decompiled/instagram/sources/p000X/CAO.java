package p000X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.framelayout.MediaFrameLayout;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.p009ui.mediaactions.MediaActionsView;

/* renamed from: X.CAO */
public final class CAO implements C32161ah {
    public View A00;
    public MediaFrameLayout A01;
    public C32221an A02;
    public C32291au A03;
    public C36841ih A04;
    public IgProgressImageView A05;
    public MediaActionsView A06;

    public final C32231ao APv() {
        return null;
    }

    public CAO(View view) {
        this.A05 = (IgProgressImageView) view.findViewById(C0003R.C0005id.fixed_media_header_image);
        this.A00 = view.findViewById(C0003R.C0005id.fixed_media_header_overlay);
        this.A01 = (MediaFrameLayout) view.findViewById(C0003R.C0005id.fixed_media_header_container);
        this.A06 = (MediaActionsView) view.findViewById(C0003R.C0005id.fixed_media_header_media_actions);
        this.A02 = new C32221an((ViewStub) view.findViewById(C0003R.C0005id.fixed_media_header_audio_icon_stub));
        this.A03 = new C32291au((ViewStub) view.findViewById(C0003R.C0005id.fixed_media_header_play_button_stub));
    }

    public final C32221an AGJ() {
        return this.A02;
    }

    public final IgProgressImageView ANP() {
        return this.A05;
    }

    public final MediaActionsView APf() {
        return this.A06;
    }

    public final View APn() {
        return this.A01;
    }

    public final C36841ih APt() {
        return this.A04;
    }

    public final C31841a5 AXz() {
        return this.A01;
    }
}
