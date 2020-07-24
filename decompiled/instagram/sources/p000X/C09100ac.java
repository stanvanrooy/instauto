package p000X;

import java.io.File;

/* renamed from: X.0ac  reason: invalid class name and case insensitive filesystem */
public class C09100ac implements C04530Ei {
    public final AnonymousClass04V A00;
    public final C04370Dr A01;
    public final AnonymousClass0FG A02;
    public final boolean A03;
    public final boolean A04;

    public final Integer AQd() {
        return Constants.A06;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        if (r8 == p000X.AnonymousClass04W.BYTE_NOT_PRESENT.A00) goto L_0x0090;
     */
    public void start() {
        boolean z;
        String A022;
        AnonymousClass0FG r1 = this.A02;
        File A012 = r1.A01(r1.A04);
        if (A012 != null) {
            File file = new File(A012, "state.txt");
            AnonymousClass0E3 r7 = new AnonymousClass0E3(file);
            char A002 = r7.A00();
            boolean A013 = AnonymousClass0E4.A01(A002);
            char A003 = new AnonymousClass0E2(new File(A012, "native_state.txt")).A00();
            char A004 = new AnonymousClass0E2(new File(A012, "anr_state.txt")).A00();
            boolean A023 = AnonymousClass0E4.A02(r7.A01(), A003, A004);
            if (A023) {
                boolean z2 = false;
                if (A002 == AnonymousClass04W.IN_FOREGROUND.A00) {
                    z2 = true;
                }
                if (z2 && (A022 = r7.A02(this.A00)) != null && A022.contains(AnonymousClass04T.A01.getClass().getSimpleName())) {
                    A013 = false;
                }
            }
            if (!this.A03 || A013) {
                if (this.A04) {
                    char A005 = r7.A00();
                    if (!(A005 == AnonymousClass04W.INITIAL_STATE.A00 || A005 == AnonymousClass04W.BYTE_NOT_USED.A00)) {
                        z = true;
                    }
                    z = false;
                    if (!z) {
                        return;
                    }
                }
                r7.A01();
                r7.A00();
                char A014 = r7.A01();
                if (AnonymousClass0E4.A01(r7.A00())) {
                    AnonymousClass0E4.A02(A014, A003, A004);
                }
                if (AnonymousClass0E4.A03(AnonymousClass0E4.A00(r7.A01(), A003, A004), Constants.ONE) && !new File(A012, "critical_java_prop.txt").exists()) {
                    A023 = true;
                    AnonymousClass0DB.A0E("lacrima", "Java state with no java report, reporting as fad");
                }
                if (A023) {
                    AnonymousClass0LX r3 = new AnonymousClass0LX();
                    r3.A01("time_of_crash_s", Long.toString(file.lastModified() / 1000));
                    r3.A01("detection_time_s", Long.toString(System.currentTimeMillis() / 1000));
                    r3.A01("category", "unexplained");
                    synchronized (this.A01) {
                        try {
                            C04370Dr r12 = this.A01;
                            C04440Dz r0 = C04440Dz.CRITICAL_REPORT;
                            r12.A06(this, r0);
                            r12.A07(this, r0, r3);
                            r12.A05(this, r0);
                        } catch (Throwable th) {
                            while (true) {
                                th = th;
                            }
                        }
                    }
                    synchronized (this.A01) {
                        try {
                            C04370Dr r13 = this.A01;
                            C04440Dz r02 = C04440Dz.LARGE_REPORT;
                            r13.A06(this, r02);
                            r13.A07(this, r02, r3);
                            r13.A05(this, r02);
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                }
            }
        }
    }

    public C09100ac(AnonymousClass0FG r1, C04370Dr r2, AnonymousClass04V r3, boolean z, boolean z2) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = r3;
        this.A04 = z;
        this.A03 = z2;
    }
}
