package com.facebook.common.dextricks;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

public final class DexErrorRecoveryInfo {
    public boolean dexoptDuringColdStart;
    public Throwable fallbackCause;
    public int loadResult;
    public String odexSchemeName;
    public long odexSize;
    public Throwable regenRetryCause;
    public Throwable xdexFailureCause;

    public static void printExOrNull(PrintWriter printWriter, String str, Throwable th) {
        String str2;
        printWriter.format(" %s=", new Object[]{str});
        if (th == null) {
            str2 = "null";
        } else {
            printWriter.append("[");
            th.printStackTrace(printWriter);
            str2 = "]";
        }
        printWriter.append(str2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:15|16|17|18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0075, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0079 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0080 */
    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            printWriter.append("<DexErrorRecoveryInfo");
            printWriter.format(" loadResult=%x", new Object[]{Integer.valueOf(this.loadResult)});
            printWriter.format(" odexSchemeName=%s", new Object[]{this.odexSchemeName});
            printWriter.format(" dexoptDuringColdStart=%b", new Object[]{Boolean.valueOf(this.dexoptDuringColdStart)});
            printWriter.format(" odexSize=%d", new Object[]{Long.valueOf(this.odexSize)});
            printExOrNull(printWriter, "regenRetryCause", this.regenRetryCause);
            printExOrNull(printWriter, "fallbackCause", this.fallbackCause);
            printExOrNull(printWriter, "xdexFailureCause", this.xdexFailureCause);
            printWriter.append(">");
            printWriter.flush();
            String stringWriter2 = stringWriter.toString();
            printWriter.close();
            stringWriter.close();
            return stringWriter2;
            try {
            } catch (Throwable th) {
                stringWriter.close();
                throw th;
            }
        } catch (IOException unused) {
            throw new AssertionError();
        } catch (Throwable ) {
            throw th;
        }
    }
}
