package p000X;

import com.facebook.common.time.RealtimeSinceBootClock;
import java.lang.ref.WeakReference;

/* renamed from: X.AXF */
public final class AXF extends AnonymousClass3V6 {
    public WeakReference A00;
    public WeakReference A01;
    public final AXG A02;

    public final void BQK() {
        AXG axg = this.A02;
        if (axg != null) {
            axg.A07++;
        }
        super.BQK();
        AWU awu = (AWU) this.A00.get();
        if (awu != null) {
            awu.BCt();
        }
        AXG axg2 = this.A02;
        if (axg2 != null) {
            axg2.A01++;
            axg2.A03.A02++;
            long now = axg2.A05.now();
            if (axg2.A02 == 0) {
                AXH axh = axg2.A03;
                axh.A00 = -1;
                axh.A02 = 0;
                axh.A01 = axh.A03.now();
                axg2.A02 = now;
            }
            if (now - axg2.A02 >= axg2.A04) {
                AXH axh2 = axg2.A03;
                long now2 = axh2.A03.now();
                long j = now2 - axh2.A01;
                if (j >= 1000) {
                    axh2.A00 = (int) ((axh2.A02 * 1000) / j);
                    axh2.A01 = now2;
                    axh2.A02 = 0;
                }
                axg2.A00 = axh2.A00;
                axg2.A02 = now;
                AXI axi = axg2.A06;
                if (axi != null) {
                    C12670hC.A04(new AWX((AWU) axi.A00.A00.get(), axg2.A07, axg2.A01, axg2.A00));
                }
            }
        }
    }

    public AXF(AWY awy, AWU awu, boolean z) {
        super(awy.getSurface(), awy.AXS(), awy.AXQ(), AnonymousClass3d0.CAPTURE);
        AXG axg;
        this.A00 = new WeakReference(awu);
        this.A01 = new WeakReference(awy);
        if (z) {
            axg = new AXG(RealtimeSinceBootClock.A00, new AXI(this));
        } else {
            axg = null;
        }
        this.A02 = axg;
    }

    public final boolean A7d() {
        AWY awy;
        if (!super.A7d() || (awy = (AWY) this.A01.get()) == null || awy.Agu() || ((AWU) this.A00.get()) == null) {
            return false;
        }
        return true;
    }
}
