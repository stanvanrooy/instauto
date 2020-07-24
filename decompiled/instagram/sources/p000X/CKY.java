package p000X;

import android.view.View;

/* renamed from: X.CKY */
public final class CKY implements View.OnClickListener {
    public final /* synthetic */ CKR A00;

    public CKY(CKR ckr) {
        this.A00 = ckr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004f, code lost:
        if (r1 != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        if (r1 != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006b, code lost:
        if (r1 != false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0079, code lost:
        if (r1 != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0087, code lost:
        if (r1 != false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0095, code lost:
        if (r1 != false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a3, code lost:
        if (r1 != false) goto L_0x00a5;
     */
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int A05 = AnonymousClass0Z0.A05(-1355151048);
        CKS cks = this.A00.A08;
        if (cks == null) {
            C13150hy.A03("interactor");
        }
        cks.A01.A05(this.A00, new C27621CKo(this));
        CKR.A00(this.A00);
        CKR.A01(this.A00);
        CKS cks2 = this.A00.A08;
        if (cks2 == null) {
            C13150hy.A03("interactor");
        }
        Object A02 = cks2.A02.A02();
        if (A02 == null) {
            C13150hy.A00();
        }
        CKX ckx = (CKX) A02;
        C13150hy.A01(ckx, "this");
        String str = ckx.A0Q;
        boolean z8 = false;
        if (str != null) {
            boolean A0C = C63272pA.A0C(str);
            z = false;
        }
        z = true;
        if (!z) {
            String str2 = ckx.A0R;
            if (str2 != null) {
                boolean A0C2 = C63272pA.A0C(str2);
                z2 = false;
            }
            z2 = true;
            if (!z2) {
                String str3 = ckx.A0P;
                if (str3 != null) {
                    boolean A0C3 = C63272pA.A0C(str3);
                    z3 = false;
                }
                z3 = true;
                if (!z3) {
                    String str4 = ckx.A0M;
                    if (str4 != null) {
                        boolean A0C4 = C63272pA.A0C(str4);
                        z4 = false;
                    }
                    z4 = true;
                    if (!z4) {
                        String str5 = ckx.A0O;
                        if (str5 != null) {
                            boolean A0C5 = C63272pA.A0C(str5);
                            z5 = false;
                        }
                        z5 = true;
                        if (!z5) {
                            String str6 = ckx.A0T;
                            if (str6 != null) {
                                boolean A0C6 = C63272pA.A0C(str6);
                                z6 = false;
                            }
                            z6 = true;
                            if (!z6) {
                                String str7 = ckx.A0U;
                                if (str7 != null) {
                                    boolean A0C7 = C63272pA.A0C(str7);
                                    z7 = false;
                                }
                                z7 = true;
                                if (!z7) {
                                    z8 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (z8) {
            ckx.A0W = true;
            cks2.A02.A09(ckx);
            cks2.A03.A02(cks2.A04.A00(ckx.A0M, ckx.A0O, ckx.A0T, ckx.A0U, ckx.A0X).A0G(C27731Iz.A01), new C27608CKb(ckx, cks2));
        }
        AnonymousClass0Z0.A0C(1522877016, A05);
    }
}
