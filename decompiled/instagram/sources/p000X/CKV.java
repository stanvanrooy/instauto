package p000X;

/* renamed from: X.CKV */
public final class CKV implements C64582ri {
    public final /* synthetic */ CKS A00;
    public final /* synthetic */ CKX A01;
    public final /* synthetic */ AnonymousClass0C1 A02;

    public CKV(CKX ckx, CKS cks, AnonymousClass0C1 r3) {
        this.A01 = ckx;
        this.A00 = cks;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0036, code lost:
        if (r1 != false) goto L_0x0038;
     */
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        AnonymousClass1HQ r2;
        CKX ckx;
        boolean z;
        C27791Jf A002;
        String str;
        C17710qg r6 = (C17710qg) obj;
        C13150hy.A01(r6, "response");
        if (r6.A05()) {
            Object A022 = r6.A02();
            C13150hy.A01(A022, "response.get()");
            if (((CLJ) A022).isOk()) {
                Object A023 = r6.A02();
                C13150hy.A01(A023, "response.get()");
                String str2 = ((CLJ) A023).A01;
                if (str2 != null) {
                    boolean A0C = C63272pA.A0C(str2);
                    z = false;
                }
                z = true;
                if (z) {
                    CKX ckx2 = this.A01;
                    Object A024 = r6.A02();
                    C13150hy.A01(A024, "response.get()");
                    ckx2.A0K = ((CLJ) A024).A00;
                    CKX ckx3 = this.A01;
                    Object A025 = r6.A02();
                    C13150hy.A01(A025, "response.get()");
                    ckx3.A0L = ((CLJ) A025).A02;
                    C23465ANm aNm = new C23465ANm("[\\D]");
                    C27613CKg cKg = this.A00.A04;
                    String A04 = this.A02.A04();
                    C13150hy.A01(A04, "userSession.userId");
                    String str3 = this.A01.A0D;
                    Object A026 = this.A00.A02.A02();
                    if (A026 == null) {
                        C13150hy.A00();
                    }
                    CKX ckx4 = (CKX) A026;
                    String str4 = ckx4.A0D;
                    String str5 = ckx4.A09;
                    String str6 = "";
                    String str7 = str6;
                    if (str5 != null) {
                        str7 = str5;
                    }
                    String str8 = ckx4.A0B;
                    String str9 = str6;
                    if (str8 != null) {
                        str9 = str8;
                    }
                    String str10 = ckx4.A0G;
                    String str11 = str6;
                    if (str10 != null) {
                        str11 = str10;
                    }
                    String str12 = ckx4.A0J;
                    String str13 = str6;
                    if (str12 != null) {
                        str13 = str12;
                    }
                    CLY cly = new CLY(str4, (String) null, (String) null, str7, str9, str11, str13, ckx4.A0X.name());
                    CKX ckx5 = this.A01;
                    CL0 cl0 = ckx5.A00;
                    if (cl0 == null) {
                        cl0 = CL0.LLC;
                    }
                    CL1 cl1 = ckx5.A04;
                    String A003 = aNm.A00(String.valueOf(ckx5.A0H), str6);
                    CKX ckx6 = this.A01;
                    String str14 = ckx6.A0E;
                    String str15 = ckx6.A0C;
                    Object A027 = this.A00.A02.A02();
                    if (A027 == null) {
                        C13150hy.A00();
                    }
                    CKX ckx7 = (CKX) A027;
                    String str16 = ckx7.A0Q;
                    String str17 = ckx7.A0S;
                    String str18 = ckx7.A0R;
                    String str19 = ckx7.A0M;
                    String str20 = str6;
                    if (str19 != null) {
                        str20 = str19;
                    }
                    String str21 = ckx7.A0O;
                    String str22 = str6;
                    if (str21 != null) {
                        str22 = str21;
                    }
                    String str23 = ckx7.A0T;
                    String str24 = str6;
                    if (str23 != null) {
                        str24 = str23;
                    }
                    String str25 = ckx7.A0U;
                    String str26 = str6;
                    if (str25 != null) {
                        str26 = str25;
                    }
                    CLY cly2 = new CLY(str16, str17, str18, str20, str22, str24, str26, ckx7.A0X.name());
                    CKX ckx8 = this.A01;
                    String str27 = ckx8.A0P;
                    CIF cif = ckx8.A02;
                    String valueOf = String.valueOf(ckx8.A0V);
                    Object A028 = r6.A02();
                    C13150hy.A01(A028, "response.get()");
                    String str28 = ((CLJ) A028).A02;
                    Object A029 = r6.A02();
                    C13150hy.A01(A029, "response.get()");
                    String str29 = ((CLJ) A029).A00;
                    CLB clb = this.A01.A03;
                    if (clb == null) {
                        clb = CLB.IGT;
                    }
                    String str30 = str15;
                    String str31 = str27;
                    String str32 = str28;
                    String str33 = str29;
                    C13150hy.A02(A04, "userId");
                    C13150hy.A02(cly, "companyAddress");
                    C13150hy.A02(cl0, "companyType");
                    C13150hy.A02(cl1, "businessTaxIDType");
                    C13150hy.A02(cly2, "ownerAddress");
                    C13150hy.A02(cif, "payoutMethod");
                    C13150hy.A02(clb, "payoutSubType");
                    if (cl1 == CL1.SSN) {
                        C27611CKe cKe = cKg.A00;
                        if (A003 != null) {
                            str6 = A003;
                        }
                        CLY cly3 = cly2;
                        CLY cly4 = cly;
                        CL0 cl02 = cl0;
                        CL1 cl12 = cl1;
                        C27613CKg cKg2 = cKg;
                        String str34 = A04;
                        A002 = C64482rY.A00(cKe.A00("sensitive_tax_id_number", str6)).A0C(new C27610CKd(cKg2, str34, str3, cly4, cl02, cl12, str14, str30, cly3, str31, cif, valueOf, str32, str33, clb));
                        str = "RxRequest.observeRequest…empty()\n        }\n      }";
                    } else {
                        C27611CKe cKe2 = cKg.A00;
                        String str35 = str6;
                        if (str3 != null) {
                            str35 = str3;
                        }
                        String str36 = str6;
                        if (A003 != null) {
                            str36 = A003;
                        }
                        String str37 = str6;
                        if (str14 != null) {
                            str37 = str14;
                        }
                        String str38 = str6;
                        if (str15 != null) {
                            str38 = str15;
                        }
                        String str39 = str6;
                        if (str27 != null) {
                            str39 = str27;
                        }
                        String str40 = str6;
                        if (valueOf != null) {
                            str40 = valueOf;
                        }
                        String str41 = str6;
                        if (str28 != null) {
                            str41 = str28;
                        }
                        if (str29 != null) {
                            str6 = str29;
                        }
                        A002 = C64482rY.A00(cKe2.A01(A04, str35, cly, cl0, cl1, str36, str37, str38, cly2, str39, cif, str40, str41, str6, clb));
                        str = "RxRequest.observeRequest…          payoutSubType))";
                    }
                    C13150hy.A01(A002, str);
                    return A002;
                }
                CKX ckx9 = this.A01;
                ckx9.A0W = false;
                Object A0210 = r6.A02();
                C13150hy.A01(A0210, "response.get()");
                ckx9.A08 = ((CLJ) A0210).A01;
                r2 = this.A00.A02;
                ckx = this.A01;
                r2.A09(ckx);
                C27791Jf A012 = C27791Jf.A01();
                C13150hy.A01(A012, "Observable.empty()");
                return A012;
            }
        }
        CKS.A00(this.A00);
        r2 = this.A00.A02;
        ckx = this.A01;
        ckx.A0W = false;
        r2.A09(ckx);
        C27791Jf A0122 = C27791Jf.A01();
        C13150hy.A01(A0122, "Observable.empty()");
        return A0122;
    }
}
