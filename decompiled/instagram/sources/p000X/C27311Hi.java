package p000X;

import android.os.SystemClock;

/* renamed from: X.1Hi  reason: invalid class name and case insensitive filesystem */
public final class C27311Hi implements Runnable {
    public float A00;
    public C255119b A01;
    public boolean A02;
    public boolean A03;
    public final /* synthetic */ C27301Hh A04;

    public C27311Hi(C27301Hh r1) {
        this.A04 = r1;
    }

    public final void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        int i = (int) (uptimeMillis - this.A04.A05);
        if (this.A01.AOh() == this.A01.getCount() - 1) {
            C255119b r1 = this.A01;
            if (r1.AI1(r1.AI5() - 1) != null) {
                C255119b r12 = this.A01;
                if (r12.AI1(r12.AI5() - 1).getBottom() == this.A01.AaK().getBottom()) {
                    if (this.A04.A06.Bmr(this.A01)) {
                        this.A00 = this.A04.A00;
                        this.A03 = true;
                    }
                    this.A02 = true;
                }
            }
        }
        C27301Hh r3 = this.A04;
        int round = Math.round(Math.abs((r3.A00 - r3.A01) - this.A00));
        int i2 = (int) (((float) i) * r3.A0D);
        if (round < i2) {
            i2 = round;
        }
        if (round != 0) {
            r3.A05 = uptimeMillis;
            AnonymousClass0ZA.A09(r3.A0E, this, 5, -184581552);
        }
        if (this.A03) {
            i2 = -i2;
        }
        if (this.A02 || this.A04.A06.Bmp()) {
            C27301Hh.A02(this.A04, (float) i2);
            this.A01.AaK().requestLayout();
            return;
        }
        C255119b r2 = this.A01;
        if (!r2.AgC()) {
            r2.AaK().scrollBy(0, i2);
        } else {
            r2.BkS(r2.ALs(), this.A01.AI1(0).getTop() - i2);
        }
    }
}
