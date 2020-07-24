package p000X;

/* renamed from: X.AJX */
public final class AJX implements AKX {
    public C13300iJ A00;
    public C23334AIl A01;
    public String A02;

    public final long AJ6() {
        String str = this.A02;
        if (str == null) {
            C13150hy.A03("timeStampSeconds");
        }
        return Long.parseLong(str);
    }

    public final String AS8() {
        C13300iJ r1 = this.A00;
        if (r1 == null) {
            C13150hy.A03("userObject");
        }
        return r1.getId();
    }

    public final C13300iJ AZf() {
        C13300iJ r1 = this.A00;
        if (r1 == null) {
            C13150hy.A03("userObject");
        }
        return r1;
    }

    public final Integer AP6() {
        return Constants.A12;
    }
}
