package p000X;

/* renamed from: X.0qx  reason: invalid class name and case insensitive filesystem */
public final class C17880qx implements C17860qv {
    public C17710qg A00;
    public C17920r1 A01;
    public C43791v5 A02;
    public C28711Mu A03;
    public C28711Mu A04;
    public boolean A05;
    public boolean A06;
    public final C17920r1 A07;
    public final C17850qu A08;
    public final AnonymousClass0OT A09;
    public final C17920r1 A0A;

    public final String toString() {
        return "HttpEngine";
    }

    public final void A00(C17920r1 r5) {
        synchronized (this.A0A) {
            if (this.A06) {
                r5.onStart();
            }
            if (this.A04 != null) {
                this.A09.ADc(new AnonymousClass26S(this, this.A08.getRunnableId(), r5));
            }
            if (this.A00 != null) {
                this.A09.ADc(new C225229mo(this, this.A08.getRunnableId(), r5));
            }
            if (this.A05) {
                r5.onFinish();
            }
            C28711Mu r0 = this.A03;
            if (r0 != null) {
                r5.onSuccess(r0);
            }
            C43791v5 r02 = this.A02;
            if (r02 != null) {
                r5.onFail(r02);
            }
            this.A01 = r5;
        }
    }

    public final String getName() {
        return this.A08.getName();
    }

    public final int getRunnableId() {
        return this.A08.getRunnableId();
    }

    public final void onFinish() {
        this.A08.onFinish();
    }

    public final void onStart() {
        this.A08.onStart();
    }

    public final void run() {
        this.A08.run();
    }

    public C17880qx(C17850qu r2, AnonymousClass0OT r3, C17920r1 r4) {
        C17950r4 r0 = new C17950r4(this);
        this.A0A = r0;
        this.A08 = r2;
        r2.A00 = r0;
        this.A09 = r3;
        this.A07 = r4;
    }
}
