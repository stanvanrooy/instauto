package p000X;

import android.net.Uri;

/* renamed from: X.D6J */
public final class D6J implements D5A {
    public final /* synthetic */ C29706D5s A00;

    public D6J(C29706D5s d5s) {
        this.A00 = d5s;
    }

    public final void Az6() {
        this.A00.A0E = true;
    }

    public final void Az7(long j) {
        C29706D5s d5s = this.A00;
        long j2 = d5s.A03;
        if (j2 == -9223372036854775807L || j2 < j) {
            d5s.A03 = j;
        }
    }

    public final void Az8() {
        C29706D5s d5s = this.A00;
        AnonymousClass0ZA.A08(d5s.A08, d5s.A0R);
        C29706D5s.A00(d5s);
    }

    public final void B4g() {
        C29706D5s d5s = this.A00;
        if (!d5s.A0F) {
            D56 d56 = d5s.A0M;
            if (d56.A09) {
                d5s.A0F = true;
                if (d56.A06 <= 0 || d5s.A0H) {
                    AnonymousClass0ZA.A08(d5s.A08, d5s.A0R);
                    C29706D5s.A00(d5s);
                }
            }
        }
    }

    public final void B9L(Uri uri, String str) {
        C29706D5s d5s = this.A00;
        if (d5s.A09 == null) {
            d5s.A09 = d5s.A04((C29791DAa) null);
        }
        d5s.A09.A06(uri, str);
    }
}
