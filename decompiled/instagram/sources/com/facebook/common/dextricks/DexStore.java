package com.facebook.common.dextricks;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.JsonWriter;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.MultiDexClassLoader;
import com.facebook.common.dextricks.OdexScheme;
import com.facebook.common.dextricks.OptimizationConfiguration;
import com.facebook.common.dextricks.ReentrantLockFile;
import com.facebook.forker.C0024Fd;
import com.facebook.forker.Process;
import com.instagram.realtimeclient.RealtimeProtocol;
import dalvik.system.DexFile;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000X.AnonymousClass000;
import p000X.AnonymousClass076;
import p000X.AnonymousClass07H;
import p000X.AnonymousClass07I;
import p000X.AnonymousClass091;
import p000X.AnonymousClass0BO;
import p000X.AnonymousClass0BV;
import p000X.AnonymousClass0Bq;
import p000X.AnonymousClass0CD;
import p000X.AnonymousClass0D0;
import p000X.AnonymousClass0FU;
import p000X.AnonymousClass0ZJ;

public final class DexStore {
    public static final String CONFIG_FILENAME = "config";
    public static final String CONFIG_TMP_FILENAME = "config.tmp";
    public static final long CS_DEX0OPT = 16;
    public static final long CS_STATE_MASK = 15;
    public static final byte CS_STATE_SHIFT = 4;
    public static final int DAYS_TO_MS_FACTOR = 86400000;
    public static final byte DEFAULT_MULTIDEX_COMPILATION_STRATEGY = 0;
    public static final byte DEFAULT_PGO_COMPILER_FILTER = 0;
    public static final String DEPS_FILENAME = "deps";
    public static final int DS_ASYNC = 4;
    public static final int DS_DO_NOT_OPTIMIZE = 1;
    public static final int DS_FORCE_SYNC = 8;
    public static final int DS_LOAD_SECONDARY = 16;
    public static final int DS_NO_RETRY = 2;
    public static final int LA_LOAD_EXISTING = 0;
    public static final int LA_REGEN_ALL = 2;
    public static final int LA_REGEN_MISSING = 1;
    public static final int LOAD_RESULT_CREATED_BY_OATMEAL = 128;
    public static final int LOAD_RESULT_DEX2OAT_CLASSPATH_SET = 16384;
    public static final int LOAD_RESULT_DEX2OAT_QUICKENED = 512;
    public static final int LOAD_RESULT_DEX2OAT_QUICKEN_ATTEMPTED = 4096;
    public static final int LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP = 131072;
    public static final int LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED = 262144;
    public static final int LOAD_RESULT_MIXED_MODE = 1024;
    public static final int LOAD_RESULT_MIXED_MODE_ATTEMPTED = 8192;
    public static final int LOAD_RESULT_NEED_OPTIMIZATION = 2;
    public static final int LOAD_RESULT_NEED_REOPTIMIZATION = 1048576;
    public static final int LOAD_RESULT_NOT_OPTIMIZED = 8;
    public static final int LOAD_RESULT_OATMEAL_QUICKENED = 256;
    public static final int LOAD_RESULT_OATMEAL_QUICKEN_ATTEMPTED = 2048;
    public static final int LOAD_RESULT_OPTIMIZATION_IS_CRAZY_EXPENSIVE = 4;
    public static final int LOAD_RESULT_PGO = 32768;
    public static final int LOAD_RESULT_PGO_ATTEMPTED = 65536;
    public static final int LOAD_RESULT_RECOVERED_FROM_BAD_GEN = 64;
    public static final int LOAD_RESULT_RECOVERED_FROM_CORRUPTION = 16;
    public static final int LOAD_RESULT_REGENERATED = 1;
    public static final int LOAD_RESULT_REGEN_FORCED = 32;
    public static final int LOAD_RESULT_WITH_VDEX_ODEX = 524288;
    public static final String MDEX_DIRECTORY = "mdex";
    public static final String MDEX_LOCK_FILENAME = "mdex_lock";
    public static final String MDEX_STATUS_FILENAME = "mdex_status2";
    public static final long MDEX_STATUS_XOR = -374168170706063353L;
    public static final int MS_IN_NS = 1000000;
    public static final byte MULTIDEX_COMPILATION_STRATEGY_EVERY_COLDSTART_DEX = 2;
    public static final byte MULTIDEX_COMPILATION_STRATEGY_EVERY_DEX = 1;
    public static final byte MULTIDEX_COMPILATION_STRATEGY_FIRST_COLDSTART_DEX = 0;
    public static final long NO_TIMESTAMP = 0;
    public static final String ODEX_LOCK_FILENAME = "odex_lock";
    public static final String OPTIMIZATION_HISTORY_LOG_FILENAME = "optimization_history_log";
    public static final String OPTIMIZATION_LOG_FILENAME = "optimization_log";
    public static final byte PGO_COMPILER_FILTER_EVERYTHING_PROFILE = 2;
    public static final byte PGO_COMPILER_FILTER_SPACE_PROFILE = 1;
    public static final byte PGO_COMPILER_FILTER_SPEED_PROFILE = 0;
    public static final byte PGO_COMPILER_FILTER_VERIFY_PROFILE = 3;
    public static final String REGEN_STAMP_FILENAME = "regen_stamp";
    public static final byte STATE_ART_TURBO = 7;
    public static final byte STATE_ART_XDEX = 8;
    public static final byte STATE_BAD_GEN = 5;
    public static final byte STATE_FALLBACK = 2;
    public static final byte STATE_INVALID = 0;
    public static final byte STATE_NOOP = 9;
    public static final byte STATE_REGEN_FORCED = 6;
    public static final byte STATE_RESERVED1 = 10;
    public static final byte STATE_TURBO = 4;
    public static final byte STATE_TX_FAILED = 1;
    public static final byte STATE_XDEX = 3;
    public static final String TMPDIR_LOCK_SUFFIX = ".tmpdir_lock";
    public static final String TMPDIR_SUFFIX = ".tmpdir";
    public static boolean logDexAddPageFaults;
    public static long majPageFaultsDelta;
    public static long pageInBytesDelta;
    public static boolean sAttemptedCrossDexHookInstallation;
    public static long sCachedLastAppUpdateTime;
    public static Throwable sCrossDexHookInstallationError;
    public static DexStoreClock sDexStoreClock = new NormalDexStoreClock();
    public static DexStoreTestHooks sDexStoreTestHooks;
    public static DexStore sListHead;
    public static boolean sLoadedCompressedOreo;
    public static MultiDexClassLoader.Configuration sMergedDexConfig;
    public final ArrayList auxiliaryDexes;

    /* renamed from: id */
    public String f145id;
    public final File mApk;
    public OptimizationHistoryLog mCachedOptimizationHistoryLog;
    public final List mChildStores = new ArrayList();
    public DexIteratorFactory mDexIteratorFactory;
    public DexErrorRecoveryInfo mLastDeri;
    public DexManifest mLoadedManifest;
    public final ReentrantLockFile mLockFile;
    public DexManifest mManifest;
    public String mMegaZipPath = null;
    public final List mParentStores = new ArrayList();
    public ResProvider mResProvider;
    public boolean mUseBgDexOpt = false;
    public final DexStore next = sListHead;
    public final ArrayList primaryDexes;
    public final File root;

    public final class Config {
        public static final byte ART_FILTER_BALANCED = 4;
        public static final byte ART_FILTER_DEFAULT = 0;
        public static final byte ART_FILTER_EVERYTHING = 6;
        public static final byte ART_FILTER_INTERPRET_ONLY = 2;
        public static final byte ART_FILTER_SPACE = 3;
        public static final byte ART_FILTER_SPEED = 5;
        public static final byte ART_FILTER_TIME = 7;
        public static final byte ART_FILTER_VERIFY_NONE = 1;
        public static final byte DALVIK_OPT_ALL = 3;
        public static final byte DALVIK_OPT_DEFAULT = 0;
        public static final byte DALVIK_OPT_FULL = 4;
        public static final byte DALVIK_OPT_NONE = 1;
        public static final byte DALVIK_OPT_VERIFIED = 2;
        public static final byte DALVIK_REGISTER_MAPS_DEFAULT = 0;
        public static final byte DALVIK_REGISTER_MAPS_NO = 1;
        public static final byte DALVIK_REGISTER_MAPS_YES = 2;
        public static final byte DALVIK_VERIFY_ALL = 3;
        public static final byte DALVIK_VERIFY_DEFAULT = 0;
        public static final byte DALVIK_VERIFY_NONE = 1;
        public static final byte DALVIK_VERIFY_REMOTE = 2;
        public static final byte MODE_DEFAULT = 0;
        public static final byte MODE_FORCE_FALLBACK = 1;
        public static final byte MODE_FORCE_TURBO = 2;
        public static final byte MODE_FORCE_XDEX = 3;
        public static final byte SYNC_CONTROL_ASYNC = 1;
        public static final byte SYNC_CONTROL_DEFAULT = 0;
        public static final byte SYNC_CONTROL_SYNC = 2;
        public static final byte VERSION = 7;
        public final byte artFilter;
        public final int artHugeMethodMax;
        public final int artLargeMethodMax;
        public final int artSmallMethodMax;
        public final int artTinyMethodMax;
        public final int artTruncatedDexSize;
        public final byte dalvikOptimize;
        public final byte dalvikRegisterMaps;
        public final byte dalvikVerify;
        public final boolean enableArtVerifyNone;
        public final boolean enableDex2OatQuickening;
        public final boolean enableMixedMode;
        public final boolean enableMixedModeClassPath;
        public final boolean enableMixedModePgo;
        public final boolean enableOatmeal;
        public final boolean enableOatmealQuickening;
        public final boolean enableQuickening;
        public final long minTimeBetweenPgoCompilationMs;
        public final byte mode;
        public final byte multidexCompilationStrategy;
        public final byte pgoCompilerFilter;
        public final byte sync;
        public final boolean tryPeriodicPgoCompilation;

        public final class Builder {
            public byte mArtFilter = 0;
            public int mArtHugeMethodMax = -1;
            public int mArtLargeMethodMax = -1;
            public int mArtSmallMethodMax = -1;
            public int mArtTinyMethodMax = -1;
            public int mArtTruncatedDexSize = -1;
            public byte mDalvikOptimize = 0;
            public byte mDalvikRegisterMaps = 0;
            public byte mDalvikVerify = 0;
            public boolean mDoPeriodicPgoCompilation = false;
            public boolean mEnableArtVerifyNone = false;
            public boolean mEnableDex2OatQuickening = false;
            public boolean mEnableMixedMode = false;
            public boolean mEnableMixedModeClassPath = false;
            public boolean mEnableMixedModePgo = false;
            public boolean mEnableOatmeal = Config.enableOatmealByDefault();
            public boolean mEnableOatmealQuickening = false;
            public boolean mEnableQuickening = false;
            public long mMinTimeBetweenPgoCompilationMs = -1;
            public byte mMode = 0;
            public byte mMultidexCompilationStrategy = 0;
            public byte mPgoCompilerFilter = 0;
            public byte mSync = 0;

            public Config build() {
                byte b = this.mMode;
                byte b2 = this.mSync;
                byte b3 = this.mDalvikVerify;
                byte b4 = this.mDalvikOptimize;
                byte b5 = this.mDalvikRegisterMaps;
                byte b6 = this.mArtFilter;
                int i = this.mArtHugeMethodMax;
                int i2 = this.mArtLargeMethodMax;
                int i3 = this.mArtSmallMethodMax;
                int i4 = this.mArtTinyMethodMax;
                int i5 = this.mArtTruncatedDexSize;
                boolean z = this.mEnableArtVerifyNone;
                boolean z2 = this.mEnableOatmeal;
                byte b7 = b5;
                byte b8 = b6;
                int i6 = i;
                int i7 = i2;
                return new Config(b, b2, b3, b4, b7, b8, i6, i7, i3, i4, i5, z, z2, this.mEnableDex2OatQuickening, this.mEnableOatmealQuickening, this.mEnableQuickening, this.mEnableMixedMode, this.mEnableMixedModeClassPath, this.mEnableMixedModePgo, this.mPgoCompilerFilter, this.mDoPeriodicPgoCompilation, this.mMinTimeBetweenPgoCompilationMs, this.mMultidexCompilationStrategy);
            }

            public Builder setMinTimeBetweenPgoCompilationDays(double d) {
                this.mMinTimeBetweenPgoCompilationMs = convertDaysToMs(d);
                return this;
            }

            public Builder setArtFilter(byte b) {
                this.mArtFilter = b;
                return this;
            }

            public Builder setArtHugeMethodMax(int i) {
                this.mArtHugeMethodMax = i;
                return this;
            }

            public Builder setArtLargeMethodMax(int i) {
                this.mArtLargeMethodMax = i;
                return this;
            }

            public Builder setArtSmallMethodMax(int i) {
                this.mArtSmallMethodMax = i;
                return this;
            }

            public Builder setArtTinyMethodMax(int i) {
                this.mArtTinyMethodMax = i;
                return this;
            }

            public Builder setArtTruncatedDexSize(int i) {
                this.mArtTruncatedDexSize = i;
                return this;
            }

            public Builder setDalvikOptimize(byte b) {
                this.mDalvikOptimize = b;
                return this;
            }

            public Builder setDalvikRegisterMaps(byte b) {
                this.mDalvikRegisterMaps = b;
                return this;
            }

            public Builder setDalvikVerify(byte b) {
                this.mDalvikVerify = b;
                return this;
            }

            public Builder setDoPeriodicPgoCompilation(boolean z) {
                this.mDoPeriodicPgoCompilation = z;
                return this;
            }

            public Builder setEnableArtVerifyNone(boolean z) {
                this.mEnableArtVerifyNone = z;
                return this;
            }

            public Builder setEnableDex2OatQuickening(boolean z) {
                this.mEnableDex2OatQuickening = z;
                return this;
            }

            public Builder setEnableMixedMode(boolean z) {
                this.mEnableMixedMode = z;
                return this;
            }

            public Builder setEnableMixedModeClassPath(boolean z) {
                this.mEnableMixedModeClassPath = z;
                return this;
            }

            public Builder setEnableMixedModePgo(boolean z) {
                this.mEnableMixedModePgo = z;
                return this;
            }

            public Builder setEnableOatmeal(boolean z) {
                this.mEnableOatmeal = z;
                return this;
            }

            public Builder setEnableOatmealQuickening(boolean z) {
                this.mEnableOatmealQuickening = z;
                return this;
            }

            public Builder setEnableQuickening(boolean z) {
                this.mEnableQuickening = z;
                return this;
            }

            public Builder setMinTimeBetweenPgoCompilationMs(long j) {
                this.mMinTimeBetweenPgoCompilationMs = j;
                return this;
            }

            public Builder setMode(byte b) {
                this.mMode = b;
                return this;
            }

            public Builder setMultidexCompilationStrategy(byte b) {
                this.mMultidexCompilationStrategy = b;
                return this;
            }

            public Builder setPgoCompilerFilter(byte b) {
                this.mPgoCompilerFilter = b;
                return this;
            }

            public Builder setSync(byte b) {
                this.mSync = b;
                return this;
            }

            private long convertDaysToMs(double d) {
                return Math.round(d * 8.64E7d);
            }

            public Builder(Config config) {
                this.mMode = config.mode;
                this.mSync = config.sync;
                this.mDalvikVerify = config.dalvikVerify;
                this.mDalvikOptimize = config.dalvikOptimize;
                this.mDalvikRegisterMaps = config.dalvikRegisterMaps;
                this.mArtFilter = config.artFilter;
                this.mArtHugeMethodMax = config.artHugeMethodMax;
                this.mArtLargeMethodMax = config.artLargeMethodMax;
                this.mArtSmallMethodMax = config.artSmallMethodMax;
                this.mArtTinyMethodMax = config.artTinyMethodMax;
                this.mArtTruncatedDexSize = config.artTruncatedDexSize;
                this.mEnableArtVerifyNone = config.enableArtVerifyNone;
                this.mEnableOatmeal = config.enableOatmeal;
                this.mEnableDex2OatQuickening = config.enableDex2OatQuickening;
                this.mEnableOatmealQuickening = config.enableOatmealQuickening;
                this.mEnableQuickening = config.enableQuickening;
                this.mEnableMixedMode = config.enableMixedMode;
                this.mEnableMixedModeClassPath = config.enableMixedModeClassPath;
                this.mEnableMixedModePgo = config.enableMixedModePgo;
                this.mPgoCompilerFilter = config.pgoCompilerFilter;
                this.mDoPeriodicPgoCompilation = config.tryPeriodicPgoCompilation;
                this.mMinTimeBetweenPgoCompilationMs = config.minTimeBetweenPgoCompilationMs;
                this.mMultidexCompilationStrategy = config.multidexCompilationStrategy;
            }
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj != null && getClass() == obj.getClass()) {
                    Config config = (Config) obj;
                    if (!(this.mode == config.mode && this.sync == config.sync && this.dalvikVerify == config.dalvikVerify && this.dalvikOptimize == config.dalvikOptimize && this.dalvikRegisterMaps == config.dalvikRegisterMaps && this.artFilter == config.artFilter && this.artHugeMethodMax == config.artHugeMethodMax && this.artLargeMethodMax == config.artLargeMethodMax && this.artSmallMethodMax == config.artSmallMethodMax && this.artTinyMethodMax == config.artTinyMethodMax && this.artTruncatedDexSize == config.artTruncatedDexSize && this.enableArtVerifyNone == config.enableArtVerifyNone && this.enableOatmeal == config.enableOatmeal && this.enableDex2OatQuickening == config.enableDex2OatQuickening && this.enableOatmealQuickening == config.enableOatmealQuickening && this.enableQuickening == config.enableQuickening && this.enableMixedMode == config.enableMixedMode && this.enableMixedModeClassPath == config.enableMixedModeClassPath && this.enableMixedModePgo == config.enableMixedModePgo && this.pgoCompilerFilter == config.pgoCompilerFilter && this.multidexCompilationStrategy == config.multidexCompilationStrategy && this.tryPeriodicPgoCompilation == config.tryPeriodicPgoCompilation && this.minTimeBetweenPgoCompilationMs == config.minTimeBetweenPgoCompilationMs)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public static boolean enableOatmealByDefault() {
            if (!AnonymousClass0BV.A01) {
                return false;
            }
            return true;
        }

        public static File getConfigFileName(File file) {
            return new File(file, DexStore.CONFIG_FILENAME);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0081, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r0.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0085, code lost:
            throw r1;
         */
        public static Config read(File file) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            if (randomAccessFile.readByte() == 7) {
                Config config = new Config(randomAccessFile.readByte(), randomAccessFile.readByte(), randomAccessFile.readByte(), randomAccessFile.readByte(), randomAccessFile.readByte(), randomAccessFile.readByte(), randomAccessFile.readInt(), randomAccessFile.readInt(), randomAccessFile.readInt(), randomAccessFile.readInt(), randomAccessFile.readInt(), randomAccessFile.readBoolean(), randomAccessFile.readBoolean(), randomAccessFile.readBoolean(), randomAccessFile.readBoolean(), randomAccessFile.readBoolean(), randomAccessFile.readBoolean(), randomAccessFile.readBoolean(), randomAccessFile.readBoolean(), randomAccessFile.readByte(), randomAccessFile.readBoolean(), randomAccessFile.readLong(), randomAccessFile.readByte());
                randomAccessFile.close();
                return config;
            }
            throw new UnsupportedOperationException("unexpected version");
        }

        public boolean equalsForBootstrapPurposes(Config config) {
            if (config != null && config.mode == this.mode && config.sync == this.sync && config.artFilter == this.artFilter && config.enableArtVerifyNone == this.enableArtVerifyNone && config.enableOatmeal == this.enableOatmeal && config.enableDex2OatQuickening == this.enableDex2OatQuickening && config.enableOatmealQuickening == this.enableOatmealQuickening && config.enableMixedMode == this.enableMixedMode && config.enableMixedModeClassPath == this.enableMixedModeClassPath && config.enableMixedModePgo == this.enableMixedModePgo && config.pgoCompilerFilter == this.pgoCompilerFilter && config.multidexCompilationStrategy == this.multidexCompilationStrategy && config.tryPeriodicPgoCompilation == this.tryPeriodicPgoCompilation) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((((((((((((((((((((((((((((((((((((((((((((10571 + this.mode) * 31) + this.sync) * 31) + this.dalvikVerify) * 31) + this.dalvikOptimize) * 31) + this.dalvikRegisterMaps) * 31) + this.artFilter) * 31) + this.artHugeMethodMax) * 31) + this.artLargeMethodMax) * 31) + this.artSmallMethodMax) * 31) + this.artTinyMethodMax) * 31) + this.artTruncatedDexSize) * 31) + (this.enableArtVerifyNone ? 1 : 0)) * 31) + (this.enableOatmeal ? 1 : 0)) * 31) + (this.enableDex2OatQuickening ? 1 : 0)) * 31) + (this.enableOatmealQuickening ? 1 : 0)) * 31) + (this.enableQuickening ? 1 : 0)) * 31) + (this.enableMixedMode ? 1 : 0)) * 31) + (this.enableMixedModeClassPath ? 1 : 0)) * 31) + (this.enableMixedModePgo ? 1 : 0)) * 31) + this.pgoCompilerFilter) * 31) + this.multidexCompilationStrategy) * 31) + (this.tryPeriodicPgoCompilation ? 1 : 0)) * 31) + ((int) this.minTimeBetweenPgoCompilationMs);
        }

        public boolean isDefault() {
            return equals(new Builder().build());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
            r2.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0097, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0093, code lost:
            r0 = move-exception;
         */
        public void writeAndSync(File file) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.writeByte(7);
            randomAccessFile.writeByte(this.mode);
            randomAccessFile.writeByte(this.sync);
            randomAccessFile.writeByte(this.dalvikVerify);
            randomAccessFile.writeByte(this.dalvikOptimize);
            randomAccessFile.writeByte(this.dalvikRegisterMaps);
            randomAccessFile.writeByte(this.artFilter);
            randomAccessFile.writeInt(this.artHugeMethodMax);
            randomAccessFile.writeInt(this.artLargeMethodMax);
            randomAccessFile.writeInt(this.artSmallMethodMax);
            randomAccessFile.writeInt(this.artTinyMethodMax);
            randomAccessFile.writeInt(this.artTruncatedDexSize);
            randomAccessFile.writeBoolean(this.enableArtVerifyNone);
            randomAccessFile.writeBoolean(this.enableOatmeal);
            randomAccessFile.writeBoolean(this.enableDex2OatQuickening);
            randomAccessFile.writeBoolean(this.enableOatmealQuickening);
            randomAccessFile.writeBoolean(this.enableQuickening);
            randomAccessFile.writeBoolean(this.enableMixedMode);
            randomAccessFile.writeBoolean(this.enableMixedModeClassPath);
            randomAccessFile.writeBoolean(this.enableMixedModePgo);
            randomAccessFile.writeByte(this.pgoCompilerFilter);
            randomAccessFile.writeBoolean(this.tryPeriodicPgoCompilation);
            randomAccessFile.writeLong(this.minTimeBetweenPgoCompilationMs);
            randomAccessFile.writeByte(this.multidexCompilationStrategy);
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            randomAccessFile.getFD().sync();
            randomAccessFile.close();
        }

        public static Config readFromRoot(File file) {
            return read(getConfigFileName(file));
        }

        public byte[] readDepBlock() {
            Parcel obtain = Parcel.obtain();
            try {
                obtain.writeByte(this.mode);
                obtain.writeByte(this.sync);
                obtain.writeByte(this.dalvikVerify);
                obtain.writeByte(this.dalvikOptimize);
                obtain.writeByte(this.dalvikRegisterMaps);
                obtain.writeByte(this.artFilter);
                obtain.writeInt(this.artHugeMethodMax);
                obtain.writeInt(this.artLargeMethodMax);
                obtain.writeInt(this.artSmallMethodMax);
                obtain.writeInt(this.artTinyMethodMax);
                int i = 0;
                obtain.writeBooleanArray(new boolean[]{this.enableArtVerifyNone, this.enableOatmeal, this.enableDex2OatQuickening, this.enableOatmealQuickening, this.enableQuickening, this.enableMixedMode, this.enableMixedModeClassPath, this.enableMixedModePgo});
                obtain.writeByte(this.pgoCompilerFilter);
                if (this.tryPeriodicPgoCompilation) {
                    i = 1;
                }
                obtain.writeByte((byte) i);
                obtain.writeLong(this.minTimeBetweenPgoCompilationMs);
                obtain.writeByte(this.multidexCompilationStrategy);
                return obtain.marshall();
            } finally {
                obtain.recycle();
            }
        }

        public Config(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, byte b7, boolean z9, long j, byte b8) {
            this.mode = b;
            this.sync = b2;
            this.dalvikVerify = b3;
            this.dalvikOptimize = b4;
            this.dalvikRegisterMaps = b5;
            this.artFilter = b6;
            this.artHugeMethodMax = i;
            this.artLargeMethodMax = i2;
            this.artSmallMethodMax = i3;
            this.artTinyMethodMax = i4;
            this.artTruncatedDexSize = i5;
            this.enableArtVerifyNone = z;
            this.enableOatmeal = z2;
            this.enableDex2OatQuickening = z3;
            this.enableOatmealQuickening = z4;
            this.enableQuickening = z5;
            this.enableMixedMode = z6;
            this.enableMixedModeClassPath = z7;
            this.enableMixedModePgo = z8;
            this.pgoCompilerFilter = b7;
            this.tryPeriodicPgoCompilation = z9;
            this.minTimeBetweenPgoCompilationMs = j;
            this.multidexCompilationStrategy = b8;
        }
    }

    public interface DexStoreClock {
        long now();
    }

    public interface DexStoreTestHooks {
        void onSecondaryDexesUnpackedForRecompilation();
    }

    public interface ExternalProcessProgressListener {
        void onCheckpoint();

        void onComplete(int i);
    }

    public final class FinishRegenerationThread extends Thread {
        public final ReentrantLockFile.Lock mHeldLock;
        public final long mNewStatus;
        public final OdexScheme mOdexScheme;

        public FinishRegenerationThread(OdexScheme odexScheme, ReentrantLockFile.Lock lock, long j) {
            super(AnonymousClass000.A0E("TxFlush-", DexStore.this.root.getName()));
            this.mHeldLock = lock;
            this.mNewStatus = j;
            this.mOdexScheme = odexScheme;
        }

        public void run() {
            try {
                Mlog.safeFmt("running syncer thread", new Object[0]);
                for (String file : this.mOdexScheme.expectedFiles) {
                    File file2 = new File(DexStore.this.root, file);
                    if (file2.exists()) {
                        DalvikInternals.fsyncNamed(file2.getCanonicalPath(), -1);
                    }
                }
                DexStore.this.writeStatusLocked(this.mNewStatus);
                this.mHeldLock.close();
                Mlog.safeFmt("finished syncer thread: initial regeneration of dex store %s complete", DexStore.this.root);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
                this.mHeldLock.close();
                throw th;
            }
        }
    }

    public final class OptimizationHistoryLog {
        public static final long NO_TIME_DELTA = -1;
        public static final int SUCCESS = 2;
        public final File file;
        public final long lastFileModifiedTime;
        public final long lastOptedAppUpgradeTimestamp;
        public final long lastSuccessfulOptimizationTimestampMs;
        public final long optStatus;
        public final long schemeStatus;

        public static File getDefaultFile(File file2) {
            return new File(file2, DexStore.OPTIMIZATION_HISTORY_LOG_FILENAME);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
            r0 = move-exception;
         */
        public static OptimizationHistoryLog read(File file2) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "r");
            OptimizationHistoryLog optimizationHistoryLog = new OptimizationHistoryLog(DexStore.sanityCheckTimestamp(randomAccessFile.readLong()), randomAccessFile.readLong(), randomAccessFile.readLong(), randomAccessFile.readLong(), DexStore.lastModifiedTime(file2), file2);
            Mlog.safeFmt("Read opt history log %s", optimizationHistoryLog);
            randomAccessFile.close();
            return optimizationHistoryLog;
        }

        public boolean isLogFileAsFromRoot(File file2) {
            if (file2 != null) {
                return getDefaultFile(file2).equals(this.file);
            }
            if (this.file == null) {
                return true;
            }
            return false;
        }

        public boolean isNotDefault() {
            if (this.file != null) {
                return true;
            }
            return false;
        }

        public boolean isOutOfDate() {
            if (DexStore.lastModifiedTime(this.file) != this.lastFileModifiedTime) {
                return true;
            }
            return false;
        }

        public boolean lastCompilationSessionWasASuccess() {
            if ((this.optStatus & 2) != 0) {
                return true;
            }
            return false;
        }

        public long timeDeltaFromLastCompilationSessionMs() {
            if (this.lastSuccessfulOptimizationTimestampMs == 0) {
                return -1;
            }
            long now = DexStore.sDexStoreClock.now();
            long j = this.lastSuccessfulOptimizationTimestampMs;
            if (j <= now) {
                return now - j;
            }
            return -1;
        }

        public String toString() {
            String str;
            String str2;
            StringBuilder sb = new StringBuilder("[ Opt History Log: ");
            sb.append("Default: ");
            sb.append(!isNotDefault());
            sb.append(", ");
            sb.append("Last Compile time: ");
            sb.append(this.lastSuccessfulOptimizationTimestampMs);
            sb.append(" ms, ");
            sb.append("Delta: ");
            sb.append(timeDeltaFromLastCompilationSessionMs());
            sb.append(" ms, ");
            sb.append("Opt Status: ");
            sb.append(this.optStatus);
            sb.append(" (");
            if (lastCompilationSessionWasASuccess()) {
                str = "success";
            } else {
                str = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE;
            }
            sb.append(str);
            sb.append("), ");
            sb.append("Scheme Status: ");
            sb.append(this.schemeStatus);
            sb.append(", ");
            sb.append("Last app update time: ");
            sb.append(this.lastOptedAppUpgradeTimestamp);
            sb.append(" ms, ");
            sb.append("File: ");
            File file2 = this.file;
            if (file2 != null) {
                str2 = file2.getAbsolutePath();
            } else {
                str2 = "None";
            }
            sb.append(str2);
            sb.append(']');
            return sb.toString();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
            r2.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
            r0 = move-exception;
         */
        public void writeToDisk(File file2) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
            randomAccessFile.writeLong(this.lastSuccessfulOptimizationTimestampMs);
            randomAccessFile.writeLong(this.optStatus);
            randomAccessFile.writeLong(this.schemeStatus);
            randomAccessFile.writeLong(this.lastOptedAppUpgradeTimestamp);
            randomAccessFile.getFD().sync();
            randomAccessFile.close();
        }

        public static boolean canUseHistoryLogForThisApp(Context context, OptimizationHistoryLog optimizationHistoryLog) {
            long appUpgradeTimestamp = DexStore.getAppUpgradeTimestamp(context);
            if (appUpgradeTimestamp == 0) {
                Mlog.m35w("Found not app version", new Object[0]);
                return false;
            }
            Mlog.m35w("Comparing new %d to old %s", Long.valueOf(appUpgradeTimestamp), Long.valueOf(optimizationHistoryLog.lastOptedAppUpgradeTimestamp));
            if (appUpgradeTimestamp == optimizationHistoryLog.lastOptedAppUpgradeTimestamp) {
                return true;
            }
            return false;
        }

        public static void clearHistoryLog(File file2) {
            getDefaultFile(file2).delete();
        }

        public static OptimizationHistoryLog readOrMakeDefault(Context context, File file2) {
            try {
                OptimizationHistoryLog read = read(file2);
                if (canUseHistoryLogForThisApp(context, read)) {
                    return read;
                }
                Mlog.safeFmt("Could not use previous history log since it was for a different version or corrupted. optHistoryLog: %s", read);
                return new OptimizationHistoryLog();
            } catch (IOException unused) {
                return new OptimizationHistoryLog();
            }
        }

        public static OptimizationHistoryLog readOrMakeDefaultFromRoot(Context context, File file2) {
            return readOrMakeDefault(context, getDefaultFile(file2));
        }

        public static void writeNewStatus(Context context, File file2, boolean z, long j) {
            long j2;
            String str;
            File defaultFile = getDefaultFile(file2);
            if (z) {
                j2 = 2;
            } else {
                j2 = 0;
            }
            long now = DexStore.sDexStoreClock.now();
            long appUpgradeTimestamp = DexStore.getAppUpgradeTimestamp(context);
            Object[] objArr = new Object[6];
            if (z) {
                str = "success";
            } else {
                str = "error";
            }
            objArr[0] = str;
            objArr[1] = Long.valueOf(j2);
            long j3 = j;
            objArr[2] = Long.valueOf(j3);
            objArr[3] = Long.valueOf(appUpgradeTimestamp);
            objArr[4] = Long.valueOf(now);
            objArr[5] = defaultFile.getAbsolutePath();
            Mlog.safeFmt("Writing optimization history log %s [opt status: %d scheme status: %d] (app last update time %d) at %d ms for %s", objArr);
            OptimizationHistoryLog optimizationHistoryLog = new OptimizationHistoryLog(now, j2, j3, appUpgradeTimestamp, 0, defaultFile);
            optimizationHistoryLog.writeToDisk(defaultFile);
            Mlog.safeFmt("Wrote optimization history log %s", optimizationHistoryLog);
        }

        public OptimizationHistoryLog() {
            this(0, 0, 0, 0, 0, (File) null);
        }

        public OptimizationHistoryLog(long j, long j2, long j3, long j4, long j5, File file2) {
            this.lastSuccessfulOptimizationTimestampMs = j;
            this.optStatus = j2;
            this.schemeStatus = j3;
            this.lastOptedAppUpgradeTimestamp = j4;
            this.lastFileModifiedTime = j5;
            this.file = file2;
        }
    }

    public final class OptimizationLog {
        public static final int COMPLETE = 1;
        public static final int COUNTER_AWAKE_MS = 0;
        public static final int COUNTER_AWAKE_RUN_MS = 3;
        public static final int COUNTER_AWAKE_YIELD_MS = 2;
        public static final int COUNTER_REAL_TIME_MS = 1;
        public static final int NR_COUNTERS = 4;
        public static final int SUCCESS = 2;
        public long[] counters = new long[4];
        public int flags = 0;
        public boolean isNotDefault = false;
        public long[] lastAttemptCounters = new long[4];
        public String lastFailureExceptionJson = "";
        public int nrOptimizationsAttempted = 0;
        public int nrOptimizationsFailed = 0;

        public static String getCounterName(int i) {
            if (i == 0) {
                return "COUNTER_AWAKE_MS";
            }
            if (i == 1) {
                return "COUNTER_AWAKE_REAL_TIME_MS";
            }
            if (i == 2) {
                return "COUNTER_AWAKE_YIELD_MS";
            }
            if (i == 3) {
                return "COUNTER_AWAKE_RUN_MS";
            }
            throw new AssertionError(AnonymousClass000.A05("unknown counter ", i));
        }

        public static File getDefaultFile(File file) {
            return new File(file, DexStore.OPTIMIZATION_LOG_FILENAME);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            r4.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
            throw r0;
         */
        public static OptimizationLog read(File file) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            OptimizationLog optimizationLog = new OptimizationLog();
            optimizationLog.flags = randomAccessFile.readInt();
            optimizationLog.nrOptimizationsAttempted = randomAccessFile.readInt();
            optimizationLog.nrOptimizationsFailed = randomAccessFile.readInt();
            for (int i = 0; i < 4; i++) {
                optimizationLog.counters[i] = randomAccessFile.readLong();
                optimizationLog.lastAttemptCounters[i] = randomAccessFile.readLong();
            }
            optimizationLog.lastFailureExceptionJson = randomAccessFile.readUTF();
            optimizationLog.isNotDefault = true;
            randomAccessFile.close();
            return optimizationLog;
        }

        public boolean isNotDefault() {
            return this.isNotDefault;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            r3.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
            throw r0;
         */
        public void write(File file) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.writeInt(this.flags);
            randomAccessFile.writeInt(this.nrOptimizationsAttempted);
            randomAccessFile.writeInt(this.nrOptimizationsFailed);
            for (int i = 0; i < 4; i++) {
                randomAccessFile.writeLong(this.counters[i]);
                randomAccessFile.writeLong(this.lastAttemptCounters[i]);
            }
            randomAccessFile.writeUTF(this.lastFailureExceptionJson);
            randomAccessFile.getFD().sync();
            randomAccessFile.close();
        }

        public static OptimizationLog readFromRoot(File file) {
            return read(getDefaultFile(file));
        }

        public static OptimizationLog readOrMakeDefault(File file) {
            try {
                return read(file);
            } catch (FileNotFoundException unused) {
                return new OptimizationLog();
            }
        }

        public static OptimizationLog readOrMakeDefaultFromRoot(File file) {
            return readOrMakeDefault(getDefaultFile(file));
        }

        public void writeFromRoot(File file) {
            write(getDefaultFile(file));
        }
    }

    public final class OptimizationSession implements Closeable {
        public static final int PHASE_RUNNING = 0;
        public static final int PHASE_YIELDING = 1;
        public long accumulatedRunNs;
        public long accumulatedYieldNs;
        public final OptimizationConfiguration config;
        public final OptimizationConfiguration.Provider configProvider;
        public final Config dexStoreConfig;
        public final boolean inForeground;
        public final Context mContext;
        public final ReentrantLockFile mOptLockFile;
        public final FileInputStream mRegenStampFile;
        public final int optimizationAttemptNumber;
        public final long startRealtimeMs;
        public final long startUptimeMs;

        public final class Job implements Closeable {
            public static final int PHASE_COMMITTING = 2;
            public static final int PHASE_DONE = 3;
            public static final int PHASE_OPTIMIZING = 1;
            public static final int PHASE_PREPARING = 0;
            public final long initialStatus;
            public ReentrantLockFile.Lock mCommitLock;
            public ReentrantLockFile.Lock mOptLock;
            public int mPhase;

            public Job() {
                try {
                    this.mCommitLock = DexStore.this.mLockFile.acquireInterruptubly(0);
                    long readStatusLocked = DexStore.readStatusLocked(DexStore.this);
                    this.initialStatus = readStatusLocked;
                    checkBadStatus(readStatusLocked);
                } catch (Throwable th) {
                    close();
                    throw th;
                }
            }

            private void checkBadStatus(long j) {
                byte b = (byte) ((int) (15 & j));
                if (b == 0 || b == 1 || b == 5 || b >= 10) {
                    throw new OptimizationCanceledException(String.format("bad status %x for dex store %s starting tx", new Object[]{Long.valueOf(j), DexStore.this.root}));
                } else {
                    OptimizationSession.this.checkShouldStop();
                }
            }

            public void close() {
                ReentrantLockFile.Lock lock = this.mCommitLock;
                if (lock != null) {
                    lock.close();
                    this.mCommitLock = null;
                }
                ReentrantLockFile.Lock lock2 = this.mOptLock;
                if (lock2 != null) {
                    lock2.close();
                    this.mOptLock = null;
                }
            }

            public void finishCommit(long j) {
                boolean z = false;
                if (this.mPhase == 2) {
                    z = true;
                }
                Mlog.assertThat(z, "wrong phase", new Object[0]);
                DexStore.this.writeStatusLocked(j);
                this.mCommitLock.close();
                this.mCommitLock = null;
                this.mPhase = 3;
            }

            public void startOptimizing() {
                boolean z = false;
                if (this.mPhase == 0) {
                    z = true;
                }
                Mlog.assertThat(z, "wrong phase", new Object[0]);
                this.mOptLock = OptimizationSession.this.mOptLockFile.acquireInterruptubly(1);
                this.mCommitLock.close();
                this.mCommitLock = null;
                this.mPhase = 1;
            }

            public long startCommitting() {
                return startCommitting(0);
            }

            public long startCommitting(long j) {
                int i = this.mPhase;
                boolean z = false;
                if (i == 1) {
                    z = true;
                }
                Mlog.assertThat(z, "wrong phase: %s", Integer.valueOf(i));
                this.mOptLock.close();
                this.mOptLock = null;
                this.mCommitLock = DexStore.this.mLockFile.acquireInterruptubly(0);
                long readStatusLocked = DexStore.readStatusLocked(DexStore.this);
                checkBadStatus(readStatusLocked);
                long j2 = j | readStatusLocked;
                DexStore.this.writeStatusLocked(1 | (j2 << 4));
                this.mPhase = 2;
                return j2;
            }
        }

        private byte determineOptimizationFailureState(byte b) {
            if (b == 8) {
                return 7;
            }
            return b == 3 ? (byte) 4 : 5;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
            if (r1 != null) goto L_0x001a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x001d */
        public void copeWithOptimizationFailure(Throwable th) {
            try {
                ReentrantLockFile.Lock acquire = DexStore.this.mLockFile.acquire(0);
                checkShouldStop();
                copeWithOptimizationFailureImpl(th);
                if (acquire != null) {
                    acquire.close();
                }
            } catch (Throwable th2) {
                Mlog.m36w(th2, "recording optimization failure itself failed", new Object[0]);
            }
        }

        private int incrementOptimizationAttempts(OptimizationLog optimizationLog) {
            int i = optimizationLog.nrOptimizationsAttempted;
            if (i >= 1) {
                return 1 + i;
            }
            return 1;
        }

        private int resumeProcess(Process process) {
            process.kill(18);
            return process.waitFor(-1, 5);
        }

        private boolean shouldWriteOptimizationHistoryLog(OptimizationLog optimizationLog) {
            if ((optimizationLog.flags & 1) == 0) {
                return false;
            }
            return true;
        }

        private int stopProcess(Process process) {
            process.kill(20);
            return process.waitFor(-1, 6);
        }

        private void updateOptimizationLogCounters(OptimizationLog optimizationLog) {
            long[] jArr = optimizationLog.lastAttemptCounters;
            jArr[0] = SystemClock.uptimeMillis() - this.startUptimeMs;
            jArr[1] = SystemClock.elapsedRealtime() - this.startRealtimeMs;
            jArr[3] = this.accumulatedRunNs / 1000000;
            jArr[2] = this.accumulatedYieldNs / 1000000;
            for (int i = 0; i < 4; i++) {
                long[] jArr2 = optimizationLog.counters;
                jArr2[i] = jArr2[i] + jArr[i];
            }
        }

        public void checkShouldStop() {
            if (DalvikInternals.getOpenFileLinkCount(C0024Fd.fileno(this.mRegenStampFile.getFD())) == 0) {
                throw new OptimizationCanceledException("obsolete optimization: regeneration pending");
            }
        }

        public void close() {
            C0015Fs.safeClose((Closeable) this.mOptLockFile);
            C0015Fs.safeClose((Closeable) this.mRegenStampFile);
        }

        public void copeWithOptimizationFailureImpl(Throwable th) {
            OptimizationLog readOrMakeDefaultFromRoot = OptimizationLog.readOrMakeDefaultFromRoot(DexStore.this.root);
            Mlog.m36w(th, "optimization failed (%s failures already)", Integer.valueOf(readOrMakeDefaultFromRoot.nrOptimizationsFailed));
            long readStatusLocked = DexStore.readStatusLocked(DexStore.this);
            byte b = (byte) ((int) (15 & readStatusLocked));
            updateOptimizationLogCounters(readOrMakeDefaultFromRoot);
            readOrMakeDefaultFromRoot.nrOptimizationsFailed++;
            try {
                StringWriter stringWriter = new StringWriter();
                JsonWriter jsonWriter = new JsonWriter(stringWriter);
                AnonymousClass0D0.A00(jsonWriter, th);
                jsonWriter.close();
                readOrMakeDefaultFromRoot.lastFailureExceptionJson = stringWriter.toString();
                int i = readOrMakeDefaultFromRoot.nrOptimizationsFailed;
                int i2 = this.config.maximumOptimizationAttempts;
                if (i >= i2) {
                    Mlog.m35w("too many optimization failures (threshold is %s): will not keep trying", Integer.valueOf(i2));
                    readStatusLocked = (long) determineOptimizationFailureState(b);
                    readOrMakeDefaultFromRoot.flags |= 1;
                }
                writeCurrentStateFromRoot(readOrMakeDefaultFromRoot, readStatusLocked);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public OptimizationHistoryLog getOptimizationHistoryLog() {
            DexStore dexStore = DexStore.this;
            return DexStore.getCurrentOptHistoryLogFromRoot(dexStore, this.mContext, dexStore.root);
        }

        public int maxOptimizationAttempts() {
            return this.config.maximumOptimizationAttempts;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
            if (r2 != null) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            r2.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
            throw r0;
         */
        public void noteOptimizationSuccess() {
            ReentrantLockFile.Lock acquire = DexStore.this.mLockFile.acquire(0);
            if (!this.inForeground) {
                checkShouldStop();
            }
            OptimizationLog readOrMakeDefaultFromRoot = OptimizationLog.readOrMakeDefaultFromRoot(DexStore.this.root);
            readOrMakeDefaultFromRoot.flags |= 3;
            updateOptimizationLogCounters(readOrMakeDefaultFromRoot);
            writeCurrentStateWithCurrentStatusFromRoot(readOrMakeDefaultFromRoot);
            if (acquire != null) {
                acquire.close();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0084 A[LOOP:0: B:1:0x0015->B:27:0x0084, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0070 A[SYNTHETIC] */
        public int waitForAndManageProcess(Process process, ExternalProcessProgressListener externalProcessProgressListener) {
            long j;
            long nanoTime = System.nanoTime();
            long j2 = nanoTime / 1000000;
            long j3 = nanoTime;
            long j4 = j2;
            boolean z = false;
            int i = Process.WAIT_RESULT_TIMEOUT;
            while (true) {
                OptimizationConfiguration instantaneous = this.configProvider.getInstantaneous();
                long j5 = j2 - j4;
                Process process2 = process;
                if (!z) {
                    this.accumulatedRunNs += nanoTime - j3;
                    j = (long) instantaneous.optTimeSliceMs;
                    if (j5 >= j) {
                        if (instantaneous.yieldTimeSliceMs > 0) {
                            Mlog.safeFmt("beginning yield", new Object[0]);
                            i = stopProcess(process2);
                            if (i == -2147483647) {
                                i = Process.WAIT_RESULT_TIMEOUT;
                            }
                            z = true;
                        }
                    }
                    if (i == Integer.MIN_VALUE) {
                        int i2 = instantaneous.processPollMs;
                        long j6 = j - j5;
                        if (j6 < ((long) i2)) {
                            i2 = (int) j6;
                        }
                        if (i2 < 0) {
                            i2 = 0;
                        }
                        i = process2.waitFor(i2, 4);
                    }
                    checkShouldStop();
                    long nanoTime2 = System.nanoTime();
                    j2 = nanoTime2 / 1000000;
                    ExternalProcessProgressListener externalProcessProgressListener2 = externalProcessProgressListener;
                    if (externalProcessProgressListener != null) {
                        externalProcessProgressListener2.onCheckpoint();
                    }
                    if (i != Integer.MIN_VALUE) {
                        Mlog.safeFmt("process exited with status %s", Integer.valueOf(i));
                        if (externalProcessProgressListener != null) {
                            externalProcessProgressListener2.onComplete(i);
                        }
                        return i;
                    }
                    j3 = nanoTime;
                    nanoTime = nanoTime2;
                } else if (z) {
                    this.accumulatedYieldNs += nanoTime - j3;
                    j = (long) instantaneous.yieldTimeSliceMs;
                    if (j5 >= j) {
                        if (instantaneous.optTimeSliceMs > 0) {
                            Mlog.safeFmt("ending yield", new Object[0]);
                            int resumeProcess = resumeProcess(process2);
                            if (resumeProcess == -2147483646) {
                                resumeProcess = Process.WAIT_RESULT_TIMEOUT;
                            }
                            z = false;
                        }
                    }
                    if (i == Integer.MIN_VALUE) {
                    }
                    checkShouldStop();
                    long nanoTime22 = System.nanoTime();
                    j2 = nanoTime22 / 1000000;
                    ExternalProcessProgressListener externalProcessProgressListener22 = externalProcessProgressListener;
                    if (externalProcessProgressListener != null) {
                    }
                    if (i != Integer.MIN_VALUE) {
                    }
                } else {
                    throw new AssertionError();
                }
                j4 = j2;
                if (i == Integer.MIN_VALUE) {
                }
                checkShouldStop();
                long nanoTime222 = System.nanoTime();
                j2 = nanoTime222 / 1000000;
                ExternalProcessProgressListener externalProcessProgressListener222 = externalProcessProgressListener;
                if (externalProcessProgressListener != null) {
                }
                if (i != Integer.MIN_VALUE) {
                }
            }
        }

        public OptimizationSession(Context context, OptimizationConfiguration.Provider provider, boolean z) {
            ReentrantLockFile reentrantLockFile;
            this.mContext = context.getApplicationContext() != null ? context.getApplicationContext() : context;
            OptimizationLog readOrMakeDefaultFromRoot = OptimizationLog.readOrMakeDefaultFromRoot(DexStore.this.root);
            int incrementOptimizationAttempts = incrementOptimizationAttempts(readOrMakeDefaultFromRoot);
            readOrMakeDefaultFromRoot.nrOptimizationsAttempted = incrementOptimizationAttempts;
            this.optimizationAttemptNumber = incrementOptimizationAttempts;
            writeCurrentStateWithCurrentStatusFromRoot(readOrMakeDefaultFromRoot, false);
            this.dexStoreConfig = DexStore.this.readConfig();
            this.inForeground = z;
            this.startUptimeMs = SystemClock.uptimeMillis();
            this.startRealtimeMs = SystemClock.elapsedRealtime();
            FileInputStream fileInputStream = null;
            try {
                this.configProvider = provider;
                this.config = provider.baseline;
                FileInputStream fileInputStream2 = new FileInputStream(new File(DexStore.this.root, DexStore.REGEN_STAMP_FILENAME));
                try {
                    reentrantLockFile = ReentrantLockFile.open(new File(DexStore.this.root, DexStore.ODEX_LOCK_FILENAME));
                } catch (Throwable th) {
                    th = th;
                    reentrantLockFile = null;
                    fileInputStream = fileInputStream2;
                    C0015Fs.safeClose((Closeable) fileInputStream);
                    C0015Fs.safeClose((Closeable) reentrantLockFile);
                    throw th;
                }
                try {
                    this.mRegenStampFile = fileInputStream2;
                    try {
                        this.mOptLockFile = reentrantLockFile;
                        C0015Fs.safeClose((Closeable) null);
                        C0015Fs.safeClose((Closeable) null);
                    } catch (Throwable th2) {
                        th = th2;
                        C0015Fs.safeClose((Closeable) fileInputStream);
                        C0015Fs.safeClose((Closeable) reentrantLockFile);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream = fileInputStream2;
                    C0015Fs.safeClose((Closeable) fileInputStream);
                    C0015Fs.safeClose((Closeable) reentrantLockFile);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                reentrantLockFile = null;
                C0015Fs.safeClose((Closeable) fileInputStream);
                C0015Fs.safeClose((Closeable) reentrantLockFile);
                throw th;
            }
        }

        private void writeCurrentStateFromRoot(OptimizationLog optimizationLog, long j) {
            writeCurrentStateFromRoot(optimizationLog, j, shouldWriteOptimizationHistoryLog(optimizationLog));
        }

        private void writeCurrentStateFromRoot(OptimizationLog optimizationLog, long j, boolean z) {
            DexStore.writeTxFailedStatusLocked(DexStore.this, j);
            boolean z2 = false;
            if ((optimizationLog.flags & 2) != 0) {
                z2 = true;
            }
            optimizationLog.writeFromRoot(DexStore.this.root);
            if (z) {
                OptimizationHistoryLog.writeNewStatus(this.mContext, DexStore.this.root, z2, j);
            }
            DexStore.this.writeStatusLocked(j);
        }

        private void writeCurrentStateWithCurrentStatusFromRoot(OptimizationLog optimizationLog) {
            writeCurrentStateWithCurrentStatusFromRoot(optimizationLog, shouldWriteOptimizationHistoryLog(optimizationLog));
        }

        private void writeCurrentStateWithCurrentStatusFromRoot(OptimizationLog optimizationLog, boolean z) {
            writeCurrentStateFromRoot(optimizationLog, DexStore.readStatusLocked(DexStore.this), z);
        }
    }

    public class PreviewSdkHelper {
        public static boolean isPreviewSdk() {
            if (Build.VERSION.PREVIEW_SDK_INT != 0) {
                return true;
            }
            return false;
        }
    }

    public class ProgressListener {
        public void onProgress(int i, int i2, boolean z) {
        }
    }

    public final class TmpDir implements Closeable {
        public File directory;
        public ReentrantLockFile.Lock mTmpDirLock;

        public TmpDir(ReentrantLockFile.Lock lock, File file) {
            this.mTmpDirLock = lock;
            this.directory = file;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r2.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
            if (r2 != null) goto L_0x0029;
         */
        public void close() {
            if (this.mTmpDirLock != null) {
                ReentrantLockFile.Lock acquire = DexStore.this.mLockFile.acquire(0);
                ReentrantLockFile.Lock lock = this.mTmpDirLock;
                File file = ReentrantLockFile.this.lockFileName;
                lock.close();
                this.mTmpDirLock = null;
                C0015Fs.deleteRecursiveNoThrow(file);
                C0015Fs.deleteRecursiveNoThrow(this.directory);
                this.directory = null;
                if (acquire != null) {
                    acquire.close();
                }
            }
        }
    }

    private void deleteFiles(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null) {
                Mlog.safeFmt("deleting existing file %s/%s", this.root, strArr[i]);
                C0015Fs.deleteRecursive(new File(this.root, strArr[i]));
            }
        }
    }

    private int findInArray(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            if (str.equals(strArr[i])) {
                return i;
            }
        }
        return -1;
    }

    public static String printRelativeTime(long j, long j2) {
        return String.format("%d (%d ms ago)", new Object[]{Long.valueOf(j2), Long.valueOf(j - j2)});
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:373)
        	at java.base/java.util.ArrayList.get(ArrayList.java:425)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d A[Catch:{ Exception -> 0x0040, all -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006e A[Catch:{ Exception -> 0x0040, all -> 0x00a2 }] */
    private byte[] readCurrentDepBlock() {
        /*
            r8 = this;
            r5 = 1
            r6 = 0
            r7 = 0
            java.io.File r0 = r8.mApk     // Catch:{ Exception -> 0x000a }
            java.io.File r7 = determineOdexCacheName(r0)     // Catch:{ Exception -> 0x000a }
            goto L_0x0014
        L_0x000a:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r6] = r7
            java.lang.String r0 = "error reading odex cache file %s"
            com.facebook.common.dextricks.Mlog.m36w(r2, r0, r1)
        L_0x0014:
            android.os.Parcel r3 = android.os.Parcel.obtain()
            if (r7 == 0) goto L_0x004a
            boolean r0 = r7.exists()     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x004a
            com.facebook.common.dextricks.DexStore[] r4 = r8.getParents()     // Catch:{ Exception -> 0x0040 }
            int r2 = r4.length     // Catch:{ Exception -> 0x0040 }
            r1 = 0
        L_0x0026:
            if (r1 >= r2) goto L_0x0034
            r0 = r4[r1]     // Catch:{ Exception -> 0x0040 }
            byte[] r0 = r0.readCurrentDepBlock()     // Catch:{ Exception -> 0x0040 }
            r3.writeByteArray(r0)     // Catch:{ Exception -> 0x0040 }
            int r1 = r1 + 1
            goto L_0x0026
        L_0x0034:
            java.lang.String r0 = r7.getPath()     // Catch:{ Exception -> 0x0040 }
            byte[] r0 = com.facebook.common.dextricks.DalvikInternals.readOdexDepBlock(r0)     // Catch:{ Exception -> 0x0040 }
            r3.writeByteArray(r0)     // Catch:{ Exception -> 0x0040 }
            goto L_0x004b
        L_0x0040:
            r2 = move-exception
            java.lang.String r1 = "could not read odex dep block: using modtime: %s"
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x00a2 }
            r0[r6] = r2     // Catch:{ all -> 0x00a2 }
            com.facebook.common.dextricks.Mlog.safeFmt(r1, r0)     // Catch:{ all -> 0x00a2 }
        L_0x004a:
            r5 = 0
        L_0x004b:
            if (r5 != 0) goto L_0x006a
            java.io.File r0 = r8.mApk     // Catch:{ all -> 0x00a2 }
            long r1 = r0.lastModified()     // Catch:{ all -> 0x00a2 }
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0088
            java.io.File r0 = r8.mApk     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x00a2 }
            r3.writeString(r0)     // Catch:{ all -> 0x00a2 }
            r3.writeLong(r1)     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = android.os.Build.FINGERPRINT     // Catch:{ all -> 0x00a2 }
            r3.writeString(r0)     // Catch:{ all -> 0x00a2 }
        L_0x006a:
            boolean r0 = p000X.AnonymousClass0BV.A01     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x0071
            r3.writeByte(r6)     // Catch:{ all -> 0x00a2 }
        L_0x0071:
            java.lang.Class<X.0YV> r0 = p000X.AnonymousClass0YV.class
            monitor-enter(r0)     // Catch:{ all -> 0x00a2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a2 }
            com.facebook.common.dextricks.DexStore$Config r0 = r8.readConfig()     // Catch:{ all -> 0x00a2 }
            byte[] r0 = r0.readDepBlock()     // Catch:{ all -> 0x00a2 }
            r3.writeByteArray(r0)     // Catch:{ all -> 0x00a2 }
            byte[] r0 = r3.marshall()     // Catch:{ all -> 0x00a2 }
            r3.recycle()
            return r0
        L_0x0088:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x00a2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a2 }
            r1.<init>()     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = "unable to get modtime of "
            r1.append(r0)     // Catch:{ all -> 0x00a2 }
            java.io.File r0 = r8.mApk     // Catch:{ all -> 0x00a2 }
            r1.append(r0)     // Catch:{ all -> 0x00a2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00a2 }
            r2.<init>(r0)     // Catch:{ all -> 0x00a2 }
            throw r2     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r0 = move-exception
            r3.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStore.readCurrentDepBlock():byte[]");
    }

    public static void setClock(DexStoreClock dexStoreClock) {
        Mlog.safeFmt("Setting dexstore clock override", new Object[0]);
        sDexStoreClock = dexStoreClock;
    }

    public static void setDexStoreTestHooks(DexStoreTestHooks dexStoreTestHooks) {
        Mlog.safeFmt("Setting dexstore test hooks", new Object[0]);
        sDexStoreTestHooks = dexStoreTestHooks;
    }

    private void setDifference(String[] strArr, String[] strArr2) {
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str != null) {
                int i2 = 0;
                while (true) {
                    if (i2 < strArr2.length) {
                        String str2 = strArr2[i2];
                        if (str2 != null && str.equals(str2)) {
                            strArr[i] = null;
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
            }
        }
    }

    private void verifyCanaryClasses(DexManifest dexManifest) {
        int i = 0;
        while (true) {
            DexManifest.Dex[] dexArr = dexManifest.dexes;
            if (i < dexArr.length) {
                Class.forName(dexArr[i].canaryClass);
                i++;
            } else {
                return;
            }
        }
    }

    public static void writeTxFailedStatusLocked(DexStore dexStore, long j) {
        dexStore.writeStatusLocked((j << 4) | 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r9.isDefault() == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00aa, code lost:
        if (r6 != null) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00af, code lost:
        throw r0;
     */
    public boolean atomicReplaceConfig(Config config) {
        boolean z;
        boolean z2;
        Object[] objArr = new Object[2];
        boolean z3 = true;
        if (config != null) {
            z = true;
        }
        z = false;
        objArr[0] = Boolean.valueOf(z);
        boolean z4 = false;
        if (config != null) {
            z4 = true;
        }
        objArr[1] = Boolean.valueOf(z4);
        Mlog.safeFmt("Replacing config is default: %s nn: s", objArr);
        ReentrantLockFile.Lock acquire = this.mLockFile.acquire(0);
        File file = new File(this.root, CONFIG_FILENAME);
        Config readConfig = readConfig();
        boolean equals = config.equals(readConfig);
        if (attemptedOptimizationSinceRegeneration()) {
            z2 = equals;
        } else {
            z2 = config.equalsForBootstrapPurposes(readConfig);
        }
        if (z2 && !equals) {
            if (!checkDeps()) {
                z2 = false;
            }
            if (z2 && attemptedOptimizationSinceRegeneration()) {
                z2 = false;
            }
        }
        if (config.isDefault()) {
            C0015Fs.deleteRecursive(file);
        } else {
            File file2 = new File(this.root, CONFIG_TMP_FILENAME);
            config.writeAndSync(file2);
            C0015Fs.renameOrThrow(file2, file);
        }
        if (!z2) {
            DalvikInternals.fsyncNamed(this.root.getAbsolutePath(), -1);
            synchronized (this) {
                new File(this.root, REGEN_STAMP_FILENAME).delete();
                touchRegenStamp();
            }
        }
        if (z2 && !equals) {
            saveDeps();
        }
        if (z2) {
            z3 = false;
        }
        if (acquire != null) {
            acquire.close();
        }
        return z3;
    }

    public synchronized long getLastRegenTime() {
        return new File(this.root, REGEN_STAMP_FILENAME).lastModified();
    }

    public synchronized boolean isLoaded() {
        boolean z;
        z = false;
        if (this.mLoadedManifest != null) {
            z = true;
        }
        return z;
    }

    public boolean isReoptimization(Context context) {
        try {
            return readConfig().tryPeriodicPgoCompilation && getCurrentOptHistoryLogFromRoot(this, context, this.root).lastCompilationSessionWasASuccess();
        } catch (IOException e) {
            Mlog.m30e(e, "failed to check if reoptimization. Failing back to not a reoptimization.", new Object[0]);
            return false;
        }
    }

    public synchronized DexErrorRecoveryInfo loadAll(int i, AnonymousClass076 r4, Context context) {
        DexErrorRecoveryInfo dexErrorRecoveryInfo;
        try {
            dexErrorRecoveryInfo = loadAllImpl(i, r4, context);
        } catch (RecoverableDexException e) {
            try {
                dexErrorRecoveryInfo = loadAllImpl(i | 2, r4, context);
                dexErrorRecoveryInfo.regenRetryCause = e;
            } catch (RecoverableDexException e2) {
                throw new AssertionError(e2);
            }
        }
        return dexErrorRecoveryInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        if (r1 != null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0022 */
    public long reportStatus() {
        Mlog.safeFmt("DexStore::reportStatus()", new Object[0]);
        long j = 0;
        try {
            ReentrantLockFile.Lock acquire = this.mLockFile.acquire(0);
            j = readStatusLocked(this);
            if (acquire != null) {
                acquire.close();
                return j;
            }
        } catch (Throwable th) {
            Mlog.safeFmt("DexStore::reportStatus caught Throwable ", th);
        }
        return j;
    }

    public class NormalDexStoreClock implements DexStoreClock {
        public long now() {
            return System.currentTimeMillis();
        }

        public NormalDexStoreClock() {
        }

        public /* synthetic */ NormalDexStoreClock(C00121 r1) {
        }
    }

    private byte adjustDesiredStateForConfig(byte b, Config config) {
        Object[] objArr;
        String str;
        Object[] objArr2;
        String str2;
        byte b2 = config.mode;
        if (b2 == 0) {
            return b;
        }
        if (b2 == 1) {
            Mlog.safeFmt("using fallback mode due to request in config file", new Object[0]);
            return 2;
        }
        if (b2 == 2) {
            if (b == 2) {
                objArr = new Object[0];
                str = "ignoring configured turbo mode: already forced to fallback mode";
            } else if (b == 3) {
                Mlog.safeFmt("using Dalvik turbo as requested in config file", new Object[0]);
                return 4;
            } else if (b == 4 || b == 7) {
                objArr = new Object[0];
                str = "config file wants turbo mode: already using it";
            } else if (b == 8) {
                Mlog.safeFmt("using ART turbo as requested in config file", new Object[0]);
                return 7;
            } else if (b != 9) {
                objArr2 = new Object[]{Byte.valueOf(b)};
                str2 = "ignoring configured turbo mode: state not whitelisted: %s";
            } else {
                objArr = new Object[0];
                str = "ignoring configured turbo mode: no dex loading to do";
            }
            Mlog.safeFmt(str, objArr);
            return b;
        } else if (b2 == 3) {
            if (b != 2) {
                if (b != 3) {
                    if (b == 4) {
                        Mlog.safeFmt("using Dalvik xdex as requested in config", new Object[0]);
                        return 3;
                    } else if (b == 7) {
                        Mlog.safeFmt("using ART xdex as requested in config file", new Object[0]);
                        return 8;
                    } else if (b != 8) {
                        if (b != 9) {
                            objArr2 = new Object[]{Byte.valueOf(b)};
                            str2 = "ignoring configured xdex mode: state not whitelisted: %s";
                        } else {
                            objArr = new Object[0];
                            str = "ignoring configured xdex mode: no dex loading to do";
                        }
                    }
                }
                objArr = new Object[0];
                str = "config file wants xdex mode: already using it";
            } else {
                objArr = new Object[0];
                str = "ignoring configured xdex mode: already forced to fallback";
            }
            Mlog.safeFmt(str, objArr);
            return b;
        } else {
            Mlog.m35w("ignoring unknown configured dex mode %s", Byte.valueOf(b2));
            return b;
        }
        Mlog.m35w(str2, objArr2);
        return b;
    }

    public static void appendDexHashForMegaZip(StringBuilder sb, DexManifest dexManifest) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA");
            int i = 0;
            while (true) {
                DexManifest.Dex[] dexArr = dexManifest.dexes;
                if (i >= dexArr.length) {
                    break;
                }
                instance.update(dexArr[i].hash.getBytes());
                i++;
            }
            byte[] digest = instance.digest();
            char[] charArray = "0123456789abcdef".toCharArray();
            for (byte b : digest) {
                sb.append(charArray[(b >> 4) & 15]);
                sb.append(charArray[b & 15]);
            }
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private void assertLockHeld() {
        boolean z = false;
        if (this.mLockFile.mLockOwner == Thread.currentThread()) {
            z = true;
        }
        Mlog.assertThat(z, "lock req", new Object[0]);
    }

    public static boolean canLoadCanaryClass(DexManifest dexManifest) {
        String str = dexManifest.dexes[0].canaryClass;
        try {
            Mlog.safeFmt("attempting to detect built-in ART multidex by classloading %s", str);
            Class.forName(dexManifest.dexes[0].canaryClass);
            Mlog.safeFmt("ART native multi-dex in use: found %s", str);
            return true;
        } catch (ClassNotFoundException unused) {
            Mlog.safeFmt("ART multi-dex not in use: cannot load %s", str);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0025, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0026, code lost:
        if (r1 != null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x002b */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x002b=Splitter:B:20:0x002b, B:10:0x001f=Splitter:B:10:0x001f} */
    private boolean checkAnyOptimizerRunningCurrently() {
        File file = new File(this.root, ODEX_LOCK_FILENAME);
        boolean z = false;
        try {
            if (file.exists()) {
                ReentrantLockFile open = ReentrantLockFile.open(file);
                ReentrantLockFile.Lock tryAcquire = open.tryAcquire(0);
                if (tryAcquire == null) {
                    z = true;
                } else {
                    C0015Fs.safeClose((Closeable) tryAcquire);
                }
                open.close();
                return z;
            }
        } catch (IOException unused) {
        } catch (Throwable ) {
            throw th;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0093, code lost:
        if (r0.mIsOptional == false) goto L_0x0095;
     */
    private int checkDirty(OdexScheme odexScheme, String[] strArr) {
        boolean z;
        String[] strArr2 = odexScheme.expectedFiles;
        int i = 0;
        if ((odexScheme.flags & 2) != 0) {
            i = 2;
        }
        String[] strArr3 = (String[]) strArr.clone();
        setDifference(strArr3, strArr2);
        boolean z2 = false;
        for (int i2 = 0; i2 < strArr3.length; i2++) {
            String str = strArr3[i2];
            if (str == null || DexStoreUtils.isIgnoreDirtyFileName(str)) {
                Mlog.safeFmt("Ignoring potentially excessive file %s in root: %s", str, this.root);
            } else {
                Mlog.safeFmt("deleting unknown file %s in dex store %s with schema %s", str, this.root, odexScheme.toString());
                C0015Fs.deleteRecursive(new File(this.root, strArr3[i2]));
                z2 = true;
            }
        }
        if (z2 && (odexScheme.flags & 1) != 0) {
            Mlog.safeFmt("dex store %s had excess files and is non-incremental: regenerating", this.root);
            i = 2;
        }
        if (!checkDeps()) {
            Mlog.safeFmt("dex store %s dependencies have changed: regenerating all", this.root);
            i = 2;
        }
        if (i < 1) {
            ExpectedFileInfo[] expectedFileInfoArr = odexScheme.expectedFileInfos;
            String[] strArr4 = (String[]) strArr2.clone();
            setDifference(strArr4, strArr);
            for (int i3 = 0; i3 < strArr4.length; i3++) {
                ExpectedFileInfo expectedFileInfo = expectedFileInfoArr[i3];
                if (expectedFileInfo != null) {
                    z = true;
                }
                z = false;
                String str2 = strArr4[i3];
                if (str2 != null && !z) {
                    Mlog.safeFmt("missing file %s in dex store %s", str2, this.root);
                    i = 1;
                }
            }
        }
        return i;
    }

    private byte determineDesiredState(byte b, DexManifest dexManifest) {
        Object[] objArr;
        String str;
        if (dexManifest.dexes.length == 0) {
            Mlog.safeFmt("no secondary dexes listed: using noop configuration", new Object[0]);
            return 9;
        }
        if (b == 5) {
            objArr = new Object[0];
            str = "recovering from bad class gen: using fallback";
        } else if ("Amazon".equals(Build.BRAND) && !AnonymousClass0Bq.A00) {
            objArr = new Object[0];
            str = "avoiding optimizations on non-standard VM";
        } else if (!AnonymousClass0Bq.A00) {
            return 3;
        } else {
            if (Build.VERSION.SDK_INT < 21) {
                objArr = new Object[0];
                str = "avoiding optimizations on pre-L VM";
            } else if (canLoadCanaryClass(dexManifest)) {
                return 9;
            } else {
                return 8;
            }
        }
        Mlog.safeFmt(str, objArr);
        return 2;
    }

    public static File determineOdexCacheName(File file) {
        if (AnonymousClass0Bq.A00) {
            return null;
        }
        String path = file.getPath();
        if (path.endsWith(".apk")) {
            File file2 = new File(AnonymousClass000.A0E(path.substring(0, path.length() - 4), DexManifest.ODEX_EXT));
            if (file2.exists()) {
                return file2;
            }
        }
        return C0015Fs.dexOptGenerateCacheFileName(C0015Fs.findSystemDalvikCache(), file, "classes.dex");
    }

    public static synchronized DexStore dexStoreListHead() {
        DexStore dexStore;
        synchronized (DexStore.class) {
            dexStore = sListHead;
        }
        return dexStore;
    }

    public static synchronized DexStore findOpened(File file) {
        synchronized (DexStore.class) {
            File absoluteFile = file.getAbsoluteFile();
            for (DexStore dexStoreListHead = dexStoreListHead(); dexStoreListHead != null; dexStoreListHead = dexStoreListHead.next) {
                if (dexStoreListHead.root.equals(absoluteFile)) {
                    return dexStoreListHead;
                }
            }
            return null;
        }
    }

    public static long getAppUpgradeTimestamp(Context context) {
        if (sCachedLastAppUpdateTime == 0) {
            sCachedLastAppUpdateTime = genAppUpgradeTimestamp(context);
        }
        return sCachedLastAppUpdateTime;
    }

    public static DexStoreClock getClock(Class cls) {
        DexStoreClock dexStoreClock = sDexStoreClock;
        if (dexStoreClock == null) {
            return null;
        }
        return dexStoreClock;
    }

    public static OptimizationHistoryLog getCurrentOptHistoryLogFromRoot(DexStore dexStore, Context context, File file) {
        OptimizationHistoryLog optimizationHistoryLog = dexStore.mCachedOptimizationHistoryLog;
        if (optimizationHistoryLog == null || !optimizationHistoryLog.isLogFileAsFromRoot(file) || dexStore.mCachedOptimizationHistoryLog.isOutOfDate()) {
            OptimizationHistoryLog optimizationHistoryLog2 = dexStore.mCachedOptimizationHistoryLog;
            OptimizationHistoryLog readOrMakeDefaultFromRoot = OptimizationHistoryLog.readOrMakeDefaultFromRoot(context, file);
            dexStore.mCachedOptimizationHistoryLog = readOrMakeDefaultFromRoot;
            Mlog.safeFmt("Reading new history log for (same root: %s out of date: %s) root: %s \n old: %s \n new: %s", Boolean.valueOf(readOrMakeDefaultFromRoot.isLogFileAsFromRoot(file)), Boolean.valueOf(dexStore.mCachedOptimizationHistoryLog.isOutOfDate()), file.getAbsolutePath(), optimizationHistoryLog2, dexStore.mCachedOptimizationHistoryLog);
        }
        return dexStore.mCachedOptimizationHistoryLog;
    }

    public static DexStoreTestHooks getDexStoreTestHooks() {
        return sDexStoreTestHooks;
    }

    public static String getNonSecondaryDexHashes(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("secondary.dex01.Canary");
        arrayList.add("secondary.dex02.Canary");
        StringBuilder sb = new StringBuilder();
        try {
            for (String[] strArr : DexStoreUtils.getDexInfoFromManifest(context)) {
                String str = strArr[DexStoreUtils.CANARY_IDX];
                String str2 = strArr[DexStoreUtils.HASH_IDX];
                if (!arrayList.contains(str)) {
                    if (sb.length() != 0) {
                        sb.append(",");
                    }
                    sb.append(str2);
                    sb.append(DexManifest.DEX_EXT);
                }
            }
            return sb.toString();
        } catch (IOException unused) {
            return "";
        }
    }

    public static File getOatFileFromDexHash(File file, String str) {
        if (str == null) {
            return null;
        }
        return new File(file, AnonymousClass000.A0J("prog-", str, ".oat"));
    }

    public static String getStatusDescription(long j) {
        String str;
        int i = (int) (j & 15);
        StringBuilder sb = new StringBuilder();
        switch (i) {
            case 0:
                str = "STATE_INVALID";
                break;
            case 1:
                str = "STATE_TX_FAILED";
                break;
            case 2:
                str = "STATE_FALLBACK";
                break;
            case 3:
                str = "STATE_XDEX";
                break;
            case 4:
                str = "STATE_TURBO";
                break;
            case 5:
                str = "STATE_BAD_GEN";
                break;
            case 6:
                str = "STATE_REGEN_FORCED";
                break;
            case 7:
                str = "STATE_ART_TURBO";
                break;
            case 8:
                str = "STATE_ART_XDEX";
                break;
            case 9:
                str = "STATE_NOOP";
                break;
            default:
                sb.append(AnonymousClass000.A05("BAD STATE ", i));
                break;
        }
        sb.append(str);
        return sb.toString();
    }

    public static synchronized void installCrossDexHooks() {
        synchronized (DexStore.class) {
            if (sAttemptedCrossDexHookInstallation) {
                Throwable th = sCrossDexHookInstallationError;
                if (th != null) {
                    throw C0015Fs.runtimeExFrom(th);
                }
            } else {
                sAttemptedCrossDexHookInstallation = true;
                try {
                    DalvikInternals.fixDvmForCrossDexHack();
                    Mlog.safeFmt("cross-dex hook installation succeeded", new Object[0]);
                } catch (Throwable th2) {
                    sCrossDexHookInstallationError = th2;
                    throw th2;
                }
            }
        }
    }

    public static long lastModifiedTime(File file) {
        if (file == null || !file.exists()) {
            return 0;
        }
        return file.lastModified();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007c, code lost:
        if (r1 != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007f, code lost:
        if (r0 != false) goto L_0x0081;
     */
    private String[] listAndPruneRootFiles(Context context) {
        boolean z;
        boolean z2;
        String[] list = this.root.list();
        if (list != null) {
            AnonymousClass0CD.A00(context);
            for (int i = 0; i < list.length; i++) {
                String str = list[i];
                if (!str.equals(MDEX_LOCK_FILENAME) && !str.equals(MDEX_STATUS_FILENAME) && !str.equals(ODEX_LOCK_FILENAME) && !str.equals(DEPS_FILENAME) && !str.equals(REGEN_STAMP_FILENAME) && !str.equals(OPTIMIZATION_LOG_FILENAME) && !str.equals(OPTIMIZATION_HISTORY_LOG_FILENAME) && !str.equals(CONFIG_FILENAME) && !str.equals("classmap.bin") && !str.equals("classmap.bin.hf")) {
                    if (!"art_pgo_ref_profile.prof".equals(str)) {
                        if (str == null || !str.endsWith(".prof")) {
                            z2 = false;
                        } else {
                            z2 = str.startsWith("TmpPgoProfile_");
                        }
                        z = false;
                    }
                    z = true;
                }
                list[i] = null;
                if (str.equals(CONFIG_TMP_FILENAME)) {
                    C0015Fs.deleteRecursive(new File(this.root, str));
                    list[i] = null;
                }
            }
            pruneTemporaryDirectoriesLocked(list);
            return list;
        }
        throw new IOException("unable to list directory " + this.root);
    }

    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0164, code lost:
        if (r12 != false) goto L_0x0167;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r3v2, types: [int, boolean] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01b7 A[Catch:{ all -> 0x00eb, all -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01bb A[Catch:{ all -> 0x00eb, all -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01c4 A[Catch:{ all -> 0x00eb, all -> 0x0209 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01b3 A[Catch:{ all -> 0x00eb, all -> 0x0209 }] */
    private DexErrorRecoveryInfo loadAllCompressedOreoImpl(DexErrorRecoveryInfo dexErrorRecoveryInfo, DexManifest dexManifest, int i, AnonymousClass076 r23, Context context) {
        boolean z;
        ? r3;
        boolean z2;
        RuntimeException runtimeException;
        boolean z3;
        int i2;
        String str;
        boolean z4;
        AnonymousClass0ZJ.A01(32, "DexStore.loadlAllOreo", 1789915691);
        int i3 = i & -2;
        try {
            StringBuilder sb = new StringBuilder(46);
            sb.append("z-");
            DexManifest dexManifest2 = dexManifest;
            appendDexHashForMegaZip(sb, dexManifest2);
            File file = this.root;
            sb.append(".zip");
            File file2 = new File(file, sb.toString());
            Context context2 = context;
            OdexSchemeOreo odexSchemeOreo = new OdexSchemeOreo(dexManifest2.dexes, file2, context2);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 > 29 || (i4 == 29 && (PreviewSdkHelper.isPreviewSdk() || context2.getApplicationInfo().targetSdkVersion >= 29 || AnonymousClass091.A00(context2).A04))) {
                z = true;
            } else {
                z = false;
            }
            this.mUseBgDexOpt = z;
            if (odexSchemeOreo.needsUnpack()) {
                String[] list = this.root.list();
                if (list != null) {
                    for (String str2 : list) {
                        if (str2.endsWith(DexManifest.DEX_EXT) || str2.endsWith(".zlock") || str2.endsWith(".prof") || ((str2.endsWith(".zip") && str2.startsWith("z-")) || str2.equals(OdexSchemeArtTurbo.OREO_ODEX_DIR) || REGEN_STAMP_FILENAME.equals(str2))) {
                            C0015Fs.deleteRecursiveNoThrow(new File(this.root, str2));
                        }
                    }
                    r3 = 1;
                    runCompiler(dexManifest2, odexSchemeOreo, 0, r23, context2);
                    odexSchemeOreo.finalizeZip();
                    touchRegenStamp();
                    z2 = true;
                } else {
                    throw new IOException("unable to list directory " + this.root);
                }
            } else {
                r3 = 1;
                z2 = false;
            }
            odexSchemeOreo.initializeClassLoader();
            if (z2) {
                verifyCanaryClasses(dexManifest2);
            }
            IOException[] iOExceptionArr = odexSchemeOreo.mSuppressedExceptions;
            if (iOExceptionArr != null) {
                runtimeException = new RuntimeException("ClassLoader suppressed exceptions");
                Class cls = Throwable.class;
                try {
                    Class[] clsArr = new Class[r3];
                    clsArr[0] = cls;
                    Method method = cls.getMethod("addSuppressed", clsArr);
                    z4 = false;
                    for (IOException iOException : iOExceptionArr) {
                        String message = iOException.getMessage();
                        if (message.indexOf("No original dex files found for dex location") == -1 || message.indexOf("/split_") == -1) {
                            Object[] objArr = new Object[r3];
                            objArr[0] = iOException;
                            method.invoke(runtimeException, objArr);
                            z4 = true;
                        }
                    }
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    Object[] objArr2 = new Object[r3];
                    objArr2[0] = e;
                    Mlog.m29e("Unable to add suppressed exceptions: %s", objArr2);
                    z4 = true;
                }
            }
            runtimeException = null;
            if (!canLoadCanaryClass(dexManifest2)) {
                if (runtimeException == null) {
                    runtimeException = new RuntimeException("Failed to load canary class after classloader init");
                }
                if (z2) {
                    str = "OdexSchemeOreo reunpack after unpack";
                } else {
                    str = "OdexSchemeOreo reunpack";
                }
                DexTricksErrorReporter.reportSampledSoftError(str, "Failed to load canary class, reunpacking", runtimeException);
                OdexSchemeOreo.sForceUnpack = r3;
                this.mLoadedManifest = null;
                throw new RecoverableDexException(runtimeException);
            }
            if (runtimeException != null) {
                DexTricksErrorReporter.reportSampledSoftError("OdexSchemeOreo suppressed", "OdexSchemeOreo found suppressed exceptions when initializing classloader", runtimeException);
            }
            this.mLoadedManifest = dexManifest2;
            int i5 = 0;
            if (z2) {
                i5 = 1;
            }
            boolean hasVdexOdex = OreoFileUtils.hasVdexOdex(file2);
            boolean isTruncated = OreoFileUtils.isTruncated(file2);
            if (hasVdexOdex) {
                if (!isTruncated) {
                    if (this.mUseBgDexOpt) {
                    }
                }
                z3 = true;
                if (z3) {
                    i2 = i5 | 8;
                } else {
                    i2 = i5 | 512;
                }
                if (hasVdexOdex) {
                    i2 |= LOAD_RESULT_WITH_VDEX_ODEX;
                }
                if (OreoFileUtils.hasRefProfile(file2)) {
                    i2 |= LOAD_RESULT_PGO;
                }
                odexSchemeOreo.registerCodeAndProfile(this.mUseBgDexOpt);
                this.mMegaZipPath = file2.getPath();
                DexErrorRecoveryInfo dexErrorRecoveryInfo2 = dexErrorRecoveryInfo;
                dexErrorRecoveryInfo2.loadResult = i2;
                dexErrorRecoveryInfo2.odexSize = OreoFileUtils.getOdexSize(file2);
                dexErrorRecoveryInfo2.odexSchemeName = odexSchemeOreo.getSchemeName();
                dexErrorRecoveryInfo2.dexoptDuringColdStart = z2;
                this.mLastDeri = dexErrorRecoveryInfo2;
                AnonymousClass0ZJ.A00(32, 1637988891);
                Object[] objArr3 = new Object[2];
                objArr3[0] = Integer.valueOf(dexErrorRecoveryInfo2.loadResult);
                objArr3[r3] = Long.valueOf(dexErrorRecoveryInfo2.odexSize);
                Mlog.safeFmt("OdexSchemeOreo loadResult=%d odexSize=%d", objArr3);
                return dexErrorRecoveryInfo;
            }
            z3 = false;
            if (z3) {
            }
            if (hasVdexOdex) {
            }
            if (OreoFileUtils.hasRefProfile(file2)) {
            }
            odexSchemeOreo.registerCodeAndProfile(this.mUseBgDexOpt);
            this.mMegaZipPath = file2.getPath();
            DexErrorRecoveryInfo dexErrorRecoveryInfo22 = dexErrorRecoveryInfo;
            dexErrorRecoveryInfo22.loadResult = i2;
            dexErrorRecoveryInfo22.odexSize = OreoFileUtils.getOdexSize(file2);
            dexErrorRecoveryInfo22.odexSchemeName = odexSchemeOreo.getSchemeName();
            dexErrorRecoveryInfo22.dexoptDuringColdStart = z2;
            this.mLastDeri = dexErrorRecoveryInfo22;
            AnonymousClass0ZJ.A00(32, 1637988891);
            Object[] objArr32 = new Object[2];
            objArr32[0] = Integer.valueOf(dexErrorRecoveryInfo22.loadResult);
            objArr32[r3] = Long.valueOf(dexErrorRecoveryInfo22.odexSize);
            Mlog.safeFmt("OdexSchemeOreo loadResult=%d odexSize=%d", objArr32);
            return dexErrorRecoveryInfo;
        } catch (Throwable th) {
            AnonymousClass0ZJ.A00(32, -1540393142);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03cb, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03cc, code lost:
        if (r3 != null) goto L_0x03ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x016b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x016c, code lost:
        if (r12 != null) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:191:0x03d1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x0171 */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0388 A[Catch:{ all -> 0x0334, all -> 0x0171, Exception -> 0x0103, all -> 0x045c }] */
    private DexErrorRecoveryInfo loadAllImpl(int i, AnonymousClass076 r53, Context context) {
        AnonymousClass076 r50;
        Context context2;
        long readStatusLocked;
        byte b;
        int i2;
        OdexScheme schemeForState;
        String[] listAndPruneRootFiles;
        int checkDirty;
        String str;
        boolean z;
        int i3;
        Config config;
        boolean z2;
        byte adjustDesiredStateForConfig;
        byte b2;
        int i4 = i;
        DexErrorRecoveryInfo dexErrorRecoveryInfo = new DexErrorRecoveryInfo();
        int i5 = 0;
        if (isLoaded()) {
            if (this.mLastDeri == null) {
                Mlog.m35w("dex store %s has already been loaded, but did not save recovery info", this.root);
                this.mLastDeri = dexErrorRecoveryInfo;
            }
            return this.mLastDeri;
        }
        DexManifest loadManifest = loadManifest();
        DexStore[] parents = getParents();
        int length = parents.length;
        int i6 = 0;
        while (true) {
            r50 = r53;
            context2 = context;
            if (i6 >= length) {
                break;
            }
            DexStore dexStore = parents[i6];
            if (!dexStore.isLoaded()) {
                Mlog.safeFmt("parent dex store %s loaded with result: %x", dexStore.f145id, Integer.valueOf(dexStore.loadAll(i4, r50, context2).loadResult));
            }
            i6++;
        }
        ReentrantLockFile.Lock acquire = this.mLockFile.acquire(0);
        try {
            if (this.next == null) {
                canLoadCanaryClass(loadManifest);
            }
            readStatusLocked = readStatusLocked(this);
            b = (byte) ((int) (readStatusLocked & 15));
            if (b >= 10) {
                Mlog.m35w("found invalid state %s: nuking dex store %s", Byte.valueOf(b), this.root);
            }
            if (b == 1) {
                long j = readStatusLocked >> 4;
                Mlog.m35w("found abandoned transaction (prev stateno %s status %x) on dex store %s: nuking store", Long.valueOf(j & 15), Long.valueOf(j), this.root);
                i2 = 16;
            } else {
                i2 = 0;
            }
            if (b == 5) {
                Mlog.m35w("crashed last time while loading generated files; trying fallback", new Object[0]);
                i2 |= 64;
            }
            if (b == 6) {
                Mlog.m35w("force dex regeneration requested", new Object[0]);
                i2 |= 32;
            }
            schemeForState = schemeForState(context2, loadManifest, readStatusLocked);
            listAndPruneRootFiles = listAndPruneRootFiles(context2);
            checkDirty = checkDirty(schemeForState, listAndPruneRootFiles);
            if (checkDirty == 0) {
                str = "LA_LOAD_EXISTING";
            } else if (checkDirty == 1) {
                str = "LA_REGEN_MISSING";
            } else {
                str = "LA_REGEN_ALL";
            }
            Mlog.safeFmt("current scheme: %s next step: %s", schemeForState, str);
            if (checkDirty == 1 && (schemeForState.flags & 1) != 0) {
                Mlog.safeFmt("scheme %s is non-incremental: regenerating everything", schemeForState);
                checkDirty = 2;
            }
            if (checkDirty == 0 && b == 3) {
                installCrossDexHooks();
            }
        } catch (Exception e) {
            Mlog.m36w(e, "dex store %s needs xdex hooks, but we can't do it: regenerating", this.root);
            checkDirty = 2;
        } catch (Throwable th) {
            if (acquire != null) {
                acquire.close();
            }
            throw th;
        }
        if (checkDirty > 0) {
            int length2 = loadManifest.dexes.length;
            if (length2 > 58) {
                Mlog.m35w("too many dexes, forcing turbo mode: have %s but maximum per dex store is %s", Integer.valueOf(length2), 58);
                i4 = i | 1;
            }
            writeTxFailedStatusLocked(this, readStatusLocked);
            File file = new File(this.root, REGEN_STAMP_FILENAME);
            C0015Fs.deleteRecursive(file);
            new FileOutputStream(file).close();
            File file2 = new File(this.root, ODEX_LOCK_FILENAME);
            if (file2.exists()) {
                ReentrantLockFile open = ReentrantLockFile.open(file2);
                open.acquire(0).close();
                open.close();
            }
            z = true;
        } else {
            z = false;
        }
        if (checkDirty != 0 || !checkAnyOptimizerRunningCurrently()) {
            i3 = 1;
        } else {
            i3 = 1;
            dexErrorRecoveryInfo.dexoptDuringColdStart = true;
        }
        if (checkDirty == i3) {
            try {
                runCompiler(loadManifest, schemeForState, 1, r50, context2);
                checkDirty = 0;
            } catch (Exception e2) {
                Mlog.m36w(e2, "incremental regeneration error in dex store %s: regenerating", this.root);
                checkDirty = 2;
            }
        }
        try {
            config = Config.readFromRoot(this.root);
            Mlog.safeFmt("loaded normal root config file", new Object[0]);
        } catch (FileNotFoundException unused) {
            Mlog.safeFmt("no config file for repository %s found: using all-default configuration", this.root);
            config = new Config((byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, -1, -1, -1, -1, -1, false, Config.enableOatmealByDefault(), false, false, false, false, false, false, (byte) 0, false, -1, (byte) 0);
        }
        if (checkDirty != 0) {
            saveDeps();
            byte determineDesiredState = determineDesiredState(b, loadManifest);
            if ((i4 & 1) != 0) {
                if (determineDesiredState == 3) {
                    Mlog.safeFmt("using Dalvik turbo instead of xdex: DS_DO_NOT_OPTIMIZE", new Object[0]);
                    determineDesiredState = 4;
                } else if (determineDesiredState == 8) {
                    Mlog.safeFmt("using ART turbo instead of ART xdex: DS_DO_NOT_OPTIMIZE", new Object[0]);
                    determineDesiredState = 7;
                }
            }
            byte b3 = config.sync;
            if (b3 != 0) {
                if (b3 == 1) {
                    Mlog.m35w("forcing async optimization mode from config file: dangerous!", new Object[0]);
                    i4 |= 4;
                } else if (b3 != 2) {
                    Mlog.m35w("config file has unknown sync control mode %s: ignoring", Byte.valueOf(b3));
                } else {
                    Mlog.safeFmt("forcing synchronous optimization from config file", new Object[0]);
                    i4 = (i4 & -5) | 8;
                }
            }
            adjustDesiredStateForConfig = adjustDesiredStateForConfig(determineDesiredState, config);
            if (adjustDesiredStateForConfig == 3) {
                try {
                    installCrossDexHooks();
                } catch (Exception e3) {
                    Mlog.m36w(e3, "disabling cross-dex optimization: cannot install hooks", new Object[0]);
                    dexErrorRecoveryInfo.xdexFailureCause = e3;
                    adjustDesiredStateForConfig = 4;
                }
            }
            Mlog.safeFmt("desiredStateNo:%s", Byte.valueOf(adjustDesiredStateForConfig));
            while (checkDirty != 0) {
                boolean z3 = false;
                if (checkDirty >= 2) {
                    z3 = true;
                }
                Mlog.assertThat(z3, "incremental regen already handled", new Object[i5]);
                schemeForState = schemeForState(context2, loadManifest, (long) adjustDesiredStateForConfig);
                try {
                    deleteFiles(listAndPruneRootFiles);
                    new File(this.root, OPTIMIZATION_LOG_FILENAME).delete();
                    new File(this.root, "classmap.bin").delete();
                    new File(this.root, "classmap.bin.hf").delete();
                    if ((schemeForState.flags & 16) != 0) {
                        try {
                            Mlog.safeFmt("not running dex compiler: scheme says there is nothing to do", new Object[i5]);
                        } catch (Exception e4) {
                            e = e4;
                            b2 = 2;
                        }
                    } else {
                        runCompiler(loadManifest, schemeForState, 0, r50, context2);
                    }
                    checkDirty = 0;
                } catch (Exception e5) {
                    e = e5;
                    b2 = 2;
                }
                i5 = 0;
            }
            readStatusLocked = (long) adjustDesiredStateForConfig;
        }
        Mlog.assertThat(true, "next step should be LA_LOAD_EXISTING", new Object[i5]);
        boolean z4 = false;
        if ((i4 & 4) != 0) {
            z4 = true;
        }
        if (z4) {
            loadDexFiles(z, schemeForState, loadManifest, r50, context2, i4);
        }
        if (z) {
            if (z4) {
                Mlog.safeFmt("about to start syncer thread", new Object[0]);
                FinishRegenerationThread finishRegenerationThread = new FinishRegenerationThread(schemeForState, acquire, readStatusLocked);
                this.mLockFile.donateLock(finishRegenerationThread);
                finishRegenerationThread.start();
                acquire = null;
                Mlog.safeFmt("started syncer thread", new Object[0]);
            } else {
                Mlog.safeFmt("fsyncing just-regenerated dex store %s in foreground as requested", this.root);
                C0015Fs.fsyncRecursive(this.root, Prio.unchanged());
                writeStatusLocked(readStatusLocked);
                Mlog.safeFmt("dex store sync completed", new Object[0]);
                if ((schemeForState.flags & 4) == 0) {
                    Mlog.safeFmt("optimizing in foreground", new Object[0]);
                } else if ((i4 & 8) != 0) {
                    Mlog.safeFmt("optimizing in foreground despite expense: forced", new Object[0]);
                } else {
                    Mlog.safeFmt("not optimizing in foreground: would be too expensive", new Object[0]);
                    z2 = false;
                    if (z2) {
                        optimizeInForegroundLocked(context2, loadManifest, readStatusLocked);
                        readStatusLocked = readStatusLocked(this);
                        schemeForState = schemeForState(context2, loadManifest, readStatusLocked);
                        Mlog.safeFmt("done optimizing in foreground: new status %x scheme %s", Long.valueOf(readStatusLocked), schemeForState);
                    }
                }
                z2 = true;
                if (z2) {
                }
            }
        }
        if (!z4) {
            loadDexFiles(z, schemeForState, loadManifest, r50, context2, i4);
        }
        try {
            TmpDir makeTemporaryDirectory = makeTemporaryDirectory("dexopt");
            i2 |= schemeForState.loadInformationalStatus(this.root, readStatusLocked);
            if (makeTemporaryDirectory != null) {
                makeTemporaryDirectory.close();
            }
        } catch (Throwable th2) {
            Mlog.m30e(th2, "Failure while checking oat file provenance.", new Object[0]);
        }
        dexErrorRecoveryInfo.odexSchemeName = schemeForState.getSchemeName();
        if (z) {
            i2 |= 1;
        }
        if ((schemeForState.flags & 8) != 0) {
            i2 |= 8;
        }
        OptimizationHistoryLog currentOptHistoryLogFromRoot = getCurrentOptHistoryLogFromRoot(this, context2, this.root);
        String simpleName = schemeForState.getClass().getSimpleName();
        Mlog.safeFmt("Asking scheme %s needOptimization", simpleName);
        OdexScheme.NeedOptimizationState needOptimization = schemeForState.needOptimization(readStatusLocked, config, currentOptHistoryLogFromRoot);
        if (needOptimization.needsOptimization()) {
            int i7 = i2 | 2;
            if (OdexScheme.NeedOptimizationState.NEED_REOPTIMIZATION.equals(needOptimization)) {
                Mlog.safeFmt("Scheme %s currently needs reoptimization", simpleName);
                i7 |= 1048576;
            }
            if (schemeForState.loadNotOptimized(readStatusLocked)) {
                i7 |= 8;
            }
            Mlog.safeFmt("optimization needed state: %s", needOptimization);
            if ((schemeForState.flags & 4) != 0) {
                Mlog.safeFmt("... but optimization is very expensive", new Object[0]);
                i2 |= 4;
            }
        } else {
            Mlog.safeFmt("optimization needed: no", new Object[0]);
        }
        dexErrorRecoveryInfo.loadResult = i2;
        this.mLastDeri = dexErrorRecoveryInfo;
        if (acquire != null) {
            acquire.close();
        }
        return dexErrorRecoveryInfo;
        if (adjustDesiredStateForConfig != b2) {
            Mlog.m36w(e, "dex store %s: failed turbodex: using fallback", this.root);
            dexErrorRecoveryInfo.fallbackCause = e;
            listAndPruneRootFiles = listAndPruneRootFiles(context2);
            adjustDesiredStateForConfig = 2;
            i5 = 0;
        } else {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012c, code lost:
        if (sMergedDexConfig.mDexFiles.size() != r2) goto L_0x012e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0162  */
    private void loadDexFiles(boolean z, OdexScheme odexScheme, DexManifest dexManifest, AnonymousClass076 r29, Context context, int i) {
        int i2;
        boolean z2;
        String str;
        DexManifest dexManifest2 = dexManifest;
        int i3 = 0;
        if (dexManifest2.locators) {
            i3 = 2;
        }
        if ((i & 16) != 0) {
            i3 |= 4;
        }
        Context context2 = context;
        boolean checkAndClearGk = checkAndClearGk(context2, Experiments.DISABLE_DEX_VERIFIER);
        boolean checkAndClearGk2 = checkAndClearGk(context2, Experiments.DISABLE_DEX_COLLISION_CHECK);
        boolean checkAndClearGk3 = checkAndClearGk(context2, Experiments.DISABLE_DEX_ISUPTODATE_CHECK);
        boolean checkAndClearGk4 = checkAndClearGk(context2, Experiments.ENABLE_TURBO_LOADER);
        boolean checkAndClearGk5 = checkAndClearGk(context2, Experiments.ENABLE_MADVISE_RAND);
        logDexAddPageFaults = checkAndClearGk(context2, Experiments.ENABLE_IO_LOGGING_ACROSS_ADD_DEXES);
        boolean A08 = AnonymousClass0FU.A08(context2, Experiments.ANDROID_TRY_TO_RECOVER_FROM_ADDDEX_IO_EXCEPTION);
        if (checkAndClearGk) {
            DalvikInternals.installArtHacks(4, Build.VERSION.SDK_INT);
        }
        if (checkAndClearGk2) {
            DalvikInternals.installArtHacks(32, Build.VERSION.SDK_INT);
        }
        if (checkAndClearGk3) {
            DalvikInternals.installArtHacks(64, Build.VERSION.SDK_INT);
        }
        if (checkAndClearGk5) {
            DalvikInternals.hookMmap(getNonSecondaryDexHashes(context2));
        }
        boolean z3 = true;
        if (AnonymousClass0FU.A01(context2, Experiments.DISABLE_MONITOR_VISITLOCKS, 0) != 1) {
            z3 = false;
        }
        if (z3) {
            DalvikInternals.installArtHacks(128, Build.VERSION.SDK_INT);
        }
        if (logDexAddPageFaults) {
            AnonymousClass07H A00 = AnonymousClass07I.A00();
            majPageFaultsDelta = A00.A03;
            pageInBytesDelta = A00.A02;
        }
        MultiDexClassLoader.Configuration configuration = new MultiDexClassLoader.Configuration(i3, 1000, checkAndClearGk, A08, AnonymousClass091.A00(context2));
        int size = configuration.mDexFiles.size();
        odexScheme.configureClassLoader(this.root, configuration);
        if (sMergedDexConfig == null) {
            sMergedDexConfig = new MultiDexClassLoader.Configuration(0, 1000, checkAndClearGk, A08, AnonymousClass091.A00(context2));
        }
        mergeConfiguration(configuration, dexManifest2);
        try {
            ClassLoader install = MultiDexClassLoader.install(context2, this.primaryDexes, this.auxiliaryDexes, AnonymousClass091.A00(context2));
            if (checkAndClearGk4 && AnonymousClass0BO.A00 && install.getClass() == MultiDexClassLoaderArtNative.class) {
                i2 = 4;
                try {
                    ((MultiDexClassLoaderArtNative) install).configureTurboLoader(context2, this.primaryDexes, this.auxiliaryDexes, sMergedDexConfig, this.root);
                } catch (Throwable th) {
                    th = th;
                    if ((i & 2) == 0) {
                    }
                    z2 = true;
                    Object[] objArr = new Object[i2];
                    if (!z2) {
                    }
                    objArr[0] = str;
                    objArr[1] = this.root;
                    objArr[2] = odexScheme;
                    objArr[3] = Boolean.valueOf(z);
                    Mlog.m30e(th, "%s error in store %s scheme %s regen %s", objArr);
                    if (!z) {
                    }
                    if (!z2) {
                    }
                }
            }
            if (install instanceof MultiDexClassLoader) {
                ((MultiDexClassLoader) install).configure(sMergedDexConfig);
            }
            if (z) {
                verifyCanaryClasses(dexManifest2);
            }
            this.mLoadedManifest = dexManifest2;
            if (logDexAddPageFaults) {
                AnonymousClass07H A002 = AnonymousClass07I.A00();
                majPageFaultsDelta = A002.A03 - majPageFaultsDelta;
                pageInBytesDelta = A002.A02 - pageInBytesDelta;
            }
            if (checkAndClearGk5) {
                DalvikInternals.unhookMmap();
            }
        } catch (Throwable th2) {
            th = th2;
            i2 = 4;
            if ((i & 2) == 0) {
                z2 = false;
            }
            z2 = true;
            Object[] objArr2 = new Object[i2];
            if (!z2) {
                str = "fatal";
            } else {
                str = "recoverable";
            }
            objArr2[0] = str;
            objArr2[1] = this.root;
            objArr2[2] = odexScheme;
            objArr2[3] = Boolean.valueOf(z);
            Mlog.m30e(th, "%s error in store %s scheme %s regen %s", objArr2);
            if (!z) {
                writeStatusLocked(5);
            } else {
                writeStatusLocked(0);
            }
            if (!z2) {
                throw new FatalDexError(th);
            }
            Mlog.m35w("retrying dex store load after reset", new Object[0]);
            throw new RecoverableDexException(th);
        }
    }

    public static void mergeConfiguration(MultiDexClassLoader.Configuration configuration, DexManifest dexManifest) {
        sMergedDexConfig.mDexFiles.size();
        sMergedDexConfig.configFlags |= configuration.configFlags;
        Iterator it = configuration.mDexFiles.iterator();
        while (it.hasNext()) {
            sMergedDexConfig.addDex((DexFile) it.next());
        }
        configuration.mDexFiles.clear();
    }

    public static long nowTimestamp() {
        return sDexStoreClock.now();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005e */
    private void optimizeInForegroundLocked(Context context, DexManifest dexManifest, long j) {
        assertLockHeld();
        Context context2 = context;
        OdexScheme schemeForState = schemeForState(context2, dexManifest, j);
        OptimizationConfiguration optimizationConfiguration = new OptimizationConfiguration(Prio.unchanged(), 0, 1000, 0, 100, 3600000, 10, OdexSchemeArtXdex.MIN_DISK_FREE_FOR_MIXED_MODE, false);
        OptimizationConfiguration.Provider provider = new OptimizationConfiguration.Provider(optimizationConfiguration);
        if (sDexStoreClock.now() < getNextRecommendedOptimizationAttemptTime(optimizationConfiguration)) {
            Mlog.safeFmt("... actually, not optimizing in foreground, since we failed optimization too recently", new Object[0]);
            return;
        }
        try {
            OptimizationSession optimizationSession = new OptimizationSession(context2, provider, true);
            try {
                schemeForState.optimize(context2, this, optimizationSession);
                optimizationSession.noteOptimizationSuccess();
                optimizationSession.close();
            } catch (Throwable th) {
                optimizationSession.copeWithOptimizationFailure(th);
                throw th;
            }
        } catch (InterruptedException e) {
            throw new AssertionError(e);
        } catch (Throwable th2) {
            Mlog.m36w(th2, "foreground optimization failed; proceeding", new Object[0]);
        }
    }

    private byte[] readSavedDepBlock() {
        String str;
        Object[] objArr;
        File file = new File(this.root, DEPS_FILENAME);
        if (!file.exists()) {
            return null;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                long length = randomAccessFile.length();
                if (length > 16777216) {
                    str = "saved dep block file is way too big (%s bytes): considering invalid";
                    objArr = new Object[]{Long.valueOf(length)};
                } else {
                    byte[] bArr = new byte[((int) length)];
                    int read = randomAccessFile.read(bArr);
                    if (((long) read) < length) {
                        str = "short read of dep block %s: wanted %s bytes; got %s: considering invalid";
                        objArr = new Object[]{file, Long.valueOf(length), Integer.valueOf(read)};
                    } else {
                        Mlog.safeFmt("read saved dep file %s (%s bytes)", file, Long.valueOf(length));
                        C0015Fs.safeClose((Closeable) randomAccessFile);
                        return bArr;
                    }
                }
                Mlog.safeFmt(str, objArr);
                return null;
            } finally {
                C0015Fs.safeClose((Closeable) randomAccessFile);
            }
        } catch (FileNotFoundException e) {
            Mlog.m36w(e, "unable to open deps file %s", file);
            return null;
        }
    }

    public static long readStatusLocked(DexStore dexStore) {
        DexStore dexStore2 = dexStore;
        dexStore2.assertLockHeld();
        File file = new File(dexStore2.root, MDEX_STATUS_FILENAME);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[16];
                if (fileInputStream.read(bArr, 0, 16) < 16) {
                    Mlog.safeFmt("status file %s too short: treating as zero", file);
                } else {
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    long j = wrap.getLong();
                    long j2 = wrap.getLong();
                    Long valueOf = Long.valueOf(j);
                    Long valueOf2 = Long.valueOf(j2);
                    Mlog.safeFmt("read status:%x check:%x str:%s", valueOf, valueOf2, getStatusDescription(j));
                    long j3 = MDEX_STATUS_XOR ^ j;
                    if (j3 != j2) {
                        Mlog.m29e("check mismatch: status:%x expected-check:%x actual-check:%x", valueOf, Long.valueOf(j3), valueOf2);
                    } else {
                        C0015Fs.safeClose((Closeable) fileInputStream);
                        return j;
                    }
                }
                C0015Fs.deleteRecursiveNoThrow(file);
                return 0;
            } finally {
                C0015Fs.safeClose((Closeable) fileInputStream);
            }
        } catch (FileNotFoundException unused) {
            Mlog.safeFmt("status file %s not found: treating as zero", file);
            return 0;
        }
    }

    public static long sanityCheckTimestamp(long j) {
        if (j > sDexStoreClock.now()) {
            return 0;
        }
        return j;
    }

    private OdexScheme schemeForState(Context context, DexManifest dexManifest, long j) {
        DexManifest.Dex[] dexArr = dexManifest.dexes;
        long j2 = j;
        byte b = (byte) ((int) (15 & j));
        if (b == 2) {
            return new OdexSchemeBoring(dexArr);
        }
        if (b == 3) {
            return new OdexSchemeXdex(dexArr);
        }
        if (b == 4) {
            return new OdexSchemeTurbo(dexArr);
        }
        if (b == 7) {
            return new OdexSchemeArtTurbo(dexArr);
        }
        if (b == 8) {
            return new OdexSchemeArtXdex(context, dexArr, this.mResProvider, j2);
        } else if (b != 9) {
            return new OdexSchemeInvalid(j);
        } else {
            return new OdexSchemeNoop();
        }
    }

    private void touchRegenStamp() {
        File file = new File(this.root, REGEN_STAMP_FILENAME);
        file.createNewFile();
        if (!file.setLastModified(sDexStoreClock.now())) {
            throw new IOException("could not set modtime of " + file);
        }
    }

    public void addChild(DexStore dexStore) {
        if (!this.mChildStores.contains(dexStore)) {
            this.mChildStores.add(dexStore);
        }
    }

    public boolean attemptedOptimizationSinceRegeneration() {
        return new File(this.root, OPTIMIZATION_LOG_FILENAME).exists();
    }

    public String findDexHashForCanaryClass(String str) {
        DexManifest dexManifest = this.mLoadedManifest;
        if (dexManifest != null) {
            for (DexManifest.Dex dex : dexManifest.dexes) {
                if (dex.canaryClass.equals(str)) {
                    return dex.hash;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r2 != null) goto L_0x0017;
     */
    public void forceRegenerateOnNextLoad() {
        ReentrantLockFile.Lock acquire = this.mLockFile.acquire(0);
        writeStatusLocked(6);
        if (acquire != null) {
            acquire.close();
        }
    }

    public List getAllOatFiles(File file) {
        ArrayList arrayList = new ArrayList(r3);
        for (DexManifest.Dex dex : this.mLoadedManifest.dexes) {
            File oatFileFromDexHash = getOatFileFromDexHash(file, dex.hash);
            if (oatFileFromDexHash != null && oatFileFromDexHash.exists()) {
                arrayList.add(oatFileFromDexHash);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        if (r2 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        throw r0;
     */
    public OptimizationLog getAndClearCompletedOptimizationLog() {
        File file = new File(this.root, OPTIMIZATION_LOG_FILENAME);
        if (file.exists()) {
            ReentrantLockFile.Lock acquire = this.mLockFile.acquire(0);
            OptimizationLog readOrMakeDefault = OptimizationLog.readOrMakeDefault(file);
            if ((readOrMakeDefault.flags & 1) != 0) {
                file.delete();
                if (acquire != null) {
                    acquire.close();
                }
                return readOrMakeDefault;
            } else if (acquire != null) {
                acquire.close();
                return null;
            }
        }
        return null;
    }

    public File[] getDependencyOdexFiles() {
        ArrayList arrayList = new ArrayList();
        File file = this.mApk;
        arrayList.add(file);
        arrayList.add(determineOdexCacheName(file));
        for (DexStore dependencyOdexFiles : getParents()) {
            for (File add : dependencyOdexFiles.getDependencyOdexFiles()) {
                arrayList.add(add);
            }
        }
        File[] fileArr = new File[arrayList.size()];
        arrayList.toArray(fileArr);
        return fileArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e9, code lost:
        if (r9 != null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ee, code lost:
        throw r0;
     */
    public Map getDiagnostics(Context context) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long reportStatus = reportStatus();
        OptimizationHistoryLog currentOptHistoryLogFromRoot = getCurrentOptHistoryLogFromRoot(this, context, this.root);
        Config readConfig = readConfig();
        OdexScheme schemeForState = schemeForState(context, loadManifest(), reportStatus);
        linkedHashMap.put("loadNotOptimized", Boolean.toString(schemeForState.loadNotOptimized(reportStatus)));
        linkedHashMap.put("needOptimization", schemeForState.needOptimization(reportStatus, readConfig, currentOptHistoryLogFromRoot).name());
        linkedHashMap.put("scheme", getStatusDescription(reportStatus));
        linkedHashMap.put(RealtimeProtocol.USERS_ACCOUNT_STATUS, Long.toHexString(reportStatus));
        ReentrantLockFile.Lock acquire = this.mLockFile.acquire(0);
        long now = sDexStoreClock.now();
        OptimizationLog readOrMakeDefaultFromRoot = OptimizationLog.readOrMakeDefaultFromRoot(this.root);
        if (readOrMakeDefaultFromRoot.isNotDefault) {
            linkedHashMap.put("optlog.flags", Integer.toString(readOrMakeDefaultFromRoot.flags));
            linkedHashMap.put("optlog.nrOptimizationsAttempted", Integer.toString(readOrMakeDefaultFromRoot.nrOptimizationsAttempted));
            linkedHashMap.put("optlog.nrOptimizationsFailed", Integer.toString(readOrMakeDefaultFromRoot.nrOptimizationsFailed));
            linkedHashMap.put("optlog.lastFailureExceptionJson", readOrMakeDefaultFromRoot.lastFailureExceptionJson);
        }
        if (readConfig != null) {
            linkedHashMap.put("config.enablePgoCompile", Boolean.toString(readConfig.tryPeriodicPgoCompilation));
            if (readConfig.tryPeriodicPgoCompilation) {
                linkedHashMap.put("config.minPgoDuration", Long.toString(readConfig.minTimeBetweenPgoCompilationMs));
                if (currentOptHistoryLogFromRoot != null) {
                    if (currentOptHistoryLogFromRoot.isNotDefault()) {
                        linkedHashMap.put("config.timeleft", printRelativeTime(now, currentOptHistoryLogFromRoot.lastSuccessfulOptimizationTimestampMs + readConfig.minTimeBetweenPgoCompilationMs));
                    }
                }
                linkedHashMap.put("config.timeleft", "<no info>");
            }
        }
        if (currentOptHistoryLogFromRoot != null && currentOptHistoryLogFromRoot.isNotDefault()) {
            linkedHashMap.put("opthistlog.lastSuccess", Boolean.toString(currentOptHistoryLogFromRoot.lastCompilationSessionWasASuccess()));
            linkedHashMap.put("opthistlog.lastCompilationTimestamp", printRelativeTime(now, currentOptHistoryLogFromRoot.lastSuccessfulOptimizationTimestampMs));
        }
        if (acquire != null) {
            acquire.close();
        }
        return linkedHashMap;
    }

    public DexManifest getLoadedManifest() {
        return this.mLoadedManifest;
    }

    public String getMegaZipPath() {
        return this.mMegaZipPath;
    }

    public long getNextRecommendedOptimizationAttemptTime(OptimizationConfiguration optimizationConfiguration) {
        long lastModified = new File(this.root, OPTIMIZATION_LOG_FILENAME).lastModified();
        if (lastModified > sDexStoreClock.now()) {
            Mlog.m35w("ignoring optimization log file from the future", new Object[0]);
            lastModified = 0;
        }
        if (lastModified > 0) {
            return ((long) optimizationConfiguration.timeBetweenOptimizationAttemptsMs) + lastModified;
        }
        return 0;
    }

    public String getOdexCachePath() {
        if (determineOdexCacheName(this.mApk) != null) {
            return determineOdexCacheName(this.mApk).getAbsolutePath();
        }
        return null;
    }

    public boolean hasChildren() {
        return this.mChildStores.isEmpty();
    }

    public DexManifest loadManifest() {
        if (this.mManifest == null) {
            synchronized (this) {
                if (this.mManifest == null) {
                    DexManifest loadManifestFrom = DexManifest.loadManifestFrom(this.mResProvider, DexStoreUtils.SECONDARY_DEX_MANIFEST, true);
                    this.f145id = loadManifestFrom.f144id;
                    this.mManifest = loadManifestFrom;
                }
            }
        }
        return this.mManifest;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0081, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0082, code lost:
        if (r11 != null) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0087, code lost:
        throw r0;
     */
    public TmpDir makeTemporaryDirectory(String str) {
        File file;
        File file2;
        ReentrantLockFile reentrantLockFile;
        ReentrantLockFile.Lock acquire = this.mLockFile.acquire(0);
        ReentrantLockFile.Lock lock = null;
        try {
            file = File.createTempFile(str, TMPDIR_LOCK_SUFFIX, this.root);
            try {
                file2 = new File(this.root, AnonymousClass000.A0E(C0015Fs.stripLastExtension(file.getName()), TMPDIR_SUFFIX));
                C0015Fs.mkdirOrThrow(file2);
                try {
                    reentrantLockFile = ReentrantLockFile.open(file);
                    try {
                        ReentrantLockFile.Lock tryAcquire = reentrantLockFile.tryAcquire(1);
                        if (tryAcquire != null) {
                            try {
                                TmpDir tmpDir = new TmpDir(tryAcquire, file2);
                                Mlog.safeFmt("created tmpdir %s (lock file %s)", tmpDir.directory, reentrantLockFile.lockFileName);
                                C0015Fs.safeClose((Closeable) null);
                                C0015Fs.safeClose((Closeable) null);
                                C0015Fs.deleteRecursiveNoThrow((File) null);
                                C0015Fs.deleteRecursiveNoThrow((File) null);
                                if (acquire != null) {
                                    acquire.close();
                                }
                                return tmpDir;
                            } catch (Throwable th) {
                                th = th;
                                lock = tryAcquire;
                                C0015Fs.safeClose((Closeable) lock);
                                C0015Fs.safeClose((Closeable) reentrantLockFile);
                                C0015Fs.deleteRecursiveNoThrow(file);
                                C0015Fs.deleteRecursiveNoThrow(file2);
                                throw th;
                            }
                        } else {
                            throw new RuntimeException("should have been able to acquire tmpdir lock");
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        C0015Fs.safeClose((Closeable) lock);
                        C0015Fs.safeClose((Closeable) reentrantLockFile);
                        C0015Fs.deleteRecursiveNoThrow(file);
                        C0015Fs.deleteRecursiveNoThrow(file2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    reentrantLockFile = null;
                    C0015Fs.safeClose((Closeable) lock);
                    C0015Fs.safeClose((Closeable) reentrantLockFile);
                    C0015Fs.deleteRecursiveNoThrow(file);
                    C0015Fs.deleteRecursiveNoThrow(file2);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                file2 = null;
                reentrantLockFile = null;
                C0015Fs.safeClose((Closeable) lock);
                C0015Fs.safeClose((Closeable) reentrantLockFile);
                C0015Fs.deleteRecursiveNoThrow(file);
                C0015Fs.deleteRecursiveNoThrow(file2);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            file = null;
            file2 = null;
            reentrantLockFile = null;
            C0015Fs.safeClose((Closeable) lock);
            C0015Fs.safeClose((Closeable) reentrantLockFile);
            C0015Fs.deleteRecursiveNoThrow(file);
            C0015Fs.deleteRecursiveNoThrow(file2);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0061, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0065 */
    public void optimize(Context context, OptimizationConfiguration.Provider provider) {
        DexManifest dexManifest = this.mLoadedManifest;
        if (dexManifest == null) {
            dexManifest = loadManifest();
        }
        Mlog.safeFmt("[opt] loaded manifets", new Object[0]);
        ReentrantLockFile.Lock acquireInterruptubly = this.mLockFile.acquireInterruptubly(0);
        Mlog.safeFmt("[opt] locked dex store %s", this.root);
        try {
            OdexScheme schemeForState = schemeForState(context, dexManifest, readStatusLocked(this));
            Mlog.safeFmt("[opt] found scheme %s", schemeForState);
            if (checkDeps()) {
                OptimizationSession optimizationSession = new OptimizationSession(context, provider, false);
                Mlog.safeFmt("[opt] opened optimization session", new Object[0]);
                acquireInterruptubly.close();
                try {
                    schemeForState.optimize(context, this, optimizationSession);
                    optimizationSession.noteOptimizationSuccess();
                    Mlog.safeFmt("[opt] finished optimization session", new Object[0]);
                    optimizationSession.close();
                } catch (Throwable th) {
                    optimizationSession.copeWithOptimizationFailure(th);
                    throw th;
                }
            } else {
                throw new OptimizationCanceledException("attempt to optimize stale repository");
            }
        } catch (InterruptedException e) {
            throw e;
        } catch (Throwable th2) {
            try {
                Mlog.m35w("[opt] optimization failed!", th2);
                throw th2;
            } catch (Throwable th3) {
                if (acquireInterruptubly != null) {
                    acquireInterruptubly.close();
                }
                throw th3;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r3 != null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        throw r0;
     */
    public void pruneTemporaryDirectories() {
        ReentrantLockFile.Lock acquire = this.mLockFile.acquire(0);
        String[] list = this.root.list();
        if (list != null) {
            pruneTemporaryDirectoriesLocked(list);
            if (acquire != null) {
                acquire.close();
                return;
            }
            return;
        }
        throw new IOException("unable to list directory " + this.root);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ba, code lost:
        if (r4 != null) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bf, code lost:
        throw r0;
     */
    public Config readConfig() {
        Config config;
        int i = 0;
        ReentrantLockFile.Lock acquire = this.mLockFile.acquire(0);
        File file = new File(this.root, CONFIG_FILENAME);
        try {
            Config read = Config.read(file);
            i = read;
            i = read;
            config = read;
        } catch (FileNotFoundException unused) {
            config = new Config((byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, -1, -1, -1, -1, -1, false, Config.enableOatmealByDefault(), false, false, false, false, false, false, (byte) 0, false, -1, (byte) 0);
        } catch (UnsupportedOperationException unused2) {
            Mlog.safeFmt("unsupported dex store config file %s: ignoring and deleting", new Object[i]);
            C0015Fs.deleteRecursive(file);
            config = new Config((byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, -1, -1, -1, -1, -1, false, Config.enableOatmealByDefault(), false, false, false, false, false, false, (byte) 0, false, -1, (byte) 0);
        } catch (Exception e) {
            Mlog.m36w(e, "error reading dex store config file %s: deleting and proceeding", new Object[i]);
            C0015Fs.deleteRecursive(file);
            config = new Config((byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, -1, -1, -1, -1, -1, false, Config.enableOatmealByDefault(), false, false, false, false, false, false, (byte) 0, false, -1, (byte) 0);
        }
        if (acquire != null) {
            acquire.close();
        }
        return config;
    }

    public void setResProvider(ResProvider resProvider) {
        this.mResProvider = resProvider;
        this.mDexIteratorFactory = new DexIteratorFactory(resProvider);
    }

    public boolean useBgDexOpt() {
        return this.mUseBgDexOpt;
    }

    public final class OptimizationCanceledException extends InterruptedException {
        public OptimizationCanceledException(String str) {
            super(str);
        }
    }

    public final class RecoverableDexException extends Exception {
        public RecoverableDexException(Throwable th) {
            super(th);
        }
    }

    public DexStore(File file, File file2, ResProvider resProvider, ArrayList arrayList, ArrayList arrayList2) {
        this.mApk = file2;
        this.root = file;
        C0015Fs.mkdirOrThrow(file);
        this.mLockFile = ReentrantLockFile.open(new File(file, MDEX_LOCK_FILENAME));
        this.mResProvider = resProvider;
        this.mDexIteratorFactory = new DexIteratorFactory(resProvider);
        this.primaryDexes = arrayList;
        this.auxiliaryDexes = arrayList2;
    }

    public static boolean checkAndClearGk(Context context, String str) {
        int i;
        try {
            return AnonymousClass0FU.A08(context, str);
        } finally {
            i = 0;
            if (context != null) {
                AnonymousClass0FU.A05(context, str, i);
            }
        }
    }

    private boolean checkDeps() {
        byte[] readCurrentDepBlock = readCurrentDepBlock();
        byte[] readSavedDepBlock = readSavedDepBlock();
        if (readSavedDepBlock == null || !Arrays.equals(readCurrentDepBlock, readSavedDepBlock)) {
            return false;
        }
        return true;
    }

    public static boolean checkGk(Context context, String str) {
        return AnonymousClass0FU.A08(context, str);
    }

    public static long genAppUpgradeTimestamp(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 128).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException | RuntimeException e) {
            Mlog.m36w(e, "Cannot get our app last update time", new Object[0]);
            return 0;
        }
    }

    private DexStore[] getParents() {
        boolean z;
        loadManifest();
        if (this.mParentStores.isEmpty()) {
            DexManifest dexManifest = this.mManifest;
            if (!DexStoreUtils.MAIN_DEX_STORE_ID.equals(dexManifest.f144id)) {
                for (String str : dexManifest.requires) {
                    if (!DexStoreUtils.MAIN_DEX_STORE_ID.equals(str)) {
                        DexStore dexStoreListHead = dexStoreListHead();
                        while (true) {
                            if (dexStoreListHead != null) {
                                String str2 = dexStoreListHead.f145id;
                                if (str2 != null && str2.equals(str)) {
                                    this.mParentStores.add(dexStoreListHead);
                                    dexStoreListHead.addChild(this);
                                    z = true;
                                    break;
                                }
                                dexStoreListHead = dexStoreListHead.next;
                            } else {
                                z = false;
                                break;
                            }
                        }
                        if (!z) {
                            Mlog.safeFmt(AnonymousClass000.A0N("unable to find required store ", str, " of store ", this.mManifest.f144id), new Object[0]);
                        }
                    }
                }
            }
        }
        List list = this.mParentStores;
        return (DexStore[]) list.toArray(new DexStore[list.size()]);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ca, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cb, code lost:
        if (r5 != null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d0, code lost:
        throw r0;
     */
    private void pruneTemporaryDirectoriesLocked(String[] strArr) {
        String str;
        assertLockHeld();
        for (int i = 0; i < strArr.length; i++) {
            String str2 = strArr[i];
            if (str2 != null) {
                String str3 = null;
                if (str2.endsWith(TMPDIR_LOCK_SUFFIX)) {
                    strArr[i] = null;
                    int findInArray = findInArray(strArr, AnonymousClass000.A0E(C0015Fs.stripLastExtension(str2), TMPDIR_SUFFIX));
                    if (findInArray >= 0) {
                        str = strArr[findInArray];
                        strArr[findInArray] = null;
                    } else {
                        str = null;
                    }
                    str3 = str2;
                    str2 = str;
                } else if (str2.endsWith(TMPDIR_SUFFIX)) {
                    strArr[i] = null;
                    int findInArray2 = findInArray(strArr, AnonymousClass000.A0E(C0015Fs.stripLastExtension(str2), TMPDIR_LOCK_SUFFIX));
                    if (findInArray2 >= 0) {
                        String str4 = strArr[findInArray2];
                        strArr[findInArray2] = null;
                        str3 = str4;
                    }
                } else {
                    str2 = null;
                }
                if (str3 != null && str2 != null) {
                    File file = new File(this.root, str3);
                    ReentrantLockFile open = ReentrantLockFile.open(file);
                    ReentrantLockFile.Lock tryAcquire = open.tryAcquire(0);
                    if (tryAcquire == null) {
                        Mlog.safeFmt("tmpdir %s in use: not deleting", str2);
                    } else {
                        try {
                            Mlog.safeFmt("tmpdir %s (lockfile %s) is abandoned: deleting", file, str2);
                            C0015Fs.deleteRecursive(file);
                            C0015Fs.deleteRecursive(new File(this.root, str2));
                            tryAcquire.close();
                        } catch (Throwable th) {
                            tryAcquire.close();
                            throw th;
                        }
                    }
                    open.close();
                } else if (str3 != null) {
                    Mlog.safeFmt("tmpdir lockfile %s is orphaned: deleting", str3);
                    C0015Fs.deleteRecursive(new File(this.root, str3));
                } else if (str2 != null) {
                    Mlog.safeFmt("tmpdir %s is orphaned without its lockfile: deleting", str2);
                    C0015Fs.deleteRecursive(new File(this.root, str2));
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:30|(2:32|33)|34|35) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        if (r3 != null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0040, code lost:
        if (r5 != null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0032 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0045 */
    private void runCompiler(DexManifest dexManifest, OdexScheme odexScheme, int i, AnonymousClass076 r10, Context context) {
        OdexScheme.Compiler makeCompiler = odexScheme.makeCompiler(this, i);
        InputDexIterator openDexIterator = this.mDexIteratorFactory.openDexIterator(this.f145id, dexManifest, r10, context);
        while (openDexIterator.hasNext()) {
            InputDex next2 = openDexIterator.next();
            Mlog.safeFmt("compiling %s", next2);
            makeCompiler.compile(next2);
            if (next2 != null) {
                next2.close();
            }
        }
        makeCompiler.performFinishActions();
        openDexIterator.close();
        makeCompiler.close();
        return;
        try {
        } catch (Throwable th) {
            if (makeCompiler != null) {
                try {
                    makeCompiler.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        r0 = move-exception;
     */
    private void saveDeps() {
        byte[] readCurrentDepBlock = readCurrentDepBlock();
        File file = new File(this.root, DEPS_FILENAME);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        randomAccessFile.write(readCurrentDepBlock);
        randomAccessFile.setLength(randomAccessFile.getFilePointer());
        randomAccessFile.close();
        Mlog.safeFmt("saved deps file %s", file);
    }

    public File findOatFileForCanaryClass(File file, String str) {
        return getOatFileFromDexHash(file, findDexHashForCanaryClass(str));
    }

    public String[] getParentNames() {
        loadManifest();
        return this.mManifest.requires;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0066, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        throw r0;
     */
    public void writeStatusLocked(long j) {
        assertLockHeld();
        if (((byte) ((int) (15 & j))) != 1) {
            DalvikInternals.fsyncNamed(this.root.getAbsolutePath(), -1);
        }
        File file = new File(this.root, MDEX_STATUS_FILENAME);
        long j2 = MDEX_STATUS_XOR ^ j;
        Mlog.safeFmt("writing status:%x check:%x str:%s", Long.valueOf(j), Long.valueOf(j2), getStatusDescription(j));
        byte[] bArr = new byte[16];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(j);
        wrap.putLong(j2);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(bArr, 0, 16);
        fileOutputStream.getFD().sync();
        fileOutputStream.close();
    }

    public static DexStore open(File file, File file2, ResProvider resProvider) {
        return open(file, file2, resProvider, new ArrayList(), new ArrayList());
    }

    public static synchronized DexStore open(File file, File file2, ResProvider resProvider, ArrayList arrayList, ArrayList arrayList2) {
        DexStore dexStoreListHead;
        synchronized (DexStore.class) {
            File absoluteFile = file.getAbsoluteFile();
            dexStoreListHead = dexStoreListHead();
            while (true) {
                if (dexStoreListHead != null) {
                    if (dexStoreListHead.root.equals(absoluteFile)) {
                        break;
                    }
                    dexStoreListHead = dexStoreListHead.next;
                } else {
                    dexStoreListHead = new DexStore(absoluteFile, file2, resProvider, arrayList, arrayList2);
                    sListHead = dexStoreListHead;
                    break;
                }
            }
        }
        return dexStoreListHead;
    }
}
