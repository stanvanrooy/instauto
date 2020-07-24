package p000X;

import android.view.View;
import com.facebook.C0003R;

/* renamed from: X.AMR */
public final class AMR implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C16180oA A01;
    public final /* synthetic */ AMF A02;

    public AMR(AMF amf, C16180oA r2, int i) {
        this.A02 = amf;
        this.A01 = r2;
        this.A00 = i;
    }

    public final void run() {
        AMG amg = this.A02.A0H.A0K;
        View view = amg.A05.A04;
        if (view != null) {
            amg.A08.A00(amg.A07.A05, view, C0003R.string.live_cobroadcast_invite_tooltip);
        }
        C16180oA r1 = this.A01;
        r1.A00.edit().putInt("live_with_invite_button_tooltip_view_count", this.A00 + 1).apply();
    }
}
