package p000X;

/* renamed from: X.AEY */
public final class AEY {
    public final /* synthetic */ C51382Kl A00;
    public final /* synthetic */ int[] A01;

    public AEY(C51382Kl r1, int[] iArr) {
        this.A00 = r1;
        this.A01 = iArr;
    }

    public final void A00() {
        int[] iArr = this.A01;
        int i = iArr[0] - 1;
        iArr[0] = i;
        if (i == 0) {
            this.A00.A00.A02();
        } else if (i < 0) {
            throw new IllegalStateException("negative recursion level");
        }
    }
}
