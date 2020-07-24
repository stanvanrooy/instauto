package p000X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0gK  reason: invalid class name and case insensitive filesystem */
public final class C12190gK {
    public static C12190gK A05;
    public AnonymousClass0Ba A00;
    public Map A01 = new HashMap();
    public Map A02 = new HashMap();
    public boolean A03 = false;
    public boolean A04 = false;

    public static String A00(String str, int i, String str2) {
        String str3 = str2;
        if (str2 == null) {
            str3 = "No Message supplied by the error";
        }
        return AnonymousClass000.A0P("MobileBoost | ", str, " | ", AnonymousClass299.A00(i), " | ", str3);
    }

    public static void A01(C12190gK r1, Exception exc) {
        if (!r1.A04) {
            throw new RuntimeException("Mobile Boost: Forced fallthrough crash! Error State Handler turned off!", exc);
        }
    }

    public static void A02(Map map, C12390gf r3) {
        int i;
        if (r3 != null && r3.AGu() != -1) {
            if (!map.containsKey(r3) || map.get(r3) == null) {
                i = 1;
            } else {
                i = Integer.valueOf(((Integer) map.get(r3)).intValue() + 1);
            }
            map.put(r3, i);
        }
    }

    public final void A04(C12390gf r3) {
        if (r3 != null && r3.AGu() != -1 && r3.AJ3() != 0) {
            if (this.A01.containsKey(r3) && this.A01.get(r3) != null && 5 < ((Integer) this.A01.get(r3)).intValue()) {
                this.A01.get(r3);
                r3.AJ3();
            }
            if (this.A02.containsKey(r3) && this.A02.get(r3) != null && 5 < ((Integer) this.A02.get(r3)).intValue()) {
                this.A02.get(r3);
                r3.AJ3();
            }
        }
    }

    public final void A05(C12390gf r5, Exception exc) {
        int AGu;
        if (!(r5 == null || r5.AGu() == -1)) {
            A02(this.A01, r5);
        }
        if (r5 != null) {
            AGu = r5.AGu();
        } else {
            AGu = C12370gd.A00.AGu();
        }
        A01(this, exc);
        this.A00.BpD(A00("BoosterFailsReleaseWithException", AGu, exc.getMessage()), exc);
    }

    public C12190gK(AnonymousClass0Ba r2) {
        if (r2 != null) {
            this.A00 = r2;
            this.A03 = true;
            return;
        }
        this.A00 = new C127315cs();
    }

    public final void A03(int i, Exception exc) {
        A01(this, exc);
        this.A00.BpD(A00("BoosterInitializationWithException", i, exc.getMessage()), exc);
    }
}
