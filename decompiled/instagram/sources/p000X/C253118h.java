package p000X;

/* renamed from: X.18h  reason: invalid class name and case insensitive filesystem */
public final class C253118h extends Thread {
    public C253118h() {
        super("AshemeObjectCleanupHelper.CleanupThread");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:0|1) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:1:?, LOOP_START, MTH_ENTER_BLOCK, SYNTHETIC, Splitter:B:0:0x0000] */
    public final void run() {
        while (true) {
            C253318j.A01.remove(C253318j.A00.remove());
        }
    }
}
