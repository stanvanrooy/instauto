package p000X;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;

/* renamed from: X.AKD */
public final class AKD {
    public int A00;
    public int A01;
    public long A02;
    public Handler A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final Context A07;
    public final AnonymousClass1L8 A08;
    public final AnonymousClass0C1 A09;
    public final AnonymousClass3Dj A0A;
    public final AKB A0B;

    public AKD(Context context, AnonymousClass1L8 r2, AnonymousClass0C1 r3, AKB akb, AnonymousClass3Dj r5) {
        this.A07 = context;
        this.A08 = r2;
        this.A0B = akb;
        this.A0A = r5;
        this.A09 = r3;
    }

    public static void A00(AKD akd) {
        boolean z;
        C12670hC.A02();
        if (!akd.A05 && (z = akd.A06)) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - akd.A02;
            if (elapsedRealtime < 1000) {
                akd.A05 = true;
                AnonymousClass0ZA.A09(akd.A03, new C23376AKb(akd), 1000 - elapsedRealtime, 424934598);
            } else if (z) {
                int i = akd.A00;
                C12670hC.A02();
                Context context = akd.A07;
                AnonymousClass1L8 r2 = akd.A08;
                AnonymousClass0C1 r1 = akd.A09;
                String str = akd.A04;
                int i2 = akd.A01;
                int i3 = akd.A00;
                long AFH = akd.A0A.AFH();
                C15890nh r7 = new C15890nh(r1);
                r7.A09 = Constants.ONE;
                r7.A0E("live/%s/like/", str);
                r7.A09("user_like_count", Integer.toString(i2));
                r7.A09("user_like_burst_count", Integer.toString(i3));
                r7.A09("offset_to_video_start", Long.toString(AFH / 1000));
                r7.A06(AM5.class, true);
                r7.A0G = true;
                C17850qu A032 = r7.A03();
                A032.A00 = new AKQ(akd, i);
                C28351Lj.A00(context, r2, A032);
                akd.A01 = 0;
                akd.A00 = 0;
                akd.A02 = SystemClock.elapsedRealtime();
            }
        }
    }
}
