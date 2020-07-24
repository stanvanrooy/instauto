package p000X;

import com.facebook.video.heroplayer.ipc.VideoPlayRequest;
import java.io.IOException;

/* renamed from: X.D2T */
public final class D2T implements D40 {
    public final VideoPlayRequest A00;
    public final C29706D5s A01;
    public final boolean A02;
    public final C29642D2z A03;
    public final /* synthetic */ D2E A04;

    public D2T(D2E d2e, C29706D5s d5s, C29642D2z d2z, VideoPlayRequest videoPlayRequest, boolean z) {
        this.A04 = d2e;
        this.A01 = d5s;
        this.A03 = d2z;
        this.A00 = videoPlayRequest;
        this.A02 = z;
    }

    public final /* bridge */ /* synthetic */ void BNS(Object obj) {
        D2U d2u = (D2U) obj;
        if (this.A02) {
            long A002 = D2E.A00(this.A00);
            C40431oe.A01("HeroExo2LiveInitHelper", "Inline manifest was null, setting live edge latency now to: %d", Long.valueOf(A002));
            this.A01.A04 = A002;
        }
        C29706D5s d5s = this.A01;
        d5s.A0A = d2u;
        if (d5s.A08 != null) {
            C29706D5s.A02(d5s, false);
        }
        D40 d40 = this.A04.A08;
        if (d40 != null) {
            d40.BNS(d2u);
        }
    }

    public final void BNT(IOException iOException) {
        this.A03.A00(iOException);
        D40 d40 = this.A04.A08;
        if (d40 != null) {
            d40.BNT(iOException);
        }
    }
}
