package p000X;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/* renamed from: X.BTP */
public final class BTP implements BTH {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0031 */
    public final /* bridge */ /* synthetic */ BTN AQG() {
        BTQ btq = new BTQ();
        try {
            Scanner scanner = new Scanner(new File("/proc/self/statm"));
            scanner.nextLong();
            btq.A00 = Long.valueOf((scanner.nextLong() * 4) - (scanner.nextLong() * 4));
            scanner.close();
            return btq;
        } catch (IOException | InputMismatchException e) {
            AnonymousClass0DB.A0G("ProcStatmMetricsCollector", "cant parse statm file", e);
            return btq;
        } catch (Throwable ) {
            throw th;
        }
    }
}
