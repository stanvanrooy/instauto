package com.facebook.common.dextricks;

import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.MultiDexClassLoader;
import com.facebook.common.dextricks.OdexScheme;
import dalvik.system.DexFile;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import p000X.AnonymousClass000;

public final class OdexSchemeBoring extends OdexScheme {

    public final class BoringCompiler extends OdexScheme.Compiler {
        public final DexStore mDexStore;
        public final int mFlags;
        public boolean mLowDiskSpace;
        public final Map mRenameTempToFinalOdexMap = new HashMap();
        public final DexStore.TmpDir mTmpDir;

        private void onLowDiskSpaceLikelyDetected() {
            this.mLowDiskSpace = true;
            for (File file : this.mRenameTempToFinalOdexMap.keySet()) {
                Mlog.safeFmt("Deleting odex file [success: %s]: %s", Boolean.valueOf(file.delete()), file.getAbsolutePath());
            }
            this.mRenameTempToFinalOdexMap.clear();
        }

        public void close() {
            this.mTmpDir.close();
        }

        public void compile(InputDex inputDex) {
            File file;
            String makeDexName = OdexSchemeBoring.makeDexName(inputDex.dex);
            String makeOdexName = OdexSchemeBoring.makeOdexName(makeDexName);
            File file2 = new File(this.mDexStore.root, makeDexName);
            File file3 = new File(this.mDexStore.root, makeOdexName);
            if ((this.mFlags & 1) == 0 || !file2.exists() || !file3.exists()) {
                File file4 = new File(this.mTmpDir.directory, makeDexName);
                String str = null;
                if (!this.mLowDiskSpace) {
                    file = new File(this.mTmpDir.directory, makeOdexName);
                } else {
                    file = null;
                }
                inputDex.extract(file4);
                String absolutePath = file4.getAbsolutePath();
                if (file != null) {
                    str = file.getAbsolutePath();
                }
                DexFile.loadDex(absolutePath, str, 0);
                C0015Fs.renameOrThrow(file4, file2);
                if (file == null) {
                    return;
                }
                if (file.exists()) {
                    this.mRenameTempToFinalOdexMap.put(file, file3);
                    return;
                }
                Mlog.m35w("Odex file does not exist (likely because dex2oat failed due to low disk space).\n Failing back to using dex file: %s\n Odex file: %s", file2, file.getAbsolutePath());
                onLowDiskSpaceLikelyDetected();
            }
        }

        public void performFinishActions() {
            for (Map.Entry entry : this.mRenameTempToFinalOdexMap.entrySet()) {
                Mlog.safeFmt("Copying odex file %s to %s", ((File) entry.getKey()).getAbsolutePath(), ((File) entry.getValue()).getAbsolutePath());
                C0015Fs.renameOrThrow((File) entry.getKey(), (File) entry.getValue());
            }
        }

        public BoringCompiler(DexStore dexStore, int i) {
            this.mDexStore = dexStore;
            this.mFlags = i;
            this.mTmpDir = dexStore.makeTemporaryDirectory("boring-compiler");
            this.mLowDiskSpace = (i & 32) != 0;
        }
    }

    public static ExpectedFileInfo[] makeExpectedFileList(DexManifest.Dex[] dexArr) {
        int length = dexArr.length;
        ExpectedFileInfo[] expectedFileInfoArr = new ExpectedFileInfo[(length << 1)];
        for (int i = 0; i < length; i++) {
            DexManifest.Dex dex = dexArr[i];
            String makeDexName = makeDexName(dex);
            int i2 = i << 1;
            expectedFileInfoArr[i2] = new ExpectedFileInfo(dex, makeDexName);
            int i3 = i2 + 1;
            ExpectedFileInfo expectedFileInfo = new ExpectedFileInfo(makeOdexName(makeDexName));
            expectedFileInfo.mIsOptional = true;
            expectedFileInfoArr[i3] = expectedFileInfo;
        }
        return expectedFileInfoArr;
    }

    public void configureClassLoader(File file, MultiDexClassLoader.Configuration configuration) {
        int i = 0;
        while (true) {
            String[] strArr = this.expectedFiles;
            if (i < strArr.length) {
                File file2 = new File(file, strArr[i + 1]);
                File file3 = null;
                if (file2.exists()) {
                    file3 = file2;
                }
                if (file3 == null) {
                    Mlog.safeFmt("Odex %s does not exist. Skipping...", file2);
                }
                configuration.addDex(new File(file, this.expectedFiles[i]), file3);
                i += 2;
            } else {
                return;
            }
        }
    }

    public String getSchemeName() {
        return "OdexSchemeBoring";
    }

    public static String makeDexName(DexManifest.Dex dex) {
        String str = dex.assetName;
        boolean endsWith = str.endsWith(".dex.xz");
        String str2 = DexManifest.DEX_EXT;
        if (!endsWith && !str.endsWith(str2)) {
            str2 = ".dex.jar";
        }
        return AnonymousClass000.A0J("prog-", dex.hash, str2);
    }

    public OdexScheme.Compiler makeCompiler(DexStore dexStore, int i) {
        return new BoringCompiler(dexStore, i);
    }

    public OdexSchemeBoring(DexManifest.Dex[] dexArr) {
        super(8, makeExpectedFileList(dexArr));
    }

    public static String makeOdexName(String str) {
        return AnonymousClass000.A0E(C0015Fs.stripLastExtension(str), DexManifest.ODEX_EXT);
    }
}
