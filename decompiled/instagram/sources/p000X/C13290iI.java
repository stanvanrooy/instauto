package p000X;

/* renamed from: X.0iI  reason: invalid class name and case insensitive filesystem */
public final class C13290iI {
    public static final C13300iJ A00(C13080hr r3) {
        C13300iJ r2;
        C13150hy.A02(r3, "jp");
        C13150hy.A02(r3, "jp");
        AnonymousClass0i5 parseFromJson = C13210i4.parseFromJson(r3);
        if (parseFromJson != null) {
            r2 = A01(parseFromJson);
        } else {
            r2 = null;
        }
        C13300iJ A01 = C13510ie.A00(((AnonymousClass0IY) r3).A00).A01(r2, false);
        C13150hy.A01(A01, "jp.reconcileWithCache(user, false)");
        return A01;
    }

    public static final C13300iJ A01(AnonymousClass0i5 r4) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        Integer num;
        boolean z12;
        boolean z13;
        C13300iJ r2 = new C13300iJ(r4.A0c);
        r2.A2m = r4.A0l;
        r2.A2P = r4.A0b;
        r2.A26 = r4.A0W;
        Boolean bool = r4.A0E;
        if (bool != null) {
            if (bool != null) {
                z13 = bool.booleanValue();
            } else {
                z13 = false;
            }
            r2.A0I(z13);
        }
        Boolean bool2 = r4.A0F;
        if (bool2 != null) {
            if (bool2 != null) {
                z12 = bool2.booleanValue();
            } else {
                z12 = false;
            }
            r2.A0J(z12);
        }
        r2.A2E = r4.A0Y;
        r2.A1i = r4.A0R;
        r2.A1n = r4.A0U;
        r2.A1f = r4.A0P;
        r2.A1g = r4.A0Q;
        String str = r4.A0a;
        if (str != null) {
            r2.A0M = C13390iS.valueOf(str);
        }
        String str2 = r4.A0d;
        if (str2 != null) {
            r2.A0N = C13390iS.valueOf(str2);
        }
        r2.A1k = r4.A0T;
        String str3 = r4.A0g;
        if (str3 != null) {
            if (str3.equals("PrivacyStatusUnknown")) {
                num = Constants.ZERO;
            } else if (str3.equals("PrivacyStatusPublic")) {
                num = Constants.ONE;
            } else if (str3.equals("PrivacyStatusPrivate")) {
                num = Constants.A0C;
            } else {
                throw new IllegalArgumentException(str3);
            }
            r2.A1o = num;
        }
        r2.A02 = r4.A00;
        r2.A2b = r4.A0h;
        r2.A05 = r4.A01;
        Boolean bool3 = r4.A0D;
        if (bool3 != null) {
            r2.A0k = Boolean.valueOf(bool3.booleanValue());
        }
        Boolean bool4 = r4.A0L;
        if (bool4 != null) {
            z = bool4.booleanValue();
        } else {
            z = false;
        }
        r2.A1L = Boolean.valueOf(z);
        r2.A1Y = r4.A0M;
        Boolean bool5 = r4.A0K;
        if (bool5 != null) {
            if (bool5 != null) {
                z11 = bool5.booleanValue();
            } else {
                z11 = false;
            }
            r2.A35 = z11;
        }
        Boolean bool6 = r4.A0C;
        if (bool6 != null) {
            if (bool6 != null) {
                z10 = bool6.booleanValue();
            } else {
                z10 = false;
            }
            r2.A0g = Boolean.valueOf(z10);
        }
        Boolean bool7 = r4.A06;
        if (bool7 != null) {
            if (bool7 != null) {
                z9 = bool7.booleanValue();
            } else {
                z9 = false;
            }
            r2.A0R = Boolean.valueOf(z9);
        }
        Boolean bool8 = r4.A08;
        if (bool8 != null) {
            if (bool8 != null) {
                z8 = bool8.booleanValue();
            } else {
                z8 = false;
            }
            r2.A0W = Boolean.valueOf(z8);
        }
        Boolean bool9 = r4.A09;
        if (bool9 != null) {
            if (bool9 != null) {
                z7 = bool9.booleanValue();
            } else {
                z7 = false;
            }
            r2.A0a = Boolean.valueOf(z7);
        }
        Boolean bool10 = r4.A07;
        if (bool10 != null) {
            if (bool10 != null) {
                z6 = bool10.booleanValue();
            } else {
                z6 = false;
            }
            r2.A0V = Boolean.valueOf(z6);
        }
        Boolean bool11 = r4.A0G;
        if (bool11 != null) {
            if (bool11 != null) {
                z5 = bool11.booleanValue();
            } else {
                z5 = false;
            }
            r2.A10 = Boolean.valueOf(z5);
        }
        r2.A2U = r4.A0e;
        r2.A2V = r4.A0f;
        Integer num2 = r4.A0O;
        if (num2 != null) {
            if (num2 != null) {
                i2 = num2.intValue();
            } else {
                i2 = 0;
            }
            r2.A1e = Integer.valueOf(i2);
        }
        r2.A0F = r4.A03;
        Boolean bool12 = r4.A0A;
        if (bool12 != null) {
            if (bool12 != null) {
                z4 = bool12.booleanValue();
            } else {
                z4 = false;
            }
            r2.A0c = Boolean.valueOf(z4);
        }
        r2.A0O = r4.A05;
        Boolean bool13 = r4.A0B;
        if (bool13 != null) {
            if (bool13 != null) {
                z3 = bool13.booleanValue();
            } else {
                z3 = false;
            }
            r2.A0d = Boolean.valueOf(z3);
        }
        r2.A09 = r4.A02;
        r2.A2C = r4.A0X;
        Boolean bool14 = r4.A0J;
        if (bool14 != null) {
            if (bool14 != null) {
                z2 = bool14.booleanValue();
            } else {
                z2 = false;
            }
            r2.A1A = Boolean.valueOf(z2);
        }
        r2.A2h = r4.A0j;
        r2.A2i = r4.A0k;
        r2.A2g = r4.A0i;
        Boolean bool15 = r4.A0H;
        if (bool15 != null) {
            r2.A12 = Boolean.valueOf(bool15.booleanValue());
        }
        r2.A2n = r4.A0m;
        r2.A2J = r4.A0Z;
        r2.A0L = r4.A04;
        r2.A1b = r4.A0N;
        r2.A1v = r4.A0V;
        Integer num3 = r4.A0S;
        if (num3 != null) {
            if (num3 != null) {
                i = num3.intValue();
            } else {
                i = 0;
            }
            r2.A01 = i;
        }
        Boolean bool16 = r4.A0I;
        if (bool16 != null) {
            Boolean bool17 = bool16;
            if (bool16 == null) {
                bool17 = false;
            }
            r2.A34 = bool17.booleanValue();
        }
        return r2;
    }
}
