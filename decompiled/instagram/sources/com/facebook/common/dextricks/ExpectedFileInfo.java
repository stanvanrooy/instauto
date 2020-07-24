package com.facebook.common.dextricks;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.DexUnpacker;
import java.io.File;
import java.util.Iterator;
import java.util.List;

public class ExpectedFileInfo {
    public final boolean coldstart;
    public final DexManifest.Dex dex;
    public final File dexFile;
    public final String dexName;
    public final boolean extended;
    public CompilationType mCompType;
    public boolean mIsOptional;
    public final int ordinal;
    public final boolean primary;
    public final String rawFile;
    public final boolean scroll;

    public enum CompilationType {
        ALL("all"),
        PGO("pgo"),
        NONE(NetInfoModule.CONNECTION_TYPE_NONE),
        UNKNOWN("unknown");
        
        public final String mFriendlyName;

        public String getFriendlyName() {
            return this.mFriendlyName;
        }

        /* access modifiers changed from: public */
        CompilationType(String str) {
            this.mFriendlyName = str;
        }

        public String toString() {
            return getFriendlyName();
        }
    }

    public static CompilationType checkIsValidCompType(CompilationType compilationType) {
        if (compilationType != null) {
            return compilationType;
        }
        Mlog.m35w("Comp type cannot be null defaulting to unknown", new Object[0]);
        return CompilationType.UNKNOWN;
    }

    public static ExpectedFileInfo makeOdexFromName(String str) {
        return new ExpectedFileInfo(str);
    }

    public static List setCompTypeIfUnknown(List list, CompilationType compilationType) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ExpectedFileInfo expectedFileInfo = (ExpectedFileInfo) it.next();
            if (expectedFileInfo.isCompilationTypeUnknown()) {
                expectedFileInfo.setCompilationType(compilationType);
            }
        }
        return list;
    }

    public static List setCompTypeToPgoIfUnknown(List list) {
        return setCompTypeIfUnknown(list, CompilationType.PGO);
    }

    public CompilationType getCompilationType() {
        return this.mCompType;
    }

    public DexManifest.Dex getDex() {
        return this.dex;
    }

    public boolean hasDex() {
        if (this.dex != null) {
            return true;
        }
        return false;
    }

    public boolean hasManifestData() {
        if (this.ordinal != -1) {
            return true;
        }
        return false;
    }

    public boolean isCompilationTypeMixedModeAll() {
        return CompilationType.ALL.equals(this.mCompType);
    }

    public boolean isCompilationTypePGO() {
        return CompilationType.PGO.equals(this.mCompType);
    }

    public boolean isCompilationTypeUnknown() {
        return CompilationType.UNKNOWN.equals(this.mCompType);
    }

    public boolean isNonRootDex() {
        if (this.dex == null || this.dexFile == null) {
            return false;
        }
        return true;
    }

    public boolean isOptional() {
        return this.mIsOptional;
    }

    public boolean isRawFile() {
        if (this.rawFile != null) {
            return true;
        }
        return false;
    }

    public boolean isRootDex() {
        if (this.dex == null || this.dexName == null) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x001b  */
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[Expected File Info: ");
        boolean z = true;
        if (isRawFile()) {
            sb.append("Raw File: ");
            str = this.rawFile;
        } else {
            if (isRootDex()) {
                sb.append("Dex Name: ");
                sb.append(this.dexName);
            } else if (isNonRootDex()) {
                sb.append("Dex File: ");
                sb.append(this.dexFile.getPath());
            } else {
                str = "ERROR!";
            }
            if (z) {
                sb.append("Compilation Type: ");
                sb.append(this.mCompType);
            }
            sb.append(" ]");
            return sb.toString();
        }
        sb.append(str);
        z = false;
        if (z) {
        }
        sb.append(" ]");
        return sb.toString();
    }

    public static ExpectedFileInfo makeOdexFrom(DexManifest.Dex dex2) {
        return new ExpectedFileInfo(dex2.makeOdexName());
    }

    public File getFileFromAnotherRoot(File file) {
        if (isRawFile() || isRootDex()) {
            return new File(file, toExpectedFileString());
        }
        if (isNonRootDex()) {
            return new File(file, this.dexFile.getName());
        }
        throw new RuntimeException("Cannot generate file");
    }

    public boolean isCompilationTypePgoOrMixedMode() {
        if (isCompilationTypePGO() || isCompilationTypeMixedModeAll()) {
            return true;
        }
        return false;
    }

    public void setCompilationType(CompilationType compilationType) {
        this.mCompType = checkIsValidCompType(compilationType);
    }

    public String toExpectedFileString() {
        if (isRawFile()) {
            return this.rawFile;
        }
        if (isRootDex()) {
            return this.dexName;
        }
        throw new IllegalStateException("Cannot generated an expected string");
    }

    public ExpectedFileInfo(DexManifest.Dex dex2) {
        this(dex2, CompilationType.UNKNOWN);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ExpectedFileInfo(DexManifest.Dex dex2, CompilationType compilationType) {
        this(dex2, dex2 != null ? dex2.makeDexName() : null, compilationType);
    }

    public ExpectedFileInfo(DexManifest.Dex dex2, String str) {
        this(dex2, str, CompilationType.UNKNOWN);
    }

    public ExpectedFileInfo(DexManifest.Dex dex2, String str, CompilationType compilationType) {
        this(dex2, str, (File) null, (String) null, compilationType);
    }

    public ExpectedFileInfo(DexManifest.Dex dex2, String str, File file, String str2, CompilationType compilationType) {
        this(dex2, str, file, str2, compilationType, -1, false, false, false, false, false);
    }

    public ExpectedFileInfo(DexManifest.Dex dex2, String str, File file, String str2, CompilationType compilationType, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.dex = dex2;
        this.dexName = str;
        this.dexFile = file;
        this.rawFile = str2;
        this.mCompType = checkIsValidCompType(compilationType);
        this.ordinal = i;
        this.primary = z;
        this.coldstart = z2;
        this.extended = z3;
        this.scroll = z4;
        this.mIsOptional = z5;
    }

    public ExpectedFileInfo(DexUnpacker.CopiedDexInfo copiedDexInfo) {
        this(copiedDexInfo.dex, (String) null, copiedDexInfo.dexFile, (String) null, CompilationType.UNKNOWN);
    }

    public ExpectedFileInfo(String str) {
        this((DexManifest.Dex) null, (String) null, (File) null, str, CompilationType.NONE);
    }

    public static ExpectedFileInfo[] convertTo(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        int length = strArr.length;
        ExpectedFileInfo[] expectedFileInfoArr = new ExpectedFileInfo[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            expectedFileInfoArr[i] = str != null ? new ExpectedFileInfo(str) : null;
        }
        return expectedFileInfoArr;
    }

    public static String[] convertTo(ExpectedFileInfo[] expectedFileInfoArr) {
        if (expectedFileInfoArr == null) {
            return null;
        }
        int length = expectedFileInfoArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            ExpectedFileInfo expectedFileInfo = expectedFileInfoArr[i];
            strArr[i] = expectedFileInfo != null ? expectedFileInfo.toExpectedFileString() : null;
        }
        return strArr;
    }

    public File getFile(DexStore dexStore) {
        return getFile(dexStore.root);
    }

    public File getFile(File file) {
        if (isRawFile() || isRootDex()) {
            return new File(file, toExpectedFileString());
        }
        if (isNonRootDex()) {
            return this.dexFile;
        }
        throw new RuntimeException("Cannot generate file");
    }

    public ExpectedFileInfo setIsOptional() {
        this.mIsOptional = true;
        return this;
    }

    public ExpectedFileInfo setIsOptional(boolean z) {
        this.mIsOptional = z;
        return this;
    }
}
