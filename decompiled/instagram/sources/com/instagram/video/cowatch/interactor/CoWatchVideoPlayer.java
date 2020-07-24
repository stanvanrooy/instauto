package com.instagram.video.cowatch.interactor;

import android.content.Context;
import org.webrtc.CameraVideoCapturer;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass348;
import p000X.Aw5;
import p000X.C06190Oc;
import p000X.C211829Bs;
import p000X.C24762At4;
import p000X.C24905Aw7;
import p000X.C24915AwJ;
import p000X.C24926AwU;
import p000X.C24940Awi;
import p000X.C32141af;
import p000X.C45881yj;
import p000X.C53132Rp;

public final class CoWatchVideoPlayer implements C53132Rp {
    public C24940Awi A00;
    public C211829Bs A01;
    public final Context A02;
    public final AnonymousClass0C1 A03;
    public final AnonymousClass348 A04 = new AnonymousClass348(C06190Oc.A00);

    public final void Axl() {
    }

    public final void BF3(C45881yj r1) {
    }

    public final void BGP(boolean z) {
    }

    public final void BPG(String str, boolean z) {
    }

    public final void BV5(C45881yj r1) {
    }

    public final void BVA(C45881yj r1) {
    }

    public final void BVB(C45881yj r1) {
    }

    public final void BVc(int i, int i2) {
    }

    public final void A00(int i) {
        C211829Bs r0 = this.A01;
        if (r0 != null) {
            int A0B = r0.A06.A0B();
            if (A0B > 0 && i >= A0B) {
                i %= A0B;
            }
            this.A01.A02(i, false);
            C24940Awi awi = this.A00;
            if (awi != null && this.A01.A02) {
                awi.A00(i, A0B);
            }
        }
    }

    public final void BGS(int i, int i2, boolean z) {
        C24940Awi awi = this.A00;
        if (awi != null) {
            awi.A00(i, i2);
        }
    }

    public final void BUq(C45881yj r3) {
        C24940Awi awi = this.A00;
        if (awi != null) {
            C24905Aw7.A00(awi.A00.A07).A0P.setVideoIconState(C32141af.LOADING);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002f, code lost:
        r1 = r0.A00.A06;
     */
    public final void BUx(C45881yj r8) {
        Aw5 aw5;
        C24915AwJ awJ;
        C24926AwU awU;
        AnonymousClass348 r1 = this.A04;
        if (r1.A01() && r1.A02 >= ((long) ((Integer) AnonymousClass0L6.A02(this.A03, AnonymousClass0L7.VC_COWATCH_CONFIG, "stall_seek_threshold_ms", Integer.valueOf(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS), (AnonymousClass04H) null)).intValue())) {
            this.A04.A00();
            C24940Awi awi = this.A00;
            if (awi != null && (awJ = aw5.A01) != null && C24762At4.A01(awJ.A05.AZH()) && (awU = aw5.A0A.A04) != null) {
                awU.A00();
            }
        }
    }

    public final void BVa(C45881yj r5) {
        C24940Awi awi = this.A00;
        if (awi != null) {
            boolean z = r5.A01;
            C24905Aw7.A00(awi.A00.A07).A0P.setVideoIconState(C32141af.HIDDEN);
            C24905Aw7.A02(C24905Aw7.A00(awi.A00.A07).A0O, false);
            awi.A00.A07.A05(z);
        }
    }

    public CoWatchVideoPlayer(Context context, AnonymousClass0C1 r6) {
        this.A02 = context;
        this.A03 = r6;
        this.A04.A00 = (long) ((Integer) AnonymousClass0L6.A02(r6, AnonymousClass0L7.VC_COWATCH_CONFIG, "stall_threshold_ms", 120, (AnonymousClass04H) null)).intValue();
    }
}
