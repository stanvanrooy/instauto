package p000X;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;

/* renamed from: X.1h6  reason: invalid class name and case insensitive filesystem */
public final class C35891h6 implements C06570Po, AnonymousClass0PF {
    public static final Class A06 = C35891h6.class;
    public final AnonymousClass0PD A00;
    public final C05450Ko A01;
    public final C35911h8 A02;
    public final AnonymousClass0C1 A03;
    public final HashMap A04;
    public final Handler A05 = new Handler(Looper.getMainLooper());

    public final synchronized int A01(String str) {
        int i;
        if (this.A04.containsKey(str)) {
            i = ((Integer) this.A04.get(str)).intValue();
        } else {
            i = -1;
        }
        return i;
    }

    public final synchronized long A02(String str) {
        long j;
        C35911h8 r2 = this.A02;
        synchronized (r2) {
            C35911h8.A00(r2);
            if (r2.A03.containsKey(str)) {
                j = ((Long) r2.A03.get(str)).longValue();
            } else {
                j = 0;
            }
        }
        return j;
    }

    public final void onUserSessionWillEnd(boolean z) {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:5|6|7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0027 */
    public static synchronized C35891h6 A00(AnonymousClass0C1 r4) {
        C35891h6 r0;
        Class<C35891h6> cls = C35891h6.class;
        synchronized (cls) {
            r0 = (C35891h6) r4.AV9(cls);
            if (r0 == null) {
                C13080hr A0A = C12890hY.A00.A0A(C16180oA.A00(r4).A00.getString("seen_state", (String) null));
                A0A.A0p();
                C35911h8 r1 = C35901h7.parseFromJson(A0A);
                r1 = new C35911h8();
                r1.A00 = 250;
                r0 = new C35891h6(r4, r1);
                r4.BYi(cls, r0);
            }
        }
        return r0;
    }

    public final /* bridge */ /* synthetic */ void AzE(Object obj) {
        C35911h8 r2;
        C35911h8 r3 = this.A02;
        synchronized (r3) {
            r2 = new C35911h8();
            r2.A02.addAll(r3.A02);
            r2.A01.putAll(r3.A01);
        }
        this.A01.ADc(new C41851r2(this, r2));
    }

    public C35891h6(AnonymousClass0C1 r5, C35911h8 r6) {
        AnonymousClass0O1 A002 = AnonymousClass0O1.A00();
        A002.A01 = "LocalSeenStateSerialize";
        this.A01 = A002.A01();
        this.A03 = r5;
        this.A02 = r6;
        this.A00 = new AnonymousClass0PD(this.A05, this, 100);
        this.A04 = new HashMap();
    }
}
