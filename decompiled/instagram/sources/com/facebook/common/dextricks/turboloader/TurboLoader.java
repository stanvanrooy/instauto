package com.facebook.common.dextricks.turboloader;

import android.content.Context;
import dalvik.system.DexFile;
import java.io.File;
import java.util.List;
import p000X.AnonymousClass0BO;
import p000X.AnonymousClass0Y1;

public class TurboLoader {
    public final DexFile[] mAuxDexes;
    public final DexFile[] mPrimaryDexes;
    public DexFile[] mSecondaryDexes;
    public final String turboLoaderMapFile;
    public final File turboLoaderTempDir;

    public class Locator {
    }

    private native void init();

    private native void install(DexFile[] dexFileArr, DexFile[] dexFileArr2, String str, boolean z, String str2);

    private native Locator locateClassNative(String str, String str2);

    static {
        AnonymousClass0Y1.A08("turboloader");
    }

    public TurboLoader(Context context, List list, List list2, File file) {
        DexFile[] dexFileArr;
        DexFile[] dexFileArr2 = null;
        if (list != null) {
            dexFileArr = (DexFile[]) list.toArray(new DexFile[list.size()]);
        } else {
            dexFileArr = null;
        }
        this.mPrimaryDexes = dexFileArr;
        this.mAuxDexes = list2 != null ? (DexFile[]) list2.toArray(new DexFile[list2.size()]) : dexFileArr2;
        this.turboLoaderTempDir = new File(context.getCacheDir(), "turbo_loader_tmp");
        this.turboLoaderMapFile = new File(file, "classmap.bin").getAbsolutePath();
        if (AnonymousClass0BO.A00) {
            init();
        }
    }

    public void install(List list, boolean z) {
        DexFile[] dexFileArr;
        if (list != null) {
            dexFileArr = (DexFile[]) list.toArray(new DexFile[list.size()]);
        } else {
            dexFileArr = null;
        }
        this.mSecondaryDexes = dexFileArr;
        if (AnonymousClass0BO.A00) {
            install(this.mPrimaryDexes, dexFileArr, this.turboLoaderMapFile, z, this.turboLoaderTempDir.getAbsolutePath());
        }
    }
}
