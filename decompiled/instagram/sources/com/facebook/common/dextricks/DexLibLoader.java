package com.facebook.common.dextricks;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.StrictMode;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.DexStore;
import dalvik.system.DexFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p000X.AnonymousClass000;
import p000X.AnonymousClass076;
import p000X.AnonymousClass0BR;
import p000X.AnonymousClass0BV;
import p000X.AnonymousClass0Bp;
import p000X.C024102g;

public final class DexLibLoader {
    public static final int LOAD_ALL_ASYNC_OPTIMIZATION = 4;
    public static final int LOAD_ALL_BETA_BUILD = 1;
    public static final int LOAD_ALL_INSTRUMENTATION_TEST = 16;
    public static final int LOAD_ALL_OPEN_ONLY = 2;
    public static final int LOAD_SECONDARY = 8;
    public static boolean deoptTaint;
    public static DexErrorRecoveryInfo mDeri;
    public static DexStore sMainDexStore;

    public final class ApkResProvider extends ResProvider {
        public static final String SECONDARY_PROGRAM_DEX_JARS = "secondary-program-dex-jars";
        public ZipFile mApkZip;
        public final Context mContext;

        public void close() {
            C0015Fs.safeClose(this.mApkZip);
        }

        public void markRootRelative() {
            if (this.mApkZip == null) {
                this.mApkZip = new ZipFile(this.mContext.getApplicationInfo().sourceDir);
            }
        }

        public InputStream open(String str) {
            ZipFile zipFile = this.mApkZip;
            if (zipFile == null || DexStoreUtils.SECONDARY_DEX_MANIFEST.equals(str)) {
                return this.mContext.getAssets().open(AnonymousClass000.A0E("secondary-program-dex-jars/", str));
            }
            ZipEntry entry = zipFile.getEntry(str);
            if (entry != null) {
                return this.mApkZip.getInputStream(entry);
            }
            throw new FileNotFoundException(AnonymousClass000.A0E("cannot find root-relative resource: ", str));
        }

        public ApkResProvider(Context context) {
            this.mContext = context;
        }
    }

    public final class ExoPackageResProvider extends ResProvider {
        public static final String EXOPACKAGE_DIR = "/data/local/tmp/exopackage";
        public final File mDirectory;

        public InputStream open(String str) {
            return new FileInputStream(new File(this.mDirectory, str));
        }

        public ExoPackageResProvider(Context context) {
            this.mDirectory = new File(AnonymousClass000.A0J("/data/local/tmp/exopackage/", context.getPackageName(), "/secondary-dex"));
        }
    }

    public static synchronized long getLastCompilationTime(Context context) {
        long j;
        synchronized (DexLibLoader.class) {
            j = 0;
            DexStore dexStore = sMainDexStore;
            if (dexStore != null) {
                j = dexStore.getLastRegenTime();
            }
        }
        return j;
    }

    public static synchronized DexStore getMainDexStore() {
        DexStore dexStore;
        synchronized (DexLibLoader.class) {
            dexStore = sMainDexStore;
            if (dexStore == null) {
                throw new IllegalStateException("main dex store not loaded");
            }
        }
        return dexStore;
    }

    public static DexErrorRecoveryInfo getMainDexStoreLoadInformation() {
        DexErrorRecoveryInfo dexErrorRecoveryInfo = mDeri;
        if (dexErrorRecoveryInfo != null) {
            return dexErrorRecoveryInfo;
        }
        throw new AssertionError("main dex store not yet loaded");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:21|(1:23)(1:24)|25|26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01fc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01fd, code lost:
        if (r3 != null) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0202, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        if (p000X.AnonymousClass0Bp.A01 != false) goto L_0x0058;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0077 */
    public static DexErrorRecoveryInfo loadAllImpl(Context context, int i, AnonymousClass076 r21, DexStore.Config config) {
        DexErrorRecoveryInfo dexErrorRecoveryInfo;
        int i2;
        boolean z;
        AnonymousClass0BR th;
        StrictMode.VmPolicy vmPolicy;
        StrictMode.VmPolicy.Builder builder;
        int i3 = i & 1;
        boolean z2 = false;
        if (i3 != 0) {
            z2 = true;
        }
        Mlog.safeFmt("DLL.loadAll betaBuild:%s flags:0x%08x", Boolean.valueOf(z2), Integer.valueOf(i));
        DexStore.Config config2 = config;
        Context context2 = context;
        if ((i & 16) != 0) {
            Mlog.safeFmt("DLL.loadAll instrumentation test mode", new Object[0]);
            setupMainDexStoreConfigForInstrumentationTests(context2, config2);
        } else if (config != null) {
            throw new IllegalArgumentException("Do not specify a config outside of test mode.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            ClassLoader classLoader = DexLibLoader.class.getClassLoader();
            long currentTimeMillis = System.currentTimeMillis();
            boolean z3 = AnonymousClass0Bp.A02;
            if (z3) {
                z = false;
            }
            z = true;
            if (z) {
                if (!z3 || !AnonymousClass0Bp.A01) {
                    vmPolicy = null;
                } else {
                    vmPolicy = StrictMode.getVmPolicy();
                    if (vmPolicy == null) {
                        builder = new StrictMode.VmPolicy.Builder();
                    }
                    AnonymousClass0Bp.A00.invoke(builder, new Object[0]);
                    StrictMode.setVmPolicy(builder.build());
                }
                try {
                    Field declaredField = Class.forName("dalvik.system.BaseDexClassLoader").getDeclaredField("pathList");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(classLoader);
                    Field declaredField2 = Class.forName("dalvik.system.DexPathList").getDeclaredField("dexElements");
                    declaredField2.setAccessible(true);
                    Object[] objArr = (Object[]) declaredField2.get(obj);
                    Field declaredField3 = Class.forName("dalvik.system.DexPathList$Element").getDeclaredField("dexFile");
                    declaredField3.setAccessible(true);
                    String str = context2.getApplicationInfo().sourceDir;
                    String.format("primary dex name: %s", new Object[]{str});
                    if (str != null) {
                        for (Object obj2 : objArr) {
                            DexFile dexFile = (DexFile) declaredField3.get(obj2);
                            if (dexFile != null) {
                                String name = dexFile.getName();
                                if (str.equals(name)) {
                                    String.format("Found primary dex %s", new Object[]{name});
                                    arrayList.add(dexFile);
                                } else {
                                    String.format("Found system/other dex %s", new Object[]{name});
                                    arrayList2.add(dexFile);
                                }
                            }
                        }
                        if (vmPolicy != null) {
                            StrictMode.setVmPolicy(vmPolicy);
                        }
                        String.format("Setup multi dex took %d ms.", new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
                        File mainDexStoreLocation = DexStoreUtils.getMainDexStoreLocation(context2);
                        File file = new File(context2.getApplicationInfo().sourceDir);
                        AnonymousClass076 r4 = r21;
                        ResProvider obtainResProvider = obtainResProvider(r4, context2, z2);
                        if (obtainResProvider == null) {
                            Mlog.safeFmt("Nothing to do in DexLibLoader.loadAll: no resProvider", new Object[0]);
                            return new DexErrorRecoveryInfo();
                        }
                        Mlog.safeFmt("opening dex store %s", mainDexStoreLocation);
                        DexStore open = DexStore.open(mainDexStoreLocation, file, obtainResProvider, arrayList, arrayList2);
                        sMainDexStore = open;
                        if ((i & 2) == 0) {
                            int i4 = 0;
                            if (i3 != 0) {
                                i4 = 1;
                            }
                            if ((i & 8) != 0) {
                                i4 |= 16;
                            }
                            if ((i & 4) != 0) {
                                i4 |= 4;
                            }
                            if (shouldSynchronouslyGenerateOatFiles()) {
                                Mlog.m35w("disabling background optimization", new Object[0]);
                                int i5 = i4 & -5;
                                if (Build.VERSION.SDK_INT < 26 || open.readConfig().enableOatmeal) {
                                    i2 = i5 & -2;
                                } else {
                                    i2 = i5 | 1;
                                }
                                i4 = i2 | 8;
                            }
                            dexErrorRecoveryInfo = open.loadAll(i4, r4, context2);
                            int i6 = dexErrorRecoveryInfo.loadResult;
                            if ((i6 & 8) != 0) {
                                boolean z4 = false;
                                if (AnonymousClass0BV.A01) {
                                    z4 = true;
                                }
                                if (!z4) {
                                    Mlog.safeFmt("running deoptimized code", new Object[0]);
                                    deoptTaint = true;
                                } else {
                                    throw new IllegalStateException(AnonymousClass000.A0E("In ct-scan mode, but not running optimized code. Out of disk space? Bad config? Load result: 0x", Integer.toHexString(i6)));
                                }
                            }
                        } else {
                            Mlog.safeFmt("skipping actual loadAll as requested", new Object[0]);
                            dexErrorRecoveryInfo = null;
                        }
                        obtainResProvider.close();
                        return dexErrorRecoveryInfo;
                    }
                    throw new AnonymousClass0BR("Cannot find a primary dex name");
                } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
                    throw new AnonymousClass0BR(e);
                } catch (Throwable th2) {
                    th = th2;
                    if (vmPolicy != null) {
                        StrictMode.setVmPolicy(vmPolicy);
                    }
                    String.format("Setup multi dex took %d ms.", new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
                }
            } else {
                th = new AnonymousClass0BR("Cannot call needed hidden apis on this platform");
                throw th;
            }
        } catch (AnonymousClass0BR e2) {
            Mlog.m36w(e2, "failure to locate primary/auxiliary dexes: perf loss", new Object[0]);
            arrayList.clear();
            arrayList2.clear();
        }
    }

    public static ResProvider obtainResProviderInternal(Context context, boolean z) {
        ApkResProvider apkResProvider = new ApkResProvider(context);
        try {
            apkResProvider.open(DexStoreUtils.SECONDARY_DEX_MANIFEST).close();
            return apkResProvider;
        } catch (Resources.NotFoundException | FileNotFoundException unused) {
            if (z) {
                ExoPackageResProvider exoPackageResProvider = new ExoPackageResProvider(context);
                try {
                    exoPackageResProvider.open(DexStoreUtils.SECONDARY_DEX_MANIFEST).close();
                    Mlog.safeFmt("using exopackage", new Object[0]);
                    return exoPackageResProvider;
                } catch (FileNotFoundException unused2) {
                    Mlog.safeFmt("using exo res provider failed", new Object[0]);
                    return null;
                }
            }
            return null;
        }
    }

    public static boolean shouldSynchronouslyGenerateOatFiles() {
        boolean z = false;
        if (AnonymousClass0BV.A01) {
            z = true;
        }
        if (z || Build.VERSION.SDK_INT >= 26 || AnonymousClass0BV.A00) {
            return true;
        }
        return false;
    }

    public static void ensureConfig(Context context, DexStore.Config config, boolean z) {
        File mainDexStoreLocation = DexStoreUtils.getMainDexStoreLocation(context);
        C0015Fs.mkdirOrThrow(mainDexStoreLocation);
        if (config != null) {
            File file = new File(mainDexStoreLocation, DexStore.CONFIG_FILENAME);
            if (!file.exists() || z) {
                config.writeAndSync(file);
            }
        }
    }

    public static ResProvider obtainResProvider(AnonymousClass076 r0, Context context, boolean z) {
        try {
            return obtainResProviderInternal(context, z);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void setupMainDexStoreConfigForInstrumentationTests(Context context, DexStore.Config config) {
        File mainDexStoreLocation = DexStoreUtils.getMainDexStoreLocation(context);
        C0015Fs.deleteRecursive(mainDexStoreLocation);
        C0015Fs.mkdirOrThrow(mainDexStoreLocation);
        if (config != null) {
            config.writeAndSync(new File(mainDexStoreLocation, DexStore.CONFIG_FILENAME));
        }
    }

    public static RuntimeException verifyCanaryClasses() {
        try {
            for (DexStore dexStoreListHead = DexStore.dexStoreListHead(); dexStoreListHead != null; dexStoreListHead = dexStoreListHead.next) {
                DexManifest dexManifest = dexStoreListHead.mLoadedManifest;
                if (dexManifest != null) {
                    int i = 0;
                    while (true) {
                        DexManifest.Dex[] dexArr = dexManifest.dexes;
                        if (i >= dexArr.length) {
                            break;
                        }
                        Class.forName(dexArr[i].canaryClass);
                        i++;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            return C0015Fs.runtimeExFrom(th);
        }
    }

    public static boolean wasMainDexStoreRegenerated() {
        DexErrorRecoveryInfo mainDexStoreLoadInformation = getMainDexStoreLoadInformation();
        if (mainDexStoreLoadInformation == null || (mainDexStoreLoadInformation.loadResult & 1) == 0) {
            return false;
        }
        return true;
    }

    public static void loadAll(Context context) {
        loadAll(context, false);
    }

    public static synchronized void loadAll(Context context, int i, AnonymousClass076 r4) {
        synchronized (DexLibLoader.class) {
            loadAll(context, i, r4, (DexStore.Config) null);
        }
    }

    public static synchronized void loadAll(Context context, int i, AnonymousClass076 r5, DexStore.Config config) {
        synchronized (DexLibLoader.class) {
            if (mDeri == null) {
                if (r5 == null) {
                    r5 = C024102g.A00;
                }
                try {
                    mDeri = loadAllImpl(context, i, r5, config);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new AssertionError("loadAll already loaded dex files");
            }
        }
    }

    public static void loadAll(Context context, boolean z) {
        loadAll(context, 1, (AnonymousClass076) null);
    }

    public static void loadAll(Context context, boolean z, AnonymousClass076 r3) {
        loadAll(context, 1, r3);
    }
}
