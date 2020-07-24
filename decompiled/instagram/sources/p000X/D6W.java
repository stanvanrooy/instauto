package p000X;

import java.io.IOException;

/* renamed from: X.D6W */
public final class D6W implements Runnable {
    public final /* synthetic */ D6I A00;
    public final /* synthetic */ D4J A01;
    public final /* synthetic */ D6X A02;
    public final /* synthetic */ C29724D6l A03;
    public final /* synthetic */ IOException A04;
    public final /* synthetic */ boolean A05;

    public D6W(D6I d6i, C29724D6l d6l, D4J d4j, D6X d6x, IOException iOException, boolean z) {
        this.A00 = d6i;
        this.A03 = d6l;
        this.A01 = d4j;
        this.A02 = d6x;
        this.A04 = iOException;
        this.A05 = z;
    }

    public final void run() {
        C29724D6l d6l = this.A03;
        D6I d6i = this.A00;
        d6l.B9X(d6i.A00, d6i.A01, this.A01, this.A02, this.A04, this.A05);
    }
}
