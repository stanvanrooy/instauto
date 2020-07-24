package com.instagram.debug.memorydump;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Debug;
import com.facebook.C0003R;
import java.io.File;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0JE;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass184;
import p000X.AnonymousClass236;
import p000X.AnonymousClass237;
import p000X.AnonymousClass24N;
import p000X.C05750Lu;
import p000X.C06080Nr;
import p000X.C06180Ob;
import p000X.C06190Oc;
import p000X.C06360Ot;
import p000X.C06610Ps;
import p000X.C251917r;
import p000X.C252017t;

public class MemoryDumpCreator {
    public static final String HPROF_ID_KEY = "hprof_id";
    public static final String HPROF_STATUS_KEY = "hprof";
    public static final String LEAK_SHARED_PREF_NAME = "leak_map";
    public static final Class TAG = MemoryDumpCreator.class;
    public static MemoryDumpCreator sInstance;
    public final C06180Ob mClock;
    public final Context mContext;
    public final C252017t mJobScheduler;
    public final MemoryDumpFileManager mMemoryDumpFileManager;
    public final SharedPreferences mSharedPrefMap = C05750Lu.A00(LEAK_SHARED_PREF_NAME);
    public String mUserId;

    private String generateDumpId() {
        return C06360Ot.formatString("%d_%s", Long.valueOf(System.currentTimeMillis()), UUID.randomUUID());
    }

    private void addMapEntry(String str, String str2) {
        this.mSharedPrefMap.edit().putString(str, str2).apply();
    }

    private String createMemoryDumpInternal(String str, String str2) {
        try {
            if (!this.mMemoryDumpFileManager.hasFreeSpace()) {
                AnonymousClass0QD.A01("hprof", "Failed - not enough free space");
                return null;
            } else if (!hasNoExistingDump()) {
                return null;
            } else {
                String dumpHprof = dumpHprof(this.mMemoryDumpFileManager.getHprofDirectory(), str, str2);
                if (isEligibleForUpload(this.mContext)) {
                    scheduleUpload(dumpHprof);
                }
                return dumpHprof;
            }
        } catch (Throwable th) {
            AnonymousClass0DB.A06(TAG, "Error writing Hprof dump", th);
            AnonymousClass0QD.A09("hprof", th);
            return null;
        }
    }

    public static String dumpHprof(String str, String str2, String str3) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdir();
        }
        AnonymousClass0QD.A00().BYg("hprof", "Started");
        String A05 = C06360Ot.formatString("%s/dump_%s_%s.hprof", str, str2, str3);
        Debug.dumpHprofData(A05);
        AnonymousClass0QD.A00().BYg("hprof", "Success");
        AnonymousClass0QD.A00().BYg(HPROF_ID_KEY, str3);
        return A05;
    }

    public static synchronized MemoryDumpCreator getInstance(Context context, String str) {
        MemoryDumpCreator memoryDumpCreator;
        synchronized (MemoryDumpCreator.class) {
            if (sInstance == null) {
                Context applicationContext = context.getApplicationContext();
                sInstance = new MemoryDumpCreator(applicationContext, str, C06190Oc.A00, new MemoryDumpFileManager(applicationContext, str));
            }
            memoryDumpCreator = sInstance;
        }
        return memoryDumpCreator;
    }

    private boolean hasNoExistingDump() {
        MemoryDumpFileManager memoryDumpFileManager = this.mMemoryDumpFileManager;
        File[] findDumps = memoryDumpFileManager.findDumps(memoryDumpFileManager.getHprofDirectory());
        if (findDumps == null || findDumps.length == 0) {
            return true;
        }
        return false;
    }

    public static synchronized void maybeUpdateUserId(String str) {
        synchronized (MemoryDumpCreator.class) {
            MemoryDumpCreator memoryDumpCreator = sInstance;
            if (memoryDumpCreator != null) {
                memoryDumpCreator.setUserId(str);
            }
        }
    }

    private void scheduleUploadIfNotScheduled() {
        boolean z;
        if (isEligibleForUpload(this.mContext) && Build.VERSION.SDK_INT >= 21) {
            Iterator<JobInfo> it = ((JobScheduler) this.mContext.getSystemService("jobscheduler")).getAllPendingJobs().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().getId() == C0003R.C0005id.memory_dump_upload_job_service_id) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                MemoryDumpFileManager memoryDumpFileManager = this.mMemoryDumpFileManager;
                File[] findDumps = memoryDumpFileManager.findDumps(memoryDumpFileManager.getHprofDirectory());
                if (findDumps != null && findDumps.length > 0) {
                    scheduleUpload(findDumps[0].getPath());
                }
            }
        }
    }

    public void setUserId(String str) {
        this.mUserId = str;
        this.mMemoryDumpFileManager.mUserId = str;
    }

    public MemoryDumpCreator(Context context, String str, C06180Ob r4, MemoryDumpFileManager memoryDumpFileManager) {
        this.mContext = context;
        this.mUserId = str;
        this.mClock = r4;
        this.mMemoryDumpFileManager = memoryDumpFileManager;
        this.mJobScheduler = new C251917r(context).A00();
        scheduleUploadIfNotScheduled();
    }

    public static boolean isEligibleForHeapDump() {
        if (C06610Ps.A02() || C06610Ps.A01()) {
            return true;
        }
        return false;
    }

    public static boolean isEligibleForUpload(Context context) {
        if ((C06610Ps.A02() || C06610Ps.A01()) && C06080Nr.A07(context)) {
            return true;
        }
        return false;
    }

    private void scheduleUpload(String str) {
        AnonymousClass236 A00 = AnonymousClass24N.A00();
        A00.A01(MemoryDumpUploadJob.EXTRA_FILE_PATH, str);
        A00.A01(MemoryDumpUploadJob.EXTRA_USER_ID, this.mUserId);
        AnonymousClass237 r4 = new AnonymousClass237(C0003R.C0005id.memory_dump_upload_job_service_id);
        r4.A00 = 2;
        r4.A05 = true;
        r4.A01 = TimeUnit.MINUTES.toMillis(5);
        r4.A03 = TimeUnit.HOURS.toMillis(6);
        r4.A04 = A00;
        this.mJobScheduler.A03(r4.A00());
    }

    public void createBetamapMemoryDump() {
        if (AnonymousClass0JE.A00()) {
            AnonymousClass184.A00().A02().A02("Daily");
        } else {
            createMemoryDumpInternal(MemoryDumpType.DAILY.getPatternPrefix(), generateDumpId());
        }
    }

    public void createCrashMemoryDump(Throwable th) {
        if (AnonymousClass0JE.A02()) {
            AnonymousClass184.A00();
            if (AnonymousClass184.A00().A04().A05()) {
                AnonymousClass184.A00().A02().A02("OOM");
                return;
            }
            return;
        }
        createMemoryDumpInternal(MemoryDumpType.CRASH.getPatternPrefix(), generateDumpId());
    }

    public String createLeakMemoryDump(String str) {
        String generateDumpId = generateDumpId();
        addMapEntry(generateDumpId, str);
        return createMemoryDumpInternal(MemoryDumpType.LEAK.getPatternPrefix(), generateDumpId);
    }
}
