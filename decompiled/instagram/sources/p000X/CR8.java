package p000X;

/* renamed from: X.CR8 */
public final class CR8 implements C40371oY {
    public final int A00;
    public final C27702CNw A01;
    public final boolean A02;
    public final boolean A03;

    public final /* bridge */ /* synthetic */ boolean Aep(Object obj) {
        CR8 cr8 = (CR8) obj;
        if (this.A01.equals(cr8.A01) && this.A00 == cr8.A00 && this.A02 == cr8.A02 && this.A03 == cr8.A03) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01.A02;
    }

    public CR8(C27702CNw cNw, int i, boolean z, boolean z2) {
        this.A01 = cNw;
        this.A00 = i;
        this.A02 = z;
        this.A03 = z2;
    }
}
