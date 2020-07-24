package com.fasterxml.jackson.databind.deser.std;

import java.math.BigDecimal;
import p000X.Constants;
import p000X.C120125Dh;
import p000X.C13080hr;
import p000X.C13120hv;
import p000X.C26690Bpo;
import p000X.C26695Bpv;
import p000X.C26697Bpx;
import p000X.C26699Bpz;
import p000X.C26700Bq0;
import p000X.C26701Bq1;
import p000X.C26702Bq2;
import p000X.C26703Bq3;
import p000X.C26705Bq6;
import p000X.C26706Bq9;
import p000X.C26709Bqa;
import p000X.C27109ByB;
import p000X.C27123ByY;
import p000X.C27125Bya;
import p000X.C59382hU;
import p000X.C59422hY;
import p000X.C59442ha;
import p000X.C64342rK;

public abstract class BaseNodeDeserializer extends StdDeserializer {
    public BaseNodeDeserializer() {
        super(C59382hU.class);
    }

    public final C59382hU A0L(C13080hr r4, C27123ByY byY, C59422hY r6) {
        switch (C26709Bqa.A00[r4.A0g().ordinal()]) {
            case 1:
            case 5:
                return A0N(r4, byY, r6);
            case 2:
                return A0M(r4, byY, r6);
            case 3:
                return C59442ha.A00(r4.A0t());
            case 6:
                Object A0Z = r4.A0Z();
                if (A0Z != null) {
                    if (A0Z.getClass() != byte[].class) {
                        return new C26702Bq2(A0Z);
                    }
                    byte[] bArr = (byte[]) A0Z;
                    if (bArr == null) {
                        return null;
                    }
                    if (bArr.length == 0) {
                        return C26706Bq9.A01;
                    }
                    return new C26706Bq9(bArr);
                }
                break;
            case 7:
                Integer A0X = r4.A0X();
                if (A0X == Constants.A0C || byY.A0O(C27109ByB.USE_BIG_INTEGER_FOR_INTS)) {
                    return new C26700Bq0(r4.A0b());
                }
                if (A0X == Constants.ZERO) {
                    return C26699Bpz.A00(r4.A0T());
                }
                return new C26697Bpx(r4.A0U());
            case 8:
                if (r4.A0X() != Constants.A0j && !byY.A0O(C27109ByB.USE_BIG_DECIMAL_FOR_FLOATS)) {
                    return new C26695Bpv(r4.A0R());
                }
                BigDecimal A0a = r4.A0a();
                if (r6.A00) {
                    return new C26705Bq6(A0a);
                }
                if (A0a.compareTo(BigDecimal.ZERO) == 0) {
                    return C26705Bq6.A01;
                }
                return new C26705Bq6(A0a.stripTrailingZeros());
            case 9:
                return C26701Bq1.A02;
            case 10:
                return C26701Bq1.A01;
            case C120125Dh.VIEW_TYPE_BANNER:
                break;
            default:
                throw byY.A0A(this.A00);
        }
        return C26703Bq3.A00;
    }

    public final C64342rK A0M(C13080hr r4, C27123ByY byY, C59422hY r6) {
        C59382hU A0N;
        C64342rK r2 = new C64342rK(r6);
        while (true) {
            C13120hv A0p = r4.A0p();
            if (A0p != null) {
                int i = C26709Bqa.A00[A0p.ordinal()];
                if (i == 1) {
                    A0N = A0N(r4, byY, r6);
                } else if (i == 2) {
                    A0N = A0M(r4, byY, r6);
                } else if (i == 3) {
                    A0N = C59442ha.A00(r4.A0t());
                } else if (i == 4) {
                    return r2;
                } else {
                    A0N = A0L(r4, byY, r6);
                }
                r2.A03(A0N);
            } else {
                throw C27125Bya.A00(byY.A05, "Unexpected end-of-input when binding data into ArrayNode");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r1 == 3) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        r1 = A0L(r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r1 != null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        r1 = p000X.C26703Bq3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        r3.A00.put(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        r1 = p000X.C59442ha.A00(r5.A0t());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        r1 = A0M(r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        r1 = A0N(r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1:0x000b, code lost:
        if (r1 == p000X.C13120hv.START_OBJECT) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = r5.A0p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        if (r1 != p000X.C13120hv.FIELD_NAME) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        r2 = r5.A0i();
        r1 = p000X.C26709Bqa.A00[r5.A0p().ordinal()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        if (r1 == 1) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (r1 == 2) goto L_0x0045;
     */
    public final C26690Bpo A0N(C13080hr r5, C27123ByY byY, C59422hY r7) {
        C26690Bpo bpo = new C26690Bpo(r7);
        C13120hv A0g = r5.A0g();
    }
}
