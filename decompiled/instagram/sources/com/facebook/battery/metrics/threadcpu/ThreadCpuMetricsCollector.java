package com.facebook.battery.metrics.threadcpu;

import android.os.Process;
import android.os.StrictMode;
import android.util.Pair;
import com.facebook.common.stringformat.StringFormatUtil;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import p000X.AnonymousClass000;
import p000X.AnonymousClass01Y;
import p000X.AnonymousClass0DB;
import p000X.C020700w;
import p000X.C035307i;
import p000X.C035407j;
import p000X.C035607l;
import p000X.C474924f;
import p000X.C475024g;
import p000X.C475124h;

public final class ThreadCpuMetricsCollector extends C035407j {
    public final /* bridge */ /* synthetic */ C035307i A03() {
        return new C020700w();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0041 */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x006a A[SYNTHETIC, Splitter:B:45:0x006a] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0070 A[Catch:{ Exception -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00bb A[SYNTHETIC, Splitter:B:58:0x00bb] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cb  */
    public final boolean A04(C035307i r13) {
        File file;
        String str;
        String str2;
        C020700w r132 = (C020700w) r13;
        if (r132 != null) {
            HashMap hashMap = null;
            try {
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                HashMap hashMap2 = new HashMap();
                try {
                    file = new File("/proc/self/task");
                    try {
                        File[] listFiles = file.listFiles();
                        if (listFiles != null) {
                            for (File file2 : listFiles) {
                                try {
                                    RandomAccessFile randomAccessFile = new RandomAccessFile(StringFormatUtil.formatStrLocaleSafe("/proc/self/task/%s/comm", (Object) file2.getName()), "r");
                                    str2 = randomAccessFile.readLine();
                                    randomAccessFile.close();
                                    str = str2;
                                } catch (IOException unused) {
                                    str2 = null;
                                    str = null;
                                } catch (Throwable ) {
                                    throw th;
                                }
                                if (str2 != null) {
                                    hashMap2.put(file2.getName(), str);
                                }
                            }
                        }
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (Exception e) {
                        e = e;
                        try {
                            AnonymousClass0DB.A06(C474924f.A00, StringFormatUtil.formatStrLocaleSafe("Error getting threads from task directory: %s", (Object) "/proc/self/task"), e);
                            if (file != null) {
                            }
                            hashMap2 = null;
                            if (hashMap2 != null) {
                            }
                            if (hashMap == null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (file != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    file = null;
                    AnonymousClass0DB.A06(C474924f.A00, StringFormatUtil.formatStrLocaleSafe("Error getting threads from task directory: %s", (Object) "/proc/self/task"), e);
                    if (file != null) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                    hashMap2 = null;
                    if (hashMap2 != null) {
                    }
                    if (hashMap == null) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    file = null;
                    if (file != null) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                    throw th;
                }
                if (hashMap2 != null) {
                    HashMap hashMap3 = new HashMap();
                    for (Map.Entry entry : hashMap2.entrySet()) {
                        C475124h A01 = C475024g.A01(C475024g.A02(StringFormatUtil.formatStrLocaleSafe("/proc/%d/task/%s/stat", Integer.valueOf(Process.myPid()), entry.getKey())));
                        if (A01 != null) {
                            hashMap3.put(entry.getKey(), new Pair(entry.getValue(), A01));
                        }
                    }
                    hashMap = hashMap3;
                }
            } catch (Exception e3) {
                AnonymousClass0DB.A05(C474924f.A00, "Error getting thread level CPU Usage data", e3);
            }
            if (hashMap == null) {
                return false;
            }
            r132.A00.keySet().retainAll(hashMap.keySet());
            for (Map.Entry entry2 : hashMap.entrySet()) {
                try {
                    int parseInt = Integer.parseInt((String) entry2.getKey());
                    String str3 = (String) ((Pair) entry2.getValue()).first;
                    C475124h r2 = (C475124h) ((Pair) entry2.getValue()).second;
                    AnonymousClass01Y r3 = new AnonymousClass01Y();
                    r3.A03 = r2.A01;
                    r3.A02 = r2.A00;
                    HashMap hashMap4 = r132.A00;
                    Integer valueOf = Integer.valueOf(parseInt);
                    if (hashMap4.containsKey(valueOf)) {
                        ((AnonymousClass01Y) ((Pair) r132.A00.get(valueOf)).second).A06(r3);
                    } else {
                        r132.A00.put(valueOf, new Pair(str3, r3));
                    }
                } catch (NumberFormatException e4) {
                    C035607l.A00("com.facebook.battery.metrics.threadcpu.ThreadCpuMetricsCollector", AnonymousClass000.A0E("Thread Id is not an integer: ", (String) entry2.getKey()), e4);
                }
            }
            return true;
        }
        throw new IllegalArgumentException("Null value passed to getSnapshot!");
    }
}
