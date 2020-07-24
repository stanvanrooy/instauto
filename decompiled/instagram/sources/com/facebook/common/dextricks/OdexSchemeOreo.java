package com.facebook.common.dextricks;

import android.content.Context;
import android.os.Build;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.MultiDexClassLoader;
import com.facebook.common.dextricks.OdexScheme;
import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;
import com.facebook.common.dextricks.storer.Storer;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.VMRuntime;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p000X.AnonymousClass000;
import p000X.AnonymousClass01A;
import p000X.AnonymousClass01Q;
import p000X.AnonymousClass0ZJ;
import p000X.C04200Cy;
import p000X.C04410Dw;
import p000X.C05390Kg;

public final class OdexSchemeOreo extends OdexScheme {
    public static boolean sForceUnpack;
    public Context mContext;
    public HashMap mDexNameMap;
    public long mStorer;
    public IOException[] mSuppressedExceptions;
    public File mZipFile;

    public final class OreoCompiler extends OdexScheme.Compiler {
        public HashMap mDexNameMap;
        public long mStorer;

        public void compile(InputDex inputDex) {
            AnonymousClass0ZJ.A01(32, "OdexSchemeOreo.compile", 180903662);
            try {
                String str = (String) this.mDexNameMap.get(inputDex.dex.hash);
                if (str != null) {
                    Storer.start(this.mStorer, str, 4);
                    InputStream dexContents = inputDex.getDexContents();
                    byte[] bArr = new byte[DexStore.LOAD_RESULT_PGO];
                    while (true) {
                        int read = dexContents.read(bArr);
                        if (read >= 0) {
                            Storer.write(this.mStorer, bArr, read);
                        } else {
                            Storer.finish(this.mStorer);
                            return;
                        }
                    }
                } else {
                    throw new RuntimeException("Unexpected input dex!");
                }
            } finally {
                AnonymousClass0ZJ.A00(32, -2078960940);
            }
        }

        public OreoCompiler(long j, HashMap hashMap) {
            this.mStorer = j;
            this.mDexNameMap = hashMap;
        }
    }

    public OdexSchemeOreo(DexManifest.Dex[] dexArr, File file, Context context) {
        super(1, new String[]{file.getName()});
        this.mContext = context;
        this.mZipFile = file;
        this.mDexNameMap = makeNameMap(dexArr);
    }

    public void configureClassLoader(File file, MultiDexClassLoader.Configuration configuration) {
    }

    public String getSchemeName() {
        return "OdexSchemeOreo";
    }

    public static HashMap makeNameMap(DexManifest.Dex[] dexArr) {
        int length = dexArr.length;
        HashMap hashMap = new HashMap(length);
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                hashMap.put(dexArr[i].hash, AnonymousClass000.A06("classes", i + 1, DexManifest.DEX_EXT));
            } else {
                hashMap.put(dexArr[i].hash, "classes.dex");
            }
        }
        return hashMap;
    }

    private void registerCodeAndProfileBgDexopt() {
        if (Build.VERSION.SDK_INT == 29) {
            registerCodeAndProfileBgDexoptWithPrimary();
            return;
        }
        BaseDexClassLoader baseDexClassLoader = (BaseDexClassLoader) OdexSchemeOreo.class.getClassLoader();
        try {
            Method declaredMethod = BaseDexClassLoader.class.getDeclaredMethod("reportClassLoaderChain", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(baseDexClassLoader, new Object[0]);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            Achilles.attack(new Arrow(baseDexClassLoader), Achilles.ferp());
        }
    }

    private void registerCodeAndProfileBgDexoptWithPrimary() {
        BaseDexClassLoader baseDexClassLoader = (BaseDexClassLoader) OdexSchemeOreo.class.getClassLoader();
        String str = this.mContext.getApplicationInfo().publicSourceDir;
        File file = new File(this.mZipFile.getParentFile(), "decoy.dex");
        String str2 = File.pathSeparator;
        String A0O = AnonymousClass000.A0O(str, str2, file.getAbsolutePath(), str2, this.mZipFile.getAbsolutePath());
        ArrayList arrayList = new ArrayList();
        arrayList.add(baseDexClassLoader);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(A0O);
        Achilles.attack(new Arrow(new String[]{this.mZipFile.getAbsolutePath()}, baseDexClassLoader, arrayList, arrayList2), Achilles.srclc());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r2.A04 == false) goto L_0x001b;
     */
    public static void setupErrorReportingFields() {
        AnonymousClass01Q.A00.A0S("multiDexClassLoader", new AnonymousClass01A() {
            /* JADX WARNING: Code restructure failed: missing block: B:10:0x000d, code lost:
                if (r2.A04 == false) goto L_0x000f;
             */
            public String getCustomData(Throwable th) {
                C04200Cy r2 = C04200Cy.A07;
                if (r2 != null) {
                    synchronized (r2) {
                    }
                }
                Object obj = OdexSchemeOreo.class.getClassLoader();
                return obj.toString();
            }
        });
        C04200Cy r2 = C04200Cy.A07;
        if (r2 != null) {
            synchronized (r2) {
            }
        }
        Object obj = OdexSchemeOreo.class.getClassLoader();
        C04410Dw.A0G("oreoClassLoader", obj.toString());
    }

    public static IOException[] threadSafeAddDexPath(BaseDexClassLoader baseDexClassLoader, List list) {
        int length;
        int length2;
        Object[] objArr;
        int length3;
        Class<?> cls = Class.forName("dalvik.system.DexPathList");
        Class<?> cls2 = Class.forName("dalvik.system.DexPathList$Element");
        Class<List> cls3 = List.class;
        Method declaredMethod = cls.getDeclaredMethod("makeDexElements", new Class[]{cls3, File.class, cls3, ClassLoader.class});
        declaredMethod.setAccessible(true);
        ArrayList arrayList = new ArrayList();
        Object[] objArr2 = (Object[]) declaredMethod.invoke((Object) null, new Object[]{list, null, arrayList, baseDexClassLoader});
        Field declaredField = BaseDexClassLoader.class.getDeclaredField("pathList");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(baseDexClassLoader);
        if (objArr2 != null && (length2 = objArr2.length) > 0) {
            Field declaredField2 = cls.getDeclaredField("dexElements");
            declaredField2.setAccessible(true);
            Object[] objArr3 = (Object[]) declaredField2.get(obj);
            if (objArr3 == null || (length3 = objArr3.length) <= 0) {
                objArr = objArr2;
            } else {
                objArr = (Object[]) Array.newInstance(cls2, length2 + length3);
                System.arraycopy(objArr3, 0, objArr, 0, length3);
                System.arraycopy(objArr2, 0, objArr, length3, length2);
            }
            declaredField2.set(obj, objArr);
        }
        Field declaredField3 = cls.getDeclaredField("dexElementsSuppressedExceptions");
        declaredField3.setAccessible(true);
        int size = arrayList.size();
        if (size <= 0) {
            return (IOException[]) declaredField3.get(obj);
        }
        IOException[] iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[size]);
        IOException[] iOExceptionArr2 = (IOException[]) declaredField3.get(obj);
        if (iOExceptionArr2 != null && (length = iOExceptionArr2.length) > 0) {
            IOException[] iOExceptionArr3 = new IOException[(length + size)];
            System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, 0, length);
            System.arraycopy(iOExceptionArr, 0, iOExceptionArr3, length, size);
            iOExceptionArr = iOExceptionArr3;
        }
        declaredField3.set(obj, iOExceptionArr);
        return iOExceptionArr;
    }

    public void finalizeZip() {
        Storer.cleanup(this.mStorer);
        this.mStorer = 0;
    }

    public IOException[] getSuppressedExceptions() {
        return this.mSuppressedExceptions;
    }

    public void initializeClassLoader() {
        Throwable e;
        ClassLoader classLoader = OdexSchemeOreo.class.getClassLoader();
        if (classLoader instanceof BaseDexClassLoader) {
            if (!DalvikInternals.toggleBlockDex2Oat(true)) {
                DexTricksErrorReporter.reportSampledSoftError("FBDex101", "Failed to block dex2oat", (Throwable) null);
            }
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.mZipFile);
                this.mSuppressedExceptions = threadSafeAddDexPath((BaseDexClassLoader) classLoader, arrayList);
                if (!DalvikInternals.toggleBlockDex2Oat(false)) {
                    DexTricksErrorReporter.reportSampledSoftError("FBDex101", "Failed to unblock dex2oat", (Throwable) null);
                }
                e = null;
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e2) {
                e = e2;
                DexTricksErrorReporter.reportSampledSoftError("FBDex101", "Failed to merge dex elements", e);
                if (!DalvikInternals.toggleBlockDex2Oat(false)) {
                    DexTricksErrorReporter.reportSampledSoftError("FBDex101", "Failed to unblock dex2oat", (Throwable) null);
                }
            } catch (Throwable th) {
                if (!DalvikInternals.toggleBlockDex2Oat(false)) {
                    DexTricksErrorReporter.reportSampledSoftError("FBDex101", "Failed to unblock dex2oat", (Throwable) null);
                }
                throw th;
            }
        } else {
            String A0E = AnonymousClass000.A0E("Unknown Application ClassLoader: ", classLoader.toString());
            DexTricksErrorReporter.reportSampledSoftError("FBDex101", A0E, (Throwable) null);
            e = new RuntimeException(A0E);
        }
        if (e == null) {
            enableTracingIfNeeded();
            setupErrorReportingFields();
            return;
        }
        throw new RuntimeException("[FBDex101] Unknown Application ClassLoader or failed to merge dex, app bound to crash with NoClassDef", e);
    }

    public OdexScheme.Compiler makeCompiler(DexStore dexStore, int i) {
        long open = Storer.open(this.mZipFile.getPath(), 420);
        this.mStorer = open;
        return new OreoCompiler(open, this.mDexNameMap);
    }

    public boolean needsUnpack() {
        if (sForceUnpack || !this.mZipFile.exists()) {
            return true;
        }
        if (!OreoFileUtils.isTruncated(this.mZipFile)) {
            return false;
        }
        return !OreoFileUtils.hasVdexOdex(this.mZipFile);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    public void registerCodeAndProfile(boolean z) {
        File file;
        if (z) {
            registerCodeAndProfileBgDexopt();
            return;
        }
        File parentFile = this.mZipFile.getParentFile();
        if (Build.VERSION.SDK_INT < 27) {
            file = new File(parentFile, AnonymousClass000.A0E(this.mZipFile.getName(), ".prof"));
        } else {
            File file2 = new File(parentFile, OdexSchemeArtTurbo.OREO_ODEX_DIR);
            file = new File(file2, AnonymousClass000.A0E(this.mZipFile.getName(), ".cur.prof"));
            if (!file2.exists() && !file2.mkdir()) {
                DexTricksErrorReporter.reportSampledSoftError("RegisterProf", "Failed to mkdir for prof dir: " + file, (Throwable) null);
                return;
            }
        }
        try {
            if (file.createNewFile()) {
                Mlog.m35w("Created new profile file: %s", file);
            }
            String path = file.getPath();
            String[] strArr = {this.mZipFile.getPath()};
            try {
                Method declaredMethod = VMRuntime.class.getDeclaredMethod("registerAppInfo", new Class[]{String.class, String[].class});
                declaredMethod.setAccessible(true);
                declaredMethod.invoke((Object) null, new Object[]{path, strArr});
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
                Achilles.attack(new Arrow(path, strArr), Achilles.derp());
            }
        } catch (IOException e) {
            DexTricksErrorReporter.reportSampledSoftError("RegisterProf", "Failed to touch new profile file", e);
        }
    }

    public static void enableTracingIfNeeded() {
        C04200Cy A00;
        if (ClassTracingLogger.isEnabled() && (A00 = C04200Cy.A00()) != null) {
            A00.A01(new C05390Kg());
        }
    }

    public class Arrow {
        public final List chain;

        /* renamed from: cl */
        public final BaseDexClassLoader f147cl;
        public final List classPaths;
        public final String[] codePaths;
        public final String profileFile;

        public Arrow(BaseDexClassLoader baseDexClassLoader) {
            this.f147cl = baseDexClassLoader;
            this.profileFile = null;
            this.codePaths = null;
            this.chain = null;
            this.classPaths = null;
        }

        public Arrow(String str, String[] strArr) {
            this.profileFile = str;
            this.codePaths = strArr;
            this.f147cl = null;
            this.chain = null;
            this.classPaths = null;
        }

        public Arrow(String[] strArr, BaseDexClassLoader baseDexClassLoader, List list, List list2) {
            this.codePaths = strArr;
            this.f147cl = baseDexClassLoader;
            this.chain = list;
            this.classPaths = list2;
            this.profileFile = null;
        }
    }
}
