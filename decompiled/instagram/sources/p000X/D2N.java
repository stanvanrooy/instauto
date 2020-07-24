package p000X;

import com.facebook.video.heroplayer.ipc.VideoPrefetchRequest;
import com.facebook.video.heroplayer.ipc.VideoSource;

/* renamed from: X.D2N */
public final class D2N implements Runnable {
    public final /* synthetic */ VideoPrefetchRequest A00;
    public final /* synthetic */ D4A A01;
    public final /* synthetic */ D29 A02;
    public final /* synthetic */ D2D A03;
    public final /* synthetic */ D2U A04;
    public final /* synthetic */ C29677D4l A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public D2N(D2D d2d, boolean z, boolean z2, boolean z3, String str, VideoPrefetchRequest videoPrefetchRequest, D29 d29, D2U d2u, C29677D4l d4l, D4A d4a) {
        this.A03 = d2d;
        this.A07 = z;
        this.A08 = z2;
        this.A09 = z3;
        this.A06 = str;
        this.A00 = videoPrefetchRequest;
        this.A02 = d29;
        this.A04 = d2u;
        this.A05 = d4l;
        this.A01 = d4a;
    }

    public final void run() {
        if (this.A07 && !this.A08 && !this.A09) {
            D2D d2d = this.A03;
            String str = this.A06;
            VideoPrefetchRequest videoPrefetchRequest = this.A00;
            VideoSource videoSource = videoPrefetchRequest.A09;
            String str2 = videoSource.A09;
            D29 d29 = this.A02;
            String str3 = videoSource.A0D;
            D2U d2u = this.A04;
            int i = (int) d2u.A04;
            C29677D4l d4l = this.A05;
            D29 d292 = d29;
            String str4 = str3;
            int i2 = i;
            C29677D4l d4l2 = d4l;
            String str5 = str;
            D2D d2d2 = d2d;
            d2d2.A06(str5, str2, (C29605D1k) null, (D19) null, d292, str4, i2, 1, d4l2, this.A01.A00, videoSource.A0J, videoSource.A0K, d2u.A0I, d2u.A0J, d2u.A0G, videoPrefetchRequest.A0A, Constants.ZERO, videoPrefetchRequest.A08, videoPrefetchRequest.A06, videoPrefetchRequest.A0F);
        }
    }
}
