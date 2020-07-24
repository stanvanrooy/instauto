package p000X;

/* renamed from: X.0Fc  reason: invalid class name and case insensitive filesystem */
public final class C04710Fc extends Thread {
    public C04710Fc() {
        super("HybridData DestructorThread");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:0|1|(3:3|(1:5)|8)(1:7)|6) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:6:0x0030, LOOP_START, MTH_ENTER_BLOCK, SYNTHETIC, Splitter:B:0:0x0000] */
    public final void run() {
        while (true) {
            C04720Fd r4 = (C04720Fd) C04750Fg.A02.remove();
            r4.destruct();
            if (r4.A01 == null) {
                C04720Fd r3 = (C04720Fd) C04750Fg.A01.A00.getAndSet((Object) null);
                while (r3 != null) {
                    C04720Fd r2 = r3.A00;
                    C04720Fd r1 = C04750Fg.A00.A00;
                    r3.A00 = r1.A00;
                    r1.A00 = r3;
                    r3.A00.A01 = r3;
                    r3.A01 = r1;
                    r3 = r2;
                }
            }
            C04720Fd r12 = r4.A00;
            r12.A01 = r4.A01;
            r4.A01.A00 = r12;
        }
    }
}
