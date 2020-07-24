package p000X;

import android.os.Handler;
import java.util.Map;

/* renamed from: X.DPB */
public final class DPB implements C88443sQ {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ DKT A01;
    public final /* synthetic */ C30053DOi A02;
    public final /* synthetic */ DQ6 A03;

    public DPB(C30053DOi dOi, DQ6 dq6, DKT dkt, Handler handler) {
        this.A02 = dOi;
        this.A03 = dq6;
        this.A01 = dkt;
        this.A00 = handler;
    }

    public final void B2h(Exception exc, Map map) {
        C30073DPd dPd = new C30073DPd((Throwable) exc);
        dPd.A01(map);
        this.A02.A07.A00("prepare_recording_video_failed", dPd, "high");
        DKO.A03(this.A01, this.A00, dPd);
    }

    public final void onSuccess() {
        DQ6 dq6 = this.A03;
        int i = dq6.A00 - 1;
        dq6.A00 = i;
        if (i == 0) {
            DKO.A02(this.A01, this.A00);
        }
    }
}
