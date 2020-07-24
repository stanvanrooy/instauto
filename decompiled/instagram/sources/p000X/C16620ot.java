package p000X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0ot  reason: invalid class name and case insensitive filesystem */
public final class C16620ot {
    public static C16620ot A02;
    public final AnonymousClass0OT A00;
    public final Map A01 = new HashMap();

    public static C16710p2 A00(C16620ot r1, String str) {
        C16710p2 r0 = (C16710p2) r1.A01.get(str);
        if (r0 != null) {
            return r0;
        }
        AnonymousClass0QD.A01("NotificationController", AnonymousClass000.A0J("Category ", str, " is not registered"));
        return null;
    }

    public static C16620ot A01() {
        AnonymousClass0OT r0;
        if (A02 == null) {
            synchronized (C16630ou.class) {
                if (C16630ou.A00 == null) {
                    AnonymousClass0O1 A002 = AnonymousClass0O1.A00();
                    A002.A01 = "notifications";
                    A002.A00 = 60000;
                    C16630ou.A00 = A002.A01();
                }
                r0 = C16630ou.A00;
            }
            A02 = new C16620ot(r0);
        }
        return A02;
    }

    public final void A03(String str, C16690p0 r7) {
        C16720p3 r0;
        synchronized (C16720p3.class) {
            if (C16720p3.A01 == null) {
                C16720p3.A01 = new C16720p3(new C16730p4(StoredPreferences.A00));
            }
            r0 = C16720p3.A01;
        }
        this.A01.put(str, new C16710p2(r0, r7));
    }

    public C16620ot(AnonymousClass0OT r2) {
        this.A00 = r2;
    }

    public final void A02(C06590Pq r9, String str, String str2, C42861tN r12, Runnable runnable) {
        C16710p2 A002 = A00(this, str);
        if (A002 != null) {
            this.A00.ADc(new C59662hw(this, A002, r9, str2, r12, runnable));
        }
    }

    public final void A04(String str, String str2) {
        C16710p2 A002 = A00(this, str);
        if (A002 != null) {
            this.A00.ADc(new C24487AoU(this, A002, str2));
        }
    }

    public final void A05(String str, String str2) {
        C16710p2 A002 = A00(this, str);
        if (A002 != null) {
            this.A00.ADc(new AnonymousClass3JH(this, A002, str2));
        }
    }
}
