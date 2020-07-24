package p000X;

import java.util.ArrayList;

/* renamed from: X.0jJ  reason: invalid class name and case insensitive filesystem */
public final class C13840jJ {
    public static C13850jK parseFromJson(C13080hr r7) {
        String str;
        ArrayList arrayList;
        String A0t;
        C13850jK r1 = new C13850jK();
        if (r7.A0g() != C13120hv.START_OBJECT) {
            r7.A0f();
            return null;
        }
        while (r7.A0p() != C13120hv.END_OBJECT) {
            String A0i = r7.A0i();
            r7.A0p();
            String str2 = null;
            if ("value".equals(A0i)) {
                if (r7.A0g() != C13120hv.VALUE_NULL) {
                    str2 = r7.A0t();
                }
                r1.A00 = str2;
            } else if ("logging_id".equals(A0i)) {
                if (r7.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r7.A0p() != C13120hv.END_ARRAY) {
                        if (r7.A0g() == C13120hv.VALUE_NULL) {
                            A0t = null;
                        } else {
                            A0t = r7.A0t();
                        }
                        if (A0t != null) {
                            arrayList.add(A0t);
                        }
                    }
                } else {
                    arrayList = null;
                }
                r1.A01 = arrayList;
            }
            r7.A0f();
        }
        if (C13850jK.A02 == null) {
            C13850jK.A02 = Boolean.valueOf(C05630Li.A03(new C05000Hl("should_intern_config_values", AnonymousClass0L7.QE_STRING_INTERNER, false, (String[]) null, (AnonymousClass04H) null)));
        }
        if (C13850jK.A02.booleanValue()) {
            String str3 = r1.A00;
            if (str3 != null) {
                str = str3.intern();
            } else {
                str = null;
            }
            r1.A00 = str;
        }
        return r1;
    }

    public static void A00(C13460iZ r2, C13850jK r3) {
        r2.A0T();
        String str = r3.A00;
        if (str != null) {
            r2.A0H("value", str);
        }
        if (r3.A01 != null) {
            r2.A0d("logging_id");
            r2.A0S();
            for (String str2 : r3.A01) {
                if (str2 != null) {
                    r2.A0g(str2);
                }
            }
            r2.A0P();
        }
        r2.A0Q();
    }
}
