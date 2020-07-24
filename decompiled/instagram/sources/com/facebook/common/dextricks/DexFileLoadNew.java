package com.facebook.common.dextricks;

import dalvik.system.DexFile;
import java.util.List;

public final class DexFileLoadNew {
    public static void init() {
    }

    public static Class loadClassBinaryName(DexFile dexFile, String str, ClassLoader classLoader) {
        return dexFile.loadClassBinaryName(str, classLoader, (List) null);
    }
}
