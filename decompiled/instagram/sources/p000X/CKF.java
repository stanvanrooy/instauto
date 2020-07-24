package p000X;

/* renamed from: X.CKF */
public final class CKF implements B7D {
    public String A00;
    public final int A01;
    public final String A02;
    public final String A03 = null;
    public final String A04;

    public /* synthetic */ CKF(String str, int i, String str2) {
        C13150hy.A02(str, "emptyMessage");
        this.A02 = str;
        this.A01 = i;
        this.A04 = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r5.length() == 0) goto L_0x000f;
     */
    public final B7B AWi(B7B b7b, CharSequence charSequence, boolean z) {
        boolean z2;
        String str;
        C13150hy.A02(b7b, "stateBuilder");
        boolean z3 = false;
        if (charSequence != null) {
            z2 = false;
        }
        z2 = true;
        if (z2) {
            b7b.A01 = "error";
            b7b.A00 = this.A02;
            str = "stateBuilder.error().setMessage(emptyMessage)";
        } else if (this.A04 != null && charSequence.length() < this.A01) {
            b7b.A01 = "error";
            b7b.A00 = this.A04;
            str = "stateBuilder.error().setMessage(minLengthMessage)";
        } else if (this.A03 == null || charSequence.length() <= 0) {
            String str2 = this.A00;
            if (str2 == null || str2.length() == 0) {
                z3 = true;
            }
            if (!z3) {
                b7b.A01 = "error";
                b7b.A00 = this.A00;
                str = "stateBuilder.error().setMessage(errorMessage)";
            }
            return b7b;
        } else {
            b7b.A01 = "error";
            b7b.A00 = this.A03;
            str = "stateBuilder.error().setMessage(maxLengthMessage)";
        }
        C13150hy.A01(b7b, str);
        return b7b;
    }
}
