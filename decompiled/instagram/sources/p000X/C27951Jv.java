package p000X;

/* renamed from: X.1Jv  reason: invalid class name and case insensitive filesystem */
public final class C27951Jv extends C27811Jh implements C27961Jw {
    public DRG A00;
    public boolean A01;
    public final C27811Jh A02;
    public volatile boolean A03;

    public final void A04() {
        DRG drg;
        while (true) {
            synchronized (this) {
                drg = this.A00;
                if (drg == null) {
                    this.A01 = false;
                    return;
                }
                this.A00 = null;
            }
            drg.A00(this);
        }
        while (true) {
        }
    }

    public final void A03(C27841Jk r2) {
        this.A02.Bqn(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        if (r0 != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        r3.A02.B2m(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        return;
     */
    public final void B2m(Throwable th) {
        boolean z;
        if (!this.A03) {
            synchronized (this) {
                if (this.A03) {
                    z = true;
                } else {
                    this.A03 = true;
                    if (this.A01) {
                        DRG drg = this.A00;
                        if (drg == null) {
                            drg = new DRG();
                            this.A00 = drg;
                        }
                        drg.A03[0] = new C24010AgS(th);
                        return;
                    }
                    z = false;
                    this.A01 = true;
                }
            }
        }
        AnonymousClass1J9.A03(th);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        return;
     */
    public final void BD2(Object obj) {
        if (!this.A03) {
            synchronized (this) {
                if (!this.A03) {
                    if (this.A01) {
                        DRG drg = this.A00;
                        if (drg == null) {
                            drg = new DRG();
                            this.A00 = drg;
                        }
                        drg.A01(obj);
                    } else {
                        this.A01 = true;
                        this.A02.BD2(obj);
                        A04();
                    }
                }
            }
        }
    }

    public final void BPT(C27711Ix r3) {
        boolean z = true;
        if (!this.A03) {
            synchronized (this) {
                if (!this.A03) {
                    if (this.A01) {
                        DRG drg = this.A00;
                        if (drg == null) {
                            drg = new DRG();
                            this.A00 = drg;
                        }
                        drg.A01(new C29943DHt(r3));
                        return;
                    }
                    this.A01 = true;
                    z = false;
                }
            }
        }
        if (z) {
            r3.dispose();
            return;
        }
        this.A02.BPT(r3);
        A04();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        return;
     */
    public final void onComplete() {
        if (!this.A03) {
            synchronized (this) {
                if (!this.A03) {
                    this.A03 = true;
                    if (this.A01) {
                        DRG drg = this.A00;
                        if (drg == null) {
                            drg = new DRG();
                            this.A00 = drg;
                        }
                        drg.A01(C30104DQj.A01);
                    } else {
                        this.A01 = true;
                        this.A02.onComplete();
                    }
                }
            }
        }
    }

    public final boolean test(Object obj) {
        return C30104DQj.A01(obj, this.A02);
    }

    public C27951Jv(C27811Jh r1) {
        this.A02 = r1;
    }
}
