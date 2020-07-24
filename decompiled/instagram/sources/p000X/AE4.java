package p000X;

/* renamed from: X.AE4 */
public final class AE4 extends C46251zQ {
    public final /* synthetic */ AGQ A00;
    public final /* synthetic */ AE2 A01;

    public final Object A02(int i, int i2) {
        return null;
    }

    public AE4(AE2 ae2, AGQ agq) {
        this.A01 = ae2;
        this.A00 = agq;
    }

    public final int A00() {
        return this.A00.A08.size();
    }

    public final int A01() {
        return this.A00.A07.getItemCount();
    }

    public final boolean A03(int i, int i2) {
        if (this.A00.A07.A05.get(i) == this.A00.A08.get(i2)) {
            return true;
        }
        return false;
    }

    public final boolean A04(int i, int i2) {
        if (((AnonymousClass2D8) this.A00.A07.A05.get(i)).AIE() == ((AnonymousClass2D8) this.A00.A08.get(i2)).AIE()) {
            return true;
        }
        return false;
    }
}
