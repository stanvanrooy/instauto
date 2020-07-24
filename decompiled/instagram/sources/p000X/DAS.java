package p000X;

import com.google.android.exoplayer2.source.TrackGroupArray;

/* renamed from: X.DAS */
public final class DAS {
    public final int A00;
    public final long A01;
    public final long A02;
    public final C29742D7o A03;
    public final C29791DAa A04;
    public final TrackGroupArray A05;
    public final DAL A06;
    public final Integer A07;
    public final Object A08;
    public final boolean A09;
    public volatile long A0A;
    public volatile long A0B;

    public static void A00(DAS das, DAS das2) {
        das2.A0B = das.A0B;
        das2.A0A = das.A0A;
    }

    public final DAS A01(C29791DAa dAa, long j, long j2) {
        long j3 = j2;
        C29742D7o d7o = this.A03;
        Object obj = this.A08;
        C29791DAa dAa2 = dAa;
        if (!dAa.A01()) {
            j3 = -9223372036854775807L;
        }
        return new DAS(d7o, obj, dAa2, j, j3, this.A00, this.A09, this.A05, this.A06, this.A07);
    }

    public final DAS A02(TrackGroupArray trackGroupArray, DAL dal) {
        DAS das = new DAS(this.A03, this.A08, this.A04, this.A02, this.A01, this.A00, this.A09, trackGroupArray, dal, this.A07);
        A00(this, das);
        return das;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public DAS(C29742D7o d7o, long j, TrackGroupArray trackGroupArray, DAL dal) {
        this(r1, (Object) null, new C29791DAa(0, -1, -1, -1), j, -9223372036854775807L, 1, false, r10, dal, Constants.ZERO);
        C29742D7o d7o2 = d7o;
        TrackGroupArray trackGroupArray2 = trackGroupArray;
    }

    public DAS(C29742D7o d7o, Object obj, C29791DAa dAa, long j, long j2, int i, boolean z, TrackGroupArray trackGroupArray, DAL dal, Integer num) {
        this.A03 = d7o;
        this.A08 = obj;
        this.A04 = dAa;
        this.A02 = j;
        this.A01 = j2;
        this.A0B = j;
        this.A0A = j;
        this.A00 = i;
        this.A09 = z;
        this.A05 = trackGroupArray;
        this.A06 = dal;
        this.A07 = num;
    }
}
