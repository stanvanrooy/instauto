package p000X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0Qy  reason: invalid class name and case insensitive filesystem */
public final class C06910Qy {
    public AnonymousClass0R4 A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public Map A05 = new HashMap();
    public Set A06 = new HashSet();

    public static void A00(C06910Qy r4, String str, C13080hr r6) {
        int i;
        int i2;
        r6.A0h();
        while (true) {
            C13120hv A0g = r6.A0g();
            if (A0g != C13120hv.END_OBJECT) {
                String A0i = r6.A0i();
                if (A0i.equals("*")) {
                    r6.A0t();
                    Map map = r4.A05;
                    String A0t = r6.A0t();
                    try {
                        i2 = Integer.parseInt(A0t);
                    } catch (NumberFormatException unused) {
                        AnonymousClass0QD.A01("MarauderResponse", AnonymousClass000.A0E("Invalid sample rate format. Expected: int, received: ", A0t));
                        i2 = 0;
                    }
                    map.put(str, Integer.valueOf(i2));
                    r6.A0h();
                } else {
                    String A0J = AnonymousClass000.A0J(str, ":", A0i);
                    if (A0g == C13120hv.START_OBJECT) {
                        A00(r4, A0J, r6);
                    } else {
                        r6.A0t();
                        Map map2 = r4.A05;
                        String A0t2 = r6.A0t();
                        try {
                            i = Integer.parseInt(A0t2);
                        } catch (NumberFormatException unused2) {
                            AnonymousClass0QD.A01("MarauderResponse", AnonymousClass000.A0E("Invalid sample rate format. Expected: int, received: ", A0t2));
                            i = 0;
                        }
                        map2.put(A0J, Integer.valueOf(i));
                    }
                    r6.A0h();
                }
            } else {
                return;
            }
        }
    }
}
