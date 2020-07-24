package com.facebook.common.dextricks;

import com.facebook.common.dextricks.MultiDexClassLoader;
import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;
import com.facebook.common.dextricks.stats.ClassLoadingStats;
import com.facebook.profilo.logger.api.ProfiloLogger;
import dalvik.system.DexFile;
import java.util.ArrayList;
import p000X.AnonymousClass0KJ;

public final class MultiDexClassLoaderBoring extends MultiDexClassLoader {
    public final ClassLoadingStats mClassLoadingStats;
    public DexFile[] mDexFiles;

    public void onColdstartDone() {
    }

    public String toString() {
        return "MultiDexClassLoaderBoring";
    }

    public DexFile[] doGetConfiguredDexFiles() {
        return this.mDexFiles;
    }

    public MultiDexClassLoaderBoring() {
        AnonymousClass0KJ r1 = new AnonymousClass0KJ();
        ClassLoadingStats.A00.getAndSet(r1);
        this.mClassLoadingStats = r1;
    }

    public void configure(MultiDexClassLoader.Configuration configuration) {
        super.configure(configuration);
        ArrayList arrayList = configuration.mDexFiles;
        this.mDexFiles = (DexFile[]) arrayList.toArray(new DexFile[arrayList.size()]);
        configureArtHacks(configuration);
    }

    /* JADX INFO: finally extract failed */
    public Class findClass(String str) {
        ProfiloLogger.classLoadStart();
        ClassTracingLogger.beginClassLoad(str);
        this.mClassLoadingStats.incrementClassLoadsAttempted();
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                DexFile[] dexFileArr = this.mDexFiles;
                if (i < dexFileArr.length) {
                    i2++;
                    Class loadClass = dexFileArr[i].loadClass(str, this.mPutativeLoader);
                    if (loadClass != null) {
                        this.mClassLoadingStats.incrementDexFileQueries(i2);
                        ClassTracingLogger.classLoaded(loadClass);
                        ProfiloLogger.classLoadEnd(loadClass);
                        return loadClass;
                    }
                    i++;
                } else {
                    this.mClassLoadingStats.incrementDexFileQueries(i2);
                    ClassTracingLogger.classNotFound();
                    ProfiloLogger.classLoadFailed();
                    this.mClassLoadingStats.incrementClassLoadsFailed();
                    throw new ClassNotFoundException(str);
                }
            } catch (Throwable th) {
                this.mClassLoadingStats.incrementDexFileQueries(i2);
                ClassTracingLogger.classNotFound();
                ProfiloLogger.classLoadFailed();
                this.mClassLoadingStats.incrementClassLoadsFailed();
                throw th;
            }
        }
    }
}
