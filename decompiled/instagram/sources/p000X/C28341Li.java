package p000X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.1Li  reason: invalid class name and case insensitive filesystem */
public final class C28341Li {
    public Integer A00;
    public String A01;
    public boolean A02;
    public final Handler A03;
    public final C28351Lj A04;
    public final String A05;

    public static void A00(C28341Li r7, C17850qu r8, C17850qu r9, long j, long j2, C28591Mi r14) {
        C28341Li r2 = r7;
        if (r7.A00 != Constants.ZERO) {
            AnonymousClass2TE r1 = new AnonymousClass2TE(r2, r14, j, j2);
            r9.A00 = r1;
            r2.A04.schedule(r9);
            r8.A00 = new C28601Mj(r2, r14, r1);
            r2.A04.schedule(r8);
        }
    }

    public final C28341Li A01(String str) {
        return new C28341Li(this.A05, this.A04, this.A03, str, this.A02);
    }

    public final void A02(C17850qu r3, C28591Mi r4) {
        if (this.A00 != Constants.ZERO) {
            r3.A00 = new C28601Mj(this, r4, (AnonymousClass2TE) null);
            this.A04.schedule(r3);
        }
    }

    public final boolean A03() {
        if (this.A01 != null) {
            return true;
        }
        return false;
    }

    public final boolean A04() {
        if (this.A00 != Constants.A0C || this.A01 == null || !this.A02) {
            return false;
        }
        return true;
    }

    public C28341Li(Context context, AnonymousClass0C1 r8, AnonymousClass1L8 r9) {
        this(context, r8, r9, (String) null, false);
    }

    public C28341Li(Context context, AnonymousClass0C1 r8, AnonymousClass1L8 r9, String str, boolean z) {
        this(r8.getToken(), new C28351Lj(context, r9), new Handler(Looper.getMainLooper()), str, z);
    }

    public C28341Li(String str, C28351Lj r3, Handler handler, String str2, boolean z) {
        this.A05 = str;
        this.A04 = r3;
        this.A03 = handler;
        this.A02 = z;
        this.A01 = str2;
        if (str2 != null) {
            this.A00 = Constants.A0C;
        }
    }
}
