package p000X;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.DPD */
public final class DPD {
    public final /* synthetic */ DPP A00;
    public final /* synthetic */ C30063DOt A01;
    public final /* synthetic */ AtomicInteger A02;

    public final void A00() {
        String.format((Locale) null, "Track %s has data", new Object[]{this.A00.AZ7()});
        if (this.A02.decrementAndGet() == 0) {
            C30063DOt dOt = this.A01;
            for (DPP Bpc : dOt.A05.values()) {
                Bpc.Bpc(new DQ2(dOt));
            }
        }
    }

    public DPD(C30063DOt dOt, DPP dpp, AtomicInteger atomicInteger) {
        this.A01 = dOt;
        this.A00 = dpp;
        this.A02 = atomicInteger;
    }
}
