package p000X;

import android.content.Context;

/* renamed from: X.1jo  reason: invalid class name and case insensitive filesystem */
public final class C37531jo implements C06570Po {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Context A06;
    public final AnonymousClass0C1 A07;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static C37531jo A00(Context context, AnonymousClass0C1 r3) {
        return (C37531jo) r3.AVA(C37531jo.class, new C37541jp(context, r3));
    }

    public static void A01(C37531jo r2, boolean z) {
        if (!r2.A07.Abj() && !r2.A04) {
            r2.A04 = true;
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A01("StartupManager.runJobs", 166658086);
            }
            if (z) {
                try {
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A01("runNetworkJobs", -1943015948);
                    }
                    C12070g8 r1 = C12000g1.A01;
                    r1.A01(new C40991pa(r2));
                    r1.A00(new C41001pb(r2));
                    r1.A01(new C41011pc(r2));
                    r1.A00(new C41021pd(r2));
                    r1.A00(new C41031pe(r2));
                    r1.A01(new C41041pf(r2));
                    r1.A00(new C41051pg(r2));
                    r1.A01(new C41061ph(r2));
                    r1.A00(new C41071pi(r2));
                    r1.A00(new C41081pj(r2));
                    r1.A00(new C41091pk(r2));
                    r1.A00(new C41101pl(r2));
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(1723040653);
                    }
                } catch (Throwable th) {
                    if (C06530Pk.A00) {
                        AnonymousClass0ZB.A00(1992819192);
                    }
                    throw th;
                }
            }
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A01("runStartupJobs", -530183289);
            }
            try {
                C12070g8 r12 = C12000g1.A01;
                r12.A01(new C41111pm(r2));
                r12.A00(new C41121pn(r2));
                r12.A00(new C41131po(r2));
                r12.A00(new C41141pp(r2));
                r12.A00(new C41151pq(r2));
                r12.A01(new C41161pr(r2));
                r12.A01(new C41171ps(r2));
                r12.A01(new C41181pt(r2));
                r12.A00(new C41191pu(r2));
                r12.A00(new C41201pv(r2));
                r12.A01(new C41211pw(r2));
                r12.A01(new C41221px(r2));
                r12.A00(new C41231py(r2));
                r12.A01(new C41241pz(r2));
                r12.A01(new C41251q0(r2));
                r12.A01(new C41261q1(r2));
                r12.A01(new C41271q2(r2));
                r12.A00(new C41281q3(r2));
                r12.A00(new C41291q4(r2));
                r12.A00(new C41301q5(r2));
                r12.A00(new C41311q6(r2));
                r12.A00(new C41321q7(r2));
                r12.A00(new C41331q8(r2));
                r12.A00(new C41341q9(r2));
                r12.A00(new C41351qA(r2));
                r12.A00(new C41361qB(r2));
                r12.A00(new C41371qC(r2));
                r12.A00(new C41381qD(r2));
                r12.A00(new C41391qE(r2));
                r12.A00(new C41401qF(r2));
                r12.A00(new C41411qG(r2));
                r12.A01(new C41421qH(r2));
                r12.A00(new C41431qI(r2));
                if (C06530Pk.A00) {
                    AnonymousClass0ZB.A00(1527506004);
                }
                if (C06530Pk.A00) {
                    AnonymousClass0ZB.A00(74979090);
                }
            } catch (Throwable th2) {
                th = th2;
                if (C06530Pk.A00) {
                    AnonymousClass0ZB.A00(-2107037527);
                }
                throw th;
            }
        }
    }

    public final void A02(boolean z) {
        if (!this.A02) {
            boolean z2 = true;
            this.A02 = true;
            this.A01 = z;
            if (this.A03 && !this.A00) {
                if (!z || !this.A05) {
                    z2 = false;
                }
                A01(this, z2);
            }
        }
    }

    public final void A03(boolean z) {
        if (!this.A03) {
            boolean z2 = true;
            this.A03 = true;
            this.A05 = z;
            if (this.A02 && !this.A00) {
                if (!this.A01 || !z) {
                    z2 = false;
                }
                A01(this, z2);
            }
        }
    }

    public C37531jo(Context context, AnonymousClass0C1 r6) {
        this.A06 = context.getApplicationContext();
        this.A07 = r6;
        if (((Boolean) AnonymousClass0L6.A02(r6, AnonymousClass0L7.STARTUPMANAGER_REFACTOR, "trigger_by_qpl", false, (AnonymousClass04H) null)).booleanValue()) {
            C12000g1.A01.A00(new AnonymousClass23V(this));
            this.A00 = true;
        }
    }
}
