package p000X;

import java.util.List;

/* renamed from: X.BOP */
public final class BOP extends C25521BOf {
    public final Integer A00;
    public final List A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    public BOP(long j, BR8 br8, List list, Integer num) {
        super(r1, br8, list, Constants.A02);
        boolean z;
        long j2 = j;
        this.A01 = list;
        this.A00 = num;
        switch (num.intValue()) {
            case 0:
            case 3:
            case 5:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            throw new UnsupportedOperationException();
        }
    }
}
