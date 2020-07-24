package p000X;

/* renamed from: X.1Qr  reason: invalid class name and case insensitive filesystem */
public final class C29641Qr implements C29651Qs {
    public final /* synthetic */ C27321Hj A00;

    public C29641Qr(C27321Hj r1) {
        this.A00 = r1;
    }

    public final boolean A9b(AnonymousClass1NJ r4) {
        C29331Pm r2 = this.A00.A0I.A0T;
        if (!r2.A01.contains(r4)) {
            if (r2.A03.containsKey(r4.getId())) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void BBE(AnonymousClass1NJ r5) {
        C27321Hj r1 = this.A00;
        if (r1.A0k) {
            AnonymousClass1PE r3 = r1.A0I;
            int[] iArr = (int[]) r3.A03.A07.get(r5);
            if (iArr != null) {
                r3.notifyItemRangeChanged(iArr[0], iArr[1]);
                return;
            }
            return;
        }
        r1.A0I.AE6();
    }
}
