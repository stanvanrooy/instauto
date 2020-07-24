package p000X;

import java.util.List;

/* renamed from: X.1ia  reason: invalid class name and case insensitive filesystem */
public final class C36771ia extends C29351Po {
    public boolean A00;
    public AnonymousClass390 A01;
    public Integer A02;
    public final AnonymousClass2NV A03;

    public final int A02() {
        double ceil;
        int i;
        Integer num = this.A02;
        if (num == Constants.ZERO) {
            int A032 = A03();
            if (this.A00) {
                i = A03() % this.A03.A00;
            } else {
                i = 0;
            }
            return A032 - i;
        } else if (num == Constants.ONE) {
            if (this.A00) {
                ceil = Math.floor(((double) A03()) / ((double) this.A03.A00));
            } else {
                ceil = Math.ceil(((double) A03()) / ((double) this.A03.A00));
            }
            return (int) ceil;
        } else if (num == Constants.A0C) {
            return A03();
        } else {
            throw new UnsupportedOperationException("View mode not handled");
        }
    }

    public final String A05(Object obj) {
        return ((AnonymousClass1NJ) obj).getId();
    }

    public final C68192yb A0L(int i) {
        List list = this.A01;
        int i2 = this.A03.A00;
        return new C68192yb(list, i * i2, i2);
    }

    public final void A0M(Integer num, boolean z) {
        AnonymousClass390 r2;
        this.A02 = num;
        if (z && (r2 = this.A01) != null) {
            r2.A02(num, this.A01, true);
        }
    }

    public C36771ia(Integer num, AnonymousClass2NV r3) {
        this.A02 = num;
        this.A01 = null;
        this.A03 = r3;
    }

    public C36771ia(Integer num, AnonymousClass390 r2, AnonymousClass2NV r3) {
        this.A02 = num;
        this.A01 = r2;
        this.A03 = r3;
    }
}
