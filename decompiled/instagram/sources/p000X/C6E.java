package p000X;

import java.util.Objects;

/* renamed from: X.C6E */
public final class C6E {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C6E c6e = (C6E) obj;
            if (!(this.A09 == c6e.A09 && this.A08 == c6e.A08 && this.A00 == c6e.A00 && this.A06 == c6e.A06 && this.A04 == c6e.A04 && this.A01 == c6e.A01 && this.A07 == c6e.A07 && this.A05 == c6e.A05 && this.A03 == c6e.A03 && this.A02 == c6e.A02)) {
                return false;
            }
        }
        return true;
    }

    public static void A00(C6E c6e, C6E c6e2) {
        c6e.A09 = c6e2.A09;
        c6e.A08 = c6e2.A08;
        c6e.A00 = c6e2.A00;
        c6e.A06 = c6e2.A06;
        c6e.A04 = c6e2.A04;
        c6e.A01 = c6e2.A01;
        c6e.A07 = c6e2.A07;
        c6e.A05 = c6e2.A05;
        c6e.A03 = c6e2.A03;
        c6e.A02 = c6e2.A02;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.A09), Boolean.valueOf(this.A08), Integer.valueOf(this.A00), Long.valueOf(this.A06), Long.valueOf(this.A04), Integer.valueOf(this.A01), Boolean.valueOf(this.A07), Long.valueOf(this.A05), Long.valueOf(this.A03), Long.valueOf(this.A02)});
    }

    public final String toString() {
        return "State{isUserInitialized=" + this.A09 + ", isPerfLoggerStarted=" + this.A08 + ", appStartupType=" + this.A00 + ", startupTimestampMs=" + this.A06 + ", irisSequenceId=" + this.A04 + ", irisSequenceIdSource=" + this.A01 + ", isIrisSubscribed=" + this.A07 + ", latestIrisSeqIdOnSubscribe=" + this.A05 + ", irisSeqIdOnSubscribe=" + this.A03 + ", irisSeqIdOnMarkerStart=" + this.A02 + '}';
    }

    public C6E(int i) {
        this.A09 = false;
        this.A08 = false;
        this.A00 = i;
        this.A06 = -1;
        this.A04 = -1;
        this.A01 = 0;
        this.A07 = false;
        this.A05 = -1;
        this.A03 = -1;
        this.A02 = -1;
    }

    public C6E(C6E c6e) {
        A00(this, c6e);
    }
}
