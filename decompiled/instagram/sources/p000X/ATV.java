package p000X;

/* renamed from: X.ATV */
public final class ATV implements Runnable {
    public final /* synthetic */ ATT A00;

    public ATV(ATT att) {
        this.A00 = att;
    }

    public final void run() {
        ATT att = this.A00;
        if (att.A02.A0E) {
            att.A01.deny();
            this.A00.A02.A0E = false;
        }
    }
}
