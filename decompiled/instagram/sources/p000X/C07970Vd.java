package p000X;

/* renamed from: X.0Vd  reason: invalid class name and case insensitive filesystem */
public final class C07970Vd implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C07990Vf A01;

    public C07970Vd(C07990Vf r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void run() {
        try {
            C10410dG r4 = this.A01.A0D;
            int i = this.A00;
            try {
                synchronized (r4) {
                    C10390dE r0 = r4.A0I;
                    if (r0.A00.A0X.equals(AnonymousClass0VP.CONNECTED)) {
                        C10410dG.A01(r4, r4.A01, new C10340d8(new AnonymousClass0W2(AnonymousClass0W6.PUBACK), new AnonymousClass0W4(i)));
                    }
                }
            } catch (Throwable th) {
                r4.A0I.A01(C07450Td.A00(th), C08110Vr.PUBACK, th);
                th.getMessage();
            }
        } catch (Throwable th2) {
            C10630dc r02 = this.A01.A0E.A00.A0W;
            if (r02 != null) {
                r02.A01(th2);
            }
            C07990Vf.A03(this.A01, C07450Td.A00(th2), C08110Vr.PUBACK, th2);
        }
    }
}
