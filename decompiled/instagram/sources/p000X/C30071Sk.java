package p000X;

/* renamed from: X.1Sk  reason: invalid class name and case insensitive filesystem */
public final class C30071Sk implements C28111Kl {
    public final C29951Rx A00;
    public final C27371Ho A01;
    public final C30051Si A02;
    public final AnonymousClass0C1 A03;

    public C30071Sk(AnonymousClass0C1 r1, C30051Si r2, C29951Rx r3, C27371Ho r4) {
        this.A02 = r2;
        this.A00 = r3;
        this.A01 = r4;
        this.A03 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
        if (r2 < r7.A00) goto L_0x002b;
     */
    public final void ADd(AnonymousClass1TY r10, C32761bo r11) {
        boolean z;
        if (r11.A04(r10) == Constants.A0C) {
            C30051Si r7 = this.A02;
            String id = ((AnonymousClass1NJ) r10.A01).getId();
            long A002 = r7.A02.A00(id, r11.A00);
            C39531n4 r6 = (C39531n4) r7.A01.remove(id);
            if (r6 != null) {
                z = true;
            }
            z = false;
            r7.A02.A01.remove(id);
            C41691qk r1 = new C41691qk(z, r6, A002);
            if (r1.A02 && r1.A01 != null) {
                C37141jB A032 = this.A00.A03(this.A01, (AnonymousClass1NJ) r10.A01, ((C36841ih) r10.A02).getPosition(), r1.A00, r1.A01);
                A032.A13 = 24;
                A032.A04();
                C36901in.A0H(this.A03, A032, (AnonymousClass1NJ) r10.A01, this.A01, ((C36841ih) r10.A02).AHt());
            }
        }
    }
}
