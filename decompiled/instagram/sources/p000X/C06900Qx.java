package p000X;

import java.io.IOException;

/* renamed from: X.0Qx  reason: invalid class name and case insensitive filesystem */
public final class C06900Qx implements C08030Vj {
    public final AnonymousClass0VW A00;
    public final AnonymousClass0VK A01;
    public final AnonymousClass0S4 A02;
    public final AnonymousClass0RQ A03;
    public final AnonymousClass0RT A04;
    public final AnonymousClass0RS A05;
    public final AnonymousClass0RP A06;

    private void A00(C08050Vl r3, String str, Integer num, AnonymousClass0R5 r6) {
        String str2;
        AnonymousClass0RT r0 = this.A04;
        r3.A01 = r0;
        r3.A05 = Integer.toString(r0.A00);
        r3.A02 = this.A05;
        r3.A03 = this.A06;
        if (r6 == null || (str2 = r6.Aar()) == null) {
            str2 = null;
        }
        r3.A00 = new AnonymousClass0R9(str2, str);
        r3.A04 = num;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0021 A[Catch:{ IOException -> 0x0047 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034 A[Catch:{ IOException -> 0x0047 }] */
    public final C08050Vl AAC(String str, Integer num, C07140Rx r12, AnonymousClass0R5 r13) {
        AnonymousClass0VC r2;
        boolean z;
        C07140Rx r4 = r12;
        if (num == Constants.ZERO) {
            try {
                if (this.A03.A0R) {
                    r2 = AnonymousClass0VE.A02;
                } else {
                    r2 = AnonymousClass0VE.A00;
                }
                if (!C22490yW.A00()) {
                    z = false;
                    if (this.A03.A0O) {
                    }
                    if (!z) {
                        AnonymousClass0Q0 r1 = new AnonymousClass0Q0(this.A00, r12, r2);
                        C08050Vl r0 = new C08050Vl(r1);
                        A00(r0, str, num, r13);
                        r1.A00(r0);
                        return r0;
                    }
                    C06680Pz r14 = new C06680Pz(this.A00, r12, r2);
                    C08050Vl r02 = new C08050Vl(r14);
                    A00(r02, str, num, r13);
                    r14.A00(r02);
                    return r02;
                }
                z = true;
                if (!z) {
                }
            } catch (IOException e) {
                AnonymousClass0DB.A0G("AnalyticsSessionFactory", "IOException while initializing FileBasedSession.", e);
                AnonymousClass0QD.A05("AnalyticsSessionFactory", "IOException while initializing FileBasedSession.", e);
                C08050Vl r03 = new C08050Vl(new C06540Pl(this.A00, r4, this.A03, this.A02, this.A01, false));
                A00(r03, str, num, r13);
                return r03;
            }
        } else {
            C08050Vl r04 = new C08050Vl(new C06540Pl(this.A00, r4, this.A03, this.A02, this.A01, false));
            A00(r04, str, num, r13);
            return r04;
        }
    }

    public C06900Qx(AnonymousClass0RT r1, AnonymousClass0RS r2, AnonymousClass0RP r3, AnonymousClass0VW r4, AnonymousClass0RQ r5, AnonymousClass0S4 r6, AnonymousClass0VK r7) {
        this.A04 = r1;
        this.A05 = r2;
        this.A06 = r3;
        this.A00 = r4;
        this.A03 = r5;
        this.A02 = r6;
        this.A01 = r7;
    }
}
