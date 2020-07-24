package com.facebook.common.dextricks;

import android.os.Build;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.MultiDexClassLoader;
import com.facebook.common.dextricks.OdexScheme;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass000;
import p000X.C03960Bo;

public class OdexSchemeArtTurbo extends OdexScheme {
    public static final String OREO_ODEX_DIR = "oat";
    public static boolean sAttemptedArtHackInstallation;

    public final class TurboArtCompiler extends OdexScheme.Compiler {
        public final DexStore mDexStore;
        public final int mFlags;
        public final DexStore.TmpDir mTmpDir;

        public void close() {
            this.mTmpDir.close();
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:19|20|21|22|23) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            throw r0;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x006a */
        public void compile(InputDex inputDex) {
            InputStream dexContents;
            String makeDexName = inputDex.dex.makeDexName();
            File file = new File(this.mDexStore.root, makeDexName);
            if ((this.mFlags & 1) == 0 || !file.exists()) {
                File file2 = new File(this.mTmpDir.directory, makeDexName);
                dexContents = inputDex.getDexContents();
                Mlog.safeFmt("size hint for %s: %s", inputDex, Integer.valueOf(inputDex.getSizeHint(dexContents)));
                RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                C03960Bo.A04(randomAccessFile, dexContents, new byte[DexStore.LOAD_RESULT_PGO]);
                randomAccessFile.close();
                if (dexContents != null) {
                    dexContents.close();
                }
                C0015Fs.renameOrThrow(file2, new File(this.mDexStore.root, makeDexName));
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

        public TurboArtCompiler(DexStore dexStore, int i) {
            this.mDexStore = dexStore;
            this.mFlags = i;
            this.mTmpDir = dexStore.makeTemporaryDirectory("turbo-art-compiler");
        }
    }

    public static List makeExpectedFileInfoList(DexManifest.Dex[] dexArr, String str) {
        int length = dexArr.length;
        int i = length;
        if (str != null) {
            length++;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new ExpectedFileInfo(dexArr[i2]));
        }
        if (str != null) {
            arrayList.add(new ExpectedFileInfo(str));
        }
        return arrayList;
    }

    public String getSchemeName() {
        return "OdexSchemeArtTurbo";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r4.equals("x86") == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r4.equals("armeabi-v7a") != false) goto L_0x0025;
     */
    public static String getArch() {
        String str;
        char c = 0;
        if (Build.VERSION.SDK_INT >= 21) {
            str = Build.SUPPORTED_32_BIT_ABIS[0];
        } else {
            str = Build.CPU_ABI;
        }
        int hashCode = str.hashCode();
        if (hashCode != 117110) {
            if (hashCode == 145444210) {
            }
            c = 65535;
        } else {
            c = 1;
        }
        if (c == 0) {
            return "arm";
        }
        if (c == 1) {
            return "x86";
        }
        throw new RuntimeException(AnonymousClass000.A0E("Unknown ABI ", str));
    }

    public static String getOreoOdexOutputDirectory(File file, boolean z) {
        File file2 = new File(file, AnonymousClass000.A0E("oat/", getArch()));
        if (z) {
            C0015Fs.mkdirOrThrow(file2);
        }
        return AnonymousClass000.A0E(file2.getPath(), "/");
    }

    public static String[] makeExpectedFileListFrom(List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = ((ExpectedFileInfo) list.get(i)).toExpectedFileString();
        }
        return strArr;
    }

    public final OdexScheme.Compiler makeCompiler(DexStore dexStore, int i) {
        return new TurboArtCompiler(dexStore, i);
    }

    public static String[] makeExpectedFileList(DexManifest.Dex[] dexArr, String str) {
        return makeExpectedFileListFrom(makeExpectedFileInfoList(dexArr, str));
    }

    public void configureClassLoader(File file, MultiDexClassLoader.Configuration configuration) {
        if (!sAttemptedArtHackInstallation) {
            sAttemptedArtHackInstallation = true;
            try {
                DalvikInternals.installArtHacks(6, Build.VERSION.SDK_INT);
            } catch (Exception e) {
                Mlog.m36w(e, "failed to install verifier-disabling ART hacks; continuing slowly", new Object[0]);
            }
        }
        int enabledThreadArtHacks = DalvikInternals.getEnabledThreadArtHacks();
        DalvikInternals.setEnabledThreadArtHacks(enabledThreadArtHacks | 6);
        try {
            Mlog.safeFmt("enabled ART verifier hack (warning-level logs following are expected)", new Object[0]);
            int i = 0;
            while (true) {
                String[] strArr = this.expectedFiles;
                if (i < strArr.length) {
                    String str = strArr[i];
                    if (!str.equals(OREO_ODEX_DIR)) {
                        configuration.addDex(new File(file, str), true);
                    }
                    i++;
                } else {
                    return;
                }
            }
        } finally {
            DalvikInternals.setEnabledThreadArtHacks(enabledThreadArtHacks);
            Mlog.safeFmt("restored old ART hack mask", new Object[0]);
        }
    }

    public OdexSchemeArtTurbo(int i, String[] strArr) {
        super(i, strArr);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public OdexSchemeArtTurbo(DexManifest.Dex[] dexArr) {
        super(8, makeExpectedFileList(dexArr, r0));
        String str;
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || i >= 28) {
            str = null;
        } else {
            str = OREO_ODEX_DIR;
        }
    }
}
