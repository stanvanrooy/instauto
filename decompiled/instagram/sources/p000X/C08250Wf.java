package p000X;

import java.util.Locale;
import java.util.Random;

/* renamed from: X.0Wf  reason: invalid class name and case insensitive filesystem */
public final class C08250Wf {
    public int A00;
    public int A01 = -2;
    public final int A02;
    public final int A03;
    public final Random A04 = new Random();

    public final String toString() {
        return String.format((Locale) null, "ParameterizedRetryState (%d,%d): multiplier:%d, interval:%d", new Object[]{Integer.valueOf(this.A02), Integer.valueOf(this.A03), Integer.valueOf(this.A01), Integer.valueOf(this.A00)});
    }

    public C08250Wf(int i, int i2) {
        this.A02 = i;
        this.A03 = i2;
        this.A00 = i;
    }
}
