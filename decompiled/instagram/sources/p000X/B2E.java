package p000X;

/* renamed from: X.B2E */
public final class B2E implements C25126B2c {
    public final /* synthetic */ C25115B1l A00;

    public B2E(C25115B1l b1l) {
        this.A00 = b1l;
    }

    public final void BTo(String str) {
        synchronized (this.A00.A0C) {
            for (C25126B2c BTo : this.A00.A0C) {
                BTo.BTo(str);
            }
        }
    }
}
