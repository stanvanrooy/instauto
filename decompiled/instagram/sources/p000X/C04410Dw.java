package p000X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.StrictMode;
import android.text.TextUtils;
import android.text.format.Time;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import oauth.signpost.OAuth;

/* renamed from: X.0Dw  reason: invalid class name and case insensitive filesystem */
public final class C04410Dw implements C03950Bk {
    public static AnonymousClass0E0 A0R = new AnonymousClass0E0();
    public static final Object A0S = new Object();
    public static final AtomicInteger A0T = new AtomicInteger();
    public static final ReentrantReadWriteLock A0U = new ReentrantReadWriteLock();
    public static final AnonymousClass01N[] A0V = {AnonymousClass01N.ACRA_CRASH_REPORT, AnonymousClass01N.NATIVE_CRASH_REPORT};
    public static final Object A0W = new Object();
    public static final Pattern A0X = Pattern.compile("^Cmd line: (.*)", 8);
    public int A00;
    public final Time A01 = new Time();
    public final AnonymousClass032 A02 = new AnonymousClass032();
    public final ArrayList A03 = new ArrayList();
    public final Map A04 = new HashMap();
    public final Set A05 = new HashSet();
    public final AtomicReference A06 = new AtomicReference();
    public final AtomicReference A07 = new AtomicReference();
    public volatile long A08;
    public volatile long A09;
    public volatile long A0A = 1572864;
    public volatile Context A0B;
    public volatile AnonymousClass01O A0C = null;
    public volatile AnonymousClass01W A0D;
    public volatile C04220Db A0E;
    public volatile AnonymousClass0CU A0F;
    public volatile File A0G = null;
    public volatile String A0H;
    public volatile String A0I;
    public volatile String A0J;
    public volatile String A0K;
    public volatile Thread.UncaughtExceptionHandler A0L;
    public volatile Map A0M;
    public volatile boolean A0N;
    public volatile byte[] A0O = null;
    public volatile boolean A0P;
    public volatile boolean A0Q;

    private int A00(AnonymousClass01N r21, AnonymousClass016 r22, AnonymousClass01e r23, C04110Cl r24) {
        String str;
        boolean z;
        String str2;
        OutputStreamWriter outputStreamWriter = null;
        AnonymousClass01N r9 = r21;
        C04110Cl r6 = r24;
        AnonymousClass01e r8 = r23;
        if (r24 != null) {
            try {
                File file = new File(r6.A00.getDir(r6.A01, 0), AnonymousClass000.A0E(UUID.randomUUID().toString(), r6.A02));
                str = file.getCanonicalPath();
                if (r9 == AnonymousClass01N.ANR_REPORT) {
                    synchronized (this.A05) {
                        this.A05.add(str);
                    }
                }
                try {
                    outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), "ISO8859_1");
                } catch (UnsupportedEncodingException unused) {
                }
            } catch (Throwable th) {
                if (outputStreamWriter != null) {
                    try {
                        outputStreamWriter.close();
                    } catch (IOException e) {
                        AnonymousClass0DB.A0M("ACRA", e, "IO Exception");
                        A0L(e, "ANRValidationError<IOException::Non-cached>", e.toString(), this);
                    }
                }
                throw th;
            }
        } else {
            str = r8.A00.getName();
        }
        AnonymousClass016 r3 = new AnonymousClass016();
        String str3 = r9.A03;
        AnonymousClass016 r5 = r22;
        if (str3 != null) {
            r3.A05(r9.A03, (String) r5.get(str3), outputStreamWriter);
        }
        if (r9 != AnonymousClass01N.ANR_REPORT || (str2 = (String) r5.get("PROCESS_NAME")) == null) {
            z = true;
        } else {
            r3.A05("PROCESS_NAME", str2, outputStreamWriter);
            z = false;
        }
        try {
            r3.A05("ACRA_REPORT_TYPE", r9.name(), outputStreamWriter);
            AnonymousClass0CU r12 = this.A0F;
            AnonymousClass01e r17 = null;
            AnonymousClass01L r14 = new AnonymousClass01L(this);
            if (r9 == AnonymousClass01N.NATIVE_CRASH_REPORT) {
                r17 = r8;
            }
            AnonymousClass019.A02(this, r12, "crash attachment", r14, r3, outputStreamWriter, r17, z, false);
        } catch (Throwable th2) {
            A0H("REPORT_LOAD_THROW", AnonymousClass000.A0E("retrieve exception: ", th2.getMessage()), r3, outputStreamWriter);
        }
        r3.A05("REPORT_ID", str.substring(0, str.lastIndexOf(46)), outputStreamWriter);
        r3.A06(r5, false, outputStreamWriter);
        String str4 = (String) r5.get("APP_VERSION_CODE");
        if (str4 != null) {
            r3.A05("APP_VERSION_CODE", str4, outputStreamWriter);
        }
        String str5 = (String) r5.get("APP_VERSION_NAME");
        if (str5 != null) {
            r3.A05("APP_VERSION_NAME", str5, outputStreamWriter);
        }
        String str6 = (String) r5.get("ASL_SESSION_ID");
        if (str6 != null) {
            r3.A05("ASL_SESSION_ID", str6, outputStreamWriter);
        }
        r3.A05("EXCEPTION_CAUSE", "crash attachment", outputStreamWriter);
        if (outputStreamWriter == null) {
            A08(this, r3);
        }
        if (outputStreamWriter != null) {
            try {
                outputStreamWriter.close();
                return 1;
            } catch (IOException e2) {
                AnonymousClass0DB.A0M("ACRA", e2, "IO Exception");
                A0L(e2, "ANRValidationError<IOException::Non-cached>", e2.toString(), this);
            }
        }
        return 1;
    }

    public static void A0A(C04410Dw r9, AnonymousClass01N r10, String str, File file, C04110Cl r13) {
        AnonymousClass016 r4;
        AnonymousClass01N r8 = r10;
        C04410Dw r5 = r9;
        if (!r9.A0O(r10)) {
            File file2 = file;
            if (str == null && file == null) {
                throw new IllegalArgumentException("stackTrace and traceFile can't be null at the same time");
            }
            AnonymousClass016 r3 = null;
            if (str != null) {
                try {
                    r4 = new AnonymousClass016();
                    r4.put("TIME_OF_CRASH", Long.toString(System.currentTimeMillis()));
                    r4.put(r10.A03, C024502k.A00(str.getBytes()));
                } catch (IOException e) {
                    e.printStackTrace();
                    r4.put("REPORT_LOAD_THROW", AnonymousClass000.A0E("throwable: ", e.getMessage()));
                    AnonymousClass0DB.A0M("ACRA", e, "Could not load crash report. File will be deleted.");
                } catch (Throwable th) {
                    try {
                        StringBuilder sb = new StringBuilder("Failed to build cached crash report");
                        if (file != null) {
                            sb.append(' ');
                            sb.append(file);
                        }
                        AnonymousClass0DB.A0M("ACRA", th, sb.toString());
                        r5.A0L(th, AnonymousClass000.A0J("ANRValidationError<", th.getClass().getSimpleName(), "::Non-cached>"), th.toString(), r5);
                    } catch (Throwable th2) {
                        if (r3 != null) {
                            A07(r3);
                        }
                        if (file != null) {
                            A0D(file);
                        }
                        throw th2;
                    }
                }
                r9.A0Q(r4);
                r3 = r4;
            } else if (file != null && (r3 = A02(r5, file2, (RandomAccessFile) null, r8, r10.A01, r9.A0N(r10))) == null) {
                AnonymousClass0DB.A0J("ACRA", "Failed to load crash attachment report %s", file);
                A0D(file);
                return;
            }
            r5.A00(r8, r3, (AnonymousClass01e) null, r13);
            if (r3 != null) {
                A07(r3);
            }
            if (file != null) {
                A0D(file);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* JADX WARNING: type inference failed for: r11v12 */
    /* JADX WARNING: type inference failed for: r11v13 */
    /* JADX WARNING: type inference failed for: r11v14 */
    /* JADX WARNING: type inference failed for: r11v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0161 A[SYNTHETIC, Splitter:B:103:0x0161] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0189 A[Catch:{ all -> 0x0074, all -> 0x01d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0096 A[SYNTHETIC, Splitter:B:45:0x0096] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a9 A[SYNTHETIC, Splitter:B:54:0x00a9] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d1 A[Catch:{ all -> 0x013d }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e2 A[Catch:{ all -> 0x013d }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ef A[SYNTHETIC, Splitter:B:70:0x00ef] */
    public static void A0B(C04410Dw r16, Throwable th, AnonymousClass016 r18, int i) {
        AnonymousClass016 r13;
        String str;
        C021401f r2;
        C021601h r4;
        String str2;
        UUID uuid;
        FileOutputStream fileOutputStream;
        OutputStreamWriter outputStreamWriter;
        FileOutputStream fileOutputStream2;
        Throwable th2;
        FileOutputStream fileOutputStream3;
        ? r11 = 0;
        C04410Dw r9 = r16;
        OutputStreamWriter outputStreamWriter2 = null;
        if (r9.A0N) {
            Object obj = A0S;
            synchronized (obj) {
                obj.notify();
            }
            Throwable th3 = th;
            Throwable th4 = th3;
            boolean z = th3 instanceof AnonymousClass01Z;
            if (!z) {
                while (th4.getCause() != null) {
                    th4 = th4.getCause();
                }
            }
            Class<?> cls = th4.getClass();
            r13 = new AnonymousClass016();
            if (z) {
                i |= 4;
            }
            if ((i & 4) != 0) {
                i &= -4;
                r13.A02 = true;
            }
            if (z) {
                str = ((AnonymousClass01Z) th3).ALN();
            } else {
                str = "crash";
            }
            r9.A0I(AnonymousClass000.A0E("Handling exception for ", str), th3);
            try {
                r4 = AnonymousClass01N.ACRA_CRASH_REPORT.A01(r9.A0B);
            } catch (Throwable th5) {
                th = th5;
                r2 = null;
                A0C(outputStreamWriter2);
                A0C(r11);
                A0C(r2);
                throw th;
            }
            if (r4 != null) {
                r2 = null;
                uuid = null;
                str2 = null;
                while (r2 == null) {
                    try {
                        uuid = C024902o.A01();
                        str2 = A04(r9, cls, uuid);
                        r2 = r4.A01(str2, r9.A0G);
                    } catch (Throwable th6) {
                        th = th6;
                        r11 = r11;
                        A0C(outputStreamWriter2);
                        A0C(r11);
                        A0C(r2);
                        throw th;
                    }
                }
            } else {
                uuid = null;
                str2 = null;
                r2 = null;
            }
            if (r2 != null) {
                try {
                    fileOutputStream = new FileOutputStream(r2.A01.getFD());
                } catch (Throwable th7) {
                    r13.A00 = th7;
                    A0J((String) null, th7);
                }
                if (fileOutputStream != null) {
                    try {
                        outputStreamWriter = new OutputStreamWriter(fileOutputStream, "ISO8859_1");
                    } catch (UnsupportedEncodingException unused) {
                        outputStreamWriter = null;
                    } catch (Throwable th8) {
                        th = th8;
                        r11 = fileOutputStream;
                        A0C(outputStreamWriter2);
                        A0C(r11);
                        A0C(r2);
                        throw th;
                    }
                    if (uuid == null) {
                        try {
                            uuid = C024902o.A01();
                        } catch (Throwable th9) {
                            try {
                                A0J("gathering crash data", th9);
                                String A062 = A06(th9);
                                outputStreamWriter2 = outputStreamWriter;
                                A0H("ACRA_INTERNAL", A062, r13, outputStreamWriter);
                            } catch (Throwable th10) {
                                th = th10;
                            }
                        }
                    }
                    A0H("ACRA_REPORT_TYPE", AnonymousClass01N.ACRA_CRASH_REPORT.name(), r13, outputStreamWriter);
                    if (r9.A0F.A03("ACRA_REPORT_FILENAME") && str2 != null) {
                        A0H("ACRA_REPORT_FILENAME", str2, r13, outputStreamWriter);
                    }
                    if (r9.A0F.A03("REPORT_ID")) {
                        A0H("REPORT_ID", uuid.toString(), r13, outputStreamWriter);
                    }
                    if (r9.A0F.A03("EXCEPTION_CAUSE")) {
                        A0H("EXCEPTION_CAUSE", cls.getName(), r13, outputStreamWriter);
                    }
                    r11 = A06(th3);
                    if (r18 != null) {
                        try {
                            for (Map.Entry entry : r18.entrySet()) {
                                if (AnonymousClass019.A03((String) entry.getKey(), r13, r9.A0F)) {
                                    A0H((String) entry.getKey(), (String) entry.getValue(), r13, outputStreamWriter);
                                }
                            }
                        } catch (Throwable th11) {
                            A0J("pre-populating fields from draft", th11);
                        }
                    }
                    AnonymousClass019.A02(r9, r9.A0F, r11, th3, r13, outputStreamWriter, (AnonymousClass01e) null, true, z);
                    outputStreamWriter2 = outputStreamWriter;
                    if (outputStreamWriter == null) {
                        try {
                            outputStreamWriter.flush();
                            FileOutputStream fileOutputStream4 = fileOutputStream;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.flush();
                                } catch (Throwable th12) {
                                    th = th12;
                                    fileOutputStream3 = fileOutputStream4;
                                    r11 = fileOutputStream3;
                                    r13.A00 = th;
                                    A0J((String) null, th);
                                    fileOutputStream2 = fileOutputStream3;
                                    th2 = r13.A00;
                                    if (th2 != null) {
                                    }
                                    i |= 1;
                                    if ((i & 1) != 0) {
                                    }
                                    A0C(outputStreamWriter);
                                    A0C(fileOutputStream2);
                                    A0C(r2);
                                }
                            }
                            FileChannel channel = r2.A01.getChannel();
                            channel.truncate(channel.position());
                            fileOutputStream2 = fileOutputStream4;
                        } catch (Throwable th13) {
                            th = th13;
                            fileOutputStream3 = fileOutputStream;
                            r11 = fileOutputStream3;
                            r13.A00 = th;
                            A0J((String) null, th);
                            fileOutputStream2 = fileOutputStream3;
                            th2 = r13.A00;
                            if (th2 != null) {
                            }
                            i |= 1;
                            if ((i & 1) != 0) {
                            }
                            A0C(outputStreamWriter);
                            A0C(fileOutputStream2);
                            A0C(r2);
                        }
                    } else {
                        fileOutputStream2 = fileOutputStream;
                    }
                    th2 = r13.A00;
                    if (th2 != null) {
                        A0H("GENERATING_IO_ERROR", th2.toString(), r13, outputStreamWriter);
                    }
                    if (r13.A00 != null && (i & 4) == 0) {
                        i |= 1;
                    }
                    if ((i & 1) != 0) {
                        try {
                            r13.put("SENT_IMMEDIATELY", "true");
                            AnonymousClass01S r1 = new AnonymousClass01S(r9, r13, r2);
                            if ((i & 2) != 0) {
                                r1.A00();
                            } else {
                                r1.start();
                                r2 = null;
                            }
                        } catch (Throwable th14) {
                            r11 = fileOutputStream2;
                            A0J("sending in-memory report", th14);
                        }
                    }
                    A0C(outputStreamWriter);
                    A0C(fileOutputStream2);
                    A0C(r2);
                }
                outputStreamWriter = null;
                if (uuid == null) {
                }
                A0H("ACRA_REPORT_TYPE", AnonymousClass01N.ACRA_CRASH_REPORT.name(), r13, outputStreamWriter);
                A0H("ACRA_REPORT_FILENAME", str2, r13, outputStreamWriter);
                if (r9.A0F.A03("REPORT_ID")) {
                }
                if (r9.A0F.A03("EXCEPTION_CAUSE")) {
                }
                r11 = A06(th3);
                if (r18 != null) {
                }
                AnonymousClass019.A02(r9, r9.A0F, r11, th3, r13, outputStreamWriter, (AnonymousClass01e) null, true, z);
                outputStreamWriter2 = outputStreamWriter;
                if (outputStreamWriter == null) {
                }
                th2 = r13.A00;
                if (th2 != null) {
                }
                i |= 1;
                if ((i & 1) != 0) {
                }
                A0C(outputStreamWriter);
                A0C(fileOutputStream2);
                A0C(r2);
            }
            fileOutputStream = null;
            if (fileOutputStream != null) {
            }
            outputStreamWriter = null;
            if (uuid == null) {
            }
            A0H("ACRA_REPORT_TYPE", AnonymousClass01N.ACRA_CRASH_REPORT.name(), r13, outputStreamWriter);
            A0H("ACRA_REPORT_FILENAME", str2, r13, outputStreamWriter);
            if (r9.A0F.A03("REPORT_ID")) {
            }
            if (r9.A0F.A03("EXCEPTION_CAUSE")) {
            }
            try {
                r11 = A06(th3);
            } catch (Throwable unused2) {
            }
            if (r18 != null) {
            }
            AnonymousClass019.A02(r9, r9.A0F, r11, th3, r13, outputStreamWriter, (AnonymousClass01e) null, true, z);
            outputStreamWriter2 = outputStreamWriter;
            if (outputStreamWriter == null) {
            }
            th2 = r13.A00;
            if (th2 != null) {
            }
            i |= 1;
            if ((i & 1) != 0) {
            }
            A0C(outputStreamWriter);
            A0C(fileOutputStream2);
            A0C(r2);
        }
        return;
        A0J((String) null, th);
        A0H("ACRA_INTERNAL", "ACRA_INTERNAL=java.lang.Exception: An exception occurred while trying to collect data about an ACRA internal error\n\tat com.facebook.acra.ErrorReporter.handleException(ErrorReporter.java:810)\n\tat com.facebook.acra.ErrorReporter.handleException(ErrorReporter.java:866)\n\tat com.facebook.acra.ErrorReporter.uncaughtException(ErrorReporter.java:666)\n\tat java.lang.ThreadGroup.uncaughtException(ThreadGroup.java:693)\n\tat java.lang.ThreadGroup.uncaughtException(ThreadGroup.java:690)\n", r13, outputStreamWriter);
        if (outputStreamWriter == null) {
        }
        th2 = r13.A00;
        if (th2 != null) {
        }
        i |= 1;
        if ((i & 1) != 0) {
        }
        A0C(outputStreamWriter);
        A0C(fileOutputStream2);
        A0C(r2);
    }

    public static void A0D(File file) {
        if (file != null) {
            boolean delete = file.delete();
            if (!delete && !file.exists()) {
                delete = true;
            }
            file.getName();
            if (!delete) {
                AnonymousClass0DB.A0K("ACRA", "Could not delete error report: %s", file.getName());
            }
        }
    }

    public static void A0E(File file) {
        File[] listFiles;
        if (file != null && (listFiles = file.listFiles((FileFilter) null)) != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    A0E(file2);
                }
                A0D(file2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bc A[RETURN] */
    private void A0K(Thread thread, Throwable th, boolean z) {
        Throwable th2;
        this.A0O = null;
        A0M(AnonymousClass01N.ACRA_CRASH_REPORT);
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        } catch (Throwable th3) {
            A0J((String) null, th3);
        }
        int i = 3;
        try {
            AnonymousClass0DB.A0J("ACRA", "ACRA caught a %s exception for %s version %s. Building report.", th.getClass().getSimpleName(), this.A0B.getPackageName(), this.A0H);
        } catch (Throwable th4) {
            A0J((String) null, th4);
        }
        TreeMap treeMap = new TreeMap();
        treeMap.put("java_throwing_thread_name", String.valueOf(thread.getName()));
        AnonymousClass01V r10 = (AnonymousClass01V) this.A06.get();
        int i2 = 0;
        while (true) {
            th2 = th;
            for (AnonymousClass01V r0 = r10; r0 != null && th2 != null; r0 = null) {
                try {
                    th2 = r0.A00(th2, treeMap);
                } catch (Throwable th5) {
                    AnonymousClass0DB.A0Q("ACRA", th5, "ignoring error in exception translation hook %s", r0);
                }
            }
            if (th2 != th && (i2 = i2 + 1) < 4) {
                th = th2;
            } else if (th2 == null) {
                if (z) {
                    i = 4;
                }
                Throwable th6 = th2;
                if (!(th2 instanceof AnonymousClass01Z)) {
                    while (th6.getCause() != null) {
                        th6 = th6.getCause();
                    }
                }
                if (th6 instanceof OutOfMemoryError) {
                    i &= -2;
                }
                try {
                    A0B(this, th2, new AnonymousClass016(treeMap), i);
                    return;
                } catch (Throwable th7) {
                    if (!z) {
                        AnonymousClass0DB.A0M("ACRA", th7, "error during error reporting: will attempt to report error");
                        A0K(thread, th7, true);
                        return;
                    }
                    throw th7;
                }
            } else {
                return;
            }
        }
        if (th2 == null) {
        }
    }

    private void A0M(AnonymousClass01N... r6) {
        for (AnonymousClass01N r1 : r6) {
            if (r1 == AnonymousClass01N.NATIVE_CRASH_REPORT || r1 == AnonymousClass01N.ACRA_CRASH_REPORT) {
                if (A0P(r1) > 0) {
                    A0E(this.A0B.getDir("traces", 0));
                    return;
                }
            }
        }
    }

    public final void AbZ(Thread thread, Throwable th, C03920Be r6) {
        synchronized (A0S) {
            try {
                A0K(thread, th, false);
            } catch (Throwable th2) {
                A0J((String) null, th2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x006f, code lost:
        if (r4 == null) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0077, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0078, code lost:
        if (r4 != null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x008a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x008e, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x007d */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0062 A[EDGE_INSN: B:78:0x0062->B:39:0x0062 ?: BREAK  , SYNTHETIC] */
    public static int A01(C04410Dw r8, int i, AnonymousClass01N r10, boolean z) {
        boolean z2;
        if (r10.A02 != null) {
            String A002 = AnonymousClass019.A00(r8.A0B);
            if (A002 == null) {
                A002 = "n/a";
            }
            C021501g A003 = AnonymousClass01N.A00(r10, r8.A0B);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (!A003.hasNext() || i2 >= i) {
                    break;
                }
                C021501g.A00(A003);
                AnonymousClass01e r4 = A003.A00;
                if (r4 != null) {
                    A003.A00 = null;
                    int i4 = i3 + 1;
                    if (i3 >= 5) {
                        A0D(r4.A00);
                    } else {
                        String str = null;
                        str = r4.A00.getCanonicalPath();
                        if (r10 != AnonymousClass01N.CACHED_ANR_REPORT) {
                            synchronized (r8.A05) {
                                if (!r8.A05.contains(str)) {
                                    z2 = false;
                                } else if (!z) {
                                    r8.A05.remove(str);
                                    z2 = true;
                                } else if (r4 == null) {
                                    continue;
                                    i3 = i4;
                                }
                            }
                        } else {
                            z2 = false;
                        }
                        if (r10.A02.AbW(r8, r4, A002, z2)) {
                            break;
                        }
                        i2++;
                        if (r4 == null) {
                            continue;
                            i3 = i4;
                        }
                    }
                    r4.close();
                    i3 = i4;
                } else {
                    throw new NoSuchElementException();
                }
            }
            A003.close();
            return i2;
        }
        throw new NullPointerException("ErrorReporter::checkAndHandleReportsLocked report type requires a handler");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:126|127|128|129|130) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0098, code lost:
        if (r7 <= 0) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0134, code lost:
        if (r1 != false) goto L_0x0136;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:129:0x01f6 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c9 A[Catch:{ IOException -> 0x014c }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0115 A[Catch:{ IOException -> 0x014c }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0133 A[Catch:{ IOException -> 0x014c }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0139 A[Catch:{ IOException -> 0x014c }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0184  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:129:0x01f6=Splitter:B:129:0x01f6, B:121:0x01ec=Splitter:B:121:0x01ec} */
    public static AnonymousClass016 A02(C04410Dw r27, File file, RandomAccessFile randomAccessFile, AnonymousClass01N r30, long j, boolean z) {
        boolean z2;
        String str;
        boolean z3;
        String str2;
        FileInputStream fileInputStream;
        BufferedInputStream bufferedInputStream;
        String str3;
        AnonymousClass039 r10;
        boolean z4;
        String str4;
        String str5;
        boolean z5;
        boolean z6;
        File file2 = file;
        String name = file2.getName();
        long currentTimeMillis = System.currentTimeMillis();
        long lastModified = file2.lastModified();
        long length = file2.length();
        AnonymousClass016 r3 = new AnonymousClass016();
        r3.put("TIME_OF_CRASH", Long.toString(lastModified));
        C04410Dw r6 = r27;
        long A012 = ((long) AnonymousClass0FU.A01(r6.A0B, "acraconfig_max_report_age_seconds", 604800)) * 1000;
        boolean z7 = true;
        AnonymousClass01N r5 = r30;
        if (r5 != AnonymousClass01N.ANR_REPORT || !AnonymousClass0FU.A08(r6.A0B, "acraconfig_report_old_anrs")) {
            int i = ((currentTimeMillis - lastModified) > A012 ? 1 : ((currentTimeMillis - lastModified) == A012 ? 0 : -1));
            z2 = true;
        }
        z2 = false;
        int A013 = AnonymousClass0FU.A01(r6.A0B, "acraconfig_action_on_old_reports", 0);
        String str6 = null;
        if ("MINIDUMP".equals(r5.A03) && !r6.A0F.A03("MINIDUMP")) {
            str = "CONFIG_DONT_REPORT_DUMP";
        } else if (z2 && A013 != 2) {
            str = "DUMP_TOO_OLD";
            z3 = true;
            if (AnonymousClass0FU.A08(r6.A0B, "android_acra_delete_corrupted_minidumps")) {
                RandomAccessFile randomAccessFile2 = randomAccessFile;
                if (randomAccessFile != null && r5 == AnonymousClass01N.NATIVE_CRASH_REPORT) {
                    try {
                        AnonymousClass03A r7 = new AnonymousClass03A(randomAccessFile2);
                        try {
                            AnonymousClass038 A032 = AnonymousClass03A.A03(r7, -87162880);
                            if (A032 != null) {
                                r7.A00.seek((long) A032.A00);
                                r10 = new AnonymousClass039(AnonymousClass03A.A01(r7), AnonymousClass03A.A01(r7));
                                if (r10 != null) {
                                    long j2 = r10.A01 ^ r10.A00;
                                    boolean z8 = false;
                                    if ((16 & j2) != 0) {
                                        z8 = true;
                                    }
                                    boolean z9 = false;
                                    if ((8 & j2) != 0) {
                                        z9 = true;
                                    }
                                    int i2 = ((j2 & 17592186044416L) > 0 ? 1 : ((j2 & 17592186044416L) == 0 ? 0 : -1));
                                    boolean z10 = false;
                                    if (i2 != 0) {
                                        z10 = true;
                                    }
                                    if (z8 || (z9 && z10)) {
                                        z4 = true;
                                        str5 = r7.A04(-87110912);
                                        str4 = str5;
                                        if (str5 != null) {
                                            if (!str4.contains("WriteMappings failed")) {
                                                if (str4.contains("WriteThreadListStream failed") && str4.contains("WriteThreadUnwindStream failed")) {
                                                }
                                            }
                                            z5 = true;
                                            if (!z4) {
                                                z6 = false;
                                            }
                                            z6 = true;
                                            if (z6) {
                                                str = "CORRUPTED_MINIDUMP";
                                                try {
                                                    str2 = r7.A04(-87110915);
                                                } catch (IOException e) {
                                                    AnonymousClass0DB.A0M("MinidumpReader", e, "getJavaStack error");
                                                }
                                                if (str != null) {
                                                    AnonymousClass0DB.A0K("ACRA", "deleting crash report %s: %s", name, str);
                                                    A0D(file2);
                                                    if (!z3 || A013 != 1) {
                                                        String str7 = r5.A03;
                                                        if (str7 != null) {
                                                            r3.put(str7, str);
                                                        }
                                                        r3.put("MINIDUMP_EXCLUDE_REASON", str);
                                                        if (str2 != null) {
                                                            r3.put("JAVA_STACK_FROM_DUMP", str2);
                                                        }
                                                    } else {
                                                        z7 = false;
                                                    }
                                                    if (z7) {
                                                        return r3;
                                                    }
                                                    return null;
                                                }
                                                if (z) {
                                                    fileInputStream = new FileInputStream(file2);
                                                    bufferedInputStream = new BufferedInputStream(fileInputStream);
                                                    try {
                                                        if (r5 == AnonymousClass01N.ACRA_CRASH_REPORT) {
                                                            r3.A03(bufferedInputStream);
                                                        } else {
                                                            if (r5 == AnonymousClass01N.ANR_REPORT) {
                                                                AnonymousClass01T A033 = A03(bufferedInputStream);
                                                                String str8 = A033.A00;
                                                                if (str8 != null) {
                                                                    r3.put("PROCESS_NAME", str8);
                                                                }
                                                                str6 = A033.A01;
                                                                str3 = A033.A02;
                                                            } else {
                                                                str3 = null;
                                                            }
                                                            A09(r6, r3, bufferedInputStream, r5, length);
                                                            if (!TextUtils.isEmpty(str6)) {
                                                                r3.put("APP_VERSION_CODE", str6);
                                                                r3.put("APP_VERSION_NAME", str3);
                                                            }
                                                        }
                                                    } catch (Throwable th) {
                                                        r3.put("REPORT_LOAD_THROW", AnonymousClass000.A0E("throwable: ", th.getMessage()));
                                                        AnonymousClass0DB.A0P("ACRA", th, "Could not load crash report: %s. File will be deleted.", name);
                                                        r6.A0B.deleteFile(name);
                                                    }
                                                    bufferedInputStream.close();
                                                    fileInputStream.close();
                                                } else {
                                                    FileInputStream fileInputStream2 = new FileInputStream(file2);
                                                    Map map = r3.A03;
                                                    String str9 = r5.A03;
                                                    file2.length();
                                                    map.put(str9, new C025302s(fileInputStream2, false));
                                                }
                                                r3.put("ACRA_REPORT_FILENAME", name);
                                                r6.A0Q(r3);
                                                return r3;
                                            }
                                        }
                                        z5 = false;
                                        if (!z4) {
                                        }
                                        z6 = true;
                                        if (z6) {
                                        }
                                    }
                                }
                                z4 = false;
                                str5 = r7.A04(-87110912);
                                str4 = str5;
                                if (str5 != null) {
                                }
                                z5 = false;
                                if (!z4) {
                                }
                                z6 = true;
                                if (z6) {
                                }
                            }
                        } catch (IOException e2) {
                            AnonymousClass0DB.A0M("MinidumpReader", e2, "getMinidumpMarkers failed to read");
                        }
                        r10 = null;
                        if (r10 != null) {
                        }
                        z4 = false;
                        try {
                            str5 = r7.A04(-87110912);
                            str4 = str5;
                        } catch (IOException e3) {
                            AnonymousClass0DB.A0P("MinidumpReader", e3, "getErrorLogData error: %s", "");
                            str5 = null;
                            str4 = null;
                        }
                        if (str5 != null) {
                        }
                        z5 = false;
                        if (!z4) {
                        }
                        z6 = true;
                        if (z6) {
                        }
                    } catch (IOException e4) {
                        AnonymousClass0DB.A0M("ACRA", e4, "Failed to read minidump file");
                    }
                }
            }
            str2 = null;
            if (str != null) {
            }
        } else if (length > j) {
            r3.put("ATTACHMENT_ORIGINAL_SIZE", String.valueOf(length));
            str = "DUMP_TOO_BIG";
        } else {
            str = null;
        }
        z3 = false;
        if (AnonymousClass0FU.A08(r6.A0B, "android_acra_delete_corrupted_minidumps")) {
        }
        str2 = null;
        if (str != null) {
        }
        try {
        } catch (Throwable th2) {
            bufferedInputStream.close();
            throw th2;
        }
        try {
        } catch (Throwable th3) {
            try {
                fileInputStream.close();
            } catch (Throwable unused) {
            }
            throw th3;
        }
    }

    public static String A04(C04410Dw r5, Class cls, UUID uuid) {
        String str;
        String uuid2 = uuid.toString();
        String simpleName = cls.getSimpleName();
        if (r5.A0H != null) {
            str = AnonymousClass000.A0E("-", r5.A0H);
        } else {
            str = "";
        }
        return AnonymousClass000.A0O(uuid2, "-", simpleName, str, ".stacktrace");
    }

    public static String A05(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(21);
        int read = bufferedInputStream.read();
        char[] cArr = new char[20];
        int i = 0;
        while (true) {
            if (read != -1 && i < 20 && read != 10) {
                if (!Character.isDigit(read) && read != 46) {
                    bufferedInputStream.reset();
                    i = 0;
                    break;
                }
                cArr[i] = (char) read;
                read = bufferedInputStream.read();
                i++;
            } else {
                break;
            }
        }
        return new String(cArr, 0, i);
    }

    public static String A06(Throwable th) {
        int lastIndexOf;
        int indexOf;
        if (th == null) {
            th = new Exception("Report requested by developer");
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.close();
        if (th instanceof StackOverflowError) {
            StringBuffer buffer = stringWriter.getBuffer();
            if (buffer.length() > 800000 && (lastIndexOf = buffer.lastIndexOf("\n", 400000)) >= 0 && (indexOf = buffer.indexOf("\n", buffer.length() - 400000)) >= 0) {
                buffer.replace(lastIndexOf, indexOf, "\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxSTACK_FRAMES_TRIMMED_FOR_OVERFLOWxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            }
        }
        return stringWriter.toString();
    }

    public static void A07(AnonymousClass016 r1) {
        InputStream inputStream;
        for (Map.Entry value : r1.A03.entrySet()) {
            C025302s r0 = (C025302s) value.getValue();
            if (!(r0 == null || (inputStream = r0.A00) == null)) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    public static void A08(C04410Dw r14, AnonymousClass016 r15) {
        ArrayList arrayList;
        C025002p r8;
        HttpURLConnection AIe;
        synchronized (r14.A03) {
            arrayList = new ArrayList(r14.A03);
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                AnonymousClass08S r4 = (AnonymousClass08S) it.next();
                try {
                    URL url = new URL(r4.A00.toString());
                    url.toString();
                    String str = null;
                    if (r4.A01) {
                        r8 = new AnonymousClass0Bf(3000);
                    } else {
                        r8 = new AnonymousClass0Bg();
                    }
                    HashMap hashMap = new HashMap();
                    if (r15.containsKey("UID")) {
                        str = (String) r15.get("UID");
                    }
                    if (str != null && !str.equals("") && !str.equals("0")) {
                        hashMap.put("Cookie", AnonymousClass000.A0E("c_user=", str));
                    }
                    C025102q r2 = new C025102q(r8);
                    r2.A01 = hashMap;
                    AIe = r2.A00.AIe(url);
                    AIe.setRequestMethod("POST");
                    AIe.setRequestProperty("User-Agent", "Android");
                    AIe.setRequestProperty("Content-Type", OAuth.FORM_ENCODED);
                    AIe.setRequestProperty("Content-Encoding", "gzip");
                    Map map = r2.A01;
                    if (map != null && !map.isEmpty()) {
                        for (Map.Entry entry : r2.A01.entrySet()) {
                            AIe.setRequestProperty(entry.getKey().toString(), entry.getValue().toString());
                        }
                    }
                    AIe.setDoOutput(true);
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(AnonymousClass0ZO.A01(AIe, -2122006138));
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    AnonymousClass037 r82 = new AnonymousClass037(bufferedWriter);
                    boolean z2 = true;
                    for (Map.Entry entry2 : r15.entrySet()) {
                        Object key = entry2.getKey();
                        if (!z2) {
                            bufferedWriter.append('&');
                        }
                        Object value = entry2.getValue();
                        if (value == null) {
                            value = "";
                        }
                        r82.write(key.toString());
                        bufferedWriter.write(61);
                        if (value instanceof InputStream) {
                            InputStreamReader inputStreamReader = new InputStreamReader((InputStream) value);
                            char[] cArr = new char[256];
                            while (true) {
                                try {
                                    int read = inputStreamReader.read(cArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    r82.write(cArr, 0, read);
                                } catch (IOException unused) {
                                }
                            }
                        } else {
                            r82.write(value.toString());
                        }
                        z2 = false;
                    }
                    bufferedWriter.flush();
                    gZIPOutputStream.close();
                    AIe.getResponseCode();
                    AnonymousClass0ZO.A00(AIe, -1267551549).close();
                    AIe.disconnect();
                    z = true;
                } catch (Throwable th) {
                    try {
                        throw new C023902e("Error while sending report to Http Post Form.", th);
                    } catch (C023902e e) {
                        if (!z) {
                            throw e;
                        }
                        AnonymousClass0DB.A0Q("ACRA", e, "ReportSender of class %s failed but other senders completed their task. ACRA will not send this report again.", r4.getClass().getName());
                    }
                }
            }
            return;
        }
        throw new C023902e("no configured report senders", (Throwable) null);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:21|22|23|24|25) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:66|67|68|69|70) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0053 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x005a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x00bb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x00c2 */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x00f0  */
    public static void A09(C04410Dw r7, AnonymousClass016 r8, InputStream inputStream, AnonymousClass01N r10, long j) {
        String A002;
        String str;
        FileReader fileReader;
        FileReader fileReader2;
        if (r10 == AnonymousClass01N.NATIVE_CRASH_REPORT) {
            try {
                File file = new File(r7.A0B.getFilesDir(), "last_activity_opened");
                if (!file.exists()) {
                    r8.put("LAST_ACTIVITY_LOGGED", "NO_FILE");
                } else {
                    fileReader2 = new FileReader(file);
                    BufferedReader bufferedReader = new BufferedReader(fileReader2, 1024);
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        r8.put("LAST_ACTIVITY_LOGGED", readLine);
                        r8.put("LAST_ACTIVITY_LOGGED_TIME", Long.toString(file.lastModified()));
                    }
                    file.delete();
                    bufferedReader.close();
                    fileReader2.close();
                }
            } catch (IOException e) {
                AnonymousClass0DB.A0N("ErrorReporter", e, "error attaching activity information");
            } catch (Throwable ) {
                throw th;
            }
            try {
                File file2 = new File(r7.A0B.getFilesDir(), "iab_open_times");
                if (!file2.exists()) {
                    str = "NO_FILE";
                } else {
                    try {
                        fileReader = new FileReader(file2);
                        BufferedReader bufferedReader2 = new BufferedReader(fileReader, 1024);
                        str = bufferedReader2.readLine();
                        if (str != null) {
                            bufferedReader2.close();
                            fileReader.close();
                        } else {
                            bufferedReader2.close();
                            fileReader.close();
                            str = null;
                        }
                    } catch (Exception unused) {
                    } catch (Throwable ) {
                        throw th;
                    }
                }
                if ("NO_FILE".equals(str)) {
                    r8.put("IAB_OPEN_TIMES", "0");
                } else if (str != null) {
                    r8.put("IAB_OPEN_TIMES", str);
                }
                if (file2.exists()) {
                    file2.delete();
                }
            } catch (IOException e2) {
                AnonymousClass0DB.A0N("ErrorReporter", e2, "error attaching IAB information");
            }
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i - i2;
            if (i4 > 0 && (i3 = inputStream.read(bArr, i2, i4)) != -1) {
                i2 += i3;
            } else if (i3 != 0) {
                A002 = "";
            } else {
                A002 = C024502k.A00(bArr);
            }
        }
        if (i3 != 0) {
        }
        r8.put(r10.A03, A002);
        r8.put("ATTACHMENT_ORIGINAL_SIZE", String.valueOf(j));
        return;
        try {
        } catch (Throwable th) {
            fileReader2.close();
            throw th;
        }
        try {
        } catch (Throwable th2) {
            fileReader.close();
            throw th2;
        }
    }

    public static void A0C(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                A0J("safeClose", th);
            }
        }
    }

    public static void A0F(String str) {
        C023702c.A00.Baq(str);
    }

    public static void A0G(String str, String str2) {
        C023702c.A00.Bgx(str, str2, new Object[0]);
    }

    public static void A0H(String str, String str2, AnonymousClass016 r3, Writer writer) {
        if (r3.A00 != null) {
            writer = null;
        }
        try {
            r3.A05(str, str2, writer);
        } catch (IOException e) {
            r3.A00 = e;
        }
    }

    private void A0I(String str, Throwable th) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[0];
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (i < length) {
            StackTraceElement stackTraceElement2 = stackTrace[i];
            if (!stackTraceElement2.getClassName().equals(stackTraceElement.getClassName()) || !stackTraceElement2.getMethodName().equals(stackTraceElement.getMethodName())) {
                i++;
            } else {
                AnonymousClass0DB.A0M("ErrorReporter", th, "Unable to log over log bridge due to exception.");
                return;
            }
        }
        AnonymousClass0DB.A0P("ACRA", th, "%s", str);
    }

    public static void A0J(String str, Throwable th) {
        if (str == null) {
            str = "???";
        }
        try {
            AnonymousClass0DB.A0P("ACRA", th, "internal ACRA error: %s: ", str);
        } catch (Throwable unused) {
        }
    }

    private void A0L(Throwable th, String str, String str2, C04410Dw r6) {
        AnonymousClass0CU r0 = this.A0F;
        AnonymousClass016 r1 = new AnonymousClass016();
        r1.put("soft_error_category", str);
        r1.put("soft_error_message", str2);
        A0B(r6, th, r1, 1);
    }

    private boolean A0N(AnonymousClass01N r4) {
        if (r4 == AnonymousClass01N.NATIVE_CRASH_REPORT) {
            Iterator it = this.A03.iterator();
            if (!it.hasNext()) {
                return false;
            }
            boolean z = ((AnonymousClass08S) it.next()) instanceof AnonymousClass08S;
        }
        return true;
    }

    private boolean A0O(AnonymousClass01N r4) {
        return new File(this.A0B.getDir(r4.A04, 0), ".noupload").exists();
    }

    public final int A0P(AnonymousClass01N... r6) {
        if (this.A0B == null) {
            AnonymousClass0DB.A0D("ACRA", "Trying to get ACRA reports but ACRA is not initialized.");
            return 0;
        }
        int i = 0;
        for (AnonymousClass01N A002 : r6) {
            i += AnonymousClass01N.A00(A002, this.A0B).A02.length;
        }
        return i;
    }

    public final void A0Q(AnonymousClass016 r5) {
        String str = (String) r5.get("REPORT_ID");
        if (str == null || str.length() == 0) {
            for (Map.Entry entry : this.A0M.entrySet()) {
                if (r5.get(entry.getKey()) == null) {
                    r5.put(entry.getKey(), entry.getValue());
                }
            }
        }
        String str2 = this.A0K;
        String str3 = (String) r5.get("UID");
        if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            r5.put("UID", str2);
        }
    }

    public final void A0R(File file, C04110Cl r5) {
        Object obj = A0S;
        synchronized (obj) {
            try {
                obj.notify();
            } catch (Throwable th) {
                while (true) {
                    th = th;
                }
            }
        }
        synchronized (A0W) {
            try {
                A0A(this, AnonymousClass01N.ANR_REPORT, (String) null, file, r5);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public final void A0S(String str, AnonymousClass01A r4) {
        synchronized (this.A04) {
            this.A04.put(str, r4);
        }
    }

    public static AnonymousClass01T A03(BufferedInputStream bufferedInputStream) {
        String str;
        String A052 = A05(bufferedInputStream);
        String str2 = null;
        if (!TextUtils.isEmpty(A052)) {
            str = A05(bufferedInputStream);
        } else {
            str = null;
        }
        if (bufferedInputStream.markSupported()) {
            bufferedInputStream.mark(1024);
            byte[] bArr = new byte[1024];
            int read = bufferedInputStream.read(bArr, 0, 1024);
            if (read > 0) {
                Matcher matcher = A0X.matcher(new String(bArr, 0, read));
                if (matcher.find()) {
                    str2 = matcher.group(1);
                }
            }
            bufferedInputStream.reset();
        }
        AnonymousClass01T r0 = new AnonymousClass01T();
        r0.A01 = A052;
        r0.A02 = str;
        r0.A00 = str2;
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0558, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0559, code lost:
        if (r2 != null) goto L_0x055b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0567, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:?, code lost:
        r25.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x056b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01d2, code lost:
        if (r1.equals("false") == false) goto L_0x01d4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:294:0x055e */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0305 A[Catch:{ IOException -> 0x0394 }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x030e A[Catch:{ IOException -> 0x0394 }] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x03a7 A[SYNTHETIC, Splitter:B:174:0x03a7] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x03f1 A[SYNTHETIC, Splitter:B:198:0x03f1] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0483 A[ADDED_TO_REGION, Catch:{ 02e -> 0x04cf, all -> 0x04cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x04b7 A[Catch:{ 02e -> 0x04cf, all -> 0x04cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x051a A[SYNTHETIC, Splitter:B:266:0x051a] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x053e  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x055f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x04c9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0092 A[ADDED_TO_REGION, Catch:{ all -> 0x055e }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009d A[Catch:{ all -> 0x055e }] */
    public final void A0T(AnonymousClass01N... r32) {
        File file;
        C021501g A002;
        int i;
        File[] listFiles;
        AnonymousClass01e r2;
        AnonymousClass016 r9;
        int i2;
        String str;
        File fileStreamPath;
        HashSet hashSet;
        BufferedWriter bufferedWriter;
        AnonymousClass038 A032;
        Integer num;
        Integer num2;
        boolean z;
        String str2;
        NetworkInfo networkInfo;
        Object obj = A0S;
        synchronized (obj) {
            obj.notify();
        }
        AnonymousClass01N[] r0 = r32;
        A0M(r0);
        int length = r0.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            AnonymousClass01N r3 = r32[i4];
            int max = Math.max(0, Integer.MAX_VALUE - i3);
            if (r3.A02 != null) {
                i = A01(this, max, r3, false);
            } else if (A0O(r3)) {
                i = 0;
            } else {
                if (r3 != AnonymousClass01N.NATIVE_CRASH_REPORT || !AnonymousClass0FU.A08(this.A0B, "android_acra_save_native_reports")) {
                    file = null;
                } else {
                    try {
                        file = new File(this.A0B.getDir(r3.A04, 0).getParent(), "reported_crashes");
                        try {
                            if (!file.exists()) {
                                file.mkdir();
                            }
                        } catch (NullPointerException e) {
                            e = e;
                            AnonymousClass0DB.A0P("ACRA", e, "Failed to create backup directory %s", "reported_crashes");
                            A002 = AnonymousClass01N.A00(r3, this.A0B);
                            int i5 = 0;
                            int i6 = 0;
                            i = 0;
                            while (A002.hasNext()) {
                                C021501g.A00(A002);
                                C021501g r02 = A002;
                                r2 = r02.A00;
                                if (r2 == null) {
                                }
                            }
                            A002.close();
                            Arrays.sort(listFiles, new AnonymousClass01G(this));
                            int i7 = 0;
                            while (r12 < r10) {
                            }
                            i3 += i;
                        }
                    } catch (NullPointerException e2) {
                        e = e2;
                        file = null;
                        AnonymousClass0DB.A0P("ACRA", e, "Failed to create backup directory %s", "reported_crashes");
                        A002 = AnonymousClass01N.A00(r3, this.A0B);
                        int i52 = 0;
                        int i62 = 0;
                        i = 0;
                        while (A002.hasNext()) {
                        }
                        A002.close();
                        Arrays.sort(listFiles, new AnonymousClass01G(this));
                        int i72 = 0;
                        while (r12 < r10) {
                        }
                        i3 += i;
                    }
                }
                A002 = AnonymousClass01N.A00(r3, this.A0B);
                int i522 = 0;
                int i622 = 0;
                i = 0;
                while (A002.hasNext() && i622 < max) {
                    C021501g.A00(A002);
                    C021501g r022 = A002;
                    r2 = r022.A00;
                    if (r2 == null) {
                        r022.A00 = null;
                        int i8 = i522 + 1;
                        if (i522 >= 5) {
                            A0D(r2.A00);
                        } else {
                            try {
                                boolean A0N2 = A0N(r3);
                                AnonymousClass016 A022 = A02(this, r2.A00, r2.A01, r3, r3.A01, A0N2);
                                AnonymousClass016 r29 = A022;
                                if (A022 != null) {
                                    try {
                                        if (r3 == AnonymousClass01N.NATIVE_CRASH_REPORT) {
                                            if (!A0N2) {
                                                Context context = this.A0B;
                                                AnonymousClass016 r18 = r29;
                                                if (this.A0F.A03("CORE_DUMP")) {
                                                    File file2 = new File(context.getApplicationInfo().dataDir, "core");
                                                    if (file2.exists() && file2.length() != 0) {
                                                        if ("x86".contains("64")) {
                                                            str2 = "/system/bin/app_process64";
                                                        } else {
                                                            str2 = "/system/bin/app_process32";
                                                        }
                                                        File file3 = new File(str2);
                                                        if (!file3.exists()) {
                                                            file3 = new File("/system/bin/app_process");
                                                        }
                                                        if (file3.exists() && Math.abs(file2.lastModified() - r2.A00.lastModified()) <= 60000) {
                                                            boolean z2 = false;
                                                            try {
                                                                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                                                                if (!(connectivityManager == null || (networkInfo = connectivityManager.getNetworkInfo(1)) == null || !networkInfo.isConnected())) {
                                                                    z2 = true;
                                                                }
                                                            } catch (Exception unused) {
                                                            }
                                                            if (z2) {
                                                                long currentTimeMillis = System.currentTimeMillis();
                                                                long j = currentTimeMillis - 86400000;
                                                                File file4 = new File(context.getApplicationInfo().dataDir, "core_dump_proccessed");
                                                                if (!file4.exists() || file4.lastModified() <= j) {
                                                                    FileInputStream fileInputStream = new FileInputStream(file2);
                                                                    Map map = r18.A03;
                                                                    file2.length();
                                                                    map.put("CORE_DUMP", new C025302s(fileInputStream, true));
                                                                    FileInputStream fileInputStream2 = new FileInputStream(file3);
                                                                    Map map2 = r18.A03;
                                                                    file3.length();
                                                                    map2.put("APP_PROCESS_FILE", new C025302s(fileInputStream2, true));
                                                                    if (!file4.exists()) {
                                                                        new FileOutputStream(file4).close();
                                                                    } else {
                                                                        file4.setLastModified(currentTimeMillis);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            try {
                                                AnonymousClass03A r92 = new AnonymousClass03A(r2.A01);
                                                String A052 = r92.A05("APP_STARTED_IN_BACKGROUND");
                                                if (A052 != null) {
                                                    z = true;
                                                }
                                                z = false;
                                                String A042 = r92.A04(-87110452);
                                                if (!((A042 == null || A042.indexOf("Resumed") == -1) && (!z || A042 == null || A042.indexOf("\"activities\":[]") == -1))) {
                                                    this.A0B.getSharedPreferences("FacebookApplication", 0).edit().putLong("crash_foreground_timestamp", r2.A00.lastModified()).commit();
                                                }
                                            } catch (Exception e3) {
                                                A0I("Error writing into the SharedPreferences", e3);
                                            }
                                            AnonymousClass03A r7 = new AnonymousClass03A(r2.A01);
                                            String A053 = r7.A05("session_id");
                                            if (!TextUtils.isEmpty(A053)) {
                                                r29.put("ASL_SESSION_ID", A053);
                                            }
                                            String A054 = r7.A05("is_first_run_after_upgrade");
                                            if (!TextUtils.isEmpty(A054)) {
                                                r29.put("is_first_run_after_upgrade", A054);
                                            }
                                            String A055 = r7.A05("should_report_disk_info_native");
                                            if (!TextUtils.isEmpty(A055)) {
                                                r29.put("should_report_disk_info_native", A055);
                                            }
                                            String A056 = r7.A05("no_device_memory");
                                            if (!TextUtils.isEmpty(A056)) {
                                                r29.put("no_device_memory", A056);
                                            }
                                            AnonymousClass038 A033 = AnonymousClass03A.A03(r7, -87110917);
                                            if (A033 == null || A033.A01 != 4) {
                                                num2 = null;
                                                num = null;
                                            } else {
                                                r7.A00.seek((long) A033.A00);
                                                num2 = Integer.valueOf(AnonymousClass03A.A00(r7));
                                                num = num2;
                                            }
                                            if (num2 != null) {
                                                r29.put("APP_VERSION_CODE", num.toString());
                                            }
                                            String A043 = r7.A04(-87110916);
                                            if (!TextUtils.isEmpty(A043)) {
                                                r29.put("APP_VERSION_NAME", A043);
                                            }
                                            String A057 = r7.A05("breakpad_lib_name");
                                            if (!TextUtils.isEmpty(A057)) {
                                                r29.put("BREAKPAD_LIB_NAME", A057);
                                            }
                                        }
                                        if (r3 == AnonymousClass01N.NATIVE_CRASH_REPORT) {
                                            try {
                                                str = new AnonymousClass03A(r2.A01).A05("logcatFileName");
                                            } catch (IOException e4) {
                                                AnonymousClass0DB.A0P("ACRA", e4, "Failed to find logcat file %s", r2.A00);
                                            }
                                            fileStreamPath = this.A0B.getFileStreamPath("crash_dump_sys_libs");
                                            if (!fileStreamPath.exists()) {
                                                try {
                                                    fileStreamPath.createNewFile();
                                                } catch (IOException e5) {
                                                    AnonymousClass0DB.A0M("ACRA", e5, "Failed to create GLC Lib file");
                                                }
                                            }
                                            AnonymousClass03A r72 = new AnonymousClass03A(r2.A01);
                                            A032 = AnonymousClass03A.A03(r72, 4);
                                            if (A032 != null) {
                                                AnonymousClass0DB.A0D("MinidumpReader", "Stream is Null");
                                                hashSet = null;
                                                BufferedReader bufferedReader = null;
                                                if (hashSet == null || hashSet.isEmpty()) {
                                                    hashSet = null;
                                                } else {
                                                    try {
                                                        A0U.readLock().lock();
                                                        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(fileStreamPath));
                                                        while (true) {
                                                            try {
                                                                String readLine = bufferedReader2.readLine();
                                                                if (readLine == null) {
                                                                    break;
                                                                } else if (hashSet.contains(readLine)) {
                                                                    hashSet.remove(readLine);
                                                                }
                                                            } catch (IOException e6) {
                                                                e = e6;
                                                                bufferedReader = bufferedReader2;
                                                                try {
                                                                    AnonymousClass0DB.A0M("ACRA", e, "GLC getNewLibs IO Exception");
                                                                    A0C(bufferedReader);
                                                                    A0U.readLock().unlock();
                                                                    if (hashSet != null) {
                                                                    }
                                                                    String str3 = str;
                                                                    r9 = r29;
                                                                    i2 = 1;
                                                                    i += A00(r3, r9, r2, (C04110Cl) null);
                                                                    if (r3 == AnonymousClass01N.NATIVE_CRASH_REPORT) {
                                                                    }
                                                                    r2.A00.getCanonicalPath();
                                                                    A0D(r2.A00);
                                                                    if (str != null) {
                                                                    }
                                                                    i622++;
                                                                    A07(r29);
                                                                    if (r2 == null) {
                                                                    }
                                                                    r2.close();
                                                                    i522 = i8;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    A0C(bufferedReader);
                                                                    A0U.readLock().unlock();
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                bufferedReader = bufferedReader2;
                                                                A0C(bufferedReader);
                                                                A0U.readLock().unlock();
                                                                throw th;
                                                            }
                                                        }
                                                        A0C(bufferedReader2);
                                                    } catch (IOException e7) {
                                                        e = e7;
                                                        AnonymousClass0DB.A0M("ACRA", e, "GLC getNewLibs IO Exception");
                                                        A0C(bufferedReader);
                                                        A0U.readLock().unlock();
                                                        if (hashSet != null) {
                                                        }
                                                        String str32 = str;
                                                        r9 = r29;
                                                        i2 = 1;
                                                        i += A00(r3, r9, r2, (C04110Cl) null);
                                                        if (r3 == AnonymousClass01N.NATIVE_CRASH_REPORT) {
                                                        }
                                                        r2.A00.getCanonicalPath();
                                                        A0D(r2.A00);
                                                        if (str != null) {
                                                        }
                                                        i622++;
                                                        A07(r29);
                                                        if (r2 == null) {
                                                        }
                                                        r2.close();
                                                        i522 = i8;
                                                    }
                                                    A0U.readLock().unlock();
                                                }
                                                if (hashSet != null) {
                                                    if (!hashSet.isEmpty()) {
                                                        BufferedWriter bufferedWriter2 = null;
                                                        try {
                                                            A0U.writeLock().lock();
                                                            bufferedWriter = new BufferedWriter(new FileWriter(fileStreamPath, true), hashSet.size());
                                                        } catch (IOException e8) {
                                                            e = e8;
                                                            try {
                                                                AnonymousClass0DB.A0M("ACRA", e, "GLC file to write Exception");
                                                                A0C(bufferedWriter2);
                                                                A0U.writeLock().unlock();
                                                                String str322 = str;
                                                                r9 = r29;
                                                                i2 = 1;
                                                                i += A00(r3, r9, r2, (C04110Cl) null);
                                                                if (r3 == AnonymousClass01N.NATIVE_CRASH_REPORT) {
                                                                }
                                                                r2.A00.getCanonicalPath();
                                                                A0D(r2.A00);
                                                                if (str != null) {
                                                                }
                                                                i622++;
                                                                A07(r29);
                                                                if (r2 == null) {
                                                                }
                                                                r2.close();
                                                                i522 = i8;
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                A0C(bufferedWriter2);
                                                                A0U.writeLock().unlock();
                                                                throw th;
                                                            }
                                                        }
                                                        try {
                                                            Iterator it = hashSet.iterator();
                                                            while (it.hasNext()) {
                                                                bufferedWriter.write(AnonymousClass000.A0E((String) it.next(), "\n"));
                                                            }
                                                            A0C(bufferedWriter);
                                                        } catch (IOException e9) {
                                                            e = e9;
                                                            bufferedWriter2 = bufferedWriter;
                                                            AnonymousClass0DB.A0M("ACRA", e, "GLC file to write Exception");
                                                            A0C(bufferedWriter2);
                                                            A0U.writeLock().unlock();
                                                            String str3222 = str;
                                                            r9 = r29;
                                                            i2 = 1;
                                                            i += A00(r3, r9, r2, (C04110Cl) null);
                                                            if (r3 == AnonymousClass01N.NATIVE_CRASH_REPORT) {
                                                            }
                                                            r2.A00.getCanonicalPath();
                                                            A0D(r2.A00);
                                                            if (str != null) {
                                                            }
                                                            i622++;
                                                            A07(r29);
                                                            if (r2 == null) {
                                                            }
                                                            r2.close();
                                                            i522 = i8;
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            bufferedWriter2 = bufferedWriter;
                                                            A0C(bufferedWriter2);
                                                            A0U.writeLock().unlock();
                                                            throw th;
                                                        }
                                                        A0U.writeLock().unlock();
                                                    }
                                                }
                                                String str32222 = str;
                                                r9 = r29;
                                                i2 = 1;
                                                try {
                                                    i += A00(r3, r9, r2, (C04110Cl) null);
                                                    if (r3 == AnonymousClass01N.NATIVE_CRASH_REPORT || file == null || !file.exists()) {
                                                        r2.A00.getCanonicalPath();
                                                        A0D(r2.A00);
                                                    } else {
                                                        File file5 = new File(file, r2.A00.getName());
                                                        file5.delete();
                                                        r2.A00.renameTo(file5);
                                                        r2.A00.getCanonicalPath();
                                                        file5.getCanonicalPath();
                                                    }
                                                    if (str != null) {
                                                        A0D(new File(str32222));
                                                    }
                                                    i622++;
                                                    A07(r29);
                                                } catch (C023902e e10) {
                                                    e = e10;
                                                    Object[] objArr = new Object[i2];
                                                    objArr[0] = r2.A00;
                                                    AnonymousClass0DB.A0P("ACRA", e, "Failed to send crash attachment report %s", objArr);
                                                    if (r9 != null) {
                                                    }
                                                    r2.close();
                                                    A002.close();
                                                    Arrays.sort(listFiles, new AnonymousClass01G(this));
                                                    int i722 = 0;
                                                    while (r12 < r10) {
                                                    }
                                                    i3 += i;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    try {
                                                        Object[] objArr2 = new Object[i2];
                                                        objArr2[0] = r2.A00;
                                                        AnonymousClass0DB.A0P("ACRA", th, "Failed on crash attachment file %s", objArr2);
                                                        A0L(th, AnonymousClass000.A0J("ANRValidationError<", th.getClass().getSimpleName(), "::Non-cached>"), th.toString(), this);
                                                        A0D(r2.A00);
                                                        if (r9 != null) {
                                                        }
                                                        r2.close();
                                                        A002.close();
                                                        Arrays.sort(listFiles, new AnonymousClass01G(this));
                                                        int i7222 = 0;
                                                        while (r12 < r10) {
                                                        }
                                                        i3 += i;
                                                    } catch (Throwable th6) {
                                                        if (r9 != null) {
                                                            A07(r9);
                                                        }
                                                        throw th6;
                                                    }
                                                }
                                            } else {
                                                r72.A00.seek((long) A032.A00);
                                                int A003 = AnonymousClass03A.A00(r72);
                                                hashSet = new HashSet();
                                                int i9 = A032.A00;
                                                for (int i10 = 0; i10 < A003; i10++) {
                                                    r72.A00.seek((long) (i9 + 24));
                                                    AnonymousClass03A r03 = r72;
                                                    r03.A00.seek((long) AnonymousClass03A.A00(r03));
                                                    AnonymousClass03A r04 = r72;
                                                    AnonymousClass038 r12 = new AnonymousClass038((int) r04.A00.getFilePointer(), AnonymousClass03A.A00(r04));
                                                    r72.A00.seek((long) r12.A00);
                                                    int i11 = r12.A01;
                                                    byte[] bArr = new byte[i11];
                                                    byte[] bArr2 = new byte[(i11 >> 1)];
                                                    r72.A00.read(bArr);
                                                    for (int i12 = 0; i12 < (r12.A01 >> 1); i12++) {
                                                        bArr2[i12] = bArr[i12 << 1];
                                                    }
                                                    String str4 = new String(bArr2);
                                                    if (str4.startsWith("/system") && str4.endsWith(".so")) {
                                                        hashSet.add(str4);
                                                    }
                                                    i9 += 108;
                                                }
                                                BufferedReader bufferedReader3 = null;
                                                if (hashSet == null || hashSet.isEmpty()) {
                                                }
                                                if (hashSet != null) {
                                                }
                                                String str322222 = str;
                                                r9 = r29;
                                                i2 = 1;
                                                i += A00(r3, r9, r2, (C04110Cl) null);
                                                if (r3 == AnonymousClass01N.NATIVE_CRASH_REPORT) {
                                                }
                                                r2.A00.getCanonicalPath();
                                                A0D(r2.A00);
                                                if (str != null) {
                                                }
                                                i622++;
                                                A07(r29);
                                            }
                                        }
                                        str = null;
                                        fileStreamPath = this.A0B.getFileStreamPath("crash_dump_sys_libs");
                                        if (!fileStreamPath.exists()) {
                                        }
                                        AnonymousClass03A r722 = new AnonymousClass03A(r2.A01);
                                        try {
                                            A032 = AnonymousClass03A.A03(r722, 4);
                                            if (A032 != null) {
                                            }
                                        } catch (IOException e11) {
                                            AnonymousClass0DB.A0M("MinidumpReader", e11, "getModuleList failed to read");
                                        }
                                    } catch (C023902e e12) {
                                        e = e12;
                                        r9 = r29;
                                        i2 = 1;
                                        Object[] objArr3 = new Object[i2];
                                        objArr3[0] = r2.A00;
                                        AnonymousClass0DB.A0P("ACRA", e, "Failed to send crash attachment report %s", objArr3);
                                        if (r9 != null) {
                                        }
                                        r2.close();
                                        A002.close();
                                        Arrays.sort(listFiles, new AnonymousClass01G(this));
                                        int i72222 = 0;
                                        while (r12 < r10) {
                                        }
                                        i3 += i;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        r9 = r29;
                                        i2 = 1;
                                        Object[] objArr22 = new Object[i2];
                                        objArr22[0] = r2.A00;
                                        AnonymousClass0DB.A0P("ACRA", th, "Failed on crash attachment file %s", objArr22);
                                        A0L(th, AnonymousClass000.A0J("ANRValidationError<", th.getClass().getSimpleName(), "::Non-cached>"), th.toString(), this);
                                        A0D(r2.A00);
                                        if (r9 != null) {
                                        }
                                        r2.close();
                                        A002.close();
                                        Arrays.sort(listFiles, new AnonymousClass01G(this));
                                        int i722222 = 0;
                                        while (r12 < r10) {
                                        }
                                        i3 += i;
                                    }
                                }
                                if (r2 == null) {
                                    continue;
                                    i522 = i8;
                                }
                            } catch (C023902e e13) {
                                e = e13;
                                i2 = 1;
                                r9 = null;
                                Object[] objArr32 = new Object[i2];
                                objArr32[0] = r2.A00;
                                AnonymousClass0DB.A0P("ACRA", e, "Failed to send crash attachment report %s", objArr32);
                                if (r9 != null) {
                                    A07(r9);
                                }
                                r2.close();
                                A002.close();
                                Arrays.sort(listFiles, new AnonymousClass01G(this));
                                int i7222222 = 0;
                                while (r12 < r10) {
                                }
                                i3 += i;
                            } catch (Throwable th8) {
                                th = th8;
                                i2 = 1;
                                r9 = null;
                                Object[] objArr222 = new Object[i2];
                                objArr222[0] = r2.A00;
                                AnonymousClass0DB.A0P("ACRA", th, "Failed on crash attachment file %s", objArr222);
                                A0L(th, AnonymousClass000.A0J("ANRValidationError<", th.getClass().getSimpleName(), "::Non-cached>"), th.toString(), this);
                                A0D(r2.A00);
                                if (r9 != null) {
                                }
                                r2.close();
                                A002.close();
                                Arrays.sort(listFiles, new AnonymousClass01G(this));
                                int i72222222 = 0;
                                while (r12 < r10) {
                                }
                                i3 += i;
                            }
                        }
                        r2.close();
                        i522 = i8;
                    } else {
                        throw new NoSuchElementException();
                    }
                }
                A002.close();
                if (!(file == null || !file.exists() || (listFiles = file.listFiles()) == null)) {
                    Arrays.sort(listFiles, new AnonymousClass01G(this));
                    int i722222222 = 0;
                    for (File file6 : listFiles) {
                        i722222222++;
                        if (((long) i722222222) > 5) {
                            file6.delete();
                        }
                    }
                }
            }
            i3 += i;
        }
        if (!A0O(AnonymousClass01N.NATIVE_CRASH_REPORT)) {
            new File(this.A0B.getApplicationInfo().dataDir, "core").delete();
        }
    }
}
