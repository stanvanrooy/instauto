package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.math.BigDecimal;
import java.math.BigInteger;
import p000X.AnonymousClass000;
import p000X.AnonymousClass29W;
import p000X.AnonymousClass29X;
import p000X.AnonymousClass29Z;
import p000X.C120125Dh;
import p000X.C12970hg;
import p000X.C13120hv;
import p000X.C13460iZ;
import p000X.C13480ib;

@JacksonStdImpl
public final class TokenBufferSerializer extends StdSerializer {
    public TokenBufferSerializer() {
        super(C13480ib.class);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    public static final void A00(C13480ib r7, C13460iZ r8) {
        int intValue;
        AnonymousClass29W r2 = r7.A00;
        int i = -1;
        while (true) {
            i++;
            if (i >= 16) {
                r2 = r2.A01;
                if (r2 != null) {
                    i = 0;
                } else {
                    return;
                }
            }
            long j = r2.A00;
            if (i > 0) {
                j >>= i << 2;
            }
            C13120hv r0 = AnonymousClass29W.A03[((int) j) & 15];
            if (r0 != null) {
                switch (AnonymousClass29X.A01[r0.ordinal()]) {
                    case 1:
                        r8.A0T();
                        break;
                    case 2:
                        r8.A0Q();
                        break;
                    case 3:
                        r8.A0S();
                        break;
                    case 4:
                        r8.A0P();
                        break;
                    case 5:
                        Object obj = r2.A02[i];
                        if (!(obj instanceof C12970hg)) {
                            r8.A0d((String) obj);
                            break;
                        } else {
                            r8.A0b((C12970hg) obj);
                            break;
                        }
                    case 6:
                        Object obj2 = r2.A02[i];
                        if (!(obj2 instanceof C12970hg)) {
                            r8.A0g((String) obj2);
                            break;
                        } else {
                            r8.A0c((C12970hg) obj2);
                            break;
                        }
                    case 7:
                        Object obj3 = r2.A02[i];
                        if (obj3 instanceof Integer) {
                            intValue = ((Integer) obj3).intValue();
                        } else if (obj3 instanceof BigInteger) {
                            r8.A0i((BigInteger) obj3);
                            break;
                        } else if (obj3 instanceof Long) {
                            r8.A0Y(((Long) obj3).longValue());
                            break;
                        } else if (obj3 instanceof Short) {
                            r8.A0j(((Short) obj3).shortValue());
                            break;
                        } else {
                            intValue = ((Number) obj3).intValue();
                        }
                        r8.A0X(intValue);
                        break;
                    case 8:
                        Object obj4 = r2.A02[i];
                        if (obj4 instanceof Double) {
                            r8.A0V(((Double) obj4).doubleValue());
                            break;
                        } else if (obj4 instanceof BigDecimal) {
                            r8.A0h((BigDecimal) obj4);
                            break;
                        } else if (obj4 instanceof Float) {
                            r8.A0W(((Float) obj4).floatValue());
                            break;
                        } else if (obj4 != null) {
                            if (obj4 instanceof String) {
                                r8.A0e((String) obj4);
                                break;
                            } else {
                                throw new AnonymousClass29Z(AnonymousClass000.A0J("Unrecognized value type for VALUE_NUMBER_FLOAT: ", obj4.getClass().getName(), ", can not serialize"));
                            }
                        }
                    case 9:
                        r8.A0k(true);
                        break;
                    case 10:
                        r8.A0k(false);
                        break;
                    case C120125Dh.VIEW_TYPE_BANNER:
                        r8.A0R();
                        break;
                    case C120125Dh.VIEW_TYPE_SPINNER:
                        r8.A0M(r2.A02[i]);
                        break;
                    default:
                        throw new RuntimeException("Internal error: should never end up through this code path");
                }
            } else {
                return;
            }
        }
    }
}
