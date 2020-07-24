package p000X;

import java.util.regex.Pattern;

/* renamed from: X.0q0  reason: invalid class name and case insensitive filesystem */
public final class C17300q0 {
    public static final Pattern A02 = Pattern.compile("ConnectionManagerHistoricalData:mData=(-?\\d+\\.\\d+), mTimestamp=(\\d+)");
    public double A00;
    public long A01;

    public final String toString() {
        return "ConnectionManagerHistoricalData:mData=" + this.A00 + ", mTimestamp=" + this.A01;
    }

    public C17300q0(double d, long j) {
        this.A00 = d;
        this.A01 = j;
    }
}
