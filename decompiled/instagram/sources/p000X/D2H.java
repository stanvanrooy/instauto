package p000X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.video.heroplayer.ipc.VideoPlayContextualSetting;
import com.facebook.video.heroplayer.ipc.VideoPrefetchRequest;
import com.facebook.video.heroplayer.ipc.VideoSource;
import com.google.android.exoplayer2.Format;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.D2H */
public final class D2H implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ D35 A02;
    public final /* synthetic */ D3W A03;
    public final /* synthetic */ D2V A04;
    public final /* synthetic */ DCI A05;
    public final /* synthetic */ VideoPrefetchRequest A06;
    public final /* synthetic */ D4A A07;
    public final /* synthetic */ D29 A08;
    public final /* synthetic */ C29644D3b A09;
    public final /* synthetic */ D2D A0A;
    public final /* synthetic */ D2U A0B;
    public final /* synthetic */ C29677D4l A0C;
    public final /* synthetic */ C29677D4l A0D;
    public final /* synthetic */ C29605D1k A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ List A0G;
    public final /* synthetic */ List A0H;
    public final /* synthetic */ boolean A0I;
    public final /* synthetic */ boolean A0J;

    public D2H(D2D d2d, C29677D4l d4l, boolean z, DCI dci, C29605D1k d1k, D35 d35, D2V d2v, List list, C29677D4l d4l2, int i, C29644D3b d3b, int i2, List list2, String str, D3W d3w, VideoPrefetchRequest videoPrefetchRequest, D29 d29, D2U d2u, D4A d4a, boolean z2) {
        this.A0A = d2d;
        this.A0D = d4l;
        this.A0J = z;
        this.A05 = dci;
        this.A0E = d1k;
        this.A02 = d35;
        this.A04 = d2v;
        this.A0H = list;
        this.A0C = d4l2;
        this.A01 = i;
        this.A09 = d3b;
        this.A00 = i2;
        this.A0G = list2;
        this.A0F = str;
        this.A03 = d3w;
        this.A06 = videoPrefetchRequest;
        this.A08 = d29;
        this.A0B = d2u;
        this.A07 = d4a;
        this.A0I = z2;
    }

    public final void run() {
        DCH dch;
        Integer num;
        Format format;
        long j;
        int length;
        String str;
        boolean A012;
        if (this.A0D != null && !this.A0J) {
            if (this.A05 != null) {
                D2D d2d = this.A0A;
                D2X d2x = new D2X(this.A0E, this.A02, d2d.A04, (C29623D2f) null, this.A04, d2d.A03, (D3U) null);
                d2d.A00 = d2x;
                Format[] A002 = D36.A00(this.A0H);
                D2W d2w = d2x.A07;
                int A052 = d2w.A07.A05();
                int A003 = d2w.A00((Format) null, A002, (ArrayList) null);
                if (A052 > 0 && A003 > 0) {
                    A003 = Math.min(A052, A003);
                } else if (A052 > 0) {
                    A003 = A052;
                }
                C29677D4l d4l = this.A0C;
                if (d4l == null) {
                    format = null;
                } else {
                    format = d4l.A01;
                }
                this.A05.A00(D2J.A00(this.A0D, this.A0H, -1, A003), format, this.A01, A003);
                Format[] A004 = D36.A00(this.A0H);
                DCI dci = this.A05;
                C29677D4l d4l2 = this.A0C;
                if (d4l2 == null) {
                    j = -1;
                } else {
                    j = d4l2.A00;
                }
                long j2 = (long) (this.A09.A00 * 1000);
                Format format2 = A004[0];
                Format format3 = format2;
                int i = 1;
                while (true) {
                    length = A004.length;
                    if (i >= length) {
                        break;
                    }
                    Format format4 = A004[i];
                    if (format4.A0F > format2.A0F) {
                        format2 = format4;
                    }
                    i++;
                }
                for (int i2 = 1; i2 < length; i2++) {
                    Format format5 = A004[i2];
                    int i3 = format5.A0F;
                    if (i3 <= A003) {
                        int i4 = format3.A0F;
                        if (i3 <= i4 && i4 <= A003) {
                        }
                    } else if (i3 >= format3.A0F) {
                    }
                    format3 = format5;
                }
                int i5 = this.A00;
                List list = this.A0G;
                String str2 = this.A0F;
                C25947Bcz bcz = this.A0A.A04;
                if (bcz == null || (str = bcz.A01) == null) {
                    str = NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
                }
                if (bcz == null) {
                    A012 = false;
                } else {
                    A012 = bcz.A01();
                }
                long j3 = j;
                dci.A0U = new D9W(-1, j3, -1, j2, format, A004, format2, format3, A003, i5, list, str2, str, A012);
                D3W d3w = this.A03;
                if (d3w != null) {
                    DCI dci2 = this.A05;
                    int i6 = d3w.A00;
                    dci2.A00 = i6;
                    D9W d9w = dci2.A0U;
                    long j4 = d3w.A01;
                    long j5 = d3w.A02;
                    Format format6 = this.A0D.A01;
                    long j6 = (long) format6.A04;
                    String str3 = format6.A0P;
                    if (str3 == null || str3.isEmpty()) {
                        str3 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                    }
                    d9w.A01.put(str3, new C29788D9x(j4, j5, i6, j6, j6));
                    for (D2b add : this.A03.A04) {
                        this.A05.A0U.A0F.add(add);
                    }
                }
            }
            D2D d2d2 = this.A0A;
            String str4 = this.A0F;
            VideoPrefetchRequest videoPrefetchRequest = this.A06;
            VideoSource videoSource = videoPrefetchRequest.A09;
            String str5 = videoSource.A09;
            C29605D1k d1k = this.A0E;
            DCI dci3 = this.A05;
            if (dci3 != null) {
                dch = dci3.A0Z;
            } else {
                dch = null;
            }
            D29 d29 = this.A08;
            String str6 = videoSource.A0D;
            D2U d2u = this.A0B;
            int i7 = (int) d2u.A04;
            C29677D4l d4l3 = this.A0D;
            int i8 = this.A07.A01;
            boolean z = videoSource.A0J;
            boolean z2 = videoSource.A0K;
            boolean z3 = d2u.A0I;
            boolean z4 = d2u.A0J;
            boolean z5 = d2u.A0G;
            Integer num2 = videoPrefetchRequest.A0A;
            if (this.A0I) {
                num = Constants.ZERO;
            } else {
                num = Constants.A0C;
            }
            VideoPlayContextualSetting videoPlayContextualSetting = videoPrefetchRequest.A08;
            long j7 = videoPrefetchRequest.A06;
            boolean z6 = videoPrefetchRequest.A0F;
            String str7 = str4;
            String str8 = str5;
            C29605D1k d1k2 = d1k;
            DCH dch2 = dch;
            D2D d2d3 = d2d2;
            d2d3.A06(str7, str8, d1k2, dch2, d29, str6, i7, 2, d4l3, i8, z, z2, z3, z4, z5, num2, num, videoPlayContextualSetting, j7, z6);
        }
    }
}
