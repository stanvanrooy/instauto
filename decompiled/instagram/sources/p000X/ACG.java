package p000X;

/* renamed from: X.ACG */
public final class ACG implements Runnable {
    public final /* synthetic */ ACD A00;
    public final /* synthetic */ ACD A01;

    public ACG(ACD acd, ACD acd2) {
        this.A00 = acd;
        this.A01 = acd2;
    }

    public final void run() {
        ACD acd = this.A00;
        C228039ra.A00();
        if (ACJ.A01 == null) {
            ACJ.A01 = new ACJ();
        }
        acd.A06 = ACJ.A01;
        this.A00.A06.A00(this.A01);
    }
}
