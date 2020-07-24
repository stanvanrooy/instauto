package p000X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.DYT */
public final class DYT {
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public double A04;
    public double A05;
    public long A06;
    public String A07;
    public String A08;
    public List A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A06)});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DYT)) {
            return false;
        }
        return AnonymousClass17M.A00(Long.valueOf(this.A06), Long.valueOf(((DYT) obj).A06));
    }
}
