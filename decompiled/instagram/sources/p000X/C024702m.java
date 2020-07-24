package p000X;

import java.io.InputStreamReader;

/* renamed from: X.02m  reason: invalid class name and case insensitive filesystem */
public final class C024702m {
    /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|(2:6|(1:8)(1:9))|10|11|12|13|14|15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0051 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0051=Splitter:B:23:0x0051, B:13:0x003c=Splitter:B:13:0x003c} */
    public static String A00(String... strArr) {
        StringBuilder sb = new StringBuilder();
        Process start = new ProcessBuilder(strArr).redirectErrorStream(true).start();
        try {
            start.getOutputStream().close();
            InputStreamReader inputStreamReader = new InputStreamReader(start.getInputStream());
            char[] cArr = new char[4096];
            while (true) {
                int read = inputStreamReader.read(cArr, 0, 4096);
                if (read == -1) {
                    break;
                }
                sb.append(cArr, 0, read);
            }
            inputStreamReader.close();
            start.waitFor();
            Thread.currentThread().interrupt();
            start.destroy();
            return sb.toString();
        } catch (Throwable th) {
            start.destroy();
            throw th;
        }
    }
}
