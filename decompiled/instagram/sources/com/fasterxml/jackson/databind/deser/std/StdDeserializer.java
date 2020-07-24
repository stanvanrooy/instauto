package com.fasterxml.jackson.databind.deser.std;

import com.facebook.forker.Process;
import com.facebook.react.uimanager.BaseViewManager;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.C0L;
import p000X.C13080hr;
import p000X.C13120hv;
import p000X.C13230i7;
import p000X.C200288hn;
import p000X.C27104Bxu;
import p000X.C27107By8;
import p000X.C27109ByB;
import p000X.C27123ByY;
import p000X.C27125Bya;
import p000X.C27148BzD;
import p000X.C27179Bzx;

public abstract class StdDeserializer extends JsonDeserializer implements Serializable {
    public final Class A00;

    public static final JsonDeserializer A01(C27123ByY byY, C27148BzD bzD, JsonDeserializer jsonDeserializer) {
        Object A0d;
        C27179Bzx A01 = byY.A00.A01();
        if (A01 == null || bzD == null || (A0d = A01.A0d(bzD.APy())) == null) {
            return jsonDeserializer;
        }
        C27107By8 A06 = byY.A06(A0d);
        C0L ANn = A06.ANn(byY.A05());
        if (jsonDeserializer == null) {
            jsonDeserializer = byY.A08(ANn, bzD);
        }
        return new StdDelegatingDeserializer(A06, ANn, jsonDeserializer);
    }

    public void A0J(C13080hr r7, C27123ByY byY, Object obj, String str) {
        Collection A09;
        Class<?> cls;
        if (obj == null) {
            obj = this.A00;
        }
        if (!byY.A0O(C27109ByB.FAIL_ON_UNKNOWN_PROPERTIES)) {
            r7.A0f();
            return;
        }
        if (this == null) {
            A09 = null;
        } else {
            A09 = A09();
        }
        C13080hr r4 = byY.A05;
        if (obj != null) {
            if (obj instanceof Class) {
                cls = (Class) obj;
            } else {
                cls = obj.getClass();
            }
            C27104Bxu bxu = new C27104Bxu(AnonymousClass000.A0O("Unrecognized field \"", str, "\" (class ", cls.getName(), "), not marked as ignorable"), r4.A0V(), A09);
            bxu.A04(new C200288hn(obj, str));
            throw bxu;
        }
        throw new IllegalArgumentException();
    }

    public static final String A02(C13080hr r2, C27123ByY byY) {
        String A0r = r2.A0r();
        if (A0r != null) {
            return A0r;
        }
        throw byY.A0B(String.class, r2.A0g());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if ("0".equals(r1) == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        r0 = java.lang.Boolean.TRUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r4.A0U() == 0) goto L_0x0012;
     */
    public static final boolean A03(C13080hr r4) {
        if (r4.A0X() != Constants.ONE) {
            String A0t = r4.A0t();
            if (!"0.0".equals(A0t)) {
            }
        }
        Boolean bool = Boolean.FALSE;
        return bool.booleanValue();
    }

    public final double A0B(C13080hr r6, C27123ByY byY) {
        C13120hv A0g = r6.A0g();
        if (A0g == C13120hv.VALUE_NUMBER_INT || A0g == C13120hv.VALUE_NUMBER_FLOAT) {
            return r6.A0R();
        }
        if (A0g == C13120hv.VALUE_STRING) {
            String trim = r6.A0t().trim();
            if (trim.length() != 0) {
                char charAt = trim.charAt(0);
                if (charAt != '-') {
                    if (charAt != 'I') {
                        if (charAt == 'N' && "NaN".equals(trim)) {
                            return Double.NaN;
                        }
                    } else if ("Infinity".equals(trim) || "INF".equals(trim)) {
                        return Double.POSITIVE_INFINITY;
                    }
                } else if ("-Infinity".equals(trim) || "-INF".equals(trim)) {
                    return Double.NEGATIVE_INFINITY;
                }
                try {
                    if ("2.2250738585072012e-308".equals(trim)) {
                        return Double.MIN_VALUE;
                    }
                    return Double.parseDouble(trim);
                } catch (IllegalArgumentException unused) {
                    throw byY.A0F(trim, this.A00, "not a valid double value");
                }
            }
        } else if (A0g != C13120hv.VALUE_NULL) {
            throw byY.A0B(this.A00, A0g);
        }
        return 0.0d;
    }

    public final float A0C(C13080hr r4, C27123ByY byY) {
        C13120hv A0g = r4.A0g();
        if (A0g == C13120hv.VALUE_NUMBER_INT || A0g == C13120hv.VALUE_NUMBER_FLOAT) {
            return r4.A0S();
        }
        if (A0g == C13120hv.VALUE_STRING) {
            String trim = r4.A0t().trim();
            if (trim.length() != 0) {
                char charAt = trim.charAt(0);
                if (charAt != '-') {
                    if (charAt != 'I') {
                        if (charAt == 'N' && "NaN".equals(trim)) {
                            return Float.NaN;
                        }
                    } else if ("Infinity".equals(trim) || "INF".equals(trim)) {
                        return Float.POSITIVE_INFINITY;
                    }
                } else if ("-Infinity".equals(trim) || "-INF".equals(trim)) {
                    return Float.NEGATIVE_INFINITY;
                }
                try {
                    return Float.parseFloat(trim);
                } catch (IllegalArgumentException unused) {
                    throw byY.A0F(trim, this.A00, "not a valid float value");
                }
            }
        } else if (A0g != C13120hv.VALUE_NULL) {
            throw byY.A0B(this.A00, A0g);
        }
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public final int A0D(C13080hr r12, C27123ByY byY) {
        C13120hv A0g = r12.A0g();
        if (A0g == C13120hv.VALUE_NUMBER_INT || A0g == C13120hv.VALUE_NUMBER_FLOAT) {
            return r12.A0T();
        }
        if (A0g == C13120hv.VALUE_STRING) {
            String trim = r12.A0t().trim();
            try {
                int length = trim.length();
                if (length > 9) {
                    long parseLong = Long.parseLong(trim);
                    if (parseLong >= -2147483648L && parseLong <= 2147483647L) {
                        return (int) parseLong;
                    }
                    throw byY.A0F(trim, this.A00, AnonymousClass000.A0M("Overflow: numeric value (", trim, ") out of range of int (", Process.WAIT_RESULT_TIMEOUT, " - ", Integer.MAX_VALUE, ")"));
                } else if (length != 0) {
                    return C13230i7.A01(trim);
                }
            } catch (IllegalArgumentException unused) {
                throw byY.A0F(trim, this.A00, "not a valid int value");
            }
        } else if (A0g != C13120hv.VALUE_NULL) {
            throw byY.A0B(this.A00, A0g);
        }
        return 0;
    }

    public final long A0E(C13080hr r6, C27123ByY byY) {
        C13120hv A0g = r6.A0g();
        if (A0g == C13120hv.VALUE_NUMBER_INT || A0g == C13120hv.VALUE_NUMBER_FLOAT) {
            return r6.A0U();
        }
        if (A0g == C13120hv.VALUE_STRING) {
            String trim = r6.A0t().trim();
            int length = trim.length();
            if (length != 0) {
                if (length > 9) {
                    return Long.parseLong(trim);
                }
                try {
                    return (long) C13230i7.A01(trim);
                } catch (IllegalArgumentException unused) {
                    throw byY.A0F(trim, this.A00, "not a valid long value");
                }
            }
        } else if (A0g != C13120hv.VALUE_NULL) {
            throw byY.A0B(this.A00, A0g);
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r4.A0T() == 0) goto L_0x001e;
     */
    public final Boolean A0F(C13080hr r4, C27123ByY byY) {
        C27125Bya A0B;
        C13120hv A0g = r4.A0g();
        if (A0g != C13120hv.VALUE_TRUE) {
            if (A0g != C13120hv.VALUE_FALSE) {
                if (A0g != C13120hv.VALUE_NUMBER_INT) {
                    if (A0g != C13120hv.VALUE_NULL) {
                        if (A0g == C13120hv.VALUE_STRING) {
                            String trim = r4.A0t().trim();
                            if (!"true".equals(trim)) {
                                if (!"false".equals(trim)) {
                                    if (trim.length() != 0) {
                                        A0B = byY.A0F(trim, this.A00, "only \"true\" or \"false\" recognized");
                                    }
                                }
                            }
                        } else {
                            A0B = byY.A0B(this.A00, A0g);
                        }
                        throw A0B;
                    }
                    return (Boolean) A05();
                } else if (r4.A0X() != Constants.ZERO) {
                    return Boolean.valueOf(A03(r4));
                }
            }
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public final Double A0G(C13080hr r4, C27123ByY byY) {
        double A0R;
        double d;
        C13120hv A0g = r4.A0g();
        if (A0g == C13120hv.VALUE_NUMBER_INT || A0g == C13120hv.VALUE_NUMBER_FLOAT) {
            A0R = r4.A0R();
        } else {
            if (A0g == C13120hv.VALUE_STRING) {
                String trim = r4.A0t().trim();
                if (trim.length() != 0) {
                    char charAt = trim.charAt(0);
                    if (charAt != '-') {
                        if (charAt != 'I') {
                            if (charAt == 'N' && "NaN".equals(trim)) {
                                A0R = Double.NaN;
                            }
                        } else if ("Infinity".equals(trim) || "INF".equals(trim)) {
                            A0R = Double.POSITIVE_INFINITY;
                        }
                    } else if ("-Infinity".equals(trim) || "-INF".equals(trim)) {
                        A0R = Double.NEGATIVE_INFINITY;
                    }
                    try {
                        if ("2.2250738585072012e-308".equals(trim)) {
                            d = Double.MIN_VALUE;
                        } else {
                            d = Double.parseDouble(trim);
                        }
                        return Double.valueOf(d);
                    } catch (IllegalArgumentException unused) {
                        throw byY.A0F(trim, this.A00, "not a valid Double value");
                    }
                }
            } else if (A0g != C13120hv.VALUE_NULL) {
                throw byY.A0B(this.A00, A0g);
            }
            return (Double) A05();
        }
        return Double.valueOf(A0R);
    }

    public final Integer A0H(C13080hr r12, C27123ByY byY) {
        C13120hv A0g = r12.A0g();
        if (A0g == C13120hv.VALUE_NUMBER_INT || A0g == C13120hv.VALUE_NUMBER_FLOAT) {
            return Integer.valueOf(r12.A0T());
        }
        if (A0g == C13120hv.VALUE_STRING) {
            String trim = r12.A0t().trim();
            try {
                int length = trim.length();
                if (length > 9) {
                    long parseLong = Long.parseLong(trim);
                    if (parseLong >= -2147483648L && parseLong <= 2147483647L) {
                        return Integer.valueOf((int) parseLong);
                    }
                    throw byY.A0F(trim, this.A00, AnonymousClass000.A0M("Overflow: numeric value (", trim, ") out of range of Integer (", Process.WAIT_RESULT_TIMEOUT, " - ", Integer.MAX_VALUE, ")"));
                } else if (length == 0) {
                    return (Integer) A05();
                } else {
                    return Integer.valueOf(C13230i7.A01(trim));
                }
            } catch (IllegalArgumentException unused) {
                throw byY.A0F(trim, this.A00, "not a valid Integer value");
            }
        } else if (A0g == C13120hv.VALUE_NULL) {
            return (Integer) A05();
        } else {
            throw byY.A0B(this.A00, A0g);
        }
    }

    public Date A0I(C13080hr r6, C27123ByY byY) {
        C13120hv A0g = r6.A0g();
        if (A0g == C13120hv.VALUE_NUMBER_INT) {
            return new Date(r6.A0U());
        }
        if (A0g == C13120hv.VALUE_NULL) {
            return (Date) A05();
        }
        if (A0g == C13120hv.VALUE_STRING) {
            try {
                String trim = r6.A0t().trim();
                if (trim.length() == 0) {
                    return (Date) A05();
                }
                return byY.A0M(trim);
            } catch (IllegalArgumentException e) {
                throw byY.A0F((String) null, this.A00, AnonymousClass000.A0J("not a valid representation (error: ", e.getMessage(), ")"));
            }
        } else {
            throw byY.A0B(this.A00, A0g);
        }
    }

    public final boolean A0K(C13080hr r5, C27123ByY byY) {
        C27125Bya A0B;
        C13120hv A0g = r5.A0g();
        if (A0g == C13120hv.VALUE_TRUE) {
            return true;
        }
        if (A0g == C13120hv.VALUE_FALSE || A0g == C13120hv.VALUE_NULL) {
            return false;
        }
        if (A0g != C13120hv.VALUE_NUMBER_INT) {
            if (A0g == C13120hv.VALUE_STRING) {
                String trim = r5.A0t().trim();
                if ("true".equals(trim)) {
                    return true;
                }
                if ("false".equals(trim) || trim.length() == 0) {
                    return Boolean.FALSE.booleanValue();
                }
                A0B = byY.A0F(trim, this.A00, "only \"true\" or \"false\" recognized");
            } else {
                A0B = byY.A0B(this.A00, A0g);
            }
            throw A0B;
        } else if (r5.A0X() != Constants.ZERO) {
            return A03(r5);
        } else {
            if (r5.A0T() == 0) {
                return false;
            }
            return true;
        }
    }

    public StdDeserializer(C0L c0l) {
        Class cls;
        if (c0l == null) {
            cls = null;
        } else {
            cls = c0l.A00;
        }
        this.A00 = cls;
    }

    public StdDeserializer(Class cls) {
        this.A00 = cls;
    }
}
