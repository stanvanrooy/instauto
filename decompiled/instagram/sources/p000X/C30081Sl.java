package p000X;

/* renamed from: X.1Sl  reason: invalid class name and case insensitive filesystem */
public final class C30081Sl implements C28111Kl {
    public C30051Si A00;

    public C30081Sl(C30051Si r1) {
        this.A00 = r1;
    }

    public final void ADd(AnonymousClass1TY r7, C32761bo r8) {
        if (r8.A04(r7) != Constants.A0C) {
            C30051Si r5 = this.A00;
            String id = ((AnonymousClass1NJ) r7.A01).getId();
            float A02 = r8.A02(r7);
            r5.A02.A01(id, A02, r8.A00);
            C39531n4 r2 = (C39531n4) r5.A01.get(id);
            if (r2 == null) {
                r2 = new C39531n4();
                r5.A01.put(id, r2);
            }
            r2.A00((double) A02);
        }
    }
}
