package p000X;

import java.util.Map;

/* renamed from: X.DP3 */
public final class DP3 implements C88443sQ {
    public final /* synthetic */ DKT A00;
    public final /* synthetic */ C30054DOj A01;

    public DP3(C30054DOj dOj, DKT dkt) {
        this.A01 = dOj;
        this.A00 = dkt;
    }

    public final void B2h(Exception exc, Map map) {
        C30073DPd dPd;
        this.A01.release();
        if (exc instanceof C30073DPd) {
            dPd = (C30073DPd) exc;
        } else {
            dPd = new C30073DPd((Throwable) exc);
        }
        if (map != null) {
            dPd.A01(map);
        }
        Map AJu = this.A01.A09.AJu();
        if (AJu != null) {
            dPd.A01(AJu);
        }
        this.A01.A0B.A01("stop_recording_audio_failed", dPd, "high");
        this.A00.B2m(exc);
    }

    public final void onSuccess() {
        C30054DOj dOj = this.A01;
        DKK dkk = dOj.A01;
        if (dkk != null) {
            dkk.A02(new DPK(this), dOj.A08);
            return;
        }
        dOj.release();
        C30073DPd dPd = new C30073DPd(22000, "mAudioEncoder is null while stopping");
        this.A01.A0B.A01("stop_recording_audio_failed", dPd, "low");
        this.A00.B2m(dPd);
    }
}
