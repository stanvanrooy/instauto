package p000X;

/* renamed from: X.D8X */
public final class D8X implements D9G {
    public final D9G[] A00;

    public final boolean Aeh(String str) {
        for (D9G Aeh : this.A00) {
            if (Aeh.Aeh(str)) {
                return true;
            }
        }
        return false;
    }

    public D8X(D9G... d9gArr) {
        this.A00 = d9gArr;
    }
}
