package p000X;

import android.view.View;
import com.facebook.C0003R;

/* renamed from: X.AMX */
public final class AMX implements Runnable {
    public final /* synthetic */ AMF A00;

    public AMX(AMF amf) {
        this.A00 = amf;
    }

    public final void run() {
        AMG amg = this.A00.A0H.A0K;
        View view = amg.A05.A06;
        if (view != null) {
            amg.A09.A00(amg.A07.A05, view, C0003R.string.live_ssi_tooltip);
        }
    }
}
