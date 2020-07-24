package p000X;

import com.facebook.common.dextricks.DexStore;
import java.util.Map;

/* renamed from: X.0Qw  reason: invalid class name and case insensitive filesystem */
public final class C06890Qw {
    public static C06910Qy parseFromJson(C13080hr r6) {
        C13120hv r4;
        int i;
        C06910Qy r5 = new C06910Qy();
        if (r6.A0g() != C13120hv.START_OBJECT) {
            r6.A0f();
            return null;
        }
        while (true) {
            C13120hv A0p = r6.A0p();
            r4 = C13120hv.END_OBJECT;
            if (A0p == r4) {
                break;
            }
            String A0i = r6.A0i();
            r6.A0p();
            String str = null;
            if ("app_data".equals(A0i)) {
                if (r6.A0g() != C13120hv.VALUE_NULL) {
                    str = r6.A0t();
                }
                r5.A01 = str;
            } else if ("checksum".equals(A0i)) {
                if (r6.A0g() != C13120hv.VALUE_NULL) {
                    str = r6.A0t();
                }
                r5.A02 = str;
            } else if (DexStore.CONFIG_FILENAME.equals(A0i)) {
                if (r6.A0g() != C13120hv.VALUE_NULL) {
                    str = r6.A0t();
                }
                r5.A03 = str;
            } else if ("config_owner_id".equals(A0i)) {
                if (r6.A0g() != C13120hv.VALUE_NULL) {
                    str = r6.A0t();
                }
                r5.A04 = str;
            }
            r6.A0f();
        }
        C13080hr A0A = C12890hY.A00.A0A(r5.A01);
        A0A.A0p();
        r5.A00 = AnonymousClass0R3.parseFromJson(A0A);
        String str2 = r5.A03;
        if (str2 != null && !str2.equals("")) {
            C13080hr A0A2 = C12890hY.A00.A0A(str2);
            if (A0A2.A0p() == C13120hv.START_OBJECT) {
                while (true) {
                    A0A2.A0h();
                    C13120hv A0g = A0A2.A0g();
                    if (A0g == r4) {
                        break;
                    }
                    String A0i2 = A0A2.A0i();
                    if (A0i2.equals("funnel_analytics")) {
                        A0A2.A0f();
                    } else if (A0i2.equals("blacklist")) {
                        A0A2.A0h();
                        while (A0A2.A0g() != C13120hv.END_ARRAY) {
                            A0A2.A0t();
                            r5.A06.add(A0A2.A0t());
                            A0A2.A0h();
                        }
                        A0A2.A0p();
                    } else if (A0g == C13120hv.START_OBJECT) {
                        C06910Qy.A00(r5, A0i2, A0A2);
                    } else {
                        A0A2.A0t();
                        Map map = r5.A05;
                        String A0t = A0A2.A0t();
                        try {
                            i = Integer.parseInt(A0t);
                        } catch (NumberFormatException unused) {
                            AnonymousClass0QD.A01("MarauderResponse", AnonymousClass000.A0E("Invalid sample rate format. Expected: int, received: ", A0t));
                            i = 0;
                        }
                        map.put(A0i2, Integer.valueOf(i));
                    }
                }
            }
        }
        return r5;
    }
}
