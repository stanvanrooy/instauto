package com.facebook.common.dextricks;

import android.content.Context;
import android.util.Log;
import com.facebook.common.dextricks.MultiDexClassLoader;
import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;
import com.facebook.common.dextricks.coverage.logger.ClassCoverageLogger;
import com.facebook.common.dextricks.stats.ClassLoadingStats;
import com.facebook.profilo.logger.api.ProfiloLogger;
import dalvik.system.DexFile;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0KJ;

public final class MultiDexClassLoaderJava extends MultiDexClassLoader {
    public static final byte API_FALLBACK = 3;
    public static final byte API_NEW_WORKS = 1;
    public static final byte API_OLD_WORKS = 2;
    public static final byte API_UNTESTED = 0;
    public static final int HIGH_WATER_MARK_CLASS_NAME_LEN_RENAME = 6;
    public static byte sApiDetectionState;
    public final DexFile[] mAuxiliaryDexes;
    public final ClassLoadingStats mClassLoadingStats;
    public DexFile[] mDexFiles = new DexFile[0];
    public final String[] mDexLoadFailureHistory = new String[4];
    public int mDexLoadFailurePosition;
    public final AtomicInteger mLastLoadedDexIndex = new AtomicInteger(1);
    public final DexFile[] mPrimaryDexes;

    public static int getDexLength(DexFile[] dexFileArr) {
        return (dexFileArr.length - 1) >> 1;
    }

    public static int getFirstIndexOfFixedDexes(DexFile[] dexFileArr) {
        return (dexFileArr.length + 1) >> 1;
    }

    public static int getFixedDexIndex(int i, int i2) {
        return i2 + i + 1;
    }

    private Class loadInnerFallbackApiClass(String str, DexFile[] dexFileArr, int i) {
        Class cls = null;
        int i2 = 1;
        try {
            ClassLoader classLoader = this.mPutativeLoader;
            DexFile dexFile = dexFileArr[0];
            if (dexFile != null) {
                cls = dexFile.loadClass(str, classLoader);
            } else {
                onNoDexInThePromotedFrontDexSpot();
            }
            int i3 = 1;
            while (cls == null && i3 < i) {
                try {
                    DexFile dexFile2 = dexFileArr[i3];
                    cls = dexFile2.loadClass(str, classLoader);
                    if (cls != null && i3 > 1) {
                        promoteDexFile(dexFile2, i3);
                    }
                    i3++;
                } catch (Throwable th) {
                    th = th;
                    i2 = i3;
                    this.mClassLoadingStats.incrementDexFileQueries(i2);
                    throw th;
                }
            }
            this.mClassLoadingStats.incrementDexFileQueries(i3);
            return cls;
        } catch (Throwable th2) {
            th = th2;
            this.mClassLoadingStats.incrementDexFileQueries(i2);
            throw th;
        }
    }

    private Class loadInnerNewApiClass(String str, DexFile[] dexFileArr, int i) {
        Class cls = null;
        int i2 = 1;
        try {
            ClassLoader classLoader = this.mPutativeLoader;
            DexFile dexFile = dexFileArr[0];
            if (dexFile != null) {
                cls = DexFileLoadNew.loadClassBinaryName(dexFile, str, classLoader);
            } else {
                onNoDexInThePromotedFrontDexSpot();
            }
            int i3 = 1;
            while (cls == null && i3 < i) {
                try {
                    DexFile dexFile2 = dexFileArr[i3];
                    cls = DexFileLoadNew.loadClassBinaryName(dexFile2, str, classLoader);
                    if (cls != null && i3 > 1) {
                        promoteDexFile(dexFile2, i3);
                    }
                    i3++;
                } catch (Throwable th) {
                    th = th;
                    i2 = i3;
                    this.mClassLoadingStats.incrementDexFileQueries(i2);
                    throw th;
                }
            }
            this.mClassLoadingStats.incrementDexFileQueries(i3);
            return cls;
        } catch (Throwable th2) {
            th = th2;
            this.mClassLoadingStats.incrementDexFileQueries(i2);
            throw th;
        }
    }

    private Class loadInnerOldApiClass(String str, DexFile[] dexFileArr, int i) {
        Class cls = null;
        int i2 = 1;
        try {
            ClassLoader classLoader = this.mPutativeLoader;
            DexFile dexFile = dexFileArr[0];
            if (dexFile != null) {
                cls = DexFileLoadOld.loadClassBinaryName(dexFile, str, classLoader);
            } else {
                onNoDexInThePromotedFrontDexSpot();
            }
            int i3 = 1;
            while (cls == null && i3 < i) {
                try {
                    DexFile dexFile2 = dexFileArr[i3];
                    cls = DexFileLoadOld.loadClassBinaryName(dexFile2, str, classLoader);
                    if (cls != null && i3 > 1) {
                        promoteDexFile(dexFile2, i3);
                    }
                    i3++;
                } catch (Throwable th) {
                    th = th;
                    i2 = i3;
                    this.mClassLoadingStats.incrementDexFileQueries(i2);
                    throw th;
                }
            }
            this.mClassLoadingStats.incrementDexFileQueries(i3);
            return cls;
        } catch (Throwable th2) {
            th = th2;
            this.mClassLoadingStats.incrementDexFileQueries(i2);
            throw th;
        }
    }

    public static boolean shouldAskParent(String str) {
        try {
            int length = str.length();
            if (length <= 6) {
                return false;
            }
            char charAt = str.charAt(0);
            if (charAt != 'a') {
                if (charAt == 'j') {
                    char charAt2 = str.charAt(1);
                    return charAt2 == 'a' || charAt2 == 'u';
                } else if (charAt != 'l') {
                    if (charAt != 'o') {
                        if (charAt != 's') {
                            if (charAt != 'c') {
                                if (charAt != 'd' || length < 8) {
                                    return false;
                                }
                            } else if (length >= 29 && str.charAt(4) == 'a' && str.charAt(5) == 'n' && str.charAt(12) == 'i' && str.charAt(27) == '.') {
                                return !str.startsWith("om.android.installreferrer.", 1);
                            } else {
                                return length >= 6 && str.charAt(4) == 'a' && str.charAt(5) == 'n';
                            }
                        } else if (length < 5 || str.charAt(3) != '.') {
                            return false;
                        }
                    } else if (length < 6) {
                        return false;
                    } else {
                        char charAt3 = str.charAt(4);
                        if (charAt3 != 'a') {
                            if (charAt3 != 'j') {
                                if (charAt3 != 'w') {
                                    if (charAt3 != 'x') {
                                        return false;
                                    }
                                } else if (str.charAt(5) != '3') {
                                    return false;
                                }
                            }
                        } else if (length < 12 || str.charAt(5) != 'p' || str.charAt(6) != 'a' || str.charAt(10) != '.') {
                            return false;
                        }
                    }
                }
            } else if (length >= 10 && str.charAt(7) == 'x' && str.charAt(8) == '.') {
                if (str.startsWith("ndroidx.", 1)) {
                    if (!str.startsWith("test.", 9)) {
                        return false;
                    }
                }
            } else if (length < 16 || str.charAt(8) != 's' || str.charAt(9) != 'u' || str.charAt(15) != '.' || str.charAt(7) != '.') {
                if (length >= 13 && str.charAt(8) == 'a' && str.charAt(12) == '.') {
                    return !str.startsWith("ndroid.arch.", 1);
                }
            } else if (str.startsWith("ndroid.support", 1)) {
                if (!str.startsWith("test.", 16)) {
                    return false;
                }
            }
            return true;
        } catch (IndexOutOfBoundsException e) {
            Log.e(MultiDexClassLoader.TAG, AnonymousClass000.A0E("Class out of bounds: ", str), e);
            return false;
        }
    }

    public void onColdstartDone() {
    }

    public String toString() {
        return "MultiDexClassLoaderJava";
    }

    private boolean canPromoteDexesAndUpdateState(int i, int i2) {
        int i3;
        if (i2 <= i) {
            return false;
        }
        do {
            i3 = this.mLastLoadedDexIndex.get();
            if (i3 >= i || this.mLastLoadedDexIndex.compareAndSet(i3, i)) {
                return true;
            }
            i3 = this.mLastLoadedDexIndex.get();
            return true;
        } while (this.mLastLoadedDexIndex.compareAndSet(i3, i));
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0 = r5[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        if (r0 != null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        r7 = com.facebook.common.dextricks.DexFileLoadOld.loadClassBinaryName(r0, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        onNoDexInThePromotedFrontDexSpot();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        if (r7 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        r7 = com.facebook.common.dextricks.DexFileLoadOld.loadClassBinaryName(r5[r1], r9, r3);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        sApiDetectionState = 2;
        r8.mClassLoadingStats.incrementDexFileQueries(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
        sApiDetectionState = 3;
        r0 = r5[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0056, code lost:
        if (r0 != null) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0058, code lost:
        r7 = r0.loadClass(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005c, code lost:
        if (r7 == null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0060, code lost:
        r7 = r5[r2].loadClass(r9, r3);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0069, code lost:
        onNoDexInThePromotedFrontDexSpot();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006d, code lost:
        r8.mClassLoadingStats.incrementDexFileQueries(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0072, code lost:
        return r7;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002e */
    private Class findClassSlowPath(String str) {
        DexFile[] dexFileArr = this.mDexFiles;
        int length = dexFileArr.length;
        Class cls = null;
        if (length == 0) {
            return null;
        }
        ClassLoader classLoader = this.mPutativeLoader;
        int i = 1;
        DexFile dexFile = dexFileArr[0];
        if (dexFile != null) {
            cls = DexFileLoadNew.loadClassBinaryName(dexFile, str, classLoader);
        } else {
            onNoDexInThePromotedFrontDexSpot();
        }
        int i2 = 1;
        while (cls == null && i2 < length) {
            cls = DexFileLoadNew.loadClassBinaryName(dexFileArr[i2], str, classLoader);
            i2++;
        }
        if (length > 1) {
            sApiDetectionState = 1;
        }
        this.mClassLoadingStats.incrementDexFileQueries(i2);
        return cls;
    }

    private void noteClassLoadFailure(String str) {
        String[] strArr = this.mDexLoadFailureHistory;
        synchronized (strArr) {
            int i = this.mDexLoadFailurePosition;
            this.mDexLoadFailurePosition = i + 1;
            strArr[i % strArr.length] = str;
        }
    }

    private boolean oldShouldAskBootClassLoader(String str) {
        return !str.startsWith("com.facebook.");
    }

    private void onNoDexInThePromotedFrontDexSpot() {
        this.mClassLoadingStats.decrementDexFileQueries();
    }

    private void promoteDexFile(DexFile dexFile, int i) {
        DexFile[] dexFileArr = this.mDexFiles;
        if (canPromoteDexesAndUpdateState(i, (dexFileArr.length + 1) >> 1)) {
            synchronized (dexFileArr) {
                if (dexFileArr[1] != dexFile && dexFileArr[i] == dexFile) {
                    dexFileArr[0] = dexFile;
                    while (i >= 1) {
                        int i2 = i - 1;
                        dexFileArr[i] = dexFileArr[i2];
                        i = i2;
                    }
                    dexFileArr[0] = null;
                }
            }
        }
    }

    public DexFile[] doGetConfiguredDexFiles() {
        DexFile[] dexFileArr = this.mDexFiles;
        int length = (dexFileArr.length - 1) >> 1;
        DexFile[] dexFileArr2 = new DexFile[length];
        for (int i = 0; i < length; i++) {
            dexFileArr2[i] = dexFileArr[length + i + 1];
        }
        return dexFileArr2;
    }

    public Class findClass(String str) {
        DexFile[] dexFileArr = this.mDexFiles;
        int length = dexFileArr.length;
        if (length != 0) {
            ProfiloLogger.classLoadStart();
            ClassTracingLogger.beginClassLoad(str);
            this.mClassLoadingStats.incrementClassLoadsAttempted();
            Class cls = null;
            try {
                byte b = sApiDetectionState;
                if (b == 0) {
                    cls = findClassSlowPath(str);
                } else if (b == 1) {
                    cls = loadInnerNewApiClass(str, dexFileArr, this.mLastLoadedDexIndex.get());
                    if (cls == null) {
                        cls = loadInnerNewApiClass(str, dexFileArr, length);
                    }
                } else if (b == 2) {
                    cls = loadInnerOldApiClass(str, dexFileArr, this.mLastLoadedDexIndex.get());
                    if (cls == null) {
                        cls = loadInnerOldApiClass(str, dexFileArr, length);
                    }
                } else if (b == 3 && (cls = loadInnerFallbackApiClass(str, dexFileArr, this.mLastLoadedDexIndex.get())) == null) {
                    cls = loadInnerFallbackApiClass(str, dexFileArr, length);
                }
                if (cls != null) {
                    ClassTracingLogger.classLoaded(cls);
                    if (ClassCoverageLogger.A01 != null && !ClassCoverageLogger.A01.isEmpty()) {
                        String name = cls.getName();
                        if (name.startsWith(ClassCoverageLogger.A01)) {
                            throw new UnsupportedOperationException(AnonymousClass000.A0E("Class load disallowed: ", name));
                        }
                    }
                    if (ClassCoverageLogger.A02) {
                        ClassCoverageLogger.A00.add(cls);
                    }
                    ProfiloLogger.classLoadEnd(cls);
                }
                if (cls != null) {
                    return cls;
                }
            } finally {
                ClassTracingLogger.classNotFound();
                ProfiloLogger.classLoadFailed();
                this.mClassLoadingStats.incrementClassLoadsFailed();
            }
        }
        throw new ClassNotFoundException(str);
    }

    public String[] getRecentFailedClasses() {
        String[] strArr = this.mDexLoadFailureHistory;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        synchronized (strArr) {
            int i = this.mDexLoadFailurePosition;
            if (i < length) {
                i += length;
            }
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2 + 1;
                strArr2[i2] = strArr[(i - i3) % length];
                i2 = i3;
            }
        }
        return strArr2;
    }

    public MultiDexClassLoaderJava(Context context, ArrayList arrayList, ArrayList arrayList2) {
        this.mPrimaryDexes = (DexFile[]) arrayList.toArray(new DexFile[arrayList.size()]);
        this.mAuxiliaryDexes = (DexFile[]) arrayList2.toArray(new DexFile[arrayList2.size()]);
        AnonymousClass0KJ r1 = new AnonymousClass0KJ();
        ClassLoadingStats.A00.getAndSet(r1);
        this.mClassLoadingStats = r1;
    }

    private Class loadParentBootLoaderClass(String str) {
        if (getParent() == null) {
            return null;
        }
        try {
            return getParent().loadClass(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public void configure(MultiDexClassLoader.Configuration configuration) {
        super.configure(configuration);
        int length = this.mPrimaryDexes.length;
        int size = configuration.mDexFiles.size();
        int length2 = this.mAuxiliaryDexes.length;
        int i = length + size + length2;
        DexFile[] dexFileArr = new DexFile[((i << 1) + 1)];
        int i2 = 0;
        dexFileArr[0] = null;
        int i3 = 0;
        int i4 = 1;
        while (i3 < length) {
            DexFile dexFile = this.mPrimaryDexes[i3];
            dexFileArr[i4] = dexFile;
            dexFileArr[i4 + i] = dexFile;
            i3++;
            i4++;
        }
        int i5 = 0;
        while (i5 < size) {
            DexFile dexFile2 = (DexFile) configuration.mDexFiles.get(i5);
            dexFileArr[i4] = dexFile2;
            dexFileArr[i4 + i] = dexFile2;
            i5++;
            i4++;
        }
        while (i2 < length2) {
            DexFile dexFile3 = this.mAuxiliaryDexes[i2];
            dexFileArr[i4] = dexFile3;
            dexFileArr[i4 + i] = dexFile3;
            i2++;
            i4++;
        }
        this.mDexFiles = dexFileArr;
        configureArtHacks(configuration);
    }

    public Class loadClass(String str, boolean z) {
        Class loadParentBootLoaderClass;
        boolean z2 = false;
        if (shouldAskParent(str)) {
            z2 = true;
            Class loadParentBootLoaderClass2 = loadParentBootLoaderClass(str);
            if (loadParentBootLoaderClass2 != null) {
                return loadParentBootLoaderClass2;
            }
        }
        try {
            return findClass(str);
        } catch (ClassNotFoundException e) {
            e = e;
            if (z2 || !oldShouldAskBootClassLoader(str) || (loadParentBootLoaderClass = loadParentBootLoaderClass(str)) == null) {
                try {
                    if (MultiDexClassLoader.maybeFallbackLoadDexes(str, e)) {
                        try {
                            return findClass(str);
                        } catch (ClassNotFoundException e2) {
                            e = e2;
                            noteClassLoadFailure(str);
                            throw e;
                        }
                    }
                } catch (RuntimeException e3) {
                    e = new ClassNotFoundException(AnonymousClass000.A0E("Fallback dex load failed for ", str), e3);
                }
                noteClassLoadFailure(str);
                throw e;
            }
            this.mClassLoadingStats.incrementIncorrectDfaGuesses();
            Log.w(MultiDexClassLoader.TAG, AnonymousClass000.A0N("Class ", str, " was loaded on fallback. ", "This should be fixed and added to the shouldAskParent method."));
            return loadParentBootLoaderClass;
        }
    }
}
