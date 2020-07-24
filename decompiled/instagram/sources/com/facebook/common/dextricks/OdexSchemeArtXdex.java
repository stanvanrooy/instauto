package com.facebook.common.dextricks;

import android.content.Context;
import android.os.Build;
import android.os.StatFs;
import android.os.SystemClock;
import android.os.SystemProperties;
import android.text.TextUtils;
import com.facebook.common.dextricks.Dex2oatLogcatParser;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.DexUnpacker;
import com.facebook.common.dextricks.ExpectedFileInfo;
import com.facebook.common.dextricks.MultiDexClassLoader;
import com.facebook.common.dextricks.OdexScheme;
import com.facebook.common.dextricks.Prio;
import com.facebook.forker.C0024Fd;
import com.facebook.forker.Process;
import com.facebook.forker.ProcessBuilder;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0CD;
import p000X.AnonymousClass0FU;
import p000X.AnonymousClass0Y1;
import p000X.AnonymousClass0YV;
import p000X.C038408s;
import p000X.C03960Bo;
import p000X.C04100Ck;
import p000X.C120125Dh;

public final class OdexSchemeArtXdex extends OdexSchemeArtTurbo {
    public static final boolean APPLY_MIRANDA_HACK = true;
    public static final String CREATED_BY_OATMEAL = "86827de6f1ef3407f8dc98b76382d3a6e0759ab3";
    public static final String DEX_MANIFEST_RESOURCE_PATH = "dex_manifest.txt";
    public static final String DISABLING_PGO = "OdexSchemeArtXdex_DisablingPGO";
    public static final String ENV_LD_PRELOAD = "LD_PRELOAD";
    public static final int MAX_OAT_OPTIMIZATION_ATTEMPTS = 3;
    public static final long MIN_DISK_FREE_FOR_MIXED_MODE = 419430400;
    public static final String MISSING_PGO_SOFT_ERROR_CATEGORY = "OdexSchemeArtXdex_MissingPGO";
    public static final String MIXED_MODE_DATA_RESOURCE_PATH = "mixed_mode.txt";
    public static final int OREO_SDK_INT = 26;
    public static final String QUICK_DATA_RESOURCE_PATH = "oatmeal.bin";
    public static final String REGENERATE_SOFT_ERROR_CATEGORY = "OdexSchemeArtXdex_REGEN";
    public static final long STATE_DEX2OAT_CLASSPATH_SET = 2048;
    public static final long STATE_DEX2OAT_QUICKENING_NEEDED = 64;
    public static final long STATE_DEX2OAT_QUICK_ATTEMPTED = 512;
    public static final long STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED = 32768;
    public static final long STATE_DO_PERIODIC_PGO_COMP_FINISHED = 65536;
    public static final long STATE_DO_PERIODIC_PGO_COMP_NEEDED = 16384;
    public static final long STATE_MASK = 20720;
    public static final long STATE_MIXED_ATTEMPTED = 1024;
    public static final long STATE_MIXED_NEEDED = 128;
    public static final long STATE_OATMEAL_QUICKENING_NEEDED = 32;
    public static final long STATE_OATMEAL_QUICK_ATTEMPTED = 256;
    public static final long STATE_OPT_COMPLETED = 16;
    public static final long STATE_PGO_ATTEMPTED = 8192;
    public static final long STATE_PGO_NEEDED = 4096;
    public static final String TMP_DEX_MANIFEST_FILE = "art_dex_manifest";
    public static final String TMP_MIXED_MODE_DATA_FILE = "art_mixed_mode_data_input";
    public static final String TMP_QUICK_DATA_FILE = "art_quick_data_input";
    public final DexUnpacker mDexUnpacker;
    public final DexManifest.Dex[] mDexes;
    public boolean mEnableMemoryDex2OatHook;
    public boolean mEnableMemoryDex2OatHookInited = false;
    public final boolean mIsLoadable;
    public String mOatmealPath;
    public final AnonymousClass0CD mPGOProfileUtil;
    public final ResProvider mResProvider;
    public final ArrayList oatFiles;

    public class CriticalCannotTruncateDexesSection implements Closeable {
        public final boolean mHasMarked;
        public final File mRoot;

        public void close() {
            if (this.mHasMarked) {
                OdexSchemeArtXdex.clearCannotTruncateDexesFlag(this.mRoot);
            }
        }

        public CriticalCannotTruncateDexesSection(OdexSchemeArtXdex odexSchemeArtXdex, File file) {
            this(file, true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
            if (com.facebook.common.dextricks.OdexSchemeArtXdex.markCannotTruncateDexesFlag(r4) == false) goto L_0x0010;
         */
        public CriticalCannotTruncateDexesSection(File file, boolean z) {
            this.mRoot = file;
            boolean z2 = z ? true : z2;
            z2 = false;
            this.mHasMarked = z2;
        }
    }

    public class Dex2OatProgressListener implements DexStore.ExternalProcessProgressListener {
        public static final long CHECKPOINT_PERIOD = TimeUnit.MINUTES.toMillis(5);
        public static final String EVENT_NAME = "OptsvcEvent";
        public final Context mAppContext;
        public final int mAttemptNumber;
        public Integer mExitStatus;
        public final String mJobName;
        public long mLastCheckpointMs;
        public final long mStartTimeMs;

        private void convertDex2OatStatInfoToEventMap(Map map, Dex2oatLogcatParser.Dex2OatStatInfo dex2OatStatInfo) {
            String normalizeDex2OatStatType = normalizeDex2OatStatType(dex2OatStatInfo.statType);
            addDex2OatStatToEventMap(map, normalizeDex2OatStatType, OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_TOTAL_CASES, Integer.valueOf(dex2OatStatInfo.totalCases));
            addDex2OatStatToEventMap(map, normalizeDex2OatStatType, "success", Integer.valueOf(dex2OatStatInfo.success));
            addDex2OatStatToEventMap(map, normalizeDex2OatStatType, OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE, Integer.valueOf(dex2OatStatInfo.failure));
            addDex2OatStatToEventMap(map, normalizeDex2OatStatType, OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_PERCENT, Double.valueOf(dex2OatStatInfo.percent));
        }

        private String makeKeyNameFromDex2OatStatInfo(String str, String str2) {
            return AnonymousClass000.A0N("dex2oat_stat_", str, "_", str2);
        }

        private String normalizeDex2OatStatType(String str) {
            return str.replace(' ', '_');
        }

        public void logEvent(String str, Dex2oatLogcatParser dex2oatLogcatParser) {
            Set<Dex2oatLogcatParser.Dex2OatStatInfo> emptySet;
            if (this.mExitStatus == null) {
                Mlog.m35w("Bad call to logEvent, exit status not set", new Object[0]);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(OptSvcAnalyticsStore.LOGGING_KEY_JOB_NAME, this.mJobName);
            hashMap.put("step", "finish");
            hashMap.put("duration", Long.valueOf(SystemClock.uptimeMillis() - this.mStartTimeMs));
            hashMap.put(OptSvcAnalyticsStore.LOGGING_KEY_EXIT_CODE, this.mExitStatus);
            if (!TextUtils.isEmpty(str)) {
                hashMap.put(OptSvcAnalyticsStore.LOGGING_KEY_DETAIL_MSG, str);
            }
            hashMap.put(OptSvcAnalyticsStore.LOGGING_KEY_ATTEMPT_NUMBER, Integer.valueOf(this.mAttemptNumber));
            if (dex2oatLogcatParser != null) {
                emptySet = dex2oatLogcatParser.mDex2OatStatInfos;
            } else {
                emptySet = Collections.emptySet();
            }
            for (Dex2oatLogcatParser.Dex2OatStatInfo convertDex2OatStatInfoToEventMap : emptySet) {
                convertDex2OatStatInfoToEventMap(hashMap, convertDex2OatStatInfoToEventMap);
            }
            OptSvcAnalyticsStore.logEvent(this.mAppContext, EVENT_NAME, hashMap);
        }

        public Dex2OatProgressListener(Context context, String str, int i) {
            this.mAppContext = OdexSchemeArtXdex.getAppContext(context);
            this.mJobName = str;
            this.mAttemptNumber = i;
            long uptimeMillis = SystemClock.uptimeMillis();
            this.mStartTimeMs = uptimeMillis;
            this.mLastCheckpointMs = uptimeMillis;
        }

        private void addDex2OatStatToEventMap(Map map, String str, String str2, Object obj) {
            String makeKeyNameFromDex2OatStatInfo = makeKeyNameFromDex2OatStatInfo(str, str2);
            Mlog.safeFmt("Adding dex2oat stat key %s with %s", makeKeyNameFromDex2OatStatInfo, obj);
            map.put(makeKeyNameFromDex2OatStatInfo, obj);
        }

        public void onCheckpoint() {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.mLastCheckpointMs >= CHECKPOINT_PERIOD) {
                this.mLastCheckpointMs = uptimeMillis;
                HashMap hashMap = new HashMap();
                hashMap.put(OptSvcAnalyticsStore.LOGGING_KEY_JOB_NAME, this.mJobName);
                hashMap.put("step", "checkpoint");
                hashMap.put("duration", Long.valueOf(uptimeMillis - this.mStartTimeMs));
                hashMap.put(OptSvcAnalyticsStore.LOGGING_KEY_ATTEMPT_NUMBER, Integer.valueOf(this.mAttemptNumber));
                OptSvcAnalyticsStore.logEvent(this.mAppContext, EVENT_NAME, hashMap);
            }
        }

        public void onComplete(int i) {
            this.mExitStatus = Integer.valueOf(i);
        }
    }

    public interface DexSelector {
        boolean select(DexManifest.Dex dex);
    }

    public class ManifestEntry {
        public final boolean background;
        public final String canary;
        public final boolean coldstart;
        public final boolean extended;
        public final int ordinal;
        public final boolean primary;
        public final boolean scroll;

        public static ManifestEntry fromCSV(String str) {
            String[] split = str.split(",");
            int length = split.length;
            if (length >= 1) {
                String convertClassToDotForm = OdexSchemeArtXdex.convertClassToDotForm(split[0]);
                int i = 1;
                int i2 = -1;
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                boolean z5 = false;
                while (i < length) {
                    String[] split2 = split[i].split("=");
                    if (split2.length == 2) {
                        String str2 = split2[0];
                        if (str2.equals("primary")) {
                            z = false;
                            if (Integer.valueOf(split2[1]).intValue() == 1) {
                                z = true;
                            }
                        } else if (str2.equals("extended")) {
                            z3 = false;
                            if (Integer.valueOf(split2[1]).intValue() == 1) {
                                z3 = true;
                            }
                        } else if (str2.equals("scroll")) {
                            z4 = false;
                            if (Integer.valueOf(split2[1]).intValue() == 1) {
                                z4 = true;
                            }
                        } else if (str2.equals("coldstart")) {
                            z2 = false;
                            if (Integer.valueOf(split2[1]).intValue() == 1) {
                                z2 = true;
                            }
                        } else if (str2.equals(AppStateModule.APP_STATE_BACKGROUND)) {
                            z5 = false;
                            if (Integer.valueOf(split2[1]).intValue() == 1) {
                                z5 = true;
                            }
                        } else if (str2.equals("ordinal")) {
                            i2 = Integer.valueOf(split2[1]).intValue();
                        }
                        i++;
                    }
                }
                return new ManifestEntry(convertClassToDotForm, i2, z, z2, z3, z4, z5);
            }
            return null;
        }

        public ManifestEntry(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.canary = str;
            this.ordinal = i;
            this.primary = z;
            this.coldstart = z2;
            this.extended = z3;
            this.scroll = z4;
            this.background = z5;
        }
    }

    public static boolean anyOptimizationDone(long j) {
        return (j & STATE_MASK) != 0;
    }

    public static void clearCannotTruncateDexesFlag(File file) {
        Mlog.safeFmt("Clearing flag to not truncate dex files at root: %s", file.getAbsolutePath());
        File makeIgnoreDirtyCheckFile = DexStoreUtils.makeIgnoreDirtyCheckFile(file, "cannot_trunc_dex.flg");
        if (!makeIgnoreDirtyCheckFile.exists()) {
            Mlog.m35w("Dex truncation file does not exist. This is likely an error", new Object[0]);
        }
        if (!makeIgnoreDirtyCheckFile.delete() && makeIgnoreDirtyCheckFile.exists()) {
            Mlog.m35w("Was not able to delete cannot truncate dexes file", new Object[0]);
        }
    }

    private List getMixedModeDexInfos(List list, DexStore.TmpDir tmpDir, boolean z, byte b, DexManifest.Dex[] dexArr) {
        DexStore.TmpDir tmpDir2 = tmpDir;
        File extractResourceFile = extractResourceFile(DEX_MANIFEST_RESOURCE_PATH, tmpDir.directory, TMP_DEX_MANIFEST_FILE);
        List list2 = list;
        DexManifest.Dex[] dexArr2 = dexArr;
        boolean z2 = z;
        if (extractResourceFile == null) {
            Mlog.safeFmt("[opt][mixed_mode] Getting mixed mode dex infos in legacy mode", new Object[0]);
            return getMixedModeDexInfosLegacy(list, tmpDir, z, dexArr);
        }
        Mlog.safeFmt("[opt][mixed_mode] Getting mixed mode dex infos in manifest mode", new Object[0]);
        return getMixedModeDexInfosManifest(extractResourceFile, list2, tmpDir2, z2, dexSelectorForMultidexCompilationStrategy(extractResourceFile, b), dexArr2);
    }

    private List getMixedModeDexInfosManifest(File file, List list, DexStore.TmpDir tmpDir, boolean z, DexSelector dexSelector, DexManifest.Dex[] dexArr) {
        List list2 = null;
        if (z) {
            Mlog.safeFmt("[opt][mixed_mode] mixed mode must also take into account pgo compilation: %s", list.toString());
            list2 = ExpectedFileInfo.setCompTypeIfUnknown(list, ExpectedFileInfo.CompilationType.PGO);
        }
        return makeMixedModeFileList(dexArr, dexSelector, list2);
    }

    public static boolean markCannotTruncateDexesFlag(File file) {
        Mlog.safeFmt("Marking cannot truncate dex files at root: %s", file.getAbsolutePath());
        File makeIgnoreDirtyCheckFile = DexStoreUtils.makeIgnoreDirtyCheckFile(file, "cannot_trunc_dex.flg");
        if (makeIgnoreDirtyCheckFile.exists()) {
            Mlog.m35w("Dex truncation file already exists. This is likely an error", new Object[0]);
        }
        try {
            boolean createNewFile = makeIgnoreDirtyCheckFile.createNewFile();
            if (createNewFile) {
                return createNewFile;
            }
            Mlog.m35w("Was not successful creating cannot truncate dexes file", new Object[0]);
            return createNewFile;
        } catch (IOException e) {
            Mlog.m36w(e, "Was not able to create cannot truncate dexes file", new Object[0]);
            return false;
        }
    }

    public static boolean markedToTryPgoProfileRecompilation(long j) {
        return (j & STATE_DO_PERIODIC_PGO_COMP_NEEDED) != 0;
    }

    public static boolean mixedNeeded(long j) {
        return (j & 128) != 0;
    }

    public static boolean optimizationCompleted(long j) {
        return (j & 16) != 0;
    }

    private boolean optimizeOatmealForOreo(Context context, Renamer renamer, DexStore dexStore, DexStore.OptimizationSession optimizationSession, DexStore.TmpDir tmpDir, File file, List list) {
        File file2 = file;
        String oreoOdexOutputDirectory = OdexSchemeArtTurbo.getOreoOdexOutputDirectory(file2, true);
        DexStore.TmpDir tmpDir2 = tmpDir;
        ProcessBuilder processBuilder = new ProcessBuilder(getOatmealPath(tmpDir2), "--write-elf", "--build", AnonymousClass000.A0E("--arch=", OdexSchemeArtTurbo.getArch()), AnonymousClass000.A0E("--art-image-location=", getArtImageLocation()), AnonymousClass000.A0J("--oat=", tmpDir2.directory.getPath(), "/"), AnonymousClass000.A0E("--oat-version=", getOatVersion()));
        processBuilder.setenv("LD_LIBRARY_PATH", AnonymousClass0Y1.A02());
        Context context2 = context;
        processBuilder.mTmpDir = ProcessBuilder.genDefaultTmpDir(getAppContext(context2));
        if (DalvikInternals.detectSamsungOatFormat()) {
            processBuilder.mArgv.add("--samsung-oatformat");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ExpectedFileInfo expectedFileInfo = (ExpectedFileInfo) it.next();
            processBuilder.mArgv.add(AnonymousClass000.A0E("--dex=", expectedFileInfo.getFile(file2).getPath()));
            String oatNameFromExpectedFileInfo = oatNameFromExpectedFileInfo(expectedFileInfo);
            String vdexNameFromOdexName = vdexNameFromOdexName(oatNameFromExpectedFileInfo);
            File file3 = new File(oreoOdexOutputDirectory, oatNameFromExpectedFileInfo);
            File file4 = new File(tmpDir2.directory, oatNameFromExpectedFileInfo);
            Renamer renamer2 = renamer;
            renamer2.addFile(file4, file3);
            renamer2.addFile(new File(tmpDir2.directory, vdexNameFromOdexName), new File(oreoOdexOutputDirectory, vdexNameFromOdexName));
        }
        Mlog.safeFmt("oatmeal: %s", processBuilder);
        startOptimizerProcess(processBuilder, context2, "oatmeal", optimizationSession, (Dex2oatLogcatParser) null, tmpDir2);
        return true;
    }

    public static boolean quickeningNeeded(long j) {
        long j2 = j & STATE_MASK;
        return j2 == 32 || j2 == 64;
    }

    public String getSchemeName() {
        return "OdexSchemeArtXdex";
    }

    public OdexScheme.NeedOptimizationState needOptimization(long j, DexStore.Config config, DexStore.OptimizationHistoryLog optimizationHistoryLog) {
        boolean optimizationCompleted = optimizationCompleted(j);
        Mlog.safeFmt("NeedOptimization: opt complete: %s last scheme: %s pgo: %s opt history: %s", Boolean.valueOf(optimizationCompleted), Boolean.valueOf(optimizationCompleted(optimizationHistoryLog.schemeStatus)), Boolean.valueOf(config.tryPeriodicPgoCompilation), optimizationHistoryLog);
        if (!config.tryPeriodicPgoCompilation || !optimizationHistoryLog.lastCompilationSessionWasASuccess()) {
            return OdexScheme.NeedOptimizationState.shouldOptimize(!optimizationCompleted);
        }
        if (!optimizationCompleted(optimizationHistoryLog.schemeStatus)) {
            return OdexScheme.NeedOptimizationState.NEED_OPTIMIZATION;
        }
        long timeDeltaFromLastCompilationSessionMs = optimizationHistoryLog.timeDeltaFromLastCompilationSessionMs();
        Mlog.safeFmt("NeedOptimization: timeDelta %d ms min interval: %d ms", Long.valueOf(timeDeltaFromLastCompilationSessionMs), Long.valueOf(config.minTimeBetweenPgoCompilationMs));
        if (timeDeltaFromLastCompilationSessionMs == -1 || timeDeltaFromLastCompilationSessionMs < config.minTimeBetweenPgoCompilationMs) {
            return OdexScheme.NeedOptimizationState.NO_OPTIMIZATION_NEEDED;
        }
        Mlog.safeFmt("NeedOptimization: Time to run additional pgo optimizations", new Object[0]);
        return OdexScheme.NeedOptimizationState.NEED_REOPTIMIZATION;
    }

    public final class Dex2OatHookInfo {
        public final String envFlag;
        public final String libName;

        public Dex2OatHookInfo(String str, String str2) {
            this.libName = str;
            this.envFlag = str2;
        }
    }

    public class OptimizationStateHolder {
        public long status;
        public long statusIntent;
        public boolean success;

        public OptimizationStateHolder(boolean z, long j, long j2) {
            this.success = z;
            this.status = j;
            this.statusIntent = j2;
        }
    }

    public class Renamer {
        public ArrayList mDestFiles = new ArrayList();
        public ArrayList mSourceFiles = new ArrayList();
        public final DexStore.TmpDir mTmpDir;

        public void addFile(File file, File file2) {
            Mlog.safeFmt("Queueing Rename of src %s to dest %s", file.getAbsolutePath(), file2.getAbsolutePath());
            this.mSourceFiles.add(file);
            this.mDestFiles.add(file2);
        }

        public void renameOrThrow() {
            for (int i = 0; i < this.mSourceFiles.size(); i++) {
                File file = (File) this.mSourceFiles.get(i);
                File file2 = (File) this.mDestFiles.get(i);
                Mlog.safeFmt("Renaming %s to %s", file, file2);
                C0015Fs.renameOrThrow(file, file2);
            }
        }

        public void reset() {
            Mlog.safeFmt("Resetting Renamer", new Object[0]);
            this.mSourceFiles.clear();
            this.mDestFiles.clear();
        }

        public Renamer(DexStore.TmpDir tmpDir) {
            this.mTmpDir = tmpDir;
        }
    }

    public static void addOldPgoDex2OatParams(ProcessBuilder processBuilder) {
        if (!AnonymousClass0CD.A07 && AnonymousClass0CD.A06) {
            processBuilder.mArgv.add("--compiler-backend=Quick");
            processBuilder.mArgv.add("--top-k-profile-threshold=100.0");
        }
    }

    public static boolean anyCompilationNeeded(DexStore.Config config) {
        if (config.enableMixedMode || config.enableMixedModePgo || config.tryPeriodicPgoCompilation) {
            return true;
        }
        return false;
    }

    public static List convertCopiedDexInfoToExpectedDexInfo(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ExpectedFileInfo((DexUnpacker.CopiedDexInfo) it.next()));
        }
        return arrayList;
    }

    public static String getBootClassPathValue(DexStore dexStore, boolean z) {
        String str = System.getenv("BOOTCLASSPATH");
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        File[] dependencyOdexFiles = dexStore.getDependencyOdexFiles();
        for (int i = 0; i < dependencyOdexFiles.length; i += 2) {
            if (sb.length() > 0) {
                sb.append(":");
            }
            sb.append(dependencyOdexFiles[i].getAbsoluteFile());
        }
        return sb.toString();
    }

    public static File getCannotTruncateDexFlagFile(File file) {
        return DexStoreUtils.makeIgnoreDirtyCheckFile(file, "cannot_trunc_dex.flg");
    }

    public static boolean getCannotTruncateDexesFlag(File file) {
        return DexStoreUtils.makeIgnoreDirtyCheckFile(file, "cannot_trunc_dex.flg").exists();
    }

    public static String getClassPathValue(DexStore dexStore, File file, List list) {
        StringBuilder sb = new StringBuilder();
        File[] dependencyOdexFiles = dexStore.getDependencyOdexFiles();
        for (int i = 0; i < dependencyOdexFiles.length; i += 2) {
            if (sb.length() > 0) {
                sb.append(":");
            }
            sb.append(dependencyOdexFiles[i].getAbsoluteFile());
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file2 = ((ExpectedFileInfo) it.next()).getFile(file);
            if (sb.length() > 0) {
                sb.append(":");
            }
            sb.append(file2.getAbsolutePath());
        }
        return sb.toString();
    }

    public static long getCompilationStatusFlags(DexStore.Config config) {
        long j;
        if (config.enableMixedMode) {
            j = 128;
        } else {
            j = 0;
        }
        if (config.tryPeriodicPgoCompilation) {
            j |= STATE_DO_PERIODIC_PGO_COMP_NEEDED;
        }
        if (config.enableMixedModePgo) {
            return j | STATE_PGO_NEEDED;
        }
        return j;
    }

    private String[] getDefaultDexNames() {
        return makeExpectedFileList(this.mDexes, 0);
    }

    private List getDexInfos(Context context, DexStore dexStore, DexStore.OptimizationSession optimizationSession, DexStore.Config config, DexStore.TmpDir tmpDir, Renamer renamer, List list, boolean z, boolean z2, byte b, File file, DexManifest.Dex[] dexArr, AtomicReference atomicReference) {
        List list2 = list;
        boolean z3 = z2;
        Mlog.safeFmt("[opt] dex2oat - get dex infos for mm: %s pgo comp: %s", Boolean.valueOf(z), Boolean.valueOf(z3));
        DexStore dexStore2 = dexStore;
        DexManifest.Dex[] dexArr2 = dexArr;
        File file2 = file;
        try {
            DexStore.TmpDir tmpDir2 = tmpDir;
            if (areDexesTruncated(dexStore2, file2, dexArr2)) {
                Mlog.safeFmt("Dexes appear truncated. Re-unpacking secondary dexes", new Object[0]);
                if (file2 == dexStore2.root) {
                    if (list != null) {
                        Mlog.safeFmt("Ignoring given expected dex file infos since dexes are truncated", new Object[0]);
                    }
                    DexStore.OptimizationSession optimizationSession2 = optimizationSession;
                    Context context2 = context;
                    list2 = getNewInitialOptimizedSecondaryDexes(context2, dexStore2, optimizationSession2, config, tmpDir2, renamer, atomicReference);
                } else {
                    throw new IllegalStateException("Can only copy temp secondary dexes from the root");
                }
            }
            if (z2) {
                ExpectedFileInfo.setCompTypeIfUnknown(list2, ExpectedFileInfo.CompilationType.PGO);
            }
            if (!z) {
                return list2;
            }
            return getMixedModeDexInfos(list2, tmpDir2, z3, b, dexArr2);
        } catch (IOException e) {
            Mlog.m36w(e, "Could not get dex infos due to IO error. Bailing...", new Object[0]);
            return null;
        }
    }

    public static Dex2OatHookInfo getMirandaFixLibHook() {
        if (Build.VERSION.SDK_INT == 21) {
            return new Dex2OatHookInfo("arthook", "FB_ENABLE_MIRANDA_HACK");
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0049, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004e, code lost:
        r3 = e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:18:0x0042, B:22:0x0048, B:27:0x004d] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x004d */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0042=Splitter:B:18:0x0042, B:27:0x004d=Splitter:B:27:0x004d} */
    private List getMixedModeDexInfosLegacy(List list, DexStore.TmpDir tmpDir, boolean z, DexManifest.Dex[] dexArr) {
        String str;
        File extractResourceFile = extractResourceFile(MIXED_MODE_DATA_RESOURCE_PATH, tmpDir.directory, TMP_MIXED_MODE_DATA_FILE);
        List list2 = null;
        if (extractResourceFile == null) {
            Mlog.m35w("[opt][mixed_mode] no mixed mode data file found", new Object[0]);
            return null;
        }
        Mlog.safeFmt("[opt][mixed_mode] found mixed mode data file", new Object[0]);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(extractResourceFile));
            try {
                str = bufferedReader.readLine().trim();
                if (str != null) {
                    try {
                        if (str.isEmpty()) {
                        }
                        bufferedReader.close();
                        Mlog.m35w("[opt][mixed_mode] mixed mode canary is %s", str);
                        if (str != null) {
                            if (z) {
                                Mlog.safeFmt("[opt][mixed_mode] mixed mode must also take into account pgo compilation: %s", list.toString());
                                list2 = ExpectedFileInfo.setCompTypeIfUnknown(list, ExpectedFileInfo.CompilationType.PGO);
                            }
                            list2 = makeMixedModeFileList(dexArr, str, list2);
                        }
                        Mlog.safeFmt("[opt][mixed_mode] mixed mode dex names: %s", list2);
                        return list2;
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                Mlog.m35w("[opt][mixed_mode] mixed mode data missing in mixed mode data file", new Object[0]);
                str = null;
                bufferedReader.close();
            } catch (Throwable th2) {
                th = th2;
                str = null;
                throw th;
            }
        } catch (IOException e) {
            e = e;
            str = null;
            Mlog.m36w(e, "[opt][mixed_mode] problem reading mixed mode data file", new Object[0]);
            Mlog.m35w("[opt][mixed_mode] mixed mode canary is %s", str);
            if (str != null) {
            }
            Mlog.safeFmt("[opt][mixed_mode] mixed mode dex names: %s", list2);
            return list2;
        }
        Mlog.m35w("[opt][mixed_mode] mixed mode canary is %s", str);
        if (str != null) {
        }
        Mlog.safeFmt("[opt][mixed_mode] mixed mode dex names: %s", list2);
        return list2;
    }

    private List getNewSecondaryDexes(File file, File file2) {
        return convertCopiedDexInfoToExpectedDexInfo(this.mDexUnpacker.copySecondaryDexes(file, file2));
    }

    public static int getOdexFlags() {
        if (Build.VERSION.SDK_INT < 26) {
            return 5;
        }
        return 1;
    }

    public static void initAllDex2OatHooks(ProcessBuilder processBuilder, Dex2OatHookInfo... dex2OatHookInfoArr) {
        boolean z;
        if (dex2OatHookInfoArr != null && (r6 = dex2OatHookInfoArr.length) != 0) {
            StringBuilder sb = new StringBuilder();
            String str = System.getenv(ENV_LD_PRELOAD);
            if (str != null) {
                sb.append(str);
                z = true;
            } else {
                z = false;
            }
            boolean z2 = false;
            for (Dex2OatHookInfo dex2OatHookInfo : dex2OatHookInfoArr) {
                if (dex2OatHookInfo != null) {
                    Mlog.safeFmt("Installing hook for %s", dex2OatHookInfo.libName);
                    File A01 = AnonymousClass0Y1.A01(dex2OatHookInfo.libName);
                    if (A01 != null) {
                        if (z) {
                            sb.append(File.pathSeparatorChar);
                        }
                        sb.append(A01.getAbsolutePath());
                        String str2 = dex2OatHookInfo.envFlag;
                        if (str2 != null) {
                            processBuilder.setenv(str2, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                        }
                        z2 = true;
                        z = true;
                    }
                }
            }
            if (z2) {
                Mlog.safeFmt("Setting %s to %s", ENV_LD_PRELOAD, sb.toString());
                processBuilder.setenv(ENV_LD_PRELOAD, sb.toString());
                processBuilder.setenv("LD_LIBRARY_PATH", AnonymousClass0Y1.A02());
            }
        }
    }

    private long initialDexOptimizations(Context context, DexStore dexStore, DexStore.OptimizationSession optimizationSession, DexStore.Config config, DexStore.TmpDir tmpDir, Renamer renamer, File file, List list) {
        DexStore.Config config2 = config;
        Renamer renamer2 = renamer;
        DexStore.TmpDir tmpDir2 = tmpDir;
        File file2 = file;
        List list2 = list;
        Context context2 = context;
        DexStore dexStore2 = dexStore;
        DexStore.OptimizationSession optimizationSession2 = optimizationSession;
        if (config2.enableOatmeal) {
            optimizeOatmeal(context2, renamer2, dexStore2, optimizationSession2, tmpDir2, false, file2, list2);
            Mlog.safeFmt("[opt] first oatmeal run", new Object[0]);
            if (config2.enableQuickening) {
                if (config2.enableOatmealQuickening) {
                    return 32;
                }
                return 64;
            } else if (anyCompilationNeeded(config2)) {
                return getCompilationStatusFlags(config2);
            } else {
                return 16;
            }
        } else {
            Mlog.safeFmt("[opt] first dex2oat run", new Object[0]);
            optimizeDex2Oat(context2, dexStore2, renamer2, optimizationSession2, config2, tmpDir2, config2.enableArtVerifyNone, false, false, false, false, (byte) 0, (byte) 0, false, file2, list2);
            return 16;
        }
    }

    public static boolean isOatFileStillValid(File file, long j, long j2) {
        if (Build.VERSION.SDK_INT < 26) {
            long length = file.length();
            long lastModified = file.lastModified();
            if (!(j == length && j2 == lastModified && j != 0)) {
                return false;
            }
        }
        return true;
    }

    private boolean needsTruncation(File file, int i) {
        if (i < 0 || dexAppearsTruncated(file, i)) {
            return false;
        }
        return true;
    }

    public static String oatNameFromDexName(String str) {
        StringBuilder sb;
        String str2;
        if (str.contains(".")) {
            str = str.substring(0, str.lastIndexOf(46));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            sb = new StringBuilder();
            sb.append(str);
            str2 = DexManifest.ODEX_EXT;
        } else {
            sb = new StringBuilder();
            sb.append(str);
            str2 = ".oat";
        }
        sb.append(str2);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0113, code lost:
        if (r4.enableMixedMode != false) goto L_0x0115;
     */
    private void optimizeFurther(Context context, DexStore dexStore, DexStore.OptimizationSession optimizationSession, DexStore.Config config, DexStore.TmpDir tmpDir, Renamer renamer, DexStore.OptimizationSession.Job job, OptimizationStateHolder optimizationStateHolder) {
        String str;
        Object[] objArr;
        String str2;
        String str3;
        long j;
        long j2;
        long j3;
        DexStore.OptimizationSession optimizationSession2 = optimizationSession;
        DexStore.OptimizationHistoryLog optimizationHistoryLog = optimizationSession2.getOptimizationHistoryLog();
        OptimizationStateHolder optimizationStateHolder2 = optimizationStateHolder;
        long j4 = optimizationStateHolder2.status;
        boolean mixedNeeded = mixedNeeded(j4);
        boolean initialMixedNeeded = initialMixedNeeded(j4);
        boolean pgoProfileRecompilationNeeded = pgoProfileRecompilationNeeded(optimizationHistoryLog, j4);
        DexStore.Config config2 = config;
        Mlog.safeFmt("[opt] Optimizing further quickeningNeeded: %s opt completed: %s mm status: %s (config mm: %s config mm pgo: %s) initial mm: %s pgo recomp: (now: %s enabled: %s)", Boolean.valueOf(quickeningNeeded(j4)), Boolean.valueOf(optimizationCompleted(j4)), Boolean.valueOf(mixedNeeded), Boolean.valueOf(config2.enableMixedMode), Boolean.valueOf(config2.enableMixedModePgo), Boolean.valueOf(initialMixedNeeded), Boolean.valueOf(pgoProfileRecompilationNeeded), Boolean.valueOf(markedToTryPgoProfileRecompilation(j4)));
        long j5 = optimizationStateHolder2.status;
        long j6 = 16;
        Renamer renamer2 = renamer;
        DexStore dexStore2 = dexStore;
        Context context2 = context;
        DexStore.TmpDir tmpDir2 = tmpDir;
        if (quickeningNeeded(j5)) {
            Mlog.safeFmt("[opt] quickening", new Object[0]);
            if (config2.enableOatmealQuickening) {
                optimizationStateHolder2.success = optimizeOatmeal(context2, renamer2, dexStore2, optimizationSession2, tmpDir2, true);
                optimizationStateHolder2.statusIntent = 256;
            } else if (config2.enableDex2OatQuickening) {
                Context context3 = context2;
                optimizationStateHolder2.success = optimizeDex2Oat(context3, dexStore2, renamer2, optimizationSession2, config2, tmpDir2, config2.enableArtVerifyNone, false, true, true, false, (byte) 0, (byte) 0, false);
                optimizationStateHolder2.statusIntent = 512;
            }
            long j7 = optimizationStateHolder2.status;
            if (anyCompilationNeeded(config2)) {
                j6 = getCompilationStatusFlags(config2);
            }
            long j8 = j7 | j6;
            optimizationStateHolder2.status = j8;
            if (optimizationStateHolder2.success) {
                if (config2.enableOatmealQuickening) {
                    j3 = 32;
                } else {
                    j3 = 64;
                }
                optimizationStateHolder2.status = j8 & (j3 ^ -1);
            }
            Mlog.safeFmt("[opt] new status 0x%x", Long.valueOf(optimizationStateHolder2.status));
        } else if (initialMixedNeeded || pgoProfileRecompilationNeeded) {
            boolean optimizationCompleted = optimizationCompleted(j5);
            if (pgoProfileRecompilationNeeded) {
                if (!mixedNeeded) {
                    mixedNeeded = false;
                }
                mixedNeeded = true;
            }
            Object[] objArr2 = new Object[3];
            String str4 = "";
            String str5 = "NOT ";
            if (mixedNeeded) {
                str5 = str4;
            }
            objArr2[0] = str5;
            if (!pgoProfileRecompilationNeeded) {
                str4 = "NOT ";
            }
            objArr2[1] = str4;
            if (optimizationCompleted) {
                str = "Yes";
            } else {
                str = "No";
            }
            objArr2[2] = str;
            Mlog.safeFmt("[opt] mixed mode %sneeded and pgo profile recompilation %sneeded. Already Complete: %s", objArr2);
            if (!optimizationCompleted) {
                Mlog.safeFmt("[opt] inspecting free disk space", new Object[0]);
                long availableBytes = new StatFs(dexStore2.root.getAbsolutePath()).getAvailableBytes();
                Mlog.safeFmt("[opt] " + availableBytes + " bytes available on " + dexStore2.root + " filesystem", new Object[0]);
                long j9 = optimizationSession2.config.requiredDiskSpaceForCompilation;
                if (availableBytes >= j9) {
                    objArr = new Object[0];
                    str2 = "[opt] sufficient disk space for mixed mode or pgo compilation";
                } else {
                    Mlog.safeFmt("[opt] insufficient disk space %d for mixed mode or pgo compilation", Long.valueOf(j9));
                    throw new IOException("Insufficient disk space for mixed mode or pgo compilation");
                }
            } else {
                objArr = new Object[0];
                str2 = "[opt] skipping disk space check for mixed mode or pgo compilation";
            }
            Mlog.safeFmt(str2, objArr);
            if (pgoProfileRecompilationNeeded) {
                DexStorePgoUtils.isMainDexStoreProfileChangeSignificant(context2, true);
                Mlog.safeFmt("[opt] No need to recompile since PGO file is not different enough", new Object[0]);
                return;
            }
            if (config2.enableMixedModePgo) {
                Mlog.safeFmt("[opt] Saving reference PGO file", new Object[0]);
                DexStorePgoUtils.createNewMainDexStoreReferencePgoProfile(context2);
            }
            boolean optimizeDex2Oat = optimizeDex2Oat(context2, dexStore2, renamer2, optimizationSession2, config2, tmpDir2, config2.enableArtVerifyNone, mixedNeeded, false, config2.enableMixedModeClassPath, config2.enableMixedModePgo, config2.pgoCompilerFilter, config2.multidexCompilationStrategy, false);
            optimizationStateHolder2.success = optimizeDex2Oat;
            optimizationStateHolder2.status |= 16;
            Object[] objArr3 = new Object[1];
            if (optimizeDex2Oat) {
                str3 = "succeeded";
            } else {
                str3 = "failed";
            }
            objArr3[0] = str3;
            Mlog.safeFmt("[opt] optimizeDex2Oat: %s", objArr3);
            if (optimizationStateHolder2.success) {
                if (mixedNeeded) {
                    optimizationStateHolder2.status &= -129;
                }
                if (config2.enableMixedModePgo) {
                    optimizationStateHolder2.status &= -4097;
                }
                if (config2.enableMixedModeClassPath) {
                    optimizationStateHolder2.status |= STATE_DEX2OAT_CLASSPATH_SET;
                }
                Mlog.safeFmt("[opt] new status 0x%x", Long.valueOf(optimizationStateHolder2.status));
            }
            optimizationStateHolder2.statusIntent = 0;
            if (mixedNeeded) {
                j = STATE_MIXED_ATTEMPTED;
            } else {
                j = 0;
            }
            long j10 = 0 | j;
            optimizationStateHolder2.statusIntent = j10;
            if (config2.enableMixedModePgo) {
                j2 = STATE_PGO_ATTEMPTED;
            } else {
                j2 = 0;
            }
            long j11 = j2 | j10;
            optimizationStateHolder2.statusIntent = j11;
            optimizationStateHolder2.statusIntent = j11 | 0;
        } else {
            Mlog.safeFmt("[opt] Have no further optimizations to do", new Object[0]);
        }
    }

    private void optimizeInitial(Context context, DexStore dexStore, DexStore.OptimizationSession optimizationSession, DexStore.Config config, DexStore.TmpDir tmpDir, Renamer renamer, DexStore.OptimizationSession.Job job, OptimizationStateHolder optimizationStateHolder) {
        DexStore.OptimizationSession optimizationSession2 = optimizationSession;
        if (optimizationSession2.optimizationAttemptNumber <= optimizationSession2.config.maximumOptimizationAttempts) {
            OptimizationStateHolder optimizationStateHolder2 = optimizationStateHolder;
            Context context2 = context;
            optimizationStateHolder2.status = initialDexOptimizations(context2, dexStore, optimizationSession2, config, tmpDir, renamer, (File) null, (List) null) | optimizationStateHolder2.status;
            return;
        }
        throw new IllegalStateException("Unable to optimize in a reasonable amount of attempts");
    }

    public static boolean pgoProfileRecompilationNeeded(DexStore.OptimizationHistoryLog optimizationHistoryLog, long j) {
        if (!optimizationCompleted(optimizationHistoryLog.schemeStatus) || !markedToTryPgoProfileRecompilation(j)) {
            return false;
        }
        return true;
    }

    private void saveOatFiles() {
    }

    private void setCompilerFilter(DexStore.Config config, ProcessBuilder processBuilder) {
        String str;
        String str2;
        byte b = config.artFilter;
        if (b != 0) {
            String str3 = null;
            switch (b) {
                case 1:
                    str3 = "verify-none";
                    break;
                case 2:
                    str3 = "interpret-only";
                    break;
                case 3:
                    str3 = "space";
                    break;
                case 4:
                    str3 = "balanced";
                    break;
                case 5:
                    str3 = "speed";
                    break;
                case 6:
                    str3 = "everything";
                    break;
                case 7:
                    str3 = "time";
                    break;
                default:
                    Mlog.m35w("ignoring unknown configured ART filter %s", Byte.valueOf(b));
                    break;
            }
            if (str3 != null) {
                processBuilder.mArgv.add(AnonymousClass000.A0E("--compiler-filter=", str3));
                return;
            }
        }
        String str4 = SystemProperties.get("dalvik.vm.dex2oat-filter");
        boolean isEmpty = str4.isEmpty();
        if (!isEmpty) {
            Object[] objArr = new Object[1];
            if (!isEmpty) {
                str2 = str4;
            } else {
                str2 = "<none>";
            }
            objArr[0] = str2;
            Mlog.safeFmt("Setting dex2oatFilter to system prop: %s", objArr);
            str = AnonymousClass000.A0E("--compiler-filter=", str4);
        } else {
            Mlog.safeFmt("[opt] no compile-filter set or pgo data, compiling with verify-none", new Object[0]);
            str = "--compiler-filter=verify-none";
        }
        processBuilder.mArgv.add(str);
    }

    private boolean shouldEnableMemoryDex2OatHook(Context context) {
        if (!this.mEnableMemoryDex2OatHookInited) {
            this.mEnableMemoryDex2OatHook = AnonymousClass0FU.A07(context, Experiments.ANDROID_ENABLE_MEMORY_DEX2OAT_HOOK);
            this.mEnableMemoryDex2OatHookInited = true;
        }
        return this.mEnableMemoryDex2OatHook;
    }

    public static boolean shouldUseMixedModeDex2Oat(Context context, boolean z) {
        if (!z) {
            return true;
        }
        return !C04100Ck.A03(AnonymousClass0CD.A00(context).A02).A14;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00bb */
    private void startOptimizerProcess(ProcessBuilder processBuilder, Context context, String str, DexStore.OptimizationSession optimizationSession, Dex2oatLogcatParser dex2oatLogcatParser, DexStore.TmpDir tmpDir) {
        RandomAccessFile randomAccessFile;
        String str2;
        DexStore.OptimizationSession optimizationSession2 = optimizationSession;
        Dex2OatProgressListener dex2OatProgressListener = new Dex2OatProgressListener(context, str, optimizationSession2.optimizationAttemptNumber);
        Process process = null;
        try {
            randomAccessFile = C0015Fs.openUnlinkedTemporaryFile(tmpDir.directory);
            try {
                int fileno = C0024Fd.fileno(randomAccessFile.getFD());
                ProcessBuilder processBuilder2 = processBuilder;
                int[] iArr = processBuilder2.mStreamDispositions;
                iArr[1] = fileno;
                iArr[2] = -5;
                Mlog.safeFmt("starting job %s", str);
                Prio.With with = new Prio.With();
                process = processBuilder2.create();
                with.close();
                int i = process.mPid;
                int waitForAndManageProcess = optimizationSession2.waitForAndManageProcess(process, dex2OatProgressListener);
                Dex2oatLogcatParser dex2oatLogcatParser2 = dex2oatLogcatParser;
                if (dex2oatLogcatParser != null) {
                    Mlog.safeFmt("Success getting logcat dex2oat data: %s in %d ms", Boolean.valueOf(dex2oatLogcatParser2.readAndParseProcess(i, 10000)), Long.valueOf(System.currentTimeMillis() - System.currentTimeMillis()));
                }
                try {
                    str2 = C0015Fs.readProgramOutputFile(randomAccessFile);
                } catch (IOException unused) {
                    str2 = null;
                }
                Integer valueOf = Integer.valueOf(waitForAndManageProcess);
                Mlog.safeFmt("Got result from dex2oat [exit status: %d]: %s", valueOf, str2);
                C0015Fs.safeClose((Closeable) randomAccessFile);
                process.destroy();
                dex2OatProgressListener.logEvent(str2, dex2oatLogcatParser2);
                Mlog.safeFmt("%s exited with status %s", str, valueOf);
                if (waitForAndManageProcess != 0) {
                    throw new RuntimeException(String.format("%s failed: %s: %s", new Object[]{str, Process.describeStatus(waitForAndManageProcess), str2}));
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
            C0015Fs.safeClose((Closeable) randomAccessFile);
            if (process != null) {
                process.destroy();
            }
            throw th;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:11|12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001c */
    private void truncateWithBackup(File file, File file2, int i) {
        FileOutputStream fileOutputStream;
        if (i >= 0) {
            C0015Fs.renameOrThrow(file, file2);
            fileOutputStream = new FileOutputStream(file);
            FileInputStream fileInputStream = new FileInputStream(file2);
            C03960Bo.A01(fileOutputStream, fileInputStream, i);
            fileInputStream.close();
            fileOutputStream.close();
            return;
        }
        return;
        try {
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public static String vdexNameFromOdexName(String str) {
        if (str.contains(".")) {
            str = str.substring(0, str.lastIndexOf(46));
        }
        return AnonymousClass000.A0E(str, ".vdex");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0199 A[Catch:{ IOException -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x019d A[Catch:{ IOException -> 0x01cc }] */
    public void configureClassLoader(File file, MultiDexClassLoader.Configuration configuration) {
        String A0E;
        StringBuilder sb;
        int i = 0;
        File file2 = file;
        MultiDexClassLoader.Configuration configuration2 = configuration;
        if (!this.mIsLoadable) {
            Mlog.safeFmt("App is not loadable yet, avoid loading secondary dexes", new Object[0]);
            super.configureClassLoader(file2, configuration2);
            return;
        }
        Mlog.safeFmt("We pass through this code when loading secondary dexes", new Object[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            Mlog.assertThat(Arrays.asList(this.expectedFiles).contains(OdexSchemeArtTurbo.OREO_ODEX_DIR), "expect oat dir", new Object[0]);
        }
        Mlog.safeFmt("loading pre-built omni-oat", new Object[0]);
        DexStore findOpened = DexStore.findOpened(file2);
        long reportStatus = findOpened.reportStatus();
        int i2 = findOpened.readConfig().artTruncatedDexSize;
        if (Build.VERSION.SDK_INT >= 26) {
            A0E = OdexSchemeArtTurbo.getOreoOdexOutputDirectory(file2, false);
        } else {
            A0E = AnonymousClass000.A0E(file2.getCanonicalPath(), "/");
        }
        int i3 = 1;
        Mlog.safeFmt("Looking at expected files: %s", Arrays.toString(this.expectedFiles));
        int i4 = 0;
        boolean z = true;
        while (true) {
            String[] strArr = this.expectedFiles;
            if (i4 >= strArr.length) {
                break;
            }
            Object[] objArr = new Object[i3];
            objArr[i] = strArr[i4];
            Mlog.safeFmt("Looking at expected file: %s", objArr);
            String str = this.expectedFiles[i4];
            if (!str.endsWith(DexManifest.DEX_EXT)) {
                Mlog.safeFmt("Skipping since the expected file is not a dex file", new Object[i]);
            } else {
                File file3 = new File(AnonymousClass000.A0E(A0E, oatNameFromDexName(str)));
                long lastModified = file3.lastModified();
                long length = file3.length();
                File file4 = new File(file2, this.expectedFiles[i4]);
                File file5 = new File(file2, AnonymousClass000.A0E(this.expectedFiles[i4], ".backup"));
                String A0E2 = AnonymousClass000.A0E("odexSchemeArtXDex.configureClassLoader() status=", Long.toHexString(findOpened.reportStatus()));
                if (!file4.exists()) {
                    sb = new StringBuilder();
                    sb.append(A0E2);
                    sb.append(" expected dex file ");
                    sb.append(file4);
                    sb.append(" not found");
                } else {
                    if (file4.length() == 0 && file3.exists()) {
                        sb = new StringBuilder();
                        sb.append(A0E2);
                        sb.append(" attempting to load 0 length dex file ");
                        sb.append(file4);
                        sb.append(" when we seemed to have already compiled to ");
                        sb.append(file3);
                    }
                    Mlog.safeFmt(A0E2, new Object[0]);
                    if (z) {
                        try {
                            if (shouldTruncateDexesNow(file2, file4, reportStatus, i2)) {
                                truncateWithBackup(file4, file5, i2);
                                try {
                                    Mlog.safeFmt("attempting to truncate %s to %d", file4, Integer.valueOf(i2));
                                    configuration2.addDex(file4, file3);
                                    Mlog.safeFmt("added truncated dex ok " + file4, new Object[0]);
                                    C0015Fs.deleteRecursive(file5);
                                } catch (IOException e) {
                                    C0015Fs.renameOrThrow(file5, file4);
                                    DexTricksErrorReporter.reportSampledSoftError(REGENERATE_SOFT_ERROR_CATEGORY, "failed to load truncated dex", e);
                                    findOpened.forceRegenerateOnNextLoad();
                                    configuration2.addDex(file4, file3);
                                    Mlog.safeFmt("added full dex ok " + file4, new Object[0]);
                                }
                                z &= isOatFileStillValid(file3, length, lastModified);
                            }
                        } catch (IOException e2) {
                            DexTricksErrorReporter.reportSampledSoftError(REGENERATE_SOFT_ERROR_CATEGORY, "IOException adding dex " + file4 + " will rethrow and attempt recovery", e2);
                            findOpened.forceRegenerateOnNextLoad();
                            throw new DexStore.RecoverableDexException(new IOException(A0E2, e2));
                        }
                    }
                    if (!z) {
                        configuration2.addDex(file4, file3);
                    } else {
                        configuration2.addDex(file4, false);
                    }
                    Mlog.safeFmt("added dex ok " + file4, new Object[0]);
                    z &= isOatFileStillValid(file3, length, lastModified);
                }
                A0E2 = sb.toString();
                Mlog.safeFmt(A0E2, new Object[0]);
                if (z) {
                }
                if (!z) {
                }
                Mlog.safeFmt("added dex ok " + file4, new Object[0]);
                z &= isOatFileStillValid(file3, length, lastModified);
            }
            i4++;
            i3 = 1;
            i = 0;
        }
        if (!z) {
            DexTricksErrorReporter.reportSampledSoftError(REGENERATE_SOFT_ERROR_CATEGORY, "failed filesize/time integrity checks", (Throwable) null);
            findOpened.forceRegenerateOnNextLoad();
        }
        if (optimizationCompleted(reportStatus)) {
            findOpened.writeStatusLocked(reportStatus);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0064 */
    public DexSelector dexSelectorForMultidexCompilationStrategy(File file, final byte b) {
        final AtomicInteger atomicInteger = new AtomicInteger(Integer.MAX_VALUE);
        final HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String trim = readLine.trim();
                ManifestEntry fromCSV = ManifestEntry.fromCSV(trim);
                if (fromCSV == null) {
                    Mlog.safeFmt(AnonymousClass000.A0E("[opt][mixed_mode] could not parse manifest entry for : ", trim), new Object[0]);
                } else {
                    Mlog.safeFmt(AnonymousClass000.A0N("[opt][mixed_mode] read manifest entry for ", fromCSV.canary, " : ", trim), new Object[0]);
                    hashMap.put(fromCSV.canary, fromCSV);
                    if (fromCSV.coldstart) {
                        atomicInteger.set(Math.min(atomicInteger.get(), fromCSV.ordinal));
                    }
                }
            }
        } catch (IOException e) {
            Mlog.m36w(e, "[opt][mixed_mode] problem reading manifest file", new Object[0]);
        } catch (Throwable ) {
            throw th;
        }
        return new DexSelector() {
            public boolean select(DexManifest.Dex dex) {
                boolean z;
                ManifestEntry manifestEntry = (ManifestEntry) hashMap.get(dex.canaryClass);
                if (manifestEntry == null) {
                    Mlog.m35w("[opt][mixed_mode] could not find manifest entry for canary class %s", dex.canaryClass);
                    return false;
                }
                byte b = b;
                if (b != 1) {
                    if (b == 2) {
                        z = manifestEntry.coldstart;
                    } else if (!manifestEntry.coldstart || manifestEntry.ordinal != atomicInteger.get()) {
                        z = false;
                    }
                    Mlog.m35w("[opt][mixed_mode] considering canary class=%s ordinal=%d coldstart=%s using strategy=%d => selected=%s", dex.canaryClass, Integer.valueOf(manifestEntry.ordinal), Boolean.valueOf(manifestEntry.coldstart), Byte.valueOf(b), Boolean.valueOf(z));
                    return z;
                }
                z = true;
                Mlog.m35w("[opt][mixed_mode] considering canary class=%s ordinal=%d coldstart=%s using strategy=%d => selected=%s", dex.canaryClass, Integer.valueOf(manifestEntry.ordinal), Boolean.valueOf(manifestEntry.coldstart), Byte.valueOf(b), Boolean.valueOf(z));
                return z;
            }
        };
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|18|19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003f */
    public String getOatmealPath(DexStore.TmpDir tmpDir) {
        File file;
        FileOutputStream fileOutputStream;
        String str = this.mOatmealPath;
        if (str != null) {
            return str;
        }
        File A01 = AnonymousClass0Y1.A01("oatmeal");
        A01.getParentFile();
        if (!A01.canExecute()) {
            file = File.createTempFile("oatmeal", (String) null, tmpDir.directory);
            fileOutputStream = new FileOutputStream(file);
            FileInputStream fileInputStream = new FileInputStream(A01);
            C03960Bo.A01(fileOutputStream, fileInputStream, Integer.MAX_VALUE);
            fileOutputStream.flush();
            fileInputStream.close();
            fileOutputStream.close();
            file.setExecutable(true, true);
        } else {
            file = A01;
        }
        String absolutePath = file.getAbsolutePath();
        this.mOatmealPath = absolutePath;
        return absolutePath;
        try {
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0149, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x014d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x0154 */
    public int loadInformationalStatus(File file, long j) {
        String A0E;
        FileInputStream fileInputStream;
        String[] makeExpectedFileList = makeExpectedFileList(this.mDexes, 0);
        File file2 = file;
        if (Build.VERSION.SDK_INT >= 26) {
            A0E = OdexSchemeArtTurbo.getOreoOdexOutputDirectory(file2, false);
        } else {
            A0E = AnonymousClass000.A0E(file2.getCanonicalPath(), "/");
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= makeExpectedFileList.length) {
                break;
            }
            File file3 = new File(AnonymousClass000.A0E(A0E, oatNameFromDexName(makeExpectedFileList[i])));
            if (!file3.exists()) {
                Mlog.safeFmt(AnonymousClass000.A0E("loadInformationalStatus didn't find: ", file3.getAbsolutePath()), new Object[0]);
                break;
            }
            Mlog.safeFmt(AnonymousClass000.A0E("loadInformationalStatus DID find: ", file3.getAbsolutePath()), new Object[0]);
            try {
                fileInputStream = new FileInputStream(file3);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
                if (C0015Fs.discardFromInputStream(fileInputStream, STATE_PGO_NEEDED) == STATE_PGO_NEEDED) {
                    C03960Bo.A03(byteArrayOutputStream, fileInputStream, 4096);
                    byteArrayOutputStream.flush();
                    boolean z = false;
                    if (byteArrayOutputStream.toString().indexOf(CREATED_BY_OATMEAL) >= 0) {
                        z = true;
                    }
                    Mlog.safeFmt(AnonymousClass000.A0S("loadInformationalStatus? ", z), new Object[0]);
                    if (z) {
                        i2 |= 128;
                        byteArrayOutputStream.close();
                        fileInputStream.close();
                        break;
                    }
                } else {
                    Mlog.m35w(AnonymousClass000.A0E("loadInformationalStatus couldn't read more than 4k of the beginning of ", file3.getAbsolutePath()), new Object[0]);
                }
                byteArrayOutputStream.close();
                fileInputStream.close();
            } catch (IOException unused) {
                Mlog.m35w(AnonymousClass000.A0E("loadInformationalStatus couldn't open ", file3.getAbsolutePath()), new Object[0]);
            } catch (Throwable ) {
                throw th;
            }
            i++;
        }
        if ((j & 32) == 0 && (j & 256) != 0) {
            i2 |= 256;
        } else if ((j & 64) == 0 && (j & 512) != 0) {
            i2 |= 512;
        }
        if ((j & 128) == 0 && (j & STATE_MIXED_ATTEMPTED) != 0) {
            i2 |= 1024;
        }
        if ((j & STATE_PGO_NEEDED) == 0 && (j & STATE_PGO_ATTEMPTED) != 0) {
            i2 |= DexStore.LOAD_RESULT_PGO;
        }
        if ((j & 256) != 0) {
            i2 |= 2048;
        } else if ((j & 512) != 0) {
            i2 |= 4096;
        }
        if ((j & STATE_MIXED_ATTEMPTED) != 0) {
            i2 |= 8192;
        }
        if ((j & STATE_PGO_ATTEMPTED) != 0) {
            i2 |= DexStore.LOAD_RESULT_PGO_ATTEMPTED;
        }
        if ((j & STATE_DEX2OAT_CLASSPATH_SET) != 0) {
            i2 |= DexStore.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
        }
        if ((j & STATE_DO_PERIODIC_PGO_COMP_NEEDED) == 0) {
            return i2;
        }
        if (!((j & STATE_DO_PERIODIC_PGO_COMP_FINISHED) == 0 || (j & STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) == 0)) {
            i2 = 131072 | i2;
        }
        if ((j & STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
            return i2 | DexStore.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED;
        }
        return i2;
        try {
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:40|41|42|43|44) */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ff, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0103 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:43:0x0103=Splitter:B:43:0x0103, B:31:0x00f5=Splitter:B:31:0x00f5} */
    public void optimize(Context context, DexStore dexStore, DexStore.OptimizationSession optimizationSession) {
        long j;
        DexStore dexStore2 = dexStore;
        DexStore.Config readConfig = dexStore2.readConfig();
        DexStore.TmpDir makeTemporaryDirectory = dexStore2.makeTemporaryDirectory("dexopt");
        Renamer renamer = new Renamer(makeTemporaryDirectory);
        Mlog.safeFmt("[opt] opened tmpDir %s; starting job", makeTemporaryDirectory.directory);
        DexStore.OptimizationSession optimizationSession2 = optimizationSession;
        DexStore.OptimizationSession.Job job = new DexStore.OptimizationSession.Job();
        Mlog.safeFmt("[opt] opened job", new Object[0]);
        if (!needOptimization(job.initialStatus, readConfig, optimizationSession2.getOptimizationHistoryLog()).needsOptimization()) {
            Mlog.safeFmt("[opt] nothing to do: ART xdex already complete and no need to further optimize", new Object[0]);
        } else {
            OptimizationStateHolder optimizationStateHolder = new OptimizationStateHolder(true, job.initialStatus, 0);
            job.startOptimizing();
            int i = optimizationSession2.optimizationAttemptNumber;
            Mlog.safeFmt("[opt] Optimization attempt %d", Integer.valueOf(i));
            Context context2 = context;
            if (!anyOptimizationDone(optimizationStateHolder.status)) {
                DexStore.Config config = readConfig;
                DexStore.TmpDir tmpDir = makeTemporaryDirectory;
                DexStore dexStore3 = dexStore2;
                DexStore.OptimizationSession optimizationSession3 = optimizationSession2;
                optimizeInitial(context2, dexStore3, optimizationSession3, config, tmpDir, renamer, job, optimizationStateHolder);
            } else if (i <= 3) {
                try {
                    optimizeFurther(context2, dexStore2, optimizationSession2, readConfig, makeTemporaryDirectory, renamer, job, optimizationStateHolder);
                } catch (Exception e) {
                    if (i == 3) {
                        j = optimizationStateHolder.status & -20721;
                        optimizationStateHolder.status = j;
                    } else {
                        throw e;
                    }
                }
            } else {
                Mlog.m35w("[opt] Detected error but seem to be in a complete state", new Object[0]);
                j = optimizationStateHolder.status & -20721;
                optimizationStateHolder.status = j;
                optimizationStateHolder.status = j | 16;
                optimizationStateHolder.success = false;
            }
            job.startCommitting(optimizationStateHolder.statusIntent);
            if (optimizationStateHolder.success) {
                renamer.renameOrThrow();
            } else {
                Mlog.m35w("[opt] failure to set up the optimization command", new Object[0]);
            }
            Mlog.safeFmt("[opt] new status 0x%x", Long.valueOf(optimizationStateHolder.status));
            job.finishCommit(optimizationStateHolder.status | optimizationStateHolder.statusIntent);
            Mlog.safeFmt("ART xdex optimization phase complete", new Object[0]);
            if (optimizationStateHolder.success) {
            }
        }
        job.close();
        makeTemporaryDirectory.close();
        return;
        try {
        } catch (Throwable th) {
            if (makeTemporaryDirectory != null) {
                try {
                    makeTemporaryDirectory.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    public OdexSchemeArtXdex(Context context, DexManifest.Dex[] dexArr, ResProvider resProvider, long j) {
        super(getOdexFlags(), makeExpectedFileList(dexArr, j));
        boolean z = false;
        this.mDexes = dexArr;
        this.mResProvider = resProvider;
        this.mIsLoadable = (j & STATE_MASK) != 0 ? true : z;
        this.mPGOProfileUtil = AnonymousClass0CD.A00(context);
        this.mDexUnpacker = new DexUnpacker(context, resProvider);
        this.mOatmealPath = null;
        this.oatFiles = new ArrayList();
    }

    private boolean areDexesTruncated(DexStore dexStore, File file, DexManifest.Dex[] dexArr) {
        int i = dexStore.readConfig().artTruncatedDexSize;
        if (i <= 0) {
            return false;
        }
        for (DexManifest.Dex dex : dexArr) {
            if (!dexAppearsTruncated(dex, file, i)) {
                Mlog.m35w("Dex %s is not truncated", dex.assetName);
                return false;
            }
        }
        Mlog.safeFmt("All dexes appear truncated", new Object[0]);
        return true;
    }

    private void checkTmpOatFileLength(File file) {
        if (file.exists() && file.length() == 0) {
            throw new RuntimeException(file + " is an impossibly short oat file");
        }
    }

    public static String convertClassToDotForm(String str) {
        return str.substring(1, str.length() - 1).replace('/', '.');
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:10|(2:12|13)|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r1 != null) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0030, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0024 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0034 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:27:0x0034=Splitter:B:27:0x0034, B:18:0x002a=Splitter:B:18:0x002a} */
    private File extractResourceFile(String str, File file, String str2) {
        try {
            File createTempFile = File.createTempFile(str2, "txt", file);
            createTempFile.deleteOnExit();
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            InputStream open = this.mResProvider.open(str);
            C03960Bo.A03(fileOutputStream, open, Integer.MAX_VALUE);
            if (open != null) {
                open.close();
            }
            fileOutputStream.close();
            return createTempFile;
        } catch (IOException e) {
            Mlog.m29e(AnonymousClass000.A0E("[opt][res] io exception ", e.toString()), new Object[0]);
            return null;
        } catch (Throwable ) {
            throw th;
        }
    }

    public static boolean forceUseOriginalMixedModePGOProfile(Context context) {
        AnonymousClass0CD A00 = AnonymousClass0CD.A00(context);
        C04100Ck A03 = C04100Ck.A03(A00.A02);
        if (!(!C04100Ck.A03(A00.A02).A14) || A03.A2K) {
            return false;
        }
        return true;
    }

    public static Context getAppContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return context;
        }
        return applicationContext;
    }

    private String getArtImageLocation() {
        String artImageLocation = DalvikInternals.getArtImageLocation();
        if (artImageLocation == null || "".equals(artImageLocation)) {
            return AnonymousClass000.A0J("/data/dalvik-cache/", OdexSchemeArtTurbo.getArch(), "/system@framework@boot.art");
        }
        return artImageLocation;
    }

    private Dex2OatHookInfo getDex2OatLibHooks(Context context, DexStore.OptimizationSession optimizationSession) {
        Object[] objArr;
        String str;
        if (C038408s.A00()) {
            objArr = new Object[0];
            str = "Not installing Dex2OatLibHooks on 64 bit device";
        } else if (optimizationSession.config.installDex2OatHooks || shouldEnableMemoryDex2OatHook(context)) {
            Mlog.safeFmt("Going to try installing Dex2OatLibHooks", new Object[0]);
            return new Dex2OatHookInfo("dex2oathooks", "FB_ENABLE_DEX2OAT_HOOKS");
        } else {
            objArr = new Object[0];
            str = "Not installing Dex2OatLibHooks";
        }
        Mlog.safeFmt(str, objArr);
        return null;
    }

    private List getNewInitialOptimizedSecondaryDexes(Context context, DexStore dexStore, DexStore.OptimizationSession optimizationSession, DexStore.Config config, DexStore.TmpDir tmpDir, Renamer renamer, AtomicReference atomicReference) {
        DexStore.TmpDir tmpDir2 = tmpDir;
        File makeTmpSubDirectory = makeTmpSubDirectory(tmpDir2, "tmp-unpack-dexes");
        DexStore dexStore2 = dexStore;
        List newSecondaryDexes = getNewSecondaryDexes(makeTmpSubDirectory, dexStore2.root);
        atomicReference.set(makeTmpSubDirectory);
        if (newSecondaryDexes == null) {
            return null;
        }
        Mlog.safeFmt("Starting to do initial optimizations for temp secondary dexes", new Object[0]);
        DexStore.DexStoreTestHooks dexStoreTestHooks = DexStore.sDexStoreTestHooks;
        if (dexStoreTestHooks != null) {
            dexStoreTestHooks.onSecondaryDexesUnpackedForRecompilation();
        }
        Renamer renamer2 = renamer;
        Mlog.safeFmt("Optimizing temp secondary dexes got result status: %d", Long.valueOf(initialDexOptimizations(context, dexStore2, optimizationSession, config, tmpDir2, renamer2, makeTmpSubDirectory, newSecondaryDexes)));
        renamer2.renameOrThrow();
        renamer2.reset();
        return newSecondaryDexes;
    }

    private String getOatVersion() {
        String str;
        String oatFormatVersion = DalvikInternals.getOatFormatVersion();
        if (oatFormatVersion != null && !oatFormatVersion.isEmpty()) {
            return oatFormatVersion;
        }
        int i = Build.VERSION.SDK_INT;
        if (i != 10000) {
            switch (i) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                case C120125Dh.VIEW_TYPE_LINK /*14*/:
                case 15:
                case 16:
                case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                case 18:
                case 19:
                case 20:
                    break;
                case C120125Dh.VIEW_TYPE_BRANDING /*21*/:
                    return "039";
                case C120125Dh.NUM_VIEW_TYPES /*22*/:
                    return "045";
                case 23:
                    return "064";
                case 24:
                    return "079";
                case 25:
                    return "088";
                case OREO_SDK_INT /*26*/:
                    return "124";
                case 27:
                    return "131";
                default:
                    str = "unknown api version: VERSION.SDK_INT = ";
                    break;
            }
        }
        str = "oatmeal should be used on Dalvik. VERSION.SDK_INT = ";
        Mlog.m29e(AnonymousClass000.A05(str, i), new Object[0]);
        return "039";
    }

    private int getTruncatedSize(DexStore dexStore) {
        return dexStore.readConfig().artTruncatedDexSize;
    }

    public static boolean initialMixedNeeded(long j) {
        if (optimizationCompleted(j) || !mixedNeeded(j)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r7 >= 28) goto L_0x0012;
     */
    public static List makeExpectedFileInfoList(DexManifest.Dex[] dexArr, long j) {
        String str;
        boolean anyOptimizationDone = anyOptimizationDone(j);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            str = OdexSchemeArtTurbo.OREO_ODEX_DIR;
        }
        str = null;
        if (!anyOptimizationDone) {
            str = null;
        }
        List<ExpectedFileInfo> makeExpectedFileInfoList = OdexSchemeArtTurbo.makeExpectedFileInfoList(dexArr, str);
        Mlog.safeFmt("makeExpectedFile: are oat around: %s expected files: %s", Boolean.valueOf(anyOptimizationDone), makeExpectedFileInfoList.toString());
        if (anyOptimizationDone) {
            if (i >= 26) {
                makeExpectedFileInfoList.add(new ExpectedFileInfo(OdexSchemeArtTurbo.OREO_ODEX_DIR));
            } else {
                ArrayList arrayList = new ArrayList(makeExpectedFileInfoList.size() << 1);
                arrayList.addAll(makeExpectedFileInfoList);
                for (ExpectedFileInfo expectedFileString : makeExpectedFileInfoList) {
                    arrayList.add(new ExpectedFileInfo(oatNameFromDexName(expectedFileString.toExpectedFileString())));
                }
                makeExpectedFileInfoList = arrayList;
            }
        }
        Mlog.safeFmt("makeExpectedFile: RETURN expected files: %s", makeExpectedFileInfoList.toString());
        return makeExpectedFileInfoList;
    }

    public static String[] makeExpectedFileList(DexManifest.Dex[] dexArr, long j) {
        return OdexSchemeArtTurbo.makeExpectedFileListFrom(makeExpectedFileInfoList(dexArr, j));
    }

    public static File makeTmpSubDirectory(DexStore.TmpDir tmpDir, String str) {
        File file = new File(tmpDir.directory, AnonymousClass000.A0J(str, "-", UUID.randomUUID().toString().replace("-", "")));
        C0015Fs.mkdirOrThrow(file);
        return file;
    }

    public static String oatNameFromExpectedFileInfo(ExpectedFileInfo expectedFileInfo) {
        String str;
        if (expectedFileInfo.hasDex()) {
            str = expectedFileInfo.dex.makeDexName();
        } else {
            str = expectedFileInfo.rawFile;
        }
        return oatNameFromDexName(str);
    }

    public static String readProgramOutputFileSafely(RandomAccessFile randomAccessFile) {
        try {
            return C0015Fs.readProgramOutputFile(randomAccessFile);
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean shouldTruncateDexesNow(File file, File file2, long j, int i) {
        if (!needsTruncation(file2, i) || !optimizationCompleted(j)) {
            return false;
        }
        return !getCannotTruncateDexesFlag(file);
    }

    public boolean loadNotOptimized(long j) {
        return !anyOptimizationDone(j);
    }

    public static boolean dexAppearsTruncated(DexManifest.Dex dex, File file, int i) {
        String makeDexName = dex.makeDexName();
        File file2 = new File(file, makeDexName);
        if (!file2.exists()) {
            Mlog.m35w("Dex [asset: %s] %s seems not to exist", dex.assetName, makeDexName);
        }
        return dexAppearsTruncated(file2, i);
    }

    public static boolean dexAppearsTruncated(File file, int i) {
        return file.length() <= ((long) i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r4 == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x03a0, code lost:
        if (r1.isEmpty() != false) goto L_0x03a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if (r56 != false) goto L_0x0022;
     */
    private boolean innerOptimizeDex2Oat(Context context, DexStore dexStore, Renamer renamer, DexStore.OptimizationSession optimizationSession, DexStore.Config config, DexStore.TmpDir tmpDir, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, byte b, byte b2, boolean z6, File file, List list) {
        boolean z7;
        boolean z8;
        File file2;
        List<ExpectedFileInfo> dexInfos;
        String str;
        int i;
        File file3;
        String str2;
        String str3;
        int i2;
        char c;
        String str4;
        String str5;
        File file4;
        List list2 = list;
        File file5 = file;
        DexStore.OptimizationSession optimizationSession2 = optimizationSession;
        boolean z9 = false;
        if ((optimizationSession2.config.flags & 1) != 0) {
            z9 = true;
        }
        boolean A05 = AnonymousClass0CD.A05(this.mPGOProfileUtil);
        if (!z5) {
            z7 = false;
        }
        z7 = true;
        if (z6) {
            z8 = true;
        }
        z8 = false;
        if (z7) {
            if (A05) {
                Mlog.safeFmt("[opt] Trying PGO compilation [mm: %s periodic recomp: %s] and found PGO profile file", Boolean.valueOf(z5), Boolean.valueOf(z6));
            } else {
                Mlog.m35w("[opt] did NOT find PGO profile file [mm: %s periodic: %s]", Boolean.valueOf(z5), Boolean.valueOf(z6));
            }
        }
        Context context2 = context;
        boolean forceUseOriginalMixedModePGOProfile = forceUseOriginalMixedModePGOProfile(context2);
        boolean shouldUseMixedModeDex2Oat = shouldUseMixedModeDex2Oat(context2, z8);
        DexStore.TmpDir tmpDir2 = tmpDir;
        Renamer renamer2 = renamer;
        DexStore dexStore2 = dexStore;
        if (list != null) {
            dexInfos = list2;
            file2 = file5;
        } else {
            list2 = makeExpectedFileInfoList(this.mDexes, 0);
            AtomicReference atomicReference = new AtomicReference((Object) null);
            file2 = file5;
            dexInfos = getDexInfos(context2, dexStore2, optimizationSession2, config, tmpDir2, renamer2, list2, z2, z8, b2, file5, this.mDexes, atomicReference);
            file5 = (File) atomicReference.get();
            if (file5 == null) {
                file5 = file2;
            }
        }
        String bootClassPathValue = getBootClassPathValue(dexStore2, !z4);
        if (z4) {
            str = getClassPathValue(dexStore2, file2, list2);
        } else {
            str = null;
        }
        if (dexInfos == null || dexInfos.size() == 0) {
            Mlog.m35w("[opt] no dex file to compile", new Object[0]);
            return false;
        }
        DexStore.TmpDir tmpDir3 = tmpDir2;
        Dex2oatLogcatParser dex2oatLogcatParser = new Dex2oatLogcatParser("dex2oat", tmpDir3.directory);
        if (z7) {
            file3 = DexStoreUtils.getCurrentMainDexStorePgoProfile(context2);
            i = 1;
        } else {
            i = 1;
            file3 = null;
        }
        Object[] objArr = new Object[i];
        if (file3 != null) {
            str2 = file3.getAbsolutePath();
        } else {
            str2 = "<none>";
        }
        char c2 = 0;
        objArr[0] = str2;
        Mlog.safeFmt("[opt] dex2oat - using pgo file %s", objArr);
        for (ExpectedFileInfo expectedFileInfo : dexInfos) {
            Object[] objArr2 = new Object[1];
            objArr2[c2] = expectedFileInfo;
            Mlog.safeFmt("[opt] dex2oat - go for expected file %s", objArr2);
            File file6 = expectedFileInfo.getFile(file2);
            Object[] objArr3 = new Object[1];
            objArr3[c2] = file6;
            Mlog.safeFmt("[opt] dex2oat - go for dex %s", objArr3);
            String oatNameFromExpectedFileInfo = oatNameFromExpectedFileInfo(expectedFileInfo);
            File file7 = new File(file2, oatNameFromExpectedFileInfo);
            File file8 = new File(tmpDir3.directory, oatNameFromExpectedFileInfo);
            File file9 = new File(file5, oatNameFromExpectedFileInfo);
            this.oatFiles.add(file7);
            Object[] objArr4 = new Object[11];
            objArr4[c2] = expectedFileInfo;
            objArr4[1] = file5;
            objArr4[2] = file;
            objArr4[3] = Boolean.valueOf(file6.exists());
            objArr4[4] = file6;
            objArr4[5] = Boolean.valueOf(file7.exists());
            objArr4[6] = file7;
            objArr4[7] = Boolean.valueOf(file8.exists());
            objArr4[8] = file8;
            objArr4[9] = Boolean.valueOf(file9.exists());
            objArr4[10] = file9;
            Mlog.safeFmt("[opt] Current State: \n Expected File Info %s \n Root: %s \n Potential Root: %s \n dex-file [exists: %s]: %s \n oat-location [exists: %s]: %s \n oat-file [exists: %s]: %s \n oat-file-overwrite [exists: %s]: %s", objArr4);
            String[] strArr = new String[6];
            strArr[0] = "--oat-file=" + file8;
            strArr[1] = AnonymousClass000.A0E("--oat-location=", file9.getPath());
            strArr[2] = AnonymousClass000.A0E("--dex-file=", file6.getPath());
            strArr[3] = "--no-watch-dog";
            if (Build.VERSION.SDK_INT < 28) {
                str3 = "--dump-timing";
            } else {
                str3 = "--dump-timings";
            }
            strArr[4] = str3;
            strArr[5] = "--dump-stats";
            ProcessBuilder processBuilder = new ProcessBuilder("/system/bin/dex2oat", strArr);
            processBuilder.setenv("BOOTCLASSPATH", bootClassPathValue);
            processBuilder.mTmpDir = ProcessBuilder.genDefaultTmpDir(getAppContext(context2));
            if (str != null) {
                processBuilder.setenv("CLASSPATH", str);
                i2 = 1;
                c = 0;
                Mlog.safeFmt("dex2oat CLASSPATH: %s", str);
            } else {
                i2 = 1;
                c = 0;
            }
            Object[] objArr5 = new Object[i2];
            objArr5[c] = bootClassPathValue;
            Mlog.safeFmt("dex2oat BOOTCLASSPATH: %s", objArr5);
            String str6 = SystemProperties.get("dalvik.vm.dex2oat-Xms");
            if (!str6.isEmpty()) {
                processBuilder.mArgv.add("--runtime-arg");
                processBuilder.mArgv.add(AnonymousClass000.A0E("-Xms", str6));
            }
            String str7 = SystemProperties.get("dalvik.vm.dex2oat-Xmx");
            if (!str7.isEmpty()) {
                processBuilder.mArgv.add("--runtime-arg");
                processBuilder.mArgv.add(AnonymousClass000.A0E("-Xmx", str7));
            }
            DexStore.Config config2 = optimizationSession2.dexStoreConfig;
            if (expectedFileInfo.isCompilationTypeMixedModeAll() && !shouldUseMixedModeDex2Oat) {
                Object[] objArr6 = new Object[1];
                objArr6[c] = expectedFileInfo;
                Mlog.safeFmt("[opt] Expected file is configured for mixed mode but we are skipping it for pgo. File Info: %s", objArr6);
            }
            String str8 = "everything";
            if (!expectedFileInfo.isCompilationTypeMixedModeAll() || !shouldUseMixedModeDex2Oat) {
                File file10 = null;
                if (expectedFileInfo.isCompilationTypePgoOrMixedMode()) {
                    Object[] objArr7 = new Object[3];
                    if (file3 != null) {
                        file10 = file3.getAbsoluteFile();
                    }
                    objArr7[0] = file10;
                    objArr7[1] = Boolean.valueOf(expectedFileInfo.isCompilationTypeMixedModeAll());
                    objArr7[2] = Boolean.valueOf(expectedFileInfo.isCompilationTypePGO());
                    Mlog.safeFmt("[opt] Enabling compilation for pgo %s [mm: %s pgo: %s]", objArr7);
                    processBuilder.mArgv.add(AnonymousClass000.A0E("--profile-file=", file3.getAbsolutePath()));
                    if (AnonymousClass0CD.A07) {
                        str8 = "everything-profile";
                    }
                    processBuilder.mArgv.add(AnonymousClass000.A0E("--compiler-filter=", str8));
                    addOldPgoDex2OatParams(processBuilder);
                    str5 = "dex2oat-pgo";
                } else if (z3) {
                    Mlog.safeFmt("[opt] Enabling quickening", new Object[0]);
                    processBuilder.mArgv.add("--compiler-filter=interpret-only");
                    str5 = "dex2oat-quicken";
                } else {
                    if (z) {
                        Mlog.safeFmt("[opt] Enabling verify-none option for art", new Object[0]);
                        processBuilder.mArgv.add("--compiler-filter=verify-none");
                    } else {
                        Mlog.safeFmt("[opt] Loading compiler system flags", new Object[0]);
                        setCompilerFilter(config2, processBuilder);
                        String str9 = SystemProperties.get("dalvik.vm.dex2oat-flags");
                        Object[] objArr8 = new Object[1];
                        if (str9 != null) {
                            str4 = str9;
                        }
                        str4 = "<none>";
                        objArr8[0] = str4;
                        Mlog.safeFmt("[opt] compiler defaults system flags are %s", objArr8);
                        if (!str9.isEmpty()) {
                            TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(' ');
                            simpleStringSplitter.setString(str9);
                            while (simpleStringSplitter.hasNext()) {
                                processBuilder.mArgv.add(simpleStringSplitter.next());
                            }
                        }
                    }
                    str5 = "dex2oat";
                }
            } else {
                Mlog.safeFmt("[opt] Enabling compilation for mixed mode", new Object[0]);
                String str10 = "speed";
                str5 = "dex2oat-mixedmode-pgo";
                if (z5) {
                    if (forceUseOriginalMixedModePGOProfile) {
                        file4 = DexStorePgoUtils.getDefaultPgoMixedModeProfileFromApkForDex(context2, expectedFileInfo, tmpDir3);
                    } else {
                        file4 = file3;
                    }
                    if (!z6) {
                        synchronized (AnonymousClass0YV.class) {
                        }
                    }
                    if (file4 != null) {
                        boolean z10 = AnonymousClass0CD.A07;
                        byte b3 = b;
                        if (b3 == 1) {
                            str10 = z10 ? "space-profile" : "space";
                        } else if (b3 == 2) {
                            str10 = z10 ? "everything-profile" : str8;
                        } else if (b3 == 3) {
                            str10 = z10 ? "verify-profile" : "verify-none";
                        } else if (z10) {
                            str10 = "speed-profile";
                        }
                        addOldPgoDex2OatParams(processBuilder);
                        processBuilder.mArgv.add(AnonymousClass000.A0E("--profile-file=", file4.getAbsolutePath()));
                        Mlog.safeFmt("[opt] Using PGO profile for mixed mode compilation [compiler filter: %s] at %s", str10, file4);
                    } else {
                        DexTricksErrorReporter.reportSampledSoftError(MISSING_PGO_SOFT_ERROR_CATEGORY, "PGO file could not be located", (Throwable) null);
                        throw new IOException("Couldn't find PGO profile for mixed mode compilation");
                    }
                } else {
                    str5 = "dex2oat-mixedmode";
                }
                processBuilder.mArgv.add(AnonymousClass000.A0E("--compiler-filter=", str10));
            }
            if (z9) {
                processBuilder.mArgv.add("-j1");
            }
            int i3 = config2.artHugeMethodMax;
            if (i3 >= 0) {
                processBuilder.mArgv.add(AnonymousClass000.A05("--huge-method-max=", i3));
            }
            int i4 = config2.artLargeMethodMax;
            if (i4 >= 0) {
                processBuilder.mArgv.add(AnonymousClass000.A05("--large-method-max=", i4));
            }
            int i5 = config2.artSmallMethodMax;
            if (i5 >= 0) {
                processBuilder.mArgv.add(AnonymousClass000.A05("--small-method-max=", i5));
            }
            int i6 = config2.artTinyMethodMax;
            if (i6 >= 0) {
                processBuilder.mArgv.add(AnonymousClass000.A05("--tiny-method-max=", i6));
            }
            initAllDex2OatHooks(processBuilder, getMirandaFixLibHook(), getDex2OatLibHooks(context2, optimizationSession2));
            Mlog.safeFmt("[opt] Running compiler: " + processBuilder, new Object[0]);
            renamer2.addFile(file8, file7);
            startOptimizerProcess(processBuilder, context2, str5, optimizationSession2, dex2oatLogcatParser, tmpDir2);
            checkTmpOatFileLength(file8);
            tmpDir3 = tmpDir2;
            c2 = 0;
        }
        return true;
    }

    public static List makeMixedModeFileList(DexManifest.Dex[] dexArr, DexSelector dexSelector, List list) {
        int length;
        if (list == null || (length = dexArr.length) == list.size()) {
            int length2 = dexArr.length;
            ArrayList arrayList = new ArrayList(length2);
            for (int i = 0; i < length2; i++) {
                DexManifest.Dex dex = dexArr[i];
                if (dex != null && dexSelector.select(dex)) {
                    Mlog.safeFmt("[mixed_mode] selected dex = { %s, %s, %s }", dex.canaryClass, dex.hash, dex.assetName);
                    ExpectedFileInfo expectedFileInfo = new ExpectedFileInfo(dex, ExpectedFileInfo.CompilationType.ALL);
                    if (list == null) {
                        arrayList.add(expectedFileInfo);
                    } else if (i < list.size()) {
                        list.set(i, expectedFileInfo);
                    }
                }
            }
            return list != null ? list : arrayList;
        }
        throw new IllegalStateException(String.format("Dexes array [size: %d] needs to be the same size as replaceDexNames array [size: %d]", new Object[]{Integer.valueOf(length), Integer.valueOf(list.size())}));
    }

    public static List makeMixedModeFileList(DexManifest.Dex[] dexArr, String str, List list) {
        final String convertClassToDotForm = convertClassToDotForm(str);
        return makeMixedModeFileList(dexArr, (DexSelector) new DexSelector() {
            public boolean select(DexManifest.Dex dex) {
                Mlog.m35w("[mixed_mode] comparing %s and %s", dex.canaryClass, convertClassToDotForm);
                return dex.canaryClass.equals(convertClassToDotForm);
            }
        }, list);
    }

    private boolean optimizeDex2Oat(Context context, DexStore dexStore, Renamer renamer, DexStore.OptimizationSession optimizationSession, DexStore.Config config, DexStore.TmpDir tmpDir, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, byte b, byte b2, boolean z6) {
        return optimizeDex2Oat(context, dexStore, renamer, optimizationSession, config, tmpDir, z, z2, z3, z4, z5, b, b2, z6, (File) null, (List) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        throw r0;
     */
    private boolean optimizeDex2Oat(Context context, DexStore dexStore, Renamer renamer, DexStore.OptimizationSession optimizationSession, DexStore.Config config, DexStore.TmpDir tmpDir, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, byte b, byte b2, boolean z6, File file, List list) {
        DexStore dexStore2 = dexStore;
        File file2 = file;
        if (file == null) {
            file2 = dexStore2.root;
        }
        boolean z7 = z6;
        CriticalCannotTruncateDexesSection criticalCannotTruncateDexesSection = new CriticalCannotTruncateDexesSection(file2, z7);
        boolean innerOptimizeDex2Oat = innerOptimizeDex2Oat(context, dexStore2, renamer, optimizationSession, config, tmpDir, z, z2, z3, z4, z5, b, b2, z7, file2, list);
        criticalCannotTruncateDexesSection.close();
        return innerOptimizeDex2Oat;
    }

    private boolean optimizeOatmeal(Context context, Renamer renamer, DexStore dexStore, DexStore.OptimizationSession optimizationSession, DexStore.TmpDir tmpDir, boolean z) {
        return optimizeOatmeal(context, renamer, dexStore, optimizationSession, tmpDir, z, (File) null, (List) null);
    }

    private boolean optimizeOatmeal(Context context, Renamer renamer, DexStore dexStore, DexStore.OptimizationSession optimizationSession, DexStore.TmpDir tmpDir, boolean z, File file, List list) {
        Object[] objArr;
        String str;
        String str2;
        File file2 = file;
        List<ExpectedFileInfo> list2 = list;
        DexStore dexStore2 = dexStore;
        if (file == null) {
            file2 = dexStore2.root;
        }
        if (list == null) {
            list2 = makeExpectedFileInfoList(this.mDexes, 0);
        }
        DexStore.TmpDir tmpDir2 = tmpDir;
        DexStore.OptimizationSession optimizationSession2 = optimizationSession;
        Context context2 = context;
        Renamer renamer2 = renamer;
        if (Build.VERSION.SDK_INT >= 26) {
            return optimizeOatmealForOreo(context2, renamer2, dexStore2, optimizationSession2, tmpDir2, file2, list2);
        }
        ProcessBuilder processBuilder = new ProcessBuilder(getOatmealPath(tmpDir2), "--write-elf", "--build", AnonymousClass000.A0E("--arch=", OdexSchemeArtTurbo.getArch()), "--one-oat-per-dex", AnonymousClass000.A0E("--art-image-location=", getArtImageLocation()), AnonymousClass000.A0E("--oat-version=", getOatVersion()));
        processBuilder.setenv("LD_LIBRARY_PATH", AnonymousClass0Y1.A02());
        processBuilder.mTmpDir = ProcessBuilder.genDefaultTmpDir(getAppContext(context2));
        if (DalvikInternals.detectSamsungOatFormat()) {
            processBuilder.mArgv.add("--samsung-oatformat");
        }
        if (z) {
            File extractResourceFile = extractResourceFile(QUICK_DATA_RESOURCE_PATH, tmpDir2.directory, TMP_QUICK_DATA_FILE);
            if (extractResourceFile != null) {
                processBuilder.mArgv.add("--quickening-data=" + tmpDir2.directory + "/" + extractResourceFile.getName());
                objArr = new Object[0];
                str = "[opt][quickening] found quick-data file";
            } else {
                Mlog.safeFmt("[opt][quickening] no quickening data found", new Object[0]);
                return false;
            }
        } else {
            objArr = new Object[0];
            str = "[opt][quickening] no quickening requested";
        }
        Mlog.safeFmt(str, objArr);
        for (ExpectedFileInfo expectedFileInfo : list2) {
            processBuilder.mArgv.add(AnonymousClass000.A0E("--dex=", expectedFileInfo.getFile(file2).getPath()));
            String oatNameFromExpectedFileInfo = oatNameFromExpectedFileInfo(expectedFileInfo);
            File file3 = new File(file2, oatNameFromExpectedFileInfo);
            File file4 = new File(tmpDir2.directory, oatNameFromExpectedFileInfo);
            renamer2.addFile(file4, file3);
            processBuilder.mArgv.add(AnonymousClass000.A0E("--oat=", file4.getPath()));
            this.oatFiles.add(file3);
        }
        Mlog.safeFmt("oatmeal: %s", processBuilder);
        if (z) {
            str2 = "oatmeal-quicken";
        } else {
            str2 = "oatmeal";
        }
        startOptimizerProcess(processBuilder, context2, str2, optimizationSession2, (Dex2oatLogcatParser) null, tmpDir2);
        return true;
    }
}
