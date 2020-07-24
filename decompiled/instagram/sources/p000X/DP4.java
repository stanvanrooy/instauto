package p000X;

import java.util.Locale;

/* renamed from: X.DP4 */
public final class DP4 implements Runnable {
    public final /* synthetic */ C30090DPu A00;
    public final /* synthetic */ C30064DOu A01;

    public DP4(C30064DOu dOu, C30090DPu dPu) {
        this.A01 = dOu;
        this.A00 = dPu;
    }

    public final void run() {
        C30090DPu dPu = this.A00;
        String.format((Locale) null, "Muxer wrote first samples to file", new Object[0]);
        C30063DOt.A00(dPu.A01, DPU.RECORDING);
        dPu.A01.A04.A00("recording_start_finished");
        C30063DOt dOt = dPu.A01;
        C30085DPp dPp = dOt.A02;
        if (dPp != null) {
            AnonymousClass0ZA.A0E(dOt.A06, new C30086DPq(dOt, dPp, dPp.now()), 1747755120);
        }
        dPu.A00.B4s();
    }
}
