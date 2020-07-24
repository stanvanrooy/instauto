package p000X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1tO  reason: invalid class name and case insensitive filesystem */
public final class C42871tO {
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x020c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x020d, code lost:
        if (r3 != null) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0212, code lost:
        throw r0;
     */
    public static C42861tN parseFromJson(C13080hr r6) {
        Integer num;
        C42861tN r5 = new C42861tN();
        if (r6.A0g() != C13120hv.START_OBJECT) {
            r6.A0f();
            return null;
        }
        while (r6.A0p() != C13120hv.END_OBJECT) {
            String A0i = r6.A0i();
            r6.A0p();
            String str = null;
            if ("t".equals(A0i)) {
                if (r6.A0g() != C13120hv.VALUE_NULL) {
                    str = r6.A0t();
                }
                r5.A0H = str;
            } else if ("m".equals(A0i)) {
                if (r6.A0g() != C13120hv.VALUE_NULL) {
                    str = r6.A0t();
                }
                r5.A09 = str;
            } else if ("tt".equals(A0i)) {
                if (r6.A0g() != C13120hv.VALUE_NULL) {
                    str = r6.A0t();
                }
                r5.A0G = str;
            } else if ("ig".equals(A0i)) {
                if (r6.A0g() != C13120hv.VALUE_NULL) {
                    str = r6.A0t();
                }
                r5.A06 = str;
            } else if ("collapse_key".equals(A0i)) {
                if (r6.A0g() != C13120hv.VALUE_NULL) {
                    str = r6.A0t();
                }
                r5.A03 = str;
            } else if ("i".equals(A0i)) {
                r5.A02 = C13270iF.A00(r6);
            } else if ("a".equals(A0i)) {
                r5.A01 = C13270iF.A00(r6);
            } else if ("sound".equals(A0i)) {
                if (r6.A0g() != C13120hv.VALUE_NULL) {
                    str = r6.A0t();
                }
                r5.A0F = str;
            } else if ("pi".equals(A0i)) {
                if (r6.A0g() == C13120hv.VALUE_STRING) {
                    str = r6.A0t();
                }
                r5.A0C = str;
            } else if ("c".equals(A0i)) {
                if (r6.A0g() != C13120hv.VALUE_NULL) {
                    str = r6.A0t();
                }
                r5.A0B = str;
            } else if ("u".equals(A0i)) {
                if (r6.A0g() != C13120hv.VALUE_NULL) {
                    str = r6.A0t();
                }
                r5.A08 = str;
            } else if ("bc".equals(A0i)) {
                C13080hr A0A = C12890hY.A00.A0A(r6.A0t());
                A0A.A0p();
                r5.A00 = C42881tP.parseFromJson(A0A);
            } else if ("ia".equals(A0i)) {
                if (r6.A0g() != C13120hv.VALUE_NULL) {
                    str = r6.A0t();
                }
                r5.A07 = str;
            } else if ("hpa".equals(A0i)) {
                if (r6.A0g() != C13120hv.VALUE_NULL) {
                    str = r6.A0t();
                }
                r5.A04 = str;
            } else if ("cc".equals(A0i)) {
                if (r6.A0g() != C13120hv.VALUE_NULL) {
                    str = r6.A0t();
                }
                r5.A0A = str;
            } else if ("gid".equals(A0i)) {
                if (r6.A0g() != C13120hv.VALUE_NULL) {
                    str = r6.A0t();
                }
                r5.A05 = str;
            } else if ("rid".equals(A0i)) {
                if (r6.A0g() != C13120hv.VALUE_NULL) {
                    str = r6.A0t();
                }
                r5.A0D = str;
            } else if ("rtc_m".equals(A0i)) {
                if (r6.A0g() != C13120hv.VALUE_NULL) {
                    str = r6.A0t();
                }
                r5.A0E = str;
            }
            r6.A0f();
        }
        String str2 = r5.A04;
        List list = null;
        if (str2 != null) {
            C13080hr A0A2 = C12890hY.A00.A0A(str2);
            if (A0A2.A0p() == C13120hv.START_ARRAY) {
                ArrayList arrayList = new ArrayList();
                while (A0A2.A0p() != C13120hv.END_ARRAY) {
                    if (A0A2.A0g() == C13120hv.VALUE_NULL) {
                        num = null;
                    } else {
                        num = Integer.valueOf(A0A2.A0I());
                    }
                    if (num != null) {
                        arrayList.add(num);
                    }
                }
                list = Collections.unmodifiableList(arrayList);
                A0A2.close();
            } else {
                A0A2.close();
            }
        }
        r5.A0I = list;
        return r5;
    }
}
