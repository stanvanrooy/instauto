package p000X;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;

/* renamed from: X.AMC */
public final class AMC {
    public int A00;
    public long A01;
    public Handler A02;
    public C23393AKs A03;
    public String A04;
    public boolean A05;
    public Context A06;
    public AnonymousClass1L8 A07;
    public AnonymousClass3Dj A08;
    public boolean A09;
    public final AnonymousClass0C1 A0A;
    public final Integer A0B;

    public static void A00(AMC amc) {
        C15890nh r3;
        String str;
        String str2;
        String str3 = amc.A04;
        if (str3 == null) {
            AnonymousClass0QD.A01("IgLiveReactionsFetcher", "BroadcastId null in fetchViewCount");
            return;
        }
        if (amc.A09) {
            AnonymousClass0C1 r1 = amc.A0A;
            long AFH = amc.A08.AFH();
            r3 = new C15890nh(r1);
            r3.A09 = Constants.ONE;
            r3.A0E("live/%s/heartbeat_and_get_viewer_count/", str3);
            r3.A06(C30479Dd4.class, false);
            str = Long.toString(AFH / 1000);
            str2 = "offset_to_video_start";
        } else {
            AnonymousClass0C1 r0 = amc.A0A;
            Integer num = amc.A0B;
            r3 = new C15890nh(r0);
            r3.A09 = Constants.ONE;
            r3.A0E("live/%s/heartbeat_and_get_viewer_count/", str3);
            r3.A06(C30479Dd4.class, false);
            if (num != null) {
                str = AnonymousClass2A8.A00(num);
            } else {
                str = null;
            }
            str2 = "live_with_eligibility";
        }
        r3.A09(str2, str);
        C17850qu A032 = r3.A03();
        A032.A00 = new C30480Dd5(amc, SystemClock.elapsedRealtime());
        C28351Lj.A00(amc.A06, amc.A07, A032);
    }

    public final void A01() {
        String str = this.A04;
        if (str == null) {
            AnonymousClass0QD.A01("IgLiveReactionsFetcher", "BroadcastId null in fetchLikeCount");
            return;
        }
        AnonymousClass0C1 r0 = this.A0A;
        long j = this.A01;
        C15890nh r4 = new C15890nh(r0);
        r4.A09 = Constants.A0N;
        r4.A0E("live/%s/get_like_count/", str);
        r4.A09("like_ts", Long.toString(j));
        r4.A06(AM5.class, false);
        C17850qu A032 = r4.A03();
        A032.A00 = new AMB(this);
        C28351Lj.A00(this.A06, this.A07, A032);
    }

    public AMC(Context context, AnonymousClass1L8 r2, AnonymousClass0C1 r3, C23393AKs aKs, AnonymousClass3Dj r5, Integer num, boolean z) {
        this.A06 = context;
        this.A07 = r2;
        this.A0B = num;
        this.A03 = aKs;
        this.A08 = r5;
        this.A09 = z;
        this.A0A = r3;
    }
}
