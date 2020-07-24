package p000X;

/* renamed from: X.0ab  reason: invalid class name and case insensitive filesystem */
public final class C09090ab implements C04530Ei {
    public final C04370Dr A00;
    public final AnonymousClass0FG A01;

    public final Integer AQd() {
        return Constants.A05;
    }

    public final void start() {
        AnonymousClass0LX r3 = new AnonymousClass0LX();
        r3.A01("asl_session_id", this.A01.A05);
        synchronized (this.A00) {
            try {
                C04370Dr r1 = this.A00;
                C04440Dz r0 = C04440Dz.CRITICAL_REPORT;
                r1.A06(this, r0);
                r1.A07(this, r0, r3);
                r1.A05(this, r0);
            } catch (Throwable th) {
                while (true) {
                    th = th;
                }
            }
        }
        synchronized (this.A00) {
            try {
                C04370Dr r12 = this.A00;
                C04440Dz r02 = C04440Dz.LARGE_REPORT;
                r12.A06(this, r02);
                r12.A07(this, r02, r3);
                r12.A05(this, r02);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public C09090ab(AnonymousClass0FG r1, C04370Dr r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
