package p000X;

import java.util.concurrent.Future;

/* renamed from: X.0Ug  reason: invalid class name and case insensitive filesystem */
public final class C07740Ug implements Runnable {
    public final /* synthetic */ C07890Uv A00;

    public C07740Ug(C07890Uv r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        if (r1 == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005f, code lost:
        if (r1 != false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r1 == false) goto L_0x0019;
     */
    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this.A00.A0I.BmT()) {
            C07990Vf r0 = this.A00.A0l;
            if (r0 != null) {
                boolean A05 = r0.A05();
                z = true;
            }
            z = false;
            if (z) {
                AnonymousClass0T1 r1 = this.A00.A05;
                if (r1 != null) {
                    r1.Aj3("keep_alive", "send ping");
                }
                this.A00.A0F((String) null);
                return;
            }
            AnonymousClass0T1 r12 = this.A00.A05;
            if (r12 != null) {
                r12.Aj3("keep_alive", "not connected");
            }
            C07990Vf r02 = this.A00.A0l;
            if (r02 != null) {
                boolean A06 = r02.A06();
                z2 = true;
            }
            z2 = false;
            if (!z2) {
                this.A00.A0B();
                C08220Wc r3 = this.A00.A0P;
                synchronized (r3) {
                    synchronized (r3) {
                        try {
                            Future future = r3.A06;
                            if (future != null) {
                                boolean isDone = future.isDone();
                                z3 = true;
                            }
                            z3 = false;
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                    if (!z3) {
                        if (r3.A04 == null) {
                            synchronized (r3) {
                                try {
                                    C08220Wc.A00(r3);
                                    r3.A02();
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                        } else {
                            r3.A02();
                        }
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    this.A00.A0A.A0E = C07440Tc.KEEPALIVE;
                    return;
                }
                return;
            }
            return;
        }
        AnonymousClass0T1 r13 = this.A00.A05;
        if (r13 != null) {
            r13.Aj3("keep_alive", "should_not_be_connected");
        }
        this.A00.A0D(C07450Td.KEEPALIVE_SHOULD_NOT_CONNECT);
    }
}
