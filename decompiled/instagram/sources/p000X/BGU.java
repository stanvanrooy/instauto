package p000X;

/* renamed from: X.BGU */
public abstract class BGU extends C25363BGb {
    public final B57 A00;

    public void A07(C25369BGh bGh) {
        bGh.A07.remove((Object) null);
        C60292jf r2 = ((B59) this).A00.A00;
        synchronized (r2.A04) {
            if (!r2.A02) {
                r2.A02 = true;
                r2.A01 = false;
                r2.A03.A00(r2);
            }
        }
    }

    public BGU(B57 b57) {
        this.A00 = b57;
    }
}
