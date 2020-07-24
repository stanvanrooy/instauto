package p000X;

import java.lang.ref.WeakReference;

/* renamed from: X.CVL */
public final class CVL implements C24967AxA {
    public final WeakReference A00;

    public final void B2m(Throwable th) {
    }

    public final void onComplete() {
    }

    public final /* bridge */ /* synthetic */ void BD2(Object obj) {
        C4A c4a = (C4A) obj;
        CVK cvk = (CVK) this.A00.get();
        if (cvk != null) {
            if (c4a.A02 == C26813Bsy.LIVE) {
                CVN cvn = cvk.A06;
                long j = c4a.A00;
                String str = c4a.A05;
                C13300iJ r0 = c4a.A01;
                cvn.BoM(j, str, r0.AZn(), r0.ASv());
            } else {
                cvk.A06.BoN(c4a.A00, c4a.A05);
            }
            cvk.A05.Bgt(cvk.A04, c4a.A00, c4a.A05);
        }
    }

    public CVL(CVK cvk) {
        this.A00 = new WeakReference(cvk);
    }
}
