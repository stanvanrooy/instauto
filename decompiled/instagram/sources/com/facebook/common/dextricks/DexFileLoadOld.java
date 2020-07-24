package com.facebook.common.dextricks;

import dalvik.system.DexFile;

public final class DexFileLoadOld {
    public static void init() {
    }

    public static Class loadClassBinaryName(DexFile dexFile, String str, ClassLoader classLoader) {
        return dexFile.loadClassBinaryName(str, classLoader);
    }
}
