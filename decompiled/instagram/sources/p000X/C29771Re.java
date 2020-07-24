package p000X;

/* renamed from: X.1Re  reason: invalid class name and case insensitive filesystem */
public final class C29771Re {
    public int A00;
    public Integer A01;
    public Integer A02;

    public final void A00(int i) {
        Integer num;
        int i2 = this.A00;
        if (i2 > i) {
            num = Constants.ZERO;
        } else {
            if (i2 < i) {
                num = Constants.ONE;
            }
            this.A00 = i;
        }
        this.A01 = num;
        this.A00 = i;
    }

    public C29771Re(Integer num) {
        this.A02 = num;
        this.A01 = num;
        if (num == Constants.ONE) {
            this.A00 = -1;
        } else {
            this.A00 = Integer.MAX_VALUE;
        }
    }
}
