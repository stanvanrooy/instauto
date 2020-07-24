package p000X;

/* renamed from: X.AC3 */
public final class AC3 implements Runnable {
    public final /* synthetic */ AC2 A00;

    public AC3(AC2 ac2) {
        this.A00 = ac2;
    }

    public final void run() {
        synchronized (this.A00) {
            AC2 ac2 = this.A00;
            if (!ac2.A01) {
                ac2.A06.invoke(ABZ.A00(3, "Location request timed out"));
                AC2 ac22 = this.A00;
                AnonymousClass0ZD.A01(ac22.A04, ac22.A03);
                this.A00.A01 = true;
            }
        }
    }
}
