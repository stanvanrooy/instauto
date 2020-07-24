package com.facebook.common.dextricks;

import android.content.Context;
import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0CD;

public final class DexStoreUtils {
    public static int CANARY_IDX = 2;
    public static int HASH_IDX = 1;
    public static final String IGNORE_DIRTY_CHECK_PREFIX = "IGNORE_DIRTY_";
    public static final String MAIN_DEX_STORE_ID = "dex";
    public static final boolean OREO_OR_NEWER;
    public static final String SECONDARY_DEX_MANIFEST = "metadata.txt";

    public static String getMainDexStoreId() {
        return MAIN_DEX_STORE_ID;
    }

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 26) {
            z = true;
        }
        OREO_OR_NEWER = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0045 */
    public static List getDexInfoFromManifest(Context context) {
        ArrayList arrayList = new ArrayList();
        InputStream open = context.getAssets().open("secondary-program-dex-jars/metadata.txt");
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, "UTF-8"));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    open.close();
                    return arrayList;
                } else if (!readLine.startsWith(".")) {
                    String[] split = readLine.split(" ");
                    if (split.length == 3) {
                        arrayList.add(split);
                    }
                }
            }
        } catch (Throwable th) {
            open.close();
            throw th;
        }
    }

    public static DexManifest getSecondaryDexManifest(ResProvider resProvider, boolean z) {
        return DexManifest.loadManifestFrom(resProvider, SECONDARY_DEX_MANIFEST, z);
    }

    public static boolean isIgnoreDirtyFile(File file) {
        if (file == null) {
            return false;
        }
        return isIgnoreDirtyFileName(file.getName());
    }

    public static boolean isIgnoreDirtyFileName(String str) {
        if (str == null || !str.startsWith(IGNORE_DIRTY_CHECK_PREFIX)) {
            return false;
        }
        return true;
    }

    public static boolean isMainDexStoreId(String str) {
        return MAIN_DEX_STORE_ID.equals(str);
    }

    public static boolean isSecondaryDexManifest(String str) {
        return SECONDARY_DEX_MANIFEST.equals(str);
    }

    public static File makeIgnoreDirtyCheckFile(File file, String str) {
        return new File(file, AnonymousClass000.A0E(IGNORE_DIRTY_CHECK_PREFIX, str));
    }

    public static InputStream openSecondaryDexManifest(ResProvider resProvider) {
        return resProvider.open(SECONDARY_DEX_MANIFEST);
    }

    public static File createNewMainDexStoreReferencePgoProfile(Context context) {
        return AnonymousClass0CD.A00(context).A07(getMainDexStoreLocation(context));
    }

    public static File getCurrentMainDexStorePgoProfile(Context context) {
        File mainDexStoreReferencePgoProfile = getMainDexStoreReferencePgoProfile(context);
        if (!mainDexStoreReferencePgoProfile.exists()) {
            return AnonymousClass0CD.A00(context).A06();
        }
        return mainDexStoreReferencePgoProfile;
    }

    public static File getMainDexStoreLocation(Context context) {
        String realpath;
        String str = context.getApplicationInfo().dataDir;
        if (OREO_OR_NEWER) {
            realpath = str;
        } else {
            realpath = DalvikInternals.realpath(str);
        }
        C0015Fs.deleteRecursiveNoThrow(new File(AnonymousClass000.A0E(realpath, "/app_secondary_program_dex")));
        C0015Fs.deleteRecursiveNoThrow(new File(AnonymousClass000.A0E(realpath, "/app_secondary_program_dex_opt")));
        if (!str.equals(realpath)) {
            Mlog.safeFmt("resolved non-canonical data directory %s to %s", str, realpath);
        }
        return new File(realpath, MAIN_DEX_STORE_ID);
    }

    public static File getMainDexStoreReferencePgoProfile(Context context) {
        File mainDexStoreLocation = getMainDexStoreLocation(context);
        AnonymousClass0CD.A00(context);
        return new File(mainDexStoreLocation, "art_pgo_ref_profile.prof");
    }
}
