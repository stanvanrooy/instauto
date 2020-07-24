package p000X;

import android.util.Log;
import com.google.android.exoplayer2.Format;
import java.io.IOException;

/* renamed from: X.D6A */
public final class D6A implements C29737D7b {
    public final /* synthetic */ C29706D5s A00;

    public final /* bridge */ /* synthetic */ void B9S(D97 d97, long j, long j2, boolean z) {
        this.A00.A08((C29693D5f) d97, j, j2);
    }

    public D6A(C29706D5s d5s) {
        this.A00 = d5s;
    }

    public final /* bridge */ /* synthetic */ void B9V(D97 d97, long j, long j2) {
        C29693D5f d5f = (C29693D5f) d97;
        C29706D5s d5s = this.A00;
        d5s.A0N.A0F(d5f.A01, d5f.A00, -1, (Format) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, j, j2, d5f.A04, d5f.A05);
        d5s.A02 = ((Long) d5f.A05).longValue() - j;
        C29706D5s.A02(d5s, true);
    }

    public final /* bridge */ /* synthetic */ C29756D8f B9W(D97 d97, long j, long j2, IOException iOException, int i) {
        C29693D5f d5f = (C29693D5f) d97;
        C29706D5s d5s = this.A00;
        IOException iOException2 = iOException;
        d5s.A0N.A0E(d5f.A01, d5f.A00, -1, (Format) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, j, j2, d5f.A04, iOException2, true);
        Log.e("DashMediaSource", "Failed to resolve UtcTiming element.", iOException2);
        C29706D5s.A02(d5s, true);
        return D62.A03;
    }
}
