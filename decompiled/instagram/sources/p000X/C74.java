package p000X;

import java.util.List;

/* renamed from: X.C74 */
public final class C74 {
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final String A03;
    public final List A04;

    public C74(int i, int i2, Integer num) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = null;
        this.A02 = num;
        this.A04 = null;
    }

    public C74(int i, int i2, Integer num, List list) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = null;
        this.A02 = num;
        this.A04 = list;
    }

    public C74(int i, int i2, String str) {
        Integer num = Constants.ZERO;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = str;
        this.A02 = num;
        this.A04 = null;
    }
}
