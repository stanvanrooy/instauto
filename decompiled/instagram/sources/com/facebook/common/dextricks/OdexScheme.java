package com.facebook.common.dextricks;

import android.content.Context;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.MultiDexClassLoader;
import java.io.Closeable;
import java.io.File;

public abstract class OdexScheme {
    public static final int ODEX_SCHEME_BATCH_ONLY = 1;
    public static final int ODEX_SCHEME_INVALID = 2;
    public static final int ODEX_SCHEME_LOW_SPACE = 32;
    public static final int ODEX_SCHEME_NOT_OPTIMAL = 8;
    public static final int ODEX_SCHEME_OPTIMIZATION_IS_CRAZY_EXPENSIVE = 4;
    public static final int ODEX_SCHEME_SKIP_COMPILER = 16;
    public final ExpectedFileInfo[] expectedFileInfos;
    public final String[] expectedFiles;
    public final int flags;

    public abstract class Compiler implements Closeable {
        public static final int COMPILE_INCREMENTAL = 1;

        public void close() {
        }

        public abstract void compile(InputDex inputDex);

        public void performFinishActions() {
        }
    }

    public enum NeedOptimizationState {
        NO_OPTIMIZATION_NEEDED(false),
        NEED_OPTIMIZATION(true),
        NEED_REOPTIMIZATION(true);
        
        public final boolean mShouldOptimize;

        public static NeedOptimizationState shouldOptimize(boolean z) {
            if (z) {
                return NEED_OPTIMIZATION;
            }
            return NO_OPTIMIZATION_NEEDED;
        }

        public boolean needsOptimization() {
            return this.mShouldOptimize;
        }

        /* access modifiers changed from: public */
        NeedOptimizationState(boolean z) {
            this.mShouldOptimize = z;
        }
    }

    public abstract void configureClassLoader(File file, MultiDexClassLoader.Configuration configuration);

    public abstract String getSchemeName();

    public int loadInformationalStatus(File file, long j) {
        return 0;
    }

    public boolean loadNotOptimized(long j) {
        return true;
    }

    public abstract Compiler makeCompiler(DexStore dexStore, int i);

    public void optimize(Context context, DexStore dexStore, DexStore.OptimizationSession optimizationSession) {
    }

    public final String toString() {
        return getClass().getName();
    }

    public NeedOptimizationState needOptimization(long j, DexStore.Config config, DexStore.OptimizationHistoryLog optimizationHistoryLog) {
        return NeedOptimizationState.NO_OPTIMIZATION_NEEDED;
    }

    public OdexScheme(int i, ExpectedFileInfo[] expectedFileInfoArr) {
        this.flags = i;
        this.expectedFiles = ExpectedFileInfo.convertTo(expectedFileInfoArr);
        this.expectedFileInfos = expectedFileInfoArr;
    }

    public OdexScheme(int i, String[] strArr) {
        this.flags = i;
        this.expectedFiles = strArr;
        this.expectedFileInfos = ExpectedFileInfo.convertTo(strArr);
    }
}
