package p000X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* renamed from: X.AMH */
public final class AMH {
    public static final long A0A = TimeUnit.SECONDS.toMillis(3);
    public int A00;
    public long A01;
    public long A02;
    public Handler A03;
    public boolean A04;
    public String A05;
    public final AMF A06;
    public final Context A07;
    public final AnonymousClass1L8 A08;
    public final AnonymousClass0C1 A09;

    public final void A00() {
        AnonymousClass0C1 r0 = this.A09;
        String str = this.A05;
        long j = this.A01;
        int i = this.A00;
        long j2 = this.A02;
        C15890nh r7 = new C15890nh(r0);
        r7.A09 = Constants.A0N;
        r7.A0E("live/%s/get_join_request_counts/", str);
        r7.A09("last_fetch_ts", Long.toString(j));
        r7.A09("last_total_count", Integer.toString(i));
        r7.A09("last_seen_ts", Long.toString(j2));
        r7.A06(AML.class, true);
        C17850qu A032 = r7.A03();
        A032.A00 = new AME(this);
        C28351Lj.A00(this.A07, this.A08, A032);
    }

    public final void A01(String str) {
        if (!this.A04) {
            this.A04 = true;
            this.A05 = str;
            if (this.A03 == null) {
                this.A03 = new Handler(Looper.getMainLooper());
            }
            A00();
        }
    }

    public AMH(Context context, AnonymousClass0C1 r2, AnonymousClass1L8 r3, AMF amf) {
        this.A07 = context;
        this.A09 = r2;
        this.A08 = r3;
        this.A06 = amf;
    }
}
