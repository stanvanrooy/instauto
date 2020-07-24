package com.facebook.common.dextricks;

import android.content.Context;
import android.os.Build;
import android.os.SystemProperties;
import android.util.Log;
import com.facebook.common.dextricks.stats.ClassLoadingStats;
import com.facebook.common.dextricks.turboloader.TurboLoader;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000X.AnonymousClass000;
import p000X.AnonymousClass01A;
import p000X.AnonymousClass01Q;
import p000X.AnonymousClass08G;
import p000X.AnonymousClass0BJ;
import p000X.AnonymousClass0Bq;
import p000X.AnonymousClass0CX;
import p000X.AnonymousClass0CY;
import p000X.C039008y;
import p000X.C04410Dw;

public abstract class MultiDexClassLoader extends ClassLoader {
    public static final ClassLoader APP_CLASSLOADER;
    public static final int BASE_DEX_RETRY_WAIT_MS = 500;
    public static final Field CLASSLOADER_PARENT_FIELD;
    public static final Object INSTALL_LOCK = new Object();
    public static final int MAX_LOAD_DEX_RETRY = 3;
    public static final ClassLoader SYSTEM_CLASSLOADER;
    public static final String TAG = "MultiDexClassLoader";
    public static final boolean USE_DALVIK_NATIVE_LOADER = true;
    public static final boolean USE_FANCY_LOADER = true;
    public static volatile AnonymousClass0BJ sFallbackDexLoader;
    public static Throwable sFancyLoaderFailure;
    public static volatile ClassLoader sInstalledClassLoader;
    public Configuration mConfig;
    public final ClassLoader mPutativeLoader = APP_CLASSLOADER;
    public TurboLoader mTurboLoader;

    public final class Configuration {
        public static final int LOAD_SECONDARY = 4;
        public static final int SUPPORTS_LOCATORS = 2;
        public final boolean allowRetryAddDexOnIOException;
        public final ArrayList coldstartDexBaseNames = new ArrayList();
        public final int coldstartDexCount;
        public int configFlags;
        public final boolean disableVerifier;
        public final ArrayList mDexFiles = new ArrayList();
        public final C039008y mFbColdStartExperiment;

        private void appendColdstartDexBaseName(File file) {
            if (this.coldstartDexBaseNames.size() < this.coldstartDexCount) {
                String name = file.getName();
                String substring = name.substring(0, name.indexOf(46));
                this.coldstartDexBaseNames.add(substring);
                DalvikInternals.addDexBaseNames(substring);
            }
        }

        public int getConfigFlags() {
            return this.configFlags;
        }

        public C039008y getExperiment() {
            return this.mFbColdStartExperiment;
        }

        public int getNumberConfiguredDexFiles() {
            return this.mDexFiles.size();
        }

        public Configuration(int i, int i2, boolean z, boolean z2, C039008y r6) {
            this.configFlags = i;
            this.coldstartDexCount = i2;
            this.disableVerifier = z;
            this.allowRetryAddDexOnIOException = z2;
            this.mFbColdStartExperiment = r6;
        }

        public void setConfigFlags(int i) {
            this.configFlags = i;
        }

        public void addDex(DexFile dexFile) {
            this.mDexFiles.add(dexFile);
        }

        public void addDex(File file) {
            addDex(file, false);
        }

        public void addDex(File file, File file2) {
            addDex(file, file2, false);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
            if (r11.allowRetryAddDexOnIOException == false) goto L_0x0014;
         */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0059  */
        public void addDex(File file, File file2, boolean z) {
            String str;
            boolean z2;
            String absolutePath = file.getAbsolutePath();
            DexFile dexFile = null;
            if (file2 != null) {
                str = file2.getAbsolutePath();
            } else {
                str = null;
            }
            if (z) {
                z2 = true;
            }
            z2 = false;
            int i = 0;
            do {
                if (i > 0) {
                    try {
                        Thread.sleep((long) (i * 500));
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                i++;
                try {
                    dexFile = DexFile.loadDex(file.getAbsolutePath(), str, 0);
                } catch (IOException e) {
                    Log.w(MultiDexClassLoader.TAG, String.format("Failed loading dex ( %s )", new Object[]{absolutePath}), e);
                    if (!z2 || 3 < i) {
                        throw e;
                    }
                }
                if (!z2 || dexFile != null) {
                    if (dexFile == null) {
                        this.mDexFiles.add(dexFile);
                        appendColdstartDexBaseName(file);
                        return;
                    }
                    throw new IOException(AnonymousClass000.A0E("Could not load dex file ", absolutePath));
                }
            } while (i <= 3);
            if (dexFile == null) {
            }
        }

        public void addDex(File file, boolean z) {
            addDex(file, (File) null, z);
        }
    }

    public static void clearFancyLoaderFailure() {
        sFancyLoaderFailure = null;
    }

    public static void forceLoadProfiloIfPresent() {
        String[] strArr = {"com.facebook.profilo.logger.api.ProfiloLogger", "com.facebook.profilo.core.TraceEvents", "com.facebook.profilo.entries.EntryType", "com.facebook.profilo.logger.ClassLoadLogger", "com.facebook.profilo.logger.Logger", "com.facebook.profilo.core.ProvidersRegistry"};
        for (int i = 0; i < 6; i++) {
            try {
                Class.forName(strArr[i]);
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    public abstract DexFile[] doGetConfiguredDexFiles();

    public String[] getRecentFailedClasses() {
        return new String[0];
    }

    public abstract void onColdstartDone();

    static {
        try {
            APP_CLASSLOADER = MultiDexClassLoader.class.getClassLoader();
            Field declaredField = ClassLoader.class.getDeclaredField("parent");
            CLASSLOADER_PARENT_FIELD = declaredField;
            declaredField.setAccessible(true);
            SYSTEM_CLASSLOADER = (ClassLoader) CLASSLOADER_PARENT_FIELD.get(APP_CLASSLOADER);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MultiDexClassLoader() {
        super(SYSTEM_CLASSLOADER);
    }

    public static ClassLoader createMultiDexClassLoader(Context context, ArrayList arrayList, ArrayList arrayList2, C039008y r11) {
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        Context context2 = context;
        if (!"true".equals(SystemProperties.get("com.facebook.force_mdclj")) && !"Amazon".equals(Build.BRAND)) {
            try {
                if (!AnonymousClass0Bq.A00) {
                    return new MultiDexClassLoaderDalvikNative(context, arrayList, arrayList2);
                }
                if (AnonymousClass0CX.A01.equals(AnonymousClass0CY.A00().A00)) {
                    boolean equals = "true".equals(SystemProperties.get("com.facebook.force_mdclan"));
                    int i = ((AnonymousClass08G) r11).A01;
                    if (i == 1 || i == 2 || equals) {
                        ClassLoader classLoader = SYSTEM_CLASSLOADER;
                        boolean z = false;
                        if (i == 2) {
                            z = true;
                        }
                        return new MultiDexClassLoaderArtNative(context2, classLoader, arrayList3, arrayList4, z, equals);
                    }
                }
            } catch (Exception | NoSuchFieldError e) {
                Log.w(TAG, "unable to use native MDCL: falling back to Java impl", e);
                sFancyLoaderFailure = e;
            }
        }
        return new MultiDexClassLoaderJava(context2, arrayList3, arrayList2);
    }

    public static ClassLoader get() {
        return sInstalledClassLoader;
    }

    public static Configuration getConfiguration() {
        ClassLoader classLoader = sInstalledClassLoader;
        if (classLoader == null || !(classLoader instanceof MultiDexClassLoader)) {
            return null;
        }
        return ((MultiDexClassLoader) classLoader).mConfig;
    }

    public static DexFile[] getConfiguredDexFiles() {
        ClassLoader classLoader = sInstalledClassLoader;
        if (classLoader == null || !(classLoader instanceof MultiDexClassLoader)) {
            return new DexFile[0];
        }
        return ((MultiDexClassLoader) classLoader).doGetConfiguredDexFiles();
    }

    public static Throwable getFancyLoaderFailure() {
        return sFancyLoaderFailure;
    }

    public static ClassLoader install(Context context, ArrayList arrayList, ArrayList arrayList2, C039008y r7) {
        ClassLoader classLoader;
        RuntimeException runtimeException;
        ClassLoader classLoader2 = sInstalledClassLoader;
        if (classLoader2 != null) {
            return classLoader2;
        }
        synchronized (INSTALL_LOCK) {
            classLoader = sInstalledClassLoader;
            if (classLoader == null) {
                try {
                    Class.forName("com.facebook.common.dextricks.FatalDexError");
                    Class.forName("com.facebook.common.dextricks.DexFileLoadOld");
                    Class.forName("com.facebook.common.dextricks.DexFileLoadNew");
                    Class.forName("com.facebook.common.dextricks.stats.ClassLoadingStats");
                    Class.forName("com.facebook.common.dextricks.stats.ClassLoadingStats$SnapshotStats");
                    Class.forName("com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger");
                    Class.forName("com.facebook.common.dextricks.classtracing.logger.ClassTracingLoggerNativeHolder");
                    Class.forName("com.facebook.common.dextricks.classtracing.logger.ClassTracingLoggerLite");
                    Class.forName("com.facebook.common.dextricks.coverage.logger.ClassCoverageLogger");
                    Class.forName("com.facebook.common.dextricks.benchmarkhelper.ClassloadNameCollector");
                    Class.forName("com.facebook.common.dextricks.classid.ClassId");
                    forceLoadProfiloIfPresent();
                    C04410Dw r2 = AnonymousClass01Q.A00;
                    r2.A0S("recentClassLoadFailures", new AnonymousClass01A() {
                        public String getCustomData(Throwable th) {
                            ClassLoader classLoader = MultiDexClassLoader.sInstalledClassLoader;
                            if (classLoader instanceof MultiDexClassLoader) {
                                return Arrays.toString(((MultiDexClassLoader) classLoader).getRecentFailedClasses());
                            }
                            return "";
                        }
                    });
                    r2.A0S("multiDexClassLoader", new AnonymousClass01A() {
                        public String getCustomData(Throwable th) {
                            return MultiDexClassLoader.sInstalledClassLoader.toString();
                        }
                    });
                    classLoader = createMultiDexClassLoader(context, arrayList, arrayList2, r7);
                    try {
                        if (classLoader instanceof MultiDexClassLoader) {
                            CLASSLOADER_PARENT_FIELD.set(((MultiDexClassLoader) classLoader).mPutativeLoader, classLoader);
                        }
                        sInstalledClassLoader = classLoader;
                    } catch (IllegalAccessException e) {
                        runtimeException = new RuntimeException(e);
                        throw runtimeException;
                    }
                } catch (ClassNotFoundException e2) {
                    runtimeException = new RuntimeException(e2);
                    throw runtimeException;
                }
            }
        }
        return classLoader;
    }

    public static boolean isArt() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public static final boolean maybeFallbackLoadDexes(String str, Throwable th) {
        AnonymousClass0BJ r0 = sFallbackDexLoader;
        if (r0 == null) {
            return false;
        }
        return r0.AvY(str, th);
    }

    public static void notifyCurrentClassLoaderThatColdstartDone() {
        ClassLoader classLoader = sInstalledClassLoader;
        if (classLoader != null && (classLoader instanceof MultiDexClassLoader)) {
            ((MultiDexClassLoader) classLoader).onColdstartDone();
        }
    }

    public MultiDexClassLoader configureTurboLoader(Context context, List list, List list2, Configuration configuration, File file) {
        boolean exists;
        TurboLoader turboLoader = new TurboLoader(context, list, list2, file);
        this.mTurboLoader = turboLoader;
        boolean z = false;
        if ((configuration.configFlags & 2) != 0) {
            z = true;
        }
        turboLoader.install(configuration.mDexFiles, z);
        String str = this.mTurboLoader.turboLoaderMapFile;
        if (str == null) {
            exists = false;
        } else {
            exists = new File(str).exists();
        }
        if (exists) {
            ClassLoadingStats.A00().incrementTurboLoaderMapGenerationSuccesses();
            return this;
        }
        ClassLoadingStats.A00().incrementTurboLoaderMapGenerationFailures();
        return this;
    }

    public Configuration getConfig() {
        return this.mConfig;
    }

    public void configureArtHacks(Configuration configuration) {
        if (isArt()) {
            int i = 0;
            if (configuration.disableVerifier) {
                i = 4;
            }
            if (i != 0) {
                DalvikInternals.installArtHacks(i, Build.VERSION.SDK_INT);
            }
        }
    }

    public final Class maybeFallbackLoadClass(String str, Throwable th) {
        ClassNotFoundException classNotFoundException;
        ClassNotFoundException classNotFoundException2;
        try {
            if (maybeFallbackLoadDexes(str, th)) {
                Class findClass = findClass(str);
                if (findClass != null) {
                    return findClass;
                }
                Log.w(TAG, AnonymousClass000.A0E("findClass failed without throwing for ", str));
            }
            if (th instanceof ClassNotFoundException) {
                classNotFoundException = (ClassNotFoundException) th;
                throw classNotFoundException;
            }
            classNotFoundException2 = new ClassNotFoundException(str, th);
            classNotFoundException = classNotFoundException2;
            throw classNotFoundException;
        } catch (RuntimeException e) {
            classNotFoundException2 = new ClassNotFoundException(AnonymousClass000.A0E("Fallback class load failed for ", str), e);
        }
    }

    public void notifyColdstartDone() {
        onColdstartDone();
    }

    public static void setFallbackDexLoader(AnonymousClass0BJ r0) {
        sFallbackDexLoader = r0;
    }

    public void configure(Configuration configuration) {
        this.mConfig = configuration;
    }
}
