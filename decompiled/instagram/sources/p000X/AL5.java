package p000X;

import android.os.Bundle;
import com.instagram.modal.ModalActivity;

/* renamed from: X.AL5 */
public final class AL5 extends AWN {
    public final /* synthetic */ AWZ A00;
    public final /* synthetic */ AL4 A01;
    public final /* synthetic */ String A02;

    public AL5(AL4 al4, String str, AWZ awz) {
        this.A01 = al4;
        this.A02 = str;
        this.A00 = awz;
    }

    public final void A02() {
        Bundle bundle = new Bundle();
        bundle.putString("args.broadcast_id", this.A01.A0B);
        bundle.putString("args.media_id", this.A01.A03);
        bundle.putString("args.server_info", this.A01.A04);
        bundle.putString("args.broadcaster_id", this.A01.A08.getId());
        bundle.putString("args.invite_type", this.A02);
        bundle.putString("args.tracking_token", this.A01.A01.A0Q);
        bundle.putBoolean("args.employee_mode", this.A01.A01.A0X);
        bundle.putBoolean("args.live_trace_enabled", false);
        C191188Ff r0 = this.A01.A00;
        if (r0 != null) {
            bundle.putBoolean("args.camera_front_facing", r0.Aec());
        }
        AL4 al4 = this.A01;
        C59032gv r2 = new C59032gv(al4.A07, ModalActivity.class, "livewith_guest", bundle, al4.A06.getActivity());
        r2.A0A = ModalActivity.A04;
        r2.A07(this.A01.A06, 5151);
        this.A00.A04(true);
    }
}
