package p000X;

import android.os.Looper;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Map;

/* renamed from: X.01r  reason: invalid class name and case insensitive filesystem */
public final class C022601r {
    public static void A00(OutputStream outputStream) {
        PrintWriter printWriter = new PrintWriter(outputStream);
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        Thread thread = Looper.getMainLooper().getThread();
        for (Map.Entry next : allStackTraces.entrySet()) {
            A01(printWriter, (Thread) next.getKey(), (StackTraceElement[]) next.getValue());
        }
        if (!allStackTraces.containsKey(thread)) {
            A01(printWriter, thread, thread.getStackTrace());
        }
        printWriter.flush();
    }

    public static void A01(PrintWriter printWriter, Thread thread, StackTraceElement[] stackTraceElementArr) {
        printWriter.print(thread);
        printWriter.print(" ");
        printWriter.print(thread.getState());
        printWriter.println(":");
        for (StackTraceElement println : stackTraceElementArr) {
            printWriter.println(println);
        }
        printWriter.println();
    }
}
