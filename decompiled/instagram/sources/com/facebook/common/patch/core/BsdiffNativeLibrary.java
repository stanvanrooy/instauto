package com.facebook.common.patch.core;

import com.facebook.soloader.NativeLibrary;
import java.util.Arrays;

public class BsdiffNativeLibrary extends NativeLibrary {
    public BsdiffNativeLibrary() {
        super(Arrays.asList(new String[]{"c++_shared", "bsdiff", "commonpatchjni"}));
    }

    public static native void patch(String str, String str2, String str3);
}
