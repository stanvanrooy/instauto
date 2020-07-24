package p000X;

/* renamed from: X.0ic  reason: invalid class name and case insensitive filesystem */
public final class C13490ic {
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00cb, code lost:
        if (r2 == false) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00fd, code lost:
        if (r2 == false) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0113, code lost:
        if (r2 == false) goto L_0x0115;
     */
    public static final AnonymousClass0i5 A00(C13300iJ r3) {
        String str;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        AnonymousClass0i5 r1 = new AnonymousClass0i5();
        r1.A0c = r3.getId();
        r1.A0l = r3.AZn();
        r1.A0b = r3.AMN();
        String A0A = r3.A0A();
        if (A0A != null) {
            r1.A0W = A0A;
        }
        r1.A0E = Boolean.valueOf(r3.A0e());
        r1.A0F = Boolean.valueOf(r3.A0f());
        r1.A0Y = r3.A2E;
        r1.A0R = r3.A1i;
        r1.A0U = r3.A1n;
        r1.A0P = r3.A1f;
        r1.A0Q = r3.A1g;
        r1.A0a = r3.A0M.toString();
        C13390iS r0 = r3.A0N;
        if (r0 != null) {
            str = r0.toString();
        } else {
            str = null;
        }
        r1.A0d = str;
        r1.A0T = r3.A1k;
        switch (r3.A1o.intValue()) {
            case 1:
                str2 = "PrivacyStatusPublic";
                break;
            case 2:
                str2 = "PrivacyStatusPrivate";
                break;
            default:
                str2 = "PrivacyStatusUnknown";
                break;
        }
        r1.A0g = str2;
        r1.A00 = r3.ASv();
        r1.A0h = r3.A2b;
        r1.A01 = r3.A05;
        r1.A0D = r3.A0k;
        r1.A0L = Boolean.valueOf(r3.A0s());
        r1.A0M = r3.A1Y;
        r1.A0K = Boolean.valueOf(r3.A35);
        r1.A0C = Boolean.valueOf(r3.A0S());
        r1.A06 = Boolean.valueOf(r3.A0P());
        r1.A08 = Boolean.valueOf(r3.A0Q());
        boolean z4 = false;
        if (r3.A0a == null) {
            z4 = true;
        }
        if (!z4) {
            r1.A09 = Boolean.valueOf(r3.A0R());
        }
        Boolean bool = r3.A0V;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            z = true;
        }
        z = false;
        r1.A07 = Boolean.valueOf(z);
        r1.A0G = Boolean.valueOf(r3.AeV());
        r1.A0e = r3.A2U;
        r1.A0f = r3.A2V;
        r1.A0O = r3.A1e;
        C13280iH A07 = r3.A07();
        if (A07 != C13280iH.UNSET) {
            r1.A03 = A07;
        }
        Boolean bool2 = r3.A0c;
        if (bool2 != null) {
            boolean booleanValue2 = bool2.booleanValue();
            z2 = true;
        }
        z2 = false;
        r1.A0A = Boolean.valueOf(z2);
        r1.A05 = r3.A0O;
        Boolean bool3 = r3.A0d;
        if (bool3 != null) {
            boolean booleanValue3 = bool3.booleanValue();
            z3 = true;
        }
        z3 = false;
        r1.A0B = Boolean.valueOf(z3);
        r1.A02 = r3.A09;
        r1.A0X = r3.A2C;
        r1.A0J = r3.A1A;
        r1.A0j = r3.A2h;
        r1.A0k = r3.A2i;
        r1.A0i = r3.A2g;
        r1.A0H = r3.A08();
        if (r1.A0m != null) {
            r1.A0m = r3.A2n;
        }
        r1.A0Z = r3.A2J;
        r1.A04 = r3.A0L;
        r1.A0N = r3.A1b;
        r1.A0V = r3.A1v;
        r1.A0S = Integer.valueOf(r3.ANw());
        r1.A0I = Boolean.valueOf(r3.A34);
        return r1;
    }
}
