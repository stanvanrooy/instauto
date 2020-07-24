package p000X;

import android.os.Handler;
import android.os.SystemClock;
import java.util.LinkedHashSet;

/* renamed from: X.AKE */
public final class AKE implements C23375AKa {
    public long A00;
    public AKC A01;
    public AKC A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public final AnonymousClass0C1 A06;
    public final int A07;
    public final Handler A08;
    public final C06180Ob A09;
    public final Runnable A0A = new C23380AKf(this);

    public final void BqP() {
        this.A05 = false;
        AnonymousClass0ZA.A07(this.A08, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r2 >= 2) goto L_0x0014;
     */
    public static void A00(AKE ake) {
        boolean z;
        AKC akc = ake.A01;
        if (akc != null) {
            LinkedHashSet linkedHashSet = akc.A07.A00.A06;
            if (linkedHashSet != null) {
                int size = linkedHashSet.size();
                z = true;
            }
            z = false;
            if (z && !ake.A04 && SystemClock.elapsedRealtime() - ake.A00 >= ((long) ake.A07)) {
                AnonymousClass0C1 r2 = ake.A06;
                String str = ake.A03;
                AKC akc2 = ake.A01;
                long j = akc2.A00;
                String str2 = akc2.A03;
                C15890nh r5 = new C15890nh(r2);
                r5.A09 = Constants.A0N;
                r5.A0E("live/%s/get_comment/", str);
                r5.A09("last_comment_ts", Long.toString(j));
                r5.A06(AKG.class, true);
                if (str2 != null) {
                    r5.A09("new_supporters_min_id", str2);
                }
                C17850qu A032 = r5.A03();
                A032.A00 = new AKM(ake);
                C12810hQ.A02(A032);
            }
        }
        AnonymousClass0ZA.A07(ake.A08, (Object) null);
        AnonymousClass0ZA.A09(ake.A08, ake.A0A, (long) ake.A07, -974474711);
    }

    public final void Bpd(String str) {
        if (!this.A05) {
            this.A05 = true;
            this.A03 = str;
            A00(this);
        }
    }

    public AKE(AnonymousClass0C1 r2, Handler handler, C06180Ob r4, int i) {
        this.A06 = r2;
        this.A09 = r4;
        this.A07 = i;
        this.A08 = handler;
    }

    public final void Bh9(AKC akc) {
        this.A01 = akc;
    }

    public final void Bid(AKC akc) {
        this.A02 = akc;
    }
}
