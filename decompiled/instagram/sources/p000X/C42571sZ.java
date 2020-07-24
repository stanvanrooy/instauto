package p000X;

import android.content.Context;
import android.os.PowerManager;

/* renamed from: X.1sZ  reason: invalid class name and case insensitive filesystem */
public final class C42571sZ {
    public static C42571sZ A07;
    public int A00;
    public PowerManager.WakeLock A01;
    public AnonymousClass8G9 A02;
    public Exception A03;
    public String A04 = "None";
    public final Context A05;
    public final boolean A06;

    public static synchronized void A01(C42571sZ r1, AnonymousClass8G9 r2) {
        synchronized (r1) {
            r1.A02 = r2;
        }
    }

    public final synchronized void A02() {
        if (this.A02 != null) {
            AnonymousClass0DB.A0E("FinalVideoRenderer", "Cancelling Final Render");
            this.A02.cancel();
        }
    }

    public static synchronized C42571sZ A00(AnonymousClass0C1 r5, Context context) {
        C42571sZ r1;
        synchronized (C42571sZ.class) {
            if (((Boolean) AnonymousClass0L6.A02(r5, AnonymousClass0L7.DIRECT_MUTATION_MANAGER_MEDIA_3, "prevent_multiple_renders", false, (AnonymousClass04H) null)).booleanValue()) {
                if (A07 == null) {
                    A07 = new C42571sZ(context, true);
                }
                r1 = A07;
            } else {
                r1 = new C42571sZ(context, false);
            }
        }
        return r1;
    }

    public C42571sZ(Context context, boolean z) {
        this.A05 = context;
        this.A06 = z;
    }
}
