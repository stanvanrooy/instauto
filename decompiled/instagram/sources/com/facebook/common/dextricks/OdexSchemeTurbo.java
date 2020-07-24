package com.facebook.common.dextricks;

import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.MultiDexClassLoader;
import com.facebook.common.dextricks.OdexScheme;
import com.facebook.forker.ProcessBuilder;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import p000X.AnonymousClass000;
import p000X.C03960Bo;

public class OdexSchemeTurbo extends OdexScheme {

    public final class TurboCompiler extends OdexScheme.Compiler {
        public final TurboDexOptRunner mDexOptRunner;
        public final DexStore mDexStore;
        public final File mDummyZip;
        public final int mFlags;
        public final DexStore.TmpDir mTmpDir;

        public void close() {
            this.mDexOptRunner.cleanup();
            this.mTmpDir.close();
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:24|25|26|27|28) */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x008b, code lost:
            throw new java.lang.AssertionError();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x008e, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
            r9.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            throw r0;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0086 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0092 */
        public void compile(InputDex inputDex) {
            InputStream dexContents;
            String makeDexName = OdexSchemeTurbo.makeDexName(inputDex.dex);
            String makeOdexName = OdexSchemeTurbo.makeOdexName(makeDexName);
            File file = new File(this.mDexStore.root, makeDexName);
            File file2 = new File(this.mDexStore.root, makeOdexName);
            if ((this.mFlags & 1) == 0 || !file.exists() || !file2.exists()) {
                File file3 = new File(this.mTmpDir.directory, makeOdexName);
                dexContents = inputDex.getDexContents();
                int sizeHint = inputDex.getSizeHint(dexContents);
                Mlog.safeFmt("size hint for %s: %s", inputDex, Integer.valueOf(sizeHint));
                RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
                this.mDexOptRunner.run(dexContents, sizeHint, makeDexName, randomAccessFile, "quick", (String[]) null);
                randomAccessFile.close();
                if (dexContents != null) {
                    dexContents.close();
                }
                C0015Fs.linkAtomic(this.mDummyZip, new File(this.mDexStore.root, makeDexName));
                C0015Fs.renameOrThrow(file3, new File(this.mDexStore.root, makeOdexName));
                return;
            }
            return;
            try {
            } catch (Throwable th) {
                if (dexContents != null) {
                    try {
                        dexContents.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        }

        public TurboCompiler(DexStore dexStore, int i) {
            this.mDexOptRunner = new TurboDexOptRunner(dexStore.root);
            this.mDexStore = dexStore;
            this.mFlags = i;
            DexStore.TmpDir makeTemporaryDirectory = dexStore.makeTemporaryDirectory("turbo-compiler");
            this.mTmpDir = makeTemporaryDirectory;
            try {
                File file = new File(makeTemporaryDirectory.directory, "dummy.zip");
                this.mDummyZip = file;
                OdexSchemeTurbo.makeDummyZip(file);
            } catch (Throwable th) {
                C0015Fs.safeClose((Closeable) this.mTmpDir);
                throw th;
            }
        }
    }

    public final class TurboDexOptRunner extends DexOptRunner {
        public final byte[] mBuffer;
        public final DexStore.Config mDsConfig;

        public void addDexOptOptions(ProcessBuilder processBuilder) {
            DexStore.Config config = this.mDsConfig;
            if (config != null) {
                OdexSchemeTurbo.addConfiguredDexOptOptions(config, processBuilder);
            }
        }

        public int copyDexToOdex(InputStream inputStream, int i, RandomAccessFile randomAccessFile) {
            return C03960Bo.A04(randomAccessFile, inputStream, this.mBuffer);
        }

        public TurboDexOptRunner(DexStore.Config config, File file) {
            super(file);
            this.mBuffer = new byte[DexStore.LOAD_RESULT_PGO_ATTEMPTED];
            this.mDsConfig = config;
        }

        public TurboDexOptRunner(File file) {
            super(file);
            this.mBuffer = new byte[DexStore.LOAD_RESULT_PGO_ATTEMPTED];
            this.mDsConfig = null;
        }
    }

    public static String[] makeExpectedFileList(DexManifest.Dex[] dexArr) {
        int length = dexArr.length;
        String[] strArr = new String[(length << 1)];
        for (int i = 0; i < length; i++) {
            String makeDexName = makeDexName(dexArr[i]);
            int i2 = i << 1;
            strArr[i2] = makeDexName;
            strArr[i2 + 1] = makeOdexName(makeDexName);
        }
        return strArr;
    }

    public final void configureClassLoader(File file, MultiDexClassLoader.Configuration configuration) {
        int i = 0;
        while (true) {
            String[] strArr = this.expectedFiles;
            if (i < strArr.length) {
                configuration.addDex(new File(file, strArr[i]), new File(file, this.expectedFiles[i + 1]));
                i += 2;
            } else {
                return;
            }
        }
    }

    public String getSchemeName() {
        return "OdexSchemeTurbo";
    }

    public static void addConfiguredDexOptOptions(DexStore.Config config, ProcessBuilder processBuilder) {
        String str;
        String str2;
        String str3;
        byte b = config.dalvikVerify;
        if (b != 0) {
            if (b == 1) {
                Mlog.safeFmt("using DALVIK_VERIFY_NONE as requested in config file", new Object[0]);
                str3 = "-Vn";
            } else if (b == 2) {
                Mlog.safeFmt("using DALVIK_VERIFY_REMOTE as requested in config file", new Object[0]);
                str3 = "-Vr";
            } else if (b != 3) {
                Mlog.m35w("ignoring unknown Dalvik verify value %s in config file", Byte.valueOf(b));
            } else {
                Mlog.safeFmt("using DALVIK_VERIFY_ALL as requested in config file", new Object[0]);
                str3 = "-Va";
            }
            processBuilder.mArgv.add(str3);
        }
        byte b2 = config.dalvikOptimize;
        if (b2 != 0) {
            if (b2 == 1) {
                Mlog.safeFmt("using DALVIK_OPT_NONE as requested in config file", new Object[0]);
                str2 = "-On";
            } else if (b2 == 2) {
                Mlog.safeFmt("using DALVIK_OPT_VERIFIED as requested in config file", new Object[0]);
                str2 = "-Ov";
            } else if (b2 == 3) {
                Mlog.safeFmt("using DALVIK_OPT_ALL as requested in config file", new Object[0]);
                str2 = "-Oa";
            } else if (b2 != 4) {
                Mlog.m35w("ignoring unknown Dalvik optimize value %s in config file", Byte.valueOf(b2));
            } else {
                Mlog.safeFmt("using DALVIK_OPT_FULL as requested in config file", new Object[0]);
                str2 = "-Of";
            }
            processBuilder.mArgv.add(str2);
        }
        byte b3 = config.dalvikRegisterMaps;
        if (b3 != 0) {
            if (b3 == 1) {
                str = "-Rn";
            } else if (b3 != 2) {
                Mlog.m35w("ignoring unknown Dalvik register map value %s in config file", Byte.valueOf(b3));
                return;
            } else {
                str = "-Ry";
            }
            processBuilder.mArgv.add(str);
        }
    }

    public static String makeDexName(DexManifest.Dex dex) {
        return AnonymousClass000.A0J("prog-", dex.hash, ".dex.jar");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:17|18|19|20|21) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:25|26|27|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0039 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0040 */
    public static void makeDummyZip(File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
        zipOutputStream.putNextEntry(new ZipEntry("META-INF/MANIFEST.MF"));
        PrintStream printStream = new PrintStream(zipOutputStream);
        printStream.println("Manifest-Version: 1.0");
        printStream.println("Created-By: OdexSchemeTurbo");
        printStream.flush();
        printStream.close();
        printStream.close();
        zipOutputStream.close();
        fileOutputStream.close();
        return;
        try {
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
        try {
        } catch (Throwable th2) {
            zipOutputStream.close();
            throw th2;
        }
    }

    public final OdexScheme.Compiler makeCompiler(DexStore dexStore, int i) {
        return new TurboCompiler(dexStore, i);
    }

    public static String makeOdexName(String str) {
        return AnonymousClass000.A0E(C0015Fs.stripLastExtension(str), DexManifest.ODEX_EXT);
    }

    public OdexSchemeTurbo(int i, DexManifest.Dex[] dexArr) {
        super(i, makeExpectedFileList(dexArr));
    }

    public OdexSchemeTurbo(DexManifest.Dex[] dexArr) {
        this(8, dexArr);
    }
}
