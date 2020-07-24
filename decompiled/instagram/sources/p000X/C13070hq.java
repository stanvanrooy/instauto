package p000X;

/* renamed from: X.0hq  reason: invalid class name and case insensitive filesystem */
public abstract class C13070hq extends C13080hr {
    public C13120hv A00;

    public static final String A04(int i) {
        StringBuilder sb;
        char c = (char) i;
        if (Character.isISOControl(c)) {
            return AnonymousClass000.A06("(CTRL-CHAR, code ", i, ")");
        }
        if (i > 255) {
            sb = new StringBuilder();
            sb.append("'");
            sb.append(c);
            sb.append("' (code ");
            sb.append(i);
            sb.append(" / 0x");
            sb.append(Integer.toHexString(i));
        } else {
            sb = new StringBuilder();
            sb.append("'");
            sb.append(c);
            sb.append("' (code ");
            sb.append(i);
        }
        sb.append(")");
        return sb.toString();
    }

    public abstract String A0i();

    public abstract boolean A0l();

    public abstract int A0n();

    public abstract int A0o();

    public abstract C13120hv A0p();

    public abstract String A0t();

    public abstract byte[] A0v(C25929Bcg bcg);

    public abstract char[] A0w();

    public abstract void A0x();

    public final void A0z(int i) {
        A12(AnonymousClass000.A0J("Illegal character (", A04((char) i), "): only regular white space (\\r, \\n, \\t) is allowed between tokens"));
    }

    public abstract void close();

    public final double A0c(double d) {
        C13120hv r0 = this.A00;
        if (r0 != null) {
            switch (C13220i6.A00[r0.ordinal()]) {
                case 5:
                case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                    return A0R();
                case 6:
                    return 1.0d;
                case 7:
                case 8:
                    return 0.0d;
                case 9:
                    Object A0Z = A0Z();
                    if (A0Z instanceof Number) {
                        return ((Number) A0Z).doubleValue();
                    }
                    break;
                case 10:
                    String A0t = A0t();
                    if (A0t == null) {
                        return d;
                    }
                    String trim = A0t.trim();
                    if (trim.length() == 0) {
                        return d;
                    }
                    try {
                        return C13230i7.A00(trim);
                    } catch (NumberFormatException unused) {
                        return d;
                    }
            }
        }
        return d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        r5 = r0.trim();
     */
    public final int A0d(int i) {
        String trim;
        int length;
        C13120hv r0 = this.A00;
        if (r0 != null) {
            switch (C13220i6.A00[r0.ordinal()]) {
                case 5:
                case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                    return A0T();
                case 6:
                    return 1;
                case 7:
                case 8:
                    return 0;
                case 9:
                    Object A0Z = A0Z();
                    if (A0Z instanceof Number) {
                        return ((Number) A0Z).intValue();
                    }
                    break;
                case 10:
                    String A0t = A0t();
                    if (A0t == null || (length = trim.length()) == 0) {
                        return i;
                    }
                    int i2 = 0;
                    if (length > 0) {
                        char charAt = trim.charAt(0);
                        if (charAt == '+') {
                            trim = trim.substring(1);
                            length = trim.length();
                        } else if (charAt == '-') {
                            i2 = 1;
                        }
                    }
                    while (i2 < length) {
                        char charAt2 = trim.charAt(i2);
                        if (charAt2 > '9' || charAt2 < '0') {
                            try {
                                return (int) C13230i7.A00(trim);
                            } catch (NumberFormatException unused) {
                                return i;
                            }
                        } else {
                            i2++;
                        }
                    }
                    return Integer.parseInt(trim);
            }
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        r5 = r0.trim();
     */
    public final long A0e(long j) {
        String trim;
        int length;
        C13120hv r0 = this.A00;
        if (r0 != null) {
            switch (C13220i6.A00[r0.ordinal()]) {
                case 5:
                case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                    return A0U();
                case 6:
                    return 1;
                case 7:
                case 8:
                    return 0;
                case 9:
                    Object A0Z = A0Z();
                    if (A0Z instanceof Number) {
                        return ((Number) A0Z).longValue();
                    }
                    break;
                case 10:
                    String A0t = A0t();
                    if (A0t == null || (length = trim.length()) == 0) {
                        return j;
                    }
                    int i = 0;
                    if (length > 0) {
                        char charAt = trim.charAt(0);
                        if (charAt == '+') {
                            trim = trim.substring(1);
                            length = trim.length();
                        } else if (charAt == '-') {
                            i = 1;
                        }
                    }
                    while (i < length) {
                        char charAt2 = trim.charAt(i);
                        if (charAt2 > '9' || charAt2 < '0') {
                            try {
                                return (long) C13230i7.A00(trim);
                            } catch (NumberFormatException unused) {
                                return j;
                            }
                        } else {
                            i++;
                        }
                    }
                    return Long.parseLong(trim);
            }
        }
        return j;
    }

    public final C13080hr A0f() {
        C13120hv r1 = this.A00;
        if (r1 != C13120hv.START_OBJECT && r1 != C13120hv.START_ARRAY) {
            return this;
        }
        int i = 1;
        while (true) {
            C13120hv A0p = A0p();
            if (A0p == null) {
                A0x();
                return this;
            }
            int i2 = C13220i6.A00[A0p.ordinal()];
            if (i2 == 1 || i2 == 2) {
                i++;
            } else if ((i2 == 3 || i2 == 4) && i - 1 == 0) {
                return this;
            }
        }
    }

    public final C13120hv A0g() {
        return this.A00;
    }

    public final void A0j() {
        if (this.A00 != null) {
            this.A00 = null;
        }
    }

    public final boolean A0k() {
        if (this.A00 != null) {
            return true;
        }
        return false;
    }

    public final boolean A0m(boolean z) {
        C13120hv r0 = this.A00;
        if (r0 != null) {
            switch (C13220i6.A00[r0.ordinal()]) {
                case 5:
                    if (A0T() != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    break;
                case 7:
                case 8:
                    return false;
                case 9:
                    Object A0Z = A0Z();
                    if (A0Z instanceof Boolean) {
                        return ((Boolean) A0Z).booleanValue();
                    }
                    break;
                case 10:
                    break;
            }
            if ("true".equals(A0t().trim())) {
                return true;
            }
        }
        return z;
    }

    public String A0u(String str) {
        C13120hv r1 = this.A00;
        if (r1 == C13120hv.VALUE_STRING || (r1 != null && r1 != C13120hv.VALUE_NULL && r1.A00())) {
            return A0t();
        }
        return str;
    }

    public final void A0y(char c) {
        if (A0Q(Constants.A0j)) {
            return;
        }
        if (c != '\'' || !A0Q(Constants.A0N)) {
            A12(AnonymousClass000.A0E("Unrecognized character escape ", A04(c)));
        }
    }

    public final void A10(int i, String str) {
        String A0J = AnonymousClass000.A0J("Unexpected character (", A04(i), ")");
        if (str != null) {
            A0J = AnonymousClass000.A0J(A0J, ": ", str);
        }
        A12(A0J);
    }

    public final void A11(int i, String str) {
        if (!A0Q(Constants.A0Y) || i >= 32) {
            A12(AnonymousClass000.A0N("Illegal unquoted character (", A04((char) i), "): has to be escaped using backslash to be included in ", str));
        }
    }

    public final void A13(String str) {
        A12(AnonymousClass000.A0E("Unexpected end-of-input", str));
    }

    public final C13120hv A0h() {
        C13120hv A0p = A0p();
        if (A0p == C13120hv.FIELD_NAME) {
            return A0p();
        }
        return A0p;
    }

    public final void A12(String str) {
        throw A0K(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r6 >= 0) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        r14.A03(r1, 0, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (r7 < r5) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        r3 = r7 + 1;
        r2 = r12.charAt(r7);
        r1 = r14.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        if (r1 >= 0) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        r14.A03(r2, 1, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        r10 = (r6 << 6) | r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        if (r3 < r5) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        r8 = r3 + 1;
        r2 = r12.charAt(r3);
        r1 = r14.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        if (r1 >= 0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        if (r1 == -2) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        r14.A03(r2, 2, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        if (r8 < r5) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        r2 = r8 + 1;
        r6 = r12.charAt(r8);
        r3 = r14.A01;
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        if (r6 != r3) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
        if (r0 != false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        r14.A03(r6, 3, p000X.AnonymousClass000.A03("expected padding character '", r3, "'"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006b, code lost:
        r13.A02(r10 >> 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0071, code lost:
        r3 = (r10 << 6) | r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0074, code lost:
        if (r8 < r5) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0077, code lost:
        r2 = r8 + 1;
        r0 = r12.charAt(r8);
        r1 = r14.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0081, code lost:
        if (r1 >= 0) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0083, code lost:
        if (r1 == -2) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0085, code lost:
        r14.A03(r0, 3, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0088, code lost:
        r13.A04(r3 >> 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008f, code lost:
        r13.A03((r3 << 6) | r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0099, code lost:
        if (r14.A03 != false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009b, code lost:
        r13.A02(r10 >> 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a1, code lost:
        r1 = new java.lang.IllegalArgumentException("Unexpected end-of-String in base64 content");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a9, code lost:
        r1 = new java.lang.IllegalArgumentException("Unexpected end-of-String in base64 content");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b3, code lost:
        if (r14.A03 != false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b5, code lost:
        r13.A04(r3 >> 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ba, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bb, code lost:
        r1 = new java.lang.IllegalArgumentException("Unexpected end-of-String in base64 content");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c3, code lost:
        r1 = new java.lang.IllegalArgumentException("Unexpected end-of-String in base64 content");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ca, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        r6 = r14.A00(r1);
     */
    public final void A14(String str, BZR bzr, C25929Bcg bcg) {
        try {
            int length = str.length();
            int i = 0;
            while (i < length) {
                while (true) {
                    int i2 = i + 1;
                    char charAt = str.charAt(i);
                    if (i2 >= length) {
                        return;
                    }
                    if (charAt > ' ') {
                        break;
                    }
                    i = i2;
                }
            }
        } catch (IllegalArgumentException e) {
            A12(e.getMessage());
        }
    }

    public AnonymousClass4UF Btl() {
        return AnonymousClass2As.A01(getClass());
    }

    public C13070hq() {
    }

    public C13070hq(int i) {
        super(0);
    }
}
