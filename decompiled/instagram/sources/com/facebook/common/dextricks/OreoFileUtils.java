package com.facebook.common.dextricks;

import dalvik.system.VMRuntime;
import java.io.File;

public class OreoFileUtils {
    public static long getImageSize(File file) {
        return new File(getIsaDir(file), getZipNameNoSuffix(file).concat(".art")).length();
    }

    public static long getOdexSize(File file) {
        return new File(getIsaDir(file), getZipNameNoSuffix(file).concat(DexManifest.ODEX_EXT)).length();
    }

    public static long currentProfileSize(File file) {
        return new File(file.getParentFile(), file.getName().concat(".prof")).length();
    }

    public static File getIsaDir(File file) {
        return new File(file.getParentFile(), "oat/".concat(VMRuntime.getRuntime().vmInstructionSet()));
    }

    public static String getZipNameNoSuffix(File file) {
        String name = file.getName();
        return name.substring(0, name.lastIndexOf(46));
    }

    public static boolean hasRefProfile(File file) {
        return new File(file.getParentFile(), "oat/".concat(file.getName()).concat(".prof")).exists();
    }

    public static boolean hasVdexOdex(File file) {
        File isaDir = getIsaDir(file);
        String zipNameNoSuffix = getZipNameNoSuffix(file);
        File file2 = new File(isaDir, zipNameNoSuffix.concat(".vdex"));
        File file3 = new File(isaDir, zipNameNoSuffix.concat(DexManifest.ODEX_EXT));
        if (file2.length() <= 0 || file3.length() <= 0) {
            return false;
        }
        return true;
    }

    public static boolean isTruncated(File file) {
        if (!file.exists() || file.length() < 102400) {
            return true;
        }
        return false;
    }
}
