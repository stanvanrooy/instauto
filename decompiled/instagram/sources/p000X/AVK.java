package p000X;

/* renamed from: X.AVK */
public final class AVK {
    public long A00;
    public long A01;
    public boolean A02;
    public final AVM A03;
    public final /* synthetic */ AVR A04;

    public AVK(AVR avr, AVM avm) {
        this.A04 = avr;
        this.A03 = avm;
    }

    public final void A00() {
        long j;
        if (this.A02) {
            j = this.A00 + (this.A03.now() - this.A01);
        } else {
            j = this.A00;
        }
        this.A00 = j;
        this.A02 = false;
    }
}
