package p000X;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0ng  reason: invalid class name and case insensitive filesystem */
public final class C15880ng {
    public static final AtomicInteger A07 = new AtomicInteger();
    public C17850qu A00;
    public C17880qx A01;
    public final int A02 = A07.incrementAndGet();
    public final int A03;
    public final Integer A04;
    public final String A05 = UUID.randomUUID().toString();
    public final String A06;

    public final boolean A00() {
        if (this.A04 != Constants.A12) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Request{, mReason=");
        Integer num = this.A04;
        if (num != null) {
            str = C16120o4.A00(num);
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", mInstanceNumber=");
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }

    public C15880ng(String str, Integer num, int i) {
        this.A06 = str;
        this.A04 = num;
        this.A03 = i;
    }
}
