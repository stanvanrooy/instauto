package p000X;

/* renamed from: X.ATU */
public final class ATU implements Runnable {
    public final /* synthetic */ ATS A00;

    public ATU(ATS ats) {
        this.A00 = ats;
    }

    public final void run() {
        ATS ats = this.A00;
        if (ats.A02.A0E) {
            ats.A01.deny();
            this.A00.A02.A0E = false;
        }
    }
}
