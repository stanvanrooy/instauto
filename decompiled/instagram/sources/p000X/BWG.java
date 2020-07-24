package p000X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Set;

/* renamed from: X.BWG */
public final class BWG {
    public static final BWG A06 = new BWG();
    public Context A00;
    public BWE A01;
    public String A02;
    public final Handler A03 = new Handler(Looper.getMainLooper());
    public final Thread A04 = new BWF(this);
    public final Thread A05 = new BWH(this);

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0042 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    public static void A00(BWG bwg) {
        Set<String> A002 = C62822oQ.A00();
        if (!A002.isEmpty()) {
            BWE bwe = bwg.A01;
            bwe.A00.getParentFile().mkdirs();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(bwe.A00));
                for (String write : A002) {
                    bufferedWriter.write(write);
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
            } catch (NoClassDefFoundError unused) {
            } catch (Throwable ) {
                throw th;
            }
        }
    }
}
