package p000X;

import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.common.dextricks.stats.ClassLoadingStats;
import com.facebook.common.perfcounter.PerfCounter;
import com.facebook.quicklog.PerformanceLoggingEvent;
import java.io.File;

/* renamed from: X.0dh  reason: invalid class name and case insensitive filesystem */
public final class C10680dh implements C05020Hn {
    public static final long A00 = ((AnonymousClass0IP.A00 | AnonymousClass0IP.A02) | AnonymousClass0IP.A03);

    public final String ATH() {
        return "ig_perf_stats";
    }

    public final void ABT(PerformanceLoggingEvent performanceLoggingEvent, Object obj, Object obj2) {
        long j;
        AnonymousClass07F r9 = (AnonymousClass07F) obj;
        if (performanceLoggingEvent.A06(AnonymousClass0IP.A00) && r9 != null && r9.A0F) {
            performanceLoggingEvent.A02("cpu_stats");
            performanceLoggingEvent.A03("start_pri", r9.A00);
            performanceLoggingEvent.A03("stop_pri", r9.A01);
            performanceLoggingEvent.A04("ps_cpu_ms", r9.A06);
            long j2 = r9.A09;
            if (j2 != -1) {
                performanceLoggingEvent.A04("th_cpu_ms", j2);
            }
            performanceLoggingEvent.A05("low_power_state", r9.A0D);
        }
        if (performanceLoggingEvent.A06(AnonymousClass0IP.A02) && r9 != null && r9.A0F) {
            performanceLoggingEvent.A02("io_stats");
            performanceLoggingEvent.A04("ps_flt", r9.A07);
            long j3 = r9.A0A;
            if (j3 != -1) {
                performanceLoggingEvent.A04("th_flt", j3);
            }
            performanceLoggingEvent.A03("class_load_attempts", r9.A0C.A00);
            performanceLoggingEvent.A03("dex_queries", r9.A0C.A02);
            performanceLoggingEvent.A03("class_loads_failed", r9.A0C.A01);
            performanceLoggingEvent.A03("locator_assists", r9.A0C.A04);
            performanceLoggingEvent.A03("wrong_dfa_guesses", r9.A0C.A03);
            performanceLoggingEvent.A03("class_hashmap_generate_successes", r9.A0C.A08);
            performanceLoggingEvent.A03("class_hashmap_generate_failures", r9.A0C.A07);
            performanceLoggingEvent.A03("class_hashmap_load_successes", r9.A0C.A06);
            performanceLoggingEvent.A03("class_hashmap_load_failures", r9.A0C.A05);
            long j4 = r9.A03;
            if (j4 != -1) {
                performanceLoggingEvent.A04("allocstall", j4);
            }
            long j5 = r9.A04;
            if (j5 != -1) {
                performanceLoggingEvent.A04("pages_in", j5);
            }
            long j6 = r9.A05;
            if (j6 != -1) {
                performanceLoggingEvent.A04("pages_out", j6);
            }
            performanceLoggingEvent.A04("ps_min_flt", r9.A08);
            if (r9.A0B == null) {
                j = -1;
            } else {
                AnonymousClass07D r1 = AnonymousClass07C.A00;
                r1.A00.block();
                j = r1.A03.get();
            }
            performanceLoggingEvent.A04("avail_disk_spc_kb", j);
        }
    }

    public final long ATI() {
        return A00;
    }

    public final Class AWe() {
        return AnonymousClass07F.class;
    }

    public final Object Bp1() {
        return null;
    }

    public final Object BpG() {
        int i;
        AnonymousClass07F r4 = new AnonymousClass07F();
        int myTid = Process.myTid();
        r4.A02 = myTid;
        r4.A00 = Process.getThreadPriority(myTid);
        r4.A06 = Process.getElapsedCpuTime();
        r4.A09 = SystemClock.currentThreadTimeMillis();
        long[] A002 = AnonymousClass07G.A00("/proc/self/stat");
        r4.A08 = A002[0];
        r4.A07 = A002[2];
        r4.A0A = AnonymousClass07G.A00(AnonymousClass000.A06("/proc/self/task/", Process.myTid(), "/stat"))[2];
        AnonymousClass07H A003 = AnonymousClass07I.A00();
        r4.A03 = A003.A00;
        r4.A04 = A003.A02;
        r4.A05 = A003.A04;
        ClassLoadingStats A004 = ClassLoadingStats.A00();
        r4.A0C = new ClassLoadingStats.SnapshotStats(A004.getClassLoadsAttempted(), A004.getClassLoadsFailed(), A004.getDexFileQueries(), A004.getLocatorAssistedClassLoads(), A004.getIncorrectDfaGuesses(), A004.getTurboLoaderMapGenerationSuccesses(), A004.getTurboLoaderMapGenerationFailures(), A004.getTurboLoaderClassLocationSuccesses(), A004.getTurboLoaderClassLocationFailures());
        if (AnonymousClass0YD.A02() && !r4.A0E) {
            boolean z = false;
            if (PerfCounter.A00 == -1) {
                if (!new File("/proc/sys/kernel/perf_event_paranoid").exists() || (!new File("/data/local/tmp/ctscan_test_running").exists() && !new File("/data/local/tmp/ctscan_perfcounter_collect").exists())) {
                    i = 0;
                } else {
                    i = 1;
                }
                PerfCounter.A00 = i;
            }
            if (PerfCounter.A00 == 1) {
                z = true;
            }
            if (z) {
                synchronized (PerfCounter.A02) {
                    int i2 = PerfCounter.A01;
                    if (i2 > 0) {
                        PerfCounter.A01 = i2 + 1;
                    } else {
                        if (!PerfCounter.A03) {
                            try {
                                AnonymousClass0YD.A01("perfcounter");
                                PerfCounter.A03 = true;
                            } catch (UnsatisfiedLinkError e) {
                                Log.e("PerfCounter", "Cannot find native library for PerfCounter", e);
                            } catch (Error | Exception e2) {
                                Log.e("PerfCounter", "Cannot Initialize PerfCounter due to unknown error", e2);
                            }
                        }
                        if (PerfCounter.nativeBegin()) {
                            PerfCounter.A01 = 1;
                        }
                    }
                }
            }
            AnonymousClass07F.A02(r4, false);
            r4.A0E = true;
        }
        r4.A0G = true;
        r4.A0F = false;
        r4.A01 = -1;
        return r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0130, code lost:
        if (r14.A02 == -1) goto L_0x0132;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b8  */
    public final void BqH(Object obj) {
        boolean z;
        long j;
        long j2;
        AnonymousClass07F r14 = (AnonymousClass07F) obj;
        if (r14 != null && r14.A0G && !r14.A0F) {
            int myTid = Process.myTid();
            r14.A01 = Process.getThreadPriority(myTid);
            r14.A06 = Process.getElapsedCpuTime() - r14.A06;
            long[] A002 = AnonymousClass07G.A00("/proc/self/stat");
            r14.A08 = A002[0] - r14.A08;
            r14.A07 = A002[2] - r14.A07;
            if (r14.A0E) {
                AnonymousClass07F.A02(r14, true);
                synchronized (PerfCounter.A02) {
                    int i = PerfCounter.A01;
                    if (i != 0) {
                        if (i == 1) {
                            PerfCounter.nativeEnd();
                        }
                        PerfCounter.A01--;
                    }
                }
                r14.A0E = false;
            }
            if (myTid == r14.A02) {
                r14.A09 = SystemClock.currentThreadTimeMillis() - r14.A09;
                r14.A0A = AnonymousClass07G.A00(AnonymousClass000.A06("/proc/self/task/", Process.myTid(), "/stat"))[2] - r14.A0A;
            } else {
                r14.A02 = -1;
                r14.A09 = -1;
                r14.A0A = -1;
            }
            if (!(r14.A03 == -1 && r14.A04 == -1 && r14.A05 == -1)) {
                AnonymousClass07H A003 = AnonymousClass07I.A00();
                long j3 = r14.A03;
                if (j3 != -1) {
                    long j4 = A003.A00;
                    if (j4 != -1) {
                        r14.A03 = j4 - j3;
                        j = r14.A04;
                        if (j != -1) {
                            long j5 = A003.A02;
                            if (j5 != -1) {
                                r14.A04 = j5 - j;
                                j2 = r14.A05;
                                if (j2 != -1) {
                                    long j6 = A003.A04;
                                    if (j6 != -1) {
                                        r14.A05 = j6 - j2;
                                    }
                                }
                                r14.A05 = -1;
                            }
                        }
                        r14.A04 = -1;
                        j2 = r14.A05;
                        if (j2 != -1) {
                        }
                        r14.A05 = -1;
                    }
                }
                r14.A03 = -1;
                j = r14.A04;
                if (j != -1) {
                }
                r14.A04 = -1;
                j2 = r14.A05;
                if (j2 != -1) {
                }
                r14.A05 = -1;
            }
            r14.A0B = new AnonymousClass07E();
            ClassLoadingStats A004 = ClassLoadingStats.A00();
            ClassLoadingStats.SnapshotStats snapshotStats = r14.A0C;
            r14.A0C = new ClassLoadingStats.SnapshotStats(A004.getClassLoadsAttempted() - snapshotStats.A00, A004.getClassLoadsFailed() - snapshotStats.A01, A004.getDexFileQueries() - snapshotStats.A02, A004.getLocatorAssistedClassLoads() - snapshotStats.A04, A004.getIncorrectDfaGuesses() - snapshotStats.A03, A004.getTurboLoaderMapGenerationSuccesses() - snapshotStats.A08, A004.getTurboLoaderMapGenerationFailures() - snapshotStats.A07, A004.getTurboLoaderClassLocationSuccesses() - snapshotStats.A06, A004.getTurboLoaderClassLocationFailures() - snapshotStats.A05);
            if (r14.A06 >= 0 && r14.A07 >= 0 && r14.A08 >= 0) {
                if (r14.A0F) {
                    z = true;
                }
                z = false;
                if (!z || (r14.A09 >= 0 && r14.A0A >= 0)) {
                    r14.A0F = true;
                    return;
                }
            }
            if (Log.isLoggable("PerfStats", 5)) {
                Log.w("PerfStats", "Negative values detected for PerfStats, discarding stats.");
            }
            AnonymousClass07F.A01(r14);
        }
    }

    public final Class AWF() {
        return AWe();
    }

    public final boolean AfH(C09980cT r2) {
        return r2.A01();
    }
}
