package com.facebook.common.dextricks;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0YR;

public final class DexManifest {
    public static final String DEX_EXT = ".dex";
    public static final String ODEX_EXT = ".odex";
    public final Dex[] dexes;

    /* renamed from: id */
    public final String f144id;
    public final boolean locators;
    public final String[] requires;
    public final boolean rootRelative;
    public final AnonymousClass0YR superpackExtension;
    public final int superpackFiles;

    public final class Dex {
        public final String assetName;
        public final String canaryClass;
        public final String hash;

        public String toString() {
            return String.format("<Dex assetName:[%s]>", new Object[]{this.assetName});
        }

        public String makeDexName() {
            return DexManifest.makeCompileUnitNameFromHashAndExtension(this.hash, DexManifest.DEX_EXT);
        }

        public String makeOdexName() {
            return DexManifest.makeCompileUnitNameFromHashAndExtension(this.hash, DexManifest.ODEX_EXT);
        }

        public Dex(String str, String str2, String str3) {
            this.assetName = str;
            this.hash = str2;
            this.canaryClass = str3;
        }
    }

    public static String makeCompileUnitNameFromHashAndExtension(String str, String str2) {
        if (!str2.startsWith(".")) {
            str2 = AnonymousClass000.A0E(".", str2);
        }
        return AnonymousClass000.A0J("prog-", str, str2);
    }

    public static String makeDexNameFromHash(String str) {
        return makeCompileUnitNameFromHashAndExtension(str, DEX_EXT);
    }

    public static String makeOdexNameFromHash(String str) {
        return makeCompileUnitNameFromHashAndExtension(str, ODEX_EXT);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0114, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0118, code lost:
        throw r0;
     */
    public DexManifest(InputStream inputStream) {
        ArrayList arrayList = new ArrayList();
        AnonymousClass0YR r13 = AnonymousClass0YR.NONE;
        String str = DexStoreUtils.MAIN_DEX_STORE_ID;
        ArrayList arrayList2 = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                this.rootRelative = z;
                this.locators = z2;
                this.superpackFiles = i;
                this.superpackExtension = r13;
                this.f144id = str;
                this.requires = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                this.dexes = (Dex[]) arrayList.toArray(new Dex[arrayList.size()]);
                return;
            } else if (readLine.length() != 0) {
                Mlog.safeFmt("Secondary program dex metadata: [%s]", readLine);
                if (readLine.equals(".root_relative")) {
                    z = true;
                } else if (readLine.equals(".locators")) {
                    z2 = true;
                } else if (readLine.startsWith(".superpack_files")) {
                    i = Integer.parseInt(readLine.split(" ")[1]);
                } else if (readLine.startsWith(".superpack_extension")) {
                    String str2 = readLine.split(" ")[1];
                    if (str2.isEmpty()) {
                        r13 = AnonymousClass0YR.NONE;
                    } else if (str2.equalsIgnoreCase("xz")) {
                        r13 = AnonymousClass0YR.XZ;
                    } else if (str2.equalsIgnoreCase("zst") || str2.equalsIgnoreCase("zstd")) {
                        r13 = AnonymousClass0YR.ZST;
                    } else {
                        r13 = AnonymousClass0YR.NONE;
                    }
                } else if (readLine.startsWith(".id")) {
                    str = readLine.split(" ")[1];
                } else if (readLine.startsWith(".requires")) {
                    arrayList2.add(readLine.split(" ")[1]);
                } else if (readLine.startsWith(".")) {
                    Mlog.m35w("ignoring dex metadata pragma [%s]", readLine);
                } else {
                    String[] split = readLine.split(" ");
                    arrayList.add(new Dex(split[0], split[1], split[2]));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r2 != null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0020, code lost:
        throw r0;
     */
    public static DexManifest loadManifestFrom(ResProvider resProvider, String str, boolean z) {
        InputStream open = resProvider.open(str);
        DexManifest dexManifest = new DexManifest(open);
        if (open != null) {
            open.close();
        }
        if (z && dexManifest.rootRelative) {
            resProvider.markRootRelative();
        }
        return dexManifest;
    }
}
