package p000X;

/* renamed from: X.BEW */
public final class BEW implements Runnable {
    public final /* synthetic */ C25325BEf A00;
    public final /* synthetic */ BEV A01;

    public BEW(BEV bev, C25325BEf bEf) {
        this.A01 = bev;
        this.A00 = bEf;
    }

    public final void run() {
        C25322BEc bEc = this.A01.A02;
        C25325BEf bEf = this.A00;
        synchronized (bEc) {
            for (C25344BEz BOt : bEc.A00) {
                BOt.BOt(bEf);
            }
        }
    }
}
