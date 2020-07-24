package p000X;

import android.view.View;
import com.instagram.igds.components.form.IgFormField;

/* renamed from: X.CK5 */
public final class CK5 implements View.OnClickListener {
    public final /* synthetic */ CK4 A00;

    public CK5(CK4 ck4) {
        this.A00 = ck4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cf, code lost:
        if (r1 != false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00dd, code lost:
        if (r1 != false) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00eb, code lost:
        if (r1 != false) goto L_0x00ed;
     */
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        boolean z3;
        int A05 = AnonymousClass0Z0.A05(1498417165);
        CK4 ck4 = this.A00;
        IgFormField[] igFormFieldArr = new IgFormField[4];
        IgFormField igFormField = ck4.A07;
        if (igFormField == null) {
            C13150hy.A03("country");
        }
        igFormFieldArr[0] = igFormField;
        IgFormField igFormField2 = ck4.A05;
        if (igFormField2 == null) {
            C13150hy.A03("accountHolderName");
        }
        igFormFieldArr[1] = igFormField2;
        IgFormField igFormField3 = ck4.A08;
        if (igFormField3 == null) {
            C13150hy.A03("routingNumber");
        }
        igFormFieldArr[2] = igFormField3;
        IgFormField igFormField4 = ck4.A06;
        if (igFormField4 == null) {
            C13150hy.A03("accountNumber");
        }
        igFormFieldArr[3] = igFormField4;
        for (IgFormField A04 : AnonymousClass10L.A03(igFormFieldArr)) {
            A04.A04();
        }
        CK4 ck42 = this.A00;
        CKS cks = ck42.A09;
        if (cks == null) {
            C13150hy.A03("interactor");
        }
        IgFormField igFormField5 = ck42.A08;
        if (igFormField5 == null) {
            C13150hy.A03("routingNumber");
        }
        String A02 = CK9.A02(igFormField5);
        IgFormField igFormField6 = ck42.A06;
        if (igFormField6 == null) {
            C13150hy.A03("accountNumber");
        }
        String A022 = CK9.A02(igFormField6);
        IgFormField igFormField7 = ck42.A05;
        if (igFormField7 == null) {
            C13150hy.A03("accountHolderName");
        }
        String A023 = CK9.A02(igFormField7);
        Object A024 = cks.A02.A02();
        if (A024 == null) {
            C13150hy.A00();
        }
        CKX ckx = (CKX) A024;
        ckx.A07 = A02;
        ckx.A06 = A022;
        ckx.A05 = A023;
        CKS cks2 = this.A00.A09;
        if (cks2 == null) {
            C13150hy.A03("interactor");
        }
        AnonymousClass0C1 r4 = (AnonymousClass0C1) this.A00.A0D.getValue();
        C13150hy.A02(r4, "userSession");
        Object A025 = cks2.A02.A02();
        if (A025 == null) {
            C13150hy.A00();
        }
        CKX ckx2 = (CKX) A025;
        C13150hy.A01(ckx2, "this");
        String str = ckx2.A05;
        boolean z4 = false;
        if (str != null) {
            boolean A0C = C63272pA.A0C(str);
            z = false;
        }
        z = true;
        if (!z) {
            String str2 = ckx2.A07;
            if (str2 != null) {
                boolean A0C2 = C63272pA.A0C(str2);
                z2 = false;
            }
            z2 = true;
            if (!z2) {
                String str3 = ckx2.A06;
                if (str3 != null) {
                    boolean A0C3 = C63272pA.A0C(str3);
                    z3 = false;
                }
                z3 = true;
                if (!z3) {
                    z4 = true;
                }
            }
        }
        if (z4) {
            AnonymousClass1HQ r1 = cks2.A02;
            ckx2.A0W = true;
            r1.A09(ckx2);
            C27691Iv r2 = cks2.A03;
            C27613CKg cKg = cks2.A04;
            String A042 = r4.A04();
            CKC ckc = ckx2.A01;
            String str4 = ckx2.A07;
            String str5 = ckx2.A06;
            String str6 = ckx2.A05;
            String str7 = str5;
            C13150hy.A02(ckc, "bankCountry");
            C27611CKe cKe = cKg.A00;
            if (str5 == null) {
                str7 = "";
            }
            C27791Jf A0C4 = C64482rY.A00(cKe.A00("bank_account_number", str7)).A0C(new C27612CKf(cKg, A042, ckc, str4, str6));
            C13150hy.A01(A0C4, "RxRequest.observeRequest…ble.empty()\n      }\n    }");
            r2.A02(A0C4.A0G(C27731Iz.A01).A0C(new CKV(ckx2, cks2, r4)), new CKK(cks2, r4));
        }
        CKS cks3 = this.A00.A09;
        if (cks3 == null) {
            C13150hy.A03("interactor");
        }
        cks3.A01.A05(this.A00, new CKA(this));
        AnonymousClass0Z0.A0C(2022620625, A05);
    }
}
