package p000X;

/* renamed from: X.DS7 */
public final class DS7 {
    public int A00;
    public int A01 = 0;
    public final DS6 A02;

    public DS7(DS6 ds6) {
        this.A02 = ds6;
        this.A00 = ds6.A02;
    }
}
