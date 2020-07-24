package p000X;

/* renamed from: X.0eA  reason: invalid class name and case insensitive filesystem */
public final class C10940eA extends C022301o {
    public boolean A00 = false;
    public final AnonymousClass0SY A01 = new AnonymousClass0e8(this);

    public final void A01(AnonymousClass0SX r7, Runnable runnable) {
        synchronized (AnonymousClass09Q.A0X) {
            if (AnonymousClass09Q.A0W == null) {
                AnonymousClass0DB.A0E("AppStateLoggerCore", "AppStateLogger is not ready yet");
            } else {
                AnonymousClass09Q.A0W.A09.A06(r7, runnable, false, ' ', ' ');
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        if (r10 == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0014, code lost:
        r1 = p000X.AnonymousClass09Q.A0W.A0B.A01();
        r5 = r1.A00.A00;
        r3 = p000X.AnonymousClass09Q.A0W;
        r2 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r2 == null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r3.A00 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        r3.A00 = r3.A0A.A07(r3.A0C);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        if (r0 == null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        r6 = r0.A01(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        p000X.AnonymousClass09Q.A0W.A09.A06(r8, r9, r4, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        r6 = ' ';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        r5 = ' ';
        r6 = ' ';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        r4 = r10;
     */
    public final void A02(AnonymousClass0SX r8, Runnable runnable, boolean z) {
        synchronized (AnonymousClass09Q.A0X) {
            if (AnonymousClass09Q.A0W == null) {
                AnonymousClass0DB.A0E("AppStateLoggerCore", "AppStateLogger is not ready yet");
            }
        }
    }

    public final boolean A04() {
        synchronized (AnonymousClass09Q.A0X) {
            if (AnonymousClass09Q.A0W != null) {
                return AnonymousClass09Q.A0C(AnonymousClass09Q.A0W);
            }
            AnonymousClass0DB.A0E("AppStateLoggerCore", "AppStateLogger is not ready yet");
            return false;
        }
    }

    public final void A03(AnonymousClass0SY r6) {
        super.A03(r6);
        synchronized (this.A01) {
            if (!this.A00) {
                AnonymousClass0SY r3 = this.A01;
                synchronized (AnonymousClass09Q.A0X) {
                    try {
                        if (AnonymousClass09Q.A0W == null) {
                            AnonymousClass0DB.A0E("AppStateLoggerCore", "AppStateLogger is not ready yet");
                        } else {
                            synchronized (AnonymousClass09Q.A0W.A0F) {
                                try {
                                    AnonymousClass09Q r1 = AnonymousClass09Q.A0W;
                                    if (r1.A01 == null) {
                                        r1.A01 = r3;
                                    } else {
                                        throw new IllegalStateException("Only one listener at a time supported");
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        while (true) {
                            th = th2;
                        }
                        throw th;
                    }
                }
                this.A00 = true;
            }
        }
    }

    public final boolean A05() {
        return AnonymousClass09Q.A0B();
    }
}
