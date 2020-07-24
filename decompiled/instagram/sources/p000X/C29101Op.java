package p000X;

/* renamed from: X.1Op  reason: invalid class name and case insensitive filesystem */
public final class C29101Op extends C27591Il {
    public long A00 = -1;
    public AnonymousClass0RU A01;
    public C51292Kb A02 = null;
    public C29081On A03;
    public final C04140Cp A04;
    public final C27371Ho A05;

    public C51292Kb getMode() {
        return this.A02;
    }

    public boolean isActive() {
        if (this.A02 == null || this.A00 == -1) {
            return false;
        }
        return true;
    }

    public C29101Op(C27371Ho r3, C29081On r4, C04140Cp r5, AnonymousClass0RU r6) {
        this.A05 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r6;
    }

    public final void A09(C255119b r7, int i, int i2, int i3, int i4, int i5) {
        int A032 = AnonymousClass0Z0.A03(1723913479);
        int AOh = r7.AOh();
        for (int ALs = r7.ALs(); ALs <= AOh; ALs++) {
            boolean z = false;
            if (C36371hw.A06(r7, ALs) == C36421i1.LOAD_MORE) {
                z = true;
            }
            if (z && this.A03.AgL() && this.A03.Abq()) {
                C51292Kb r1 = C51292Kb.TailFetch;
                C12670hC.A02();
                if (this.A02 == null) {
                    this.A02 = r1;
                    this.A00 = this.A04.now();
                }
            }
        }
        AnonymousClass0Z0.A0A(1628360980, A032);
    }
}
