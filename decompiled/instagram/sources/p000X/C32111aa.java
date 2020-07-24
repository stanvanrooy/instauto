package p000X;

/* renamed from: X.1aa  reason: invalid class name and case insensitive filesystem */
public final class C32111aa implements Runnable {
    public final /* synthetic */ C15880ng A00;
    public final /* synthetic */ C28661Mp A01;
    public final /* synthetic */ C28571Mg A02;
    public final /* synthetic */ AnonymousClass1LV A03;

    public C32111aa(AnonymousClass1LV r1, C15880ng r2, C28571Mg r3, C28661Mp r4) {
        this.A03 = r1;
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = r4;
    }

    public final void run() {
        C28571Mg r1;
        synchronized (this.A03.A0J) {
            C28541Md r4 = this.A03.A03;
            if (r4 != null) {
                C15880ng r3 = this.A00;
                if (r4.A07(r3, this.A02, this.A01, r3.A00()) && ((r1 = this.A02) == C28571Mg.CACHED || r1 == C28571Mg.LOCAL)) {
                    AnonymousClass1LV r5 = this.A03;
                    C28661Mp r32 = this.A01;
                    r5.A02 = new C37251jM(r32.A09, r32, -1);
                    C28341Li r2 = this.A03.A08;
                    String AQs = this.A01.AQs();
                    if (r2.A01 == null) {
                        r2.A01 = AQs;
                        boolean z = false;
                        if (AQs != null) {
                            z = true;
                        }
                        r2.A02 = z;
                    }
                }
            }
        }
    }
}
