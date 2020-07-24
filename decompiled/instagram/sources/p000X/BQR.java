package p000X;

/* renamed from: X.BQR */
public final class BQR implements BR9 {
    public AnonymousClass0QT A00;
    public AnonymousClass0RN A01;
    public AnonymousClass0C1 A02;

    public final void BtQ(Object obj) {
        try {
            AnonymousClass0C1 r2 = (AnonymousClass0C1) obj;
            this.A02 = r2;
            this.A00 = AnonymousClass0QT.A00(r2, this.A01);
        } catch (ClassCastException e) {
            C54802Yz.A00(e);
        }
    }

    public BQR(AnonymousClass0C1 r2, AnonymousClass0RN r3) {
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = AnonymousClass0QT.A00(r2, r3);
    }
}
