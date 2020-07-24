package p000X;

/* renamed from: X.ARB */
public final class ARB implements Runnable {
    public final /* synthetic */ C23724Aa8 A00;
    public final /* synthetic */ AOA A01;

    public ARB(AOA aoa, C23724Aa8 aa8) {
        this.A01 = aoa;
        this.A00 = aa8;
    }

    public final void run() {
        ARC arc = this.A01.A00;
        if (arc != null) {
            arc.Atj(this.A00);
        }
    }
}
