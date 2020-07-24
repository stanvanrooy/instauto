package p000X;

import android.os.Handler;

/* renamed from: X.DI8 */
public final class DI8 implements C137125t6 {
    public static final DI8 A08 = new DI8();
    public DIE A00 = new DIB(this);
    public int A01 = 0;
    public int A02 = 0;
    public Handler A03;
    public Runnable A04 = new DI9(this);
    public boolean A05 = true;
    public boolean A06 = true;
    public final AnonymousClass7JR A07 = new AnonymousClass7JR(this);

    public final void A01() {
        int i = this.A01 + 1;
        this.A01 = i;
        if (i != 1) {
            return;
        }
        if (this.A05) {
            this.A07.A08(C1662977d.ON_RESUME);
            this.A05 = false;
            return;
        }
        AnonymousClass0ZA.A08(this.A03, this.A04);
    }

    public final void A02() {
        int i = this.A02 + 1;
        this.A02 = i;
        if (i == 1 && this.A06) {
            this.A07.A08(C1662977d.ON_START);
            this.A06 = false;
        }
    }

    public static C137125t6 A00() {
        return A08;
    }

    public final C148076Un getLifecycle() {
        return this.A07;
    }
}
