package p000X;

/* renamed from: X.DKY */
public final class DKY implements Runnable {
    public final /* synthetic */ DKX A00;

    public DKY(DKX dkx) {
        this.A00 = dkx;
    }

    public final void run() {
        byte[] bArr = new byte[this.A00.A00];
        int i = 0;
        while (this.A00.A07 == Constants.A0C) {
            DKX dkx = this.A00;
            if (!dkx.A04.A00) {
                i = dkx.A02.read(bArr, 0, bArr.length);
            }
            this.A00.A05.AzA(bArr, i);
        }
    }
}
