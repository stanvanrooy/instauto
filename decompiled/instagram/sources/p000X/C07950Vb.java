package p000X;

import android.os.SystemClock;

/* renamed from: X.0Vb  reason: invalid class name and case insensitive filesystem */
public final class C07950Vb implements Runnable {
    public final /* synthetic */ C07990Vf A00;

    public C07950Vb(C07990Vf r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        p000X.C07990Vf.A03(r3, p000X.C07450Td.A00(r2), p000X.C08110Vr.A03, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    public final void run() {
        C07990Vf r3 = this.A00;
        if (r3.A05()) {
            C10410dG r4 = r3.A0D;
            synchronized (r4) {
                C10410dG.A01(r4, r4.A01, new AnonymousClass0WB(new AnonymousClass0W2(AnonymousClass0W6.PINGREQ), (Object) null, (Object) null));
            }
            C10630dc r0 = r3.A0W;
            if (r0 != null) {
                AnonymousClass0T1 r02 = r0.A01.A05;
            }
            r3.A0T = SystemClock.elapsedRealtime();
        }
    }
}
