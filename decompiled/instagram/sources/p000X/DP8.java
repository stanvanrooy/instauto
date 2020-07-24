package p000X;

import java.util.HashMap;

/* renamed from: X.DP8 */
public final class DP8 implements C30085DPp {
    public final /* synthetic */ C30085DPp A00;
    public final /* synthetic */ C30061DOr A01;
    public final /* synthetic */ HashMap A02;

    public DP8(C30061DOr dOr, HashMap hashMap, C30085DPp dPp) {
        this.A01 = dOr;
        this.A02 = hashMap;
        this.A00 = dPp;
    }

    public final void Auo(C30073DPd dPd) {
        this.A01.A04.A03("recording_failed", this.A02);
        this.A01.A04.A00.A0C.A00.A08.A05(22);
        this.A00.Auo(dPd);
    }

    public final void Aup() {
        this.A01.A04.A03("recording_finished", this.A02);
        this.A01.A04.A00.A0C.A00.A08.A06(22);
        this.A00.Aup();
    }

    public final void Aur(long j) {
        this.A01.A04.A03("recording_started", this.A02);
        this.A00.Aur(j);
    }

    public final long now() {
        return this.A00.now();
    }
}
