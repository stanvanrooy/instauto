package p000X;

/* renamed from: X.D6m */
public final class D6m implements Runnable {
    public final /* synthetic */ D6I A00;
    public final /* synthetic */ D6X A01;
    public final /* synthetic */ C29724D6l A02;

    public D6m(D6I d6i, C29724D6l d6l, D6X d6x) {
        this.A00 = d6i;
        this.A02 = d6l;
        this.A01 = d6x;
    }

    public final void run() {
        C29724D6l d6l = this.A02;
        D6I d6i = this.A00;
        d6l.BTl(d6i.A00, d6i.A01, this.A01);
    }
}
