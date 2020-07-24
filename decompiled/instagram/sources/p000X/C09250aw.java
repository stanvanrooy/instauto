package p000X;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.io.File;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.StringWriter;
import java.util.Locale;

/* renamed from: X.0aw  reason: invalid class name and case insensitive filesystem */
public final class C09250aw implements C03950Bk {
    public static int A00 = 2;
    public static int A01 = 5;
    public static int A02 = 30;
    public static int A03 = 40;
    public static int A04 = 45000;
    public static int A05 = -1;
    public static int A06 = -1;
    public static int A07;
    public static long A08;
    public static AnonymousClass0Bd A09;
    public static AnonymousClass0Bd A0A;
    public static C09250aw A0B;
    public static AnonymousClass0G0 A0C;
    public static AnonymousClass0G0 A0D;
    public static boolean A0E;

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    public static AnonymousClass0Fz A00(String str) {
        AnonymousClass0Fz r0;
        if (str != null) {
            try {
                r0 = (AnonymousClass0Fz) Class.forName(str).newInstance();
            } catch (Throwable th) {
                Log.e("CatchMeIfYouCan", "instantiating custom remedy class failed; continuing", th);
            }
            if (r0 != null) {
                return new AnonymousClass0Fz();
            }
            return r0;
        }
        r0 = null;
        if (r0 != null) {
        }
    }

    public static void A01(Context context) {
        int i;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            if (next.uid == myUid && (i = next.pid) != myPid) {
                String.format(Locale.US, "killing sibling process %d (%s)", new Object[]{Integer.valueOf(i), next.processName});
                Process.killProcess(next.pid);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0030 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008a  */
    public static void A02(Context context, long j, boolean z) {
        long j2;
        AnonymousClass0G0 r3;
        if (z) {
            j2 = 3600000;
        } else {
            j2 = 86400000;
        }
        AnonymousClass0G0 r6 = null;
        try {
            File A002 = AnonymousClass0G0.A00(context, z);
            RandomAccessFile randomAccessFile = new RandomAccessFile(A002, "r");
            int readInt = randomAccessFile.readInt();
            randomAccessFile.close();
            r3 = new AnonymousClass0G0(A002.lastModified(), readInt);
        } catch (Throwable th) {
            if (AnonymousClass0G0.A00(context, z).exists()) {
                Log.w("CatchMeIfYouCan", "unable to read remedy log file", th);
            }
            AnonymousClass0G0.A01(context, z);
            r3 = null;
        }
        if (r3 != null) {
            long j3 = j - r3.A01;
            if (A0E) {
                String.format(Locale.US, "previous crash remedy level %d applied %d milliseconds ago (remedy applications forgotten after %d milliseconds)", new Object[]{Integer.valueOf(r3.A00), Long.valueOf(j3), Long.valueOf(j2)});
            }
            if (j3 < 0) {
                Log.w("CatchMeIfYouCan", "remedy is from the future!");
            } else if (j3 >= j2) {
                AnonymousClass0G0.A01(context, z);
                if (!z) {
                    A0C = r6;
                    return;
                } else {
                    A0D = r6;
                    return;
                }
            }
        }
        r6 = r3;
        if (!z) {
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002e */
    public final void AbZ(Thread thread, Throwable th, C03920Be r8) {
        if (!(th instanceof C03940Bj)) {
            if ((A07 & 2) != 0) {
                try {
                    if (System.currentTimeMillis() - A08 > ((long) A04)) {
                        A09.A01();
                    } else {
                        A0A.A01();
                    }
                } catch (Throwable ) {
                }
            }
            try {
                if (A0E) {
                    Log.e("CatchMeIfYouCan", AnonymousClass000.A0J("Uncaught exception in '", AnonymousClass0CY.A00().A02(), "':"));
                    StringWriter stringWriter = new StringWriter();
                    th.printStackTrace(new PrintWriter(stringWriter));
                    for (String e : stringWriter.toString().split("\n")) {
                        Log.e("CatchMeIfYouCan", e);
                    }
                }
            } catch (Throwable unused) {
            }
            if ((A07 & 1) != 0) {
                Log.e("CatchMeIfYouCan", "CatchMeIfYouCan is killing this process");
                Process.killProcess(Process.myPid());
                System.exit(10);
            } else {
                Log.e("CatchMeIfYouCan", "Not killing process because SILENT_EXIT flag is not set.");
            }
        }
    }
}
